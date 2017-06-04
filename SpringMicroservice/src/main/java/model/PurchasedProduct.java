package model;

public class PurchasedProduct {
	String productId;
	String description;
	Long originalPrice;
	Long finalPrice;
	Discount discountInfo;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}
	public Long getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(Long finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Discount getDiscountInfo() {
		return discountInfo;
	}
	public void setDiscountInfo(Discount discountInfo) {
		this.discountInfo = discountInfo;
	}

}
