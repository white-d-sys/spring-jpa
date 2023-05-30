package pd.example.springjpa.repository;

import jakarta.persistence.EntityManager;
import org.springframework.data.annotation.Persistent;
import pd.example.springjpa.entity.Employee;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    EntityManager entityManager;

    // Injecting the entityManager
    public EmployeeRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Employee> save(Employee employee) {
        entityManager.getTransaction().begin();

        if(employee.getId() == null){
            System.out.println("It is persisted");
            entityManager.persist(employee); // only will run insert
        }
        else{
            System.out.println("It is merged");
            employee = entityManager.merge(employee); // will run insert query and update query
        }

        entityManager.getTransaction().commit();
        return Optional.empty();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        Employee employee = entityManager.find(Employee.class, id);

        return  employee != null ? Optional.of(employee) : Optional.empty();
    }

    @Override
    public void deleteEmployee(Employee employee) {
        entityManager.getTransaction().begin();

        if(entityManager.contains(employee)){
            System.out.println("Employee Removed  .....");
            entityManager.remove(employee); // will run delete query
        } else {
            System.out.println("Employee Not found .....");
            entityManager.merge(employee);
        }
        entityManager.getTransaction().commit();
    }
}
