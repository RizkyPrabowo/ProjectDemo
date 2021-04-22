package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.model.Order;

public interface RepositoryOrder extends JpaRepository<Order, Integer> {

}

