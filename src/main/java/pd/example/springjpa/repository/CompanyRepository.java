package pd.example.springjpa.repository;

import pd.example.springjpa.entity.Company;
import java.util.Optional;

public interface CompanyRepository {
    Optional<Company> save(Company Company);
    Optional<Company> getCompanyById(Long id);
    void deleteCompany(Company company);
}
