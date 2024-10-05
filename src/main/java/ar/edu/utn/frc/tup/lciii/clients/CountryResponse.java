package ar.edu.utn.frc.tup.lciii.clients;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryResponse {
    private String name;
    private long population;
    private double area;
    private String code;
    private String region;
    private List<String> borders;
    private Map<String, String> languages;
}
