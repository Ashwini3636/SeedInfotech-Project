package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.FIR;
import com.example.demo.Entity.User;

public interface FIRRepository extends JpaRepository<FIR, Long> {
	 FIR findById(long id);
}



