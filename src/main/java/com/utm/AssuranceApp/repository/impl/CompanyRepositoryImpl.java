package com.utm.AssuranceApp.repository.impl;

import com.utm.AssuranceApp.entity.Company;
import com.utm.AssuranceApp.entity.CompanyDetails;
import com.utm.AssuranceApp.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Company> findAllCompanies() {
        return jdbcTemplate.query("select * from company",
                (result, rowNum) ->
                        new Company(
                                result.getInt("id"),
                                result.getString("denumire"),
                                result.getString("licenta"),
                                result.getInt("nr_filiale"),
                                result.getString("email")
                        ));
    }

    @Override
    public CompanyDetails findById(Integer id) {
        CompanyDetails CompanyDetails =
                jdbcTemplate.queryForObject("select * from company where id = ?",
                        (result, rowNum) ->
                                new CompanyDetails(
                                        result.getInt("id"),
                                        result.getString("denumire"),
                                        result.getString("licenta"),
                                        result.getInt("nr_filiale"),
                                        result.getString("email")
                                ),id);
        return CompanyDetails;
    }

    @Override
    public void save(Company company) {
        jdbcTemplate.update(
                "insert into company values (?, ?, ?, ?, ?)",
                company.getId(), company.getDenumire(), company.getLicenta(),company.getNr_filiale(),company.getEmail());
    }

    @Override
    public void update(Integer id, Company company) {
        jdbcTemplate.update(
                "update company set denumire = ?, licenta = ?, nr_filiale = ?,email = ? where id = ?",
                company.getDenumire(),company.getLicenta(), company.getNr_filiale(),company.getEmail(), id);
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update(
                "delete from company where id = ?", id);
    }

    @Override
    public boolean companyExist(Integer id) {
        Integer count = jdbcTemplate.queryForObject("select count(*) from company where id = ?",
                Integer.class, id);
        return count > 0;
    }
}
