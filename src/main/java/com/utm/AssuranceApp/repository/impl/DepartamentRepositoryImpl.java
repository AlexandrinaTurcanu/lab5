package com.utm.AssuranceApp.repository.impl;

import com.utm.AssuranceApp.entity.Departament;
import com.utm.AssuranceApp.entity.Departament;
import com.utm.AssuranceApp.repository.DepartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DepartamentRepositoryImpl implements DepartamentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Departament> findAllDepartments() {
        return jdbcTemplate.query("select * from departament",
                (result, rowNum) ->
                        new Departament(
                                result.getInt("id"),
                                result.getString("denumire"),
                                result.getInt("nr_angajati"),
                                result.getInt("filiala_id")
                        ));
    }

    @Override
    public Departament findById(Integer id) {
        Departament departament =
                jdbcTemplate.queryForObject("select * from departament where id = ?",
                        (result, rowNum) ->
                                new Departament(
                                        result.getInt("id"),
                                        result.getString("denumire"),
                                        result.getInt("nr_angajati"),
                                        result.getInt("filiala_id")
                                ),id);
        return departament;
    }

    @Override
    public void save(Departament departament) {
        jdbcTemplate.update(
                "insert into departament values (?, ?, ?, ?)",
                departament.getId(), departament.getDenumire(), departament.getNr_angajati(),departament.getFiliala_id());
    }

    @Override
    public void update(Integer id, Departament departament) {
        jdbcTemplate.update(
                "update departament set denumire = ?, nr_angajati = ?, filiala_id = ? where id = ?",
                departament.getDenumire(),departament.getNr_angajati(), departament.getFiliala_id(), id);
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update(
                "delete from departament where id = ?", id);
    }

    @Override
    public boolean departamentExist(Integer id) {
        Integer count = jdbcTemplate.queryForObject("select count(*) from departament where id = ?",
                Integer.class, id);
        return count > 0;
    }

}
