package ca.tech.departmentservice.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ca.tech.departmentservice.entity.Department;
import ca.tech.departmentservice.repository.DepartmentRepository;
import ca.tech.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
