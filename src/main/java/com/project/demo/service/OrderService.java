package com.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.Order;
import com.project.demo.repository.RepositoryOrder;

@Service
public class OrderService {

	@Autowired
	private RepositoryOrder repo;
	
	public List<Order> listAll(){
		return repo.findAll();
	}
	
	public void save(Order order) {
		repo.save(order);
	}
	
	public Order get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
}