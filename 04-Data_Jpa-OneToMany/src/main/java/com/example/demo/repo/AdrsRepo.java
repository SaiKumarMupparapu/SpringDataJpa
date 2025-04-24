package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface AdrsRepo extends JpaRepository<Address, Integer> {

}
