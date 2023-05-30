package org.example.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
