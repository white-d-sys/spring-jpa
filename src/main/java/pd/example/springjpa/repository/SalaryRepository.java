package pd.example.springjpa.repository;

import pd.example.springjpa.entity.Salary;
import java.util.Optional;

public interface SalaryRepository {
    Optional<Salary> save(Salary salary);
    Optional<Salary> getSalaryById(Long id);
    void deleteSalary(Salary salary);
}
