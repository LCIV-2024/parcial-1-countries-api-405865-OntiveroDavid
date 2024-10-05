package ar.edu.utn.frc.tup.lciii.controllers;
import ar.edu.utn.frc.tup.lciii.dtos.common.CountryDTO;
import ar.edu.utn.frc.tup.lciii.model.Country;
import ar.edu.utn.frc.tup.lciii.repository.CountryRepository;
import ar.edu.utn.frc.tup.lciii.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    private final CountryRepository countryRepository;

    @GetMapping("/api/countries")
    public List<CountryDTO> getCountries(@RequestParam(required = false) String name, @RequestParam(required = false) String code) {
        List<Country> countries = countryService.getAllCountries();

        return countries.stream()
                .filter(country -> (name == null || country.getName().equalsIgnoreCase(name)) ||
                        (code == null || country.getCode().equalsIgnoreCase(code)))
                .map(countryService::mapToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/api/countries/{continent}/continent")
    public List<CountryDTO> getCountriesByContinent(@PathVariable String continent) {
        List<Country> countries = countryService.getAllCountries();
        return countries.stream()
                .filter(country -> country.getRegion().equalsIgnoreCase(continent))
                .map(countryService::mapToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/api/countries/{language}/language")
    public List<CountryDTO> getCountriesByLanguage(@PathVariable String language) {
        List<Country> countries = countryService.getAllCountries();
        return countries.stream()
                .filter(country -> country.getLanguages().containsValue(language))
                .map(countryService::mapToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/api/countries/most-borders")
    public CountryDTO getCountryWithMostBorders() {
        List<Country> countries = countryService.getAllCountries();
        return countries.stream()
                .max(Comparator.comparingInt(country -> country.getBorders().size()))
                .map(countryService::mapToDTO)
                .orElse(null);
    }

    @PostMapping("/api/countries")
    public List<CountryDTO> saveRandomCountries(@RequestBody Map<String, Integer> requestBody) {
        int amount = requestBody.get("amountOfCountryToSave");
        List<Country> allCountries = countryService.getAllCountries();

        Collections.shuffle(allCountries);
        List<Country> countriesToSave = allCountries.stream().limit(amount).collect(Collectors.toList());

        countryRepository.saveAll(countriesToSave);

        return countriesToSave.stream()
                .map(countryService::mapToDTO)
                .collect(Collectors.toList());
    }


}