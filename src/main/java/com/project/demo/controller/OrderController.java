package com.project.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Order;
import com.project.demo.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	
	@GetMapping("/order")
	public List<Order> list(){
		return service.listAll();
	}
	
	@GetMapping("/order/{id}")
	public ResponseEntity<Order> get(@PathVariable Integer id) {
		try {
			Order order = service.get(id);
			return new ResponseEntity<Order>(order, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/postOrders")
	public void add(@RequestBody Order order) {
		service.save(order);
	}
	
	@PutMapping("/putOrders/{id}")
	public ResponseEntity<Order> update(@RequestBody Order order,
			@PathVariable Integer id) {
		try {
			Order existProduct = service.get(id);
			service.save(order);
				
			return new ResponseEntity<Order>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
				return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
		}
		
	}
	
}