package com.utm.AssuranceApp.repository.impl;

import com.utm.AssuranceApp.entity.Filiala;
import com.utm.AssuranceApp.entity.FilialaDetails;
import com.utm.AssuranceApp.repository.FilialaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FilialaRepositoryImpl implements FilialaRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Filiala> findAllBranches() {
        return jdbcTemplate.query("select * from filiala",
                (result, rowNum) ->
                        new Filiala(
                                result.getInt("id"),
                                result.getString("nr_filialei"),
                                result.getInt("nr_produse"),
                                result.getString("adresa"),
                                result.getInt("compania_id")
                        ));
    }

    @Override
    public FilialaDetails findById(Integer id) {
        FilialaDetails FilialaDetails =
                jdbcTemplate.queryForObject("select * from filiala where id = ?",
                        (result, rowNum) ->
                                new FilialaDetails(
                                        result.getInt("id"),
                                        result.getString("nr_filialei"),
                                        result.getInt("nr_produse"),
                                        result.getString("adresa"),
                                        result.getInt("compania_id")
                                ),id);
        return FilialaDetails;
    }

    @Override
    public void save(Filiala filiala) {
        jdbcTemplate.update(
                "insert into company values (?, ?, ?, ?, ?)",
                filiala.getId(), filiala.getNr_filialei(), filiala.getNr_produse(),filiala.getAdresa(),filiala.getCompania_id());
    }

    @Override
    public void update(Integer id, Filiala filiala) {
        jdbcTemplate.update(
                "update filiala set nr_filialei = ?, nr_produse = ?, adresa = ?,compania_id = ? where id = ?",
                filiala.getNr_filialei(), filiala.getNr_produse(),filiala.getAdresa(),filiala.getCompania_id(),id);
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update(
                "delete from filiala where id = ?", id);
    }

    public boolean filialaExist(Integer id) {
        Integer count = jdbcTemplate.queryForObject("select count(*) from filiala where id = ?",
                Integer.class, id);
        return count > 0;
    }
}
