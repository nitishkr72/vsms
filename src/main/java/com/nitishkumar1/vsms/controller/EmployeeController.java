package com.nitishkumar1.vsms.controller;

import com.nitishkumar1.vsms.model.Employee;
import com.nitishkumar1.vsms.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employees = employeeService.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PostMapping("/add-all")
    public ResponseEntity<List<Employee>> addAllEmployee(@RequestBody List<Employee> employees) {
        List<Employee> employees1 = employeeService.addAllEmployee(employees);
        return new ResponseEntity<>(employees1, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {
        Employee newEmployee = employeeService.updateEmployee(employee, id);
        return new ResponseEntity<>(newEmployee, HttpStatus.OK);
    }



    @PutMapping("/update/zones")
    public ResponseEntity<Employee> updateZoneEmployeeID(@RequestParam int e_id, @RequestParam int z_id) {
        Employee employee = employeeService.addZoneEmployeeId(e_id, z_id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") int id) {
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/find/name/{name}")
    public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable("name") String name) {
        List<Employee> employees = employeeService.search(name);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

}
