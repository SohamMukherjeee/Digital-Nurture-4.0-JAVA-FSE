package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmlearnApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmlearnApplication.class, args);

        CountryService countryService = context.getBean(CountryService.class);

        testGetAllCountries(countryService);
    }

    public static void testGetAllCountries(CountryService countryService) {
        List<Country> countries = countryService.getAllCountries();
        System.out.println("Retrieved countries:");
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
