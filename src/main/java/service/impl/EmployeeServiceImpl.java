package service.impl;

import lombok.RequiredArgsConstructor;
import model.EmployeeInfo;
import org.springframework.stereotype.Service;
import repository.EmployeeInfoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl {
    private final EmployeeInfoRepository repository;

    EmployeeInfo getEmployeeInfo(int id) {
        return repository.getEmployeeInfoById(id);
    }

    List<EmployeeInfo> getAllEmployees() {
        return repository.findAll();
    }

    void deleteEmployee(int id) {
        repository.deleteById(id);
    }

    EmployeeInfo updateEmployee(EmployeeInfo employeeInfo) {
        return repository.save(employeeInfo);
    }
}
