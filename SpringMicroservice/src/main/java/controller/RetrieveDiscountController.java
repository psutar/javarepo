package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Customer;
import model.Discount;
import service.RetrieveDiscountService;

@RestController
@RequestMapping("/rest/v1/users/")
public class RetrieveDiscountController {

	@Autowired
	RetrieveDiscountService retrieveDiscountService;

	/*
	 * @RequestMapping("/{uuid}/discounts") public Discount
	 * getDiscountAll(@PathVariable("uuid")String uuid) {
	 * retrieveDiscountService.getCustomerDetails(uuid); return
	 * retrieveDiscountService.getDiscountAll(); }
	 */

	/*
	 * @RequestMapping("{id}") public Person getPerson(@PathVariable("id")String
	 * id){ return ps.getPerson(id); }
	 */

	// http://localhost:8080/rest/v1/users/760335/discounts/all
	/*@RequestMapping("/{uuid}/discounts")
	public List<Discount> getAllDiscount(@PathVariable("uuid") String uuid) {
		System.out.println("uuid :" + uuid);
		return retrieveDiscountService.getAllDiscount(uuid);
	}*/

	// http://localhost:8080/rest/v1/users/760335/discounts?productId=1234567890
	@RequestMapping("/{uuid}/discounts")
	public List<Discount> getSKUDiscount(@RequestParam(value ="productId",required=false) String productId,@PathVariable("uuid") String uuid) {
		System.out.println("productId :" + productId);
		return retrieveDiscountService.getSKUDiscount(productId,uuid);
	}
	
	
	@RequestMapping("/{uuid}")
	public Customer getCustomer(@PathVariable("uuid") String uuid) {
		System.out.println("uuid :" + uuid);
		return retrieveDiscountService.getCustomer(uuid);
	}

}
