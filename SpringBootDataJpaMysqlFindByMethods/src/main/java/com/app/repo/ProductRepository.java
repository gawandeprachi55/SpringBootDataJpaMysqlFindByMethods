package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
//all findBy Abstract method here which returns list of model class obj
	List<Product> findByProdCodeAndProdCostLessThan(String prodCode, double prodCost);

List<Product> findByProdCodeIs(String prodCode);
}