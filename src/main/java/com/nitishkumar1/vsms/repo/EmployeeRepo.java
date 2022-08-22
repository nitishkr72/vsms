package com.nitishkumar1.vsms.repo;

import com.nitishkumar1.vsms.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    void deleteEmployeeById(int id);

    @Query(value = "SELECT E FROM Employee E WHERE E.name LIKE %:name%")
    List<Employee> searchEmployeeByName(String name);

    @Query("select e from Employee e where e.id = :id")
    Employee findEmployeeById(int id);



}
