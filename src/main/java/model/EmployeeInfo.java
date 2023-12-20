package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employees", schema="public")
@Data
public class EmployeeInfo {
    @Id
    private int id;
    private String name;
    private String position;
    private float salary;
}
