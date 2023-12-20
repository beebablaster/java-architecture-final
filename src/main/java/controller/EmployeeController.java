package controller;

import lombok.RequiredArgsConstructor;
import model.EmployeeInfo;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public List<EmployeeInfo> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/info")
    public EmployeeInfo getEmployeeInfo(@RequestParam int id) {
        return employeeService.getEmployeeInfo(id);
    }

    @DeleteMapping("/employees/info")
    public void deleteEmployee(@RequestParam int id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping
    public EmployeeInfo updateEmployee(@RequestParam EmployeeInfo employeeInfo) {
        return employeeService.updateEmployee(employeeInfo);
    }
}

