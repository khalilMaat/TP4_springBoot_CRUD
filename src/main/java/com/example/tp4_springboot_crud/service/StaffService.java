package com.example.tp4_springboot_crud.service;

import com.example.tp4_springboot_crud.entity.Staff;

import java.util.List;

public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}
