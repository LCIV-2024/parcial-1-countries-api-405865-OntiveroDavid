package ar.edu.utn.frc.tup.lciii.repository;

import ar.edu.utn.frc.tup.lciii.model.Country;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Completar segun corresponda
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByName(String name);
    List<Country> findByCode(String code);
    List<Country> findByRegion(String region);
    List<Country> findByLanguagesContaining(String language);
}
