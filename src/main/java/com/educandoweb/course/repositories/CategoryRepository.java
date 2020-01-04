package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	//É o suficiente para usar vários objetos e prontos para usar
	//não é necessário a anotação @repository
}
