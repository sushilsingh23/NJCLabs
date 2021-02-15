package com.njclabs.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.njclabs.beans.Products;
import com.njclabs.exception.DuplicateProductIdException;
import com.njclabs.exception.ProductNotFoundException;


@Repository
public interface ProductRepo{

	Products findById(String id) throws ProductNotFoundException;

	Products save(Products products) throws DuplicateProductIdException, ProductNotFoundException;

	Products deleteById(Products products) throws ProductNotFoundException;

	List<Products> findAll() throws ProductNotFoundException;

	Products update(Products products, Products product) throws ProductNotFoundException;
	
	
	

}