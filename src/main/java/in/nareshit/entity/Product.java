package in.nareshit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer prodId;
	private String	prodName;
	private double prodCost;
	private String prodColor;
	
	//super constructor
	public Product() {
		
	}
	//Id (PK) based constructor
	public Product(Integer prodId) {
		super();
		this.prodId = prodId;
	}
	//Parameterized constructor without Id(PK)
	public Product(String prodName, double prodCost, String prodColor) {
		super();
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodColor = prodColor;
	}
	//Parameterized Constructor with Id (PK)
	public Product(Integer prodId, String prodName, double prodCost, String prodColor) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodColor = prodColor;
	}
	
	
	
	
	
	
	
	
}
