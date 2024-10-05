package ar.edu.utn.frc.tup.lciii.configs;

import ar.edu.utn.frc.tup.lciii.controllers.CountryController;
import ar.edu.utn.frc.tup.lciii.model.Country;
import ar.edu.utn.frc.tup.lciii.repository.CountryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
public class GeneralBeanConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CountryRepository countryRepository() {
        return new CountryRepository() {

            @Override
            public List<Country> findByName(String name) {
                return null;
            }

            @Override
            public List<Country> findByCode(String code) {
                return null;
            }

            @Override
            public List<Country> findByRegion(String region) {
                return null;
            }

            @Override
            public List<Country> findByLanguagesContaining(String language) {
                return null;
            }

            @Override
            public List<Country> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Country> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Country> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Country> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Country> findById(String s) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(String s) {
                return false;
            }


            @Override
            public List<Country> findAll() {
                return null;
            }

            @Override
            public List<Country> findAllById(Iterable<String> strings) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(String s) {

            }


            @Override
            public void delete(Country entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends String> strings) {

            }


            @Override
            public void deleteAll(Iterable<? extends Country> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Country> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Country> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Country> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<String> strings) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Country getOne(String s) {
                return null;
            }

            @Override
            public Country getById(String s) {
                return null;
            }

            @Override
            public Country getReferenceById(String s) {
                return null;
            }

            @Override
            public <S extends Country> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Country> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Country> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Country> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Country> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Country> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Country, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }


        };
    }
}
