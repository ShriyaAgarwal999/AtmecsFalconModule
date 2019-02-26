package org.atmecs.falcongetmethods.models;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class ProductModel {
	
	String name;
	String components[];
	
	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductModel [name=" + name + ", components=" + Arrays.toString(components) + "]";
	}
	public ProductModel(String name, String[] components) {
		super();
		this.name = name;
		this.components = components;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getComponents() {
		return components;
	}
	public void setComponents(String[] components) {
		this.components = components;
	}

	
}
