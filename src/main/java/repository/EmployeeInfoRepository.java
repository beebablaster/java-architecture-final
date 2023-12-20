package repository;

import model.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {
    public EmployeeInfo getEmployeeInfoById(int id);
}
