package com.springbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbackend.Model.Employee;

//jpa repository layer provides findall, sorting support , it provides internally methods so no need to write method

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
