package ca.tech.departmentservice.service;

import ca.tech.departmentservice.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
