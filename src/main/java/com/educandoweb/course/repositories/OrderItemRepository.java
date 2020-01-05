package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.enums.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	//É o suficiente para usar vários objetos e prontos para usar
	//não é necessário a anotação @repository
}
