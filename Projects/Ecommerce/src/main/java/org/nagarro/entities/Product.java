package org.nagarro.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	
	
	private String productTitle;
	
	private String productDescription;
	
	private double productPrice;
	
	private int productDiscount;
	
	private int productQuantity;
	
	@Lob
	@Column(length=100000)
	private byte[] productImage;
	
	private String productImageName;
	
	@ManyToOne()
	private Category category;

	public Product() {
		super();
		
	}

	public Product(int productId, String productTitle, String productDescription, double productPrice,
			int productDiscount, int productQuantity, byte[] productImage, String productImageName, Category category) {
		super();
		this.productId = productId;
		this.productTitle = productTitle;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productQuantity = productQuantity;
		this.productImage = productImage;
		this.productImageName = productImageName;
		this.category = category;
	}

	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productTitle=" + productTitle + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productDiscount=" + productDiscount
				+ ", productQuantity=" + productQuantity + ", productImage=" + Arrays.toString(productImage)
				+ ", productImageName=" + productImageName + ", category=" + category + "]";
	}

	
	public int getProductId() {
		return productId;
	}

	
	public void setProductId(int productId) {
		this.productId = productId;
	}

	
	public String getProductTitle() {
		return productTitle;
	}

	
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	
	public String getProductDescription() {
		return productDescription;
	}

	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	
	public double getProductPrice() {
		return productPrice;
	}

	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	
	public int getProductDiscount() {
		return productDiscount;
	}

	
	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}

	
	public int getProductQuantity() {
		return productQuantity;
	}

	
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	
	public byte[] getProductImage() {
		return productImage;
	}

	
	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	
	public String getProductImageName() {
		return productImageName;
	}

	
	public void setProductImageName(String productImageName) {
		this.productImageName = productImageName;
	}

	
	public Category getCategory() {
		return category;
	}

	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
	
	
}
