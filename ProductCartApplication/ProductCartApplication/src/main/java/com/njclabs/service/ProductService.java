package com.njclabs.service;

import java.util.List;

import com.njclabs.beans.Products;
import com.njclabs.exception.DuplicateProductIdException;
import com.njclabs.exception.ProductNotFoundException;

//import java.util.List;



public interface ProductService {

	public Products createProduct(Products products) throws DuplicateProductIdException, ProductNotFoundException;

	public Products deleteProduct(String id) throws ProductNotFoundException;
	
	public List<Products> viewProducts() throws ProductNotFoundException;
	
	public Products findProduct(String id) throws ProductNotFoundException;

	public Products updateProduct(Products products, String id) throws ProductNotFoundException;

	
}
