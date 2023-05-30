package pd.example.springjpa.repository;

import pd.example.springjpa.entity.Company;

import java.util.Optional;

public class CompanyRepositoryImpl implements CompanyRepository{
    @Override
    public Optional<Company> save(Company Company) {
        return Optional.empty();
    }

    @Override
    public Optional<Company> getCompanyById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteCompany(Company company) {

    }
}
