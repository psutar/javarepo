package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import exception.CustomerException;
import model.BadUser;
import model.Customer;
import model.Discount;
import service.RetrieveDiscountService;

@RestController
@RequestMapping("/rest/v1/users/")
public class RetrieveDiscountController {

	@Autowired
	RetrieveDiscountService retrieveDiscountService;
	BadUser user = new BadUser();

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
	/*
	 * @RequestMapping("/{uuid}/discounts") public List<Discount>
	 * getAllDiscount(@PathVariable("uuid") String uuid) {
	 * System.out.println("uuid :" + uuid); return
	 * retrieveDiscountService.getAllDiscount(uuid); }
	 */

	// http://localhost:8080/rest/v1/users/760335/discounts?productId=1234567890
	@RequestMapping("/{uuid}/discounts")
	public List<Discount> getSKUDiscount(@RequestParam(value = "productId", required = false) String productId,
			@PathVariable("uuid") String uuid, HttpServletResponse response) throws IOException {
		System.out.println("productId :" + productId);
		System.out.println("User uuid :" + uuid);
		Customer customerDetails = retrieveDiscountService.getCustomer(uuid);
		System.out.println("customerDetails :"+customerDetails);
		if (customerDetails != null )
			try {
				return retrieveDiscountService.getSKUDiscount(productId, uuid);
			} catch (CustomerException e) {
				// TODO Auto-generated catch block
				user.setCode(e.getErrorCode());
				user.setMessage(e.getErrorDescription());
				response.sendRedirect("/rest/v1/users/bad-user/discounts");
				return null;
			}
		return null;
	}

	@RequestMapping("/{uuid}")
	public Customer getCustomer(@PathVariable("uuid") String uuid) {
		System.out.println("uuid :" + uuid);
		return retrieveDiscountService.getCustomer(uuid);
	}

	@RequestMapping("/bad-user/discounts")
	public BadUser getBaduserResponse() {
		System.out.println("Reached here");
		return user;
	}

}
