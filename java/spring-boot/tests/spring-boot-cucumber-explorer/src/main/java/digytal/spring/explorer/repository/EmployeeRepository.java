package digytal.spring.explorer.repository;

import digytal.spring.explorer.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();
    private int records=0;
    public Integer save(Employee employee){
        employee.setId(++records);
        return employee.getId();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
