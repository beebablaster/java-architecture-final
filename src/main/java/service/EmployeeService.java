package service;

import model.EmployeeInfo;

import java.util.List;

public interface EmployeeService {
    EmployeeInfo getEmployeeInfo(int id);
    List<EmployeeInfo> getAllEmployees();
    EmployeeInfo updateEmployee(EmployeeInfo employeeInfo);
    void deleteEmployee(int id);

}
