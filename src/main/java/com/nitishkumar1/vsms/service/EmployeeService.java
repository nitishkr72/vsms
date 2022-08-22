package com.nitishkumar1.vsms.service;

import com.nitishkumar1.vsms.model.Employee;
import com.nitishkumar1.vsms.model.Zones;
import com.nitishkumar1.vsms.repo.EmployeeRepo;
import com.nitishkumar1.vsms.repo.ZonesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private final EmployeeRepo employeeRepo;

    @Autowired
    private final ZonesRepo zonesRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo, ZonesRepo zonesRepo) {
        this.employeeRepo = employeeRepo;
        this.zonesRepo = zonesRepo;
    }


    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee, int id) {
        Employee newEmployee = employeeRepo.findEmployeeById(id);
        newEmployee.setZone(employee.getZone());
        newEmployee.setName(employee.getName());
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setLevel(employee.getLevel());
        newEmployee.setPassword(employee.getPassword());
        newEmployee.setImageUrl(employee.getImageUrl());
        newEmployee.setManagerId(employee.getManagerId());
        newEmployee.setPhoneNumber(employee.getPhoneNumber());
        newEmployee.setMonthlySalesQuota(employee.getMonthlySalesQuota());
        return newEmployee;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> addAllEmployee(List<Employee> employees) {
        return employeeRepo.saveAll(employees);
    }

    public void deleteEmployeeById(int id) {
        employeeRepo.deleteEmployeeById(id);
    }

    public List<Employee> search(String keyword) {
        return employeeRepo.searchEmployeeByName(keyword);
    }


    public Employee findEmployeeById(int id) {
        return employeeRepo.findEmployeeById(id);
    }

    public Employee addZoneEmployeeId(int e_id, int z_id) {
        Zones newZone = zonesRepo.findById(z_id).get();
        Employee newEmployee = employeeRepo.findById(e_id).get();
        newEmployee.setZone(newZone);
        return newEmployee;
    }
}
