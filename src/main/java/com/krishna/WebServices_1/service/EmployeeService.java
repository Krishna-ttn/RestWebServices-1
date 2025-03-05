package com.krishna.WebServices_1.service;

import com.krishna.WebServices_1.exception.EmployeeNotFoundException;
import com.krishna.WebServices_1.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    private Map<Long, Employee> employees = new HashMap<>();

    public EmployeeService() {
        // Adding some default employees
        employees.put(8244L, new Employee("Krishna", 8244L, 21));
        employees.put(8246L, new Employee("Sanchit", 8246L, 21));
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public Employee getEmployeeById(Long id) {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee with" + id + "Not Found");
        }
        return employees.get(id);
    }

    public void createEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }

    public void deleteEmployee(Long id) {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee with" + id + "Not Found");
        }
        employees.remove(id);
    }

    public void updateEmployee(Long id, Employee emp) {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee with" + id + "Not Found");
        }
        employees.put(id, emp);
    }

}
