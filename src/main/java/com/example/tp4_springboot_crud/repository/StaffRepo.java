package com.example.tp4_springboot_crud.repository;

import com.example.tp4_springboot_crud.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff,Integer> {

}
