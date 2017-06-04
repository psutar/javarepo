package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Customer;
import model.Discount;
import model.PurchasedProduct;

@CacheConfig(cacheNames = "countries")
@Service
public class RetrieveDiscountService {

	Hashtable<String, Customer> customer = new Hashtable<String, Customer>();
	List<Discount> eligibleDiscount = new ArrayList<Discount>();
	List<PurchasedProduct> products = new ArrayList<PurchasedProduct>();

	public RetrieveDiscountService() {
		Discount discount1 = new Discount();
		discount1.setAmount(5L);
		discount1.setDescription("reduce the  purchase price by 5$");
		discount1.setDiscountId("5-dollars-off");
		discount1.setType("AMOUNT");
		discount1.setProductId("sku-1234567890");
		eligibleDiscount.add(discount1);
		Discount discount2 = new Discount();
		discount2.setAmount(10L);
		discount2.setDescription("reduce the  purchase price by 10%");
		discount2.setDiscountId("10-percent-off");
		discount2.setType("PERCENT");
		eligibleDiscount.add(discount2);

		Discount discountInfo = new Discount();
		discountInfo.setAmount(50L);
		discountInfo.setDescription("reduce the  purchase price by 5$");
		discountInfo.setDiscountId("50-percent-off");
		discountInfo.setType("PERCENT");
		discountInfo.setProductId("sku-1234567890");

		PurchasedProduct prProduct = new PurchasedProduct();
		prProduct.setProductId("sku-1234567890");
		prProduct.setDescription("12 month subcription to Horse and Hound");
		prProduct.setOriginalPrice(100L);
		prProduct.setFinalPrice(50L);
		prProduct.setDiscountInfo(discountInfo);
		products.add(prProduct);

		Customer cust = new Customer();
		cust.setAddress("Infosys hinj ph3");
		cust.setName("Prateek");
		cust.setUuid("760335");
		cust.setProducts(products);
		cust.setEligibleDiscount(eligibleDiscount);

		customer.put("1", cust);
	}

	public List<Discount> getSKUDiscount(String productId, String uuid) {
		List<Discount> discountList = new ArrayList<Discount>();
		Customer customerDetails = getCustomerDetails(uuid);

		if (productId != null) {
			List<PurchasedProduct> purchasedProductList = customerDetails.getProducts();
			for (PurchasedProduct purchasedProduct : purchasedProductList) {
				if (purchasedProduct.getProductId().equals(productId)) {
					discountList.add(purchasedProduct.getDiscountInfo());
					return discountList;
				}
			}
		}
		return customerDetails.getEligibleDiscount();
	}

	public Customer getCustomer(String uuid) {

		for (String key : customer.keySet()) {
			if ((customer.get(key).getUuid()).equals(uuid)) {
				return customer.get(key);
			} else
				return null;
		}
		return null;

	}

	public Customer getCustomerDetails(String uuid) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/rest/v1/users/" + uuid;
		Customer cust = restTemplate.getForObject(url, Customer.class);
		System.out.println("address: " + cust.getAddress());
		return cust;
	}

}
