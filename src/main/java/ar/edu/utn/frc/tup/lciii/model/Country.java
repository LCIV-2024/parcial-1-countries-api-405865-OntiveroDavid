package ar.edu.utn.frc.tup.lciii.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    private String name;

    @Column
    private long population;

    @Column
    private double area;

    @Column
    private String code;

    @Column
    private String region;

    @Column
    private List<String> borders;

    @Column
    private Map<String, String> languages;
}