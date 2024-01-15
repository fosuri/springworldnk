package com.world.nk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.world.nk.models.City;
import com.world.nk.models.Country;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class CountryController {

    @GetMapping("/countries")
    public String showCountries(Model model) {
        List<Country> countries = createCountryList();
        model.addAttribute("countries", countries);
        return "countries";
    }

    private List<Country> createCountryList() {
        List<Country> countryList = new ArrayList<>();

        
        Country country1 = new Country();
        country1.setName("Россия");
        country1.setCapital("Москва");
        country1.setDescription("Россия — крупная страна, охватывающая значительную часть Восточной Европы и Северной Азии.");
        country1.setImageUrl("/images/russia.png");
        List<City> cities1 = Arrays.asList(
                new City("Москва", 12678079),
                new City("Санкт-Петербург", 5398064),
                new City("Новосибирск", 1612833),
                new City("Екатеринбург", 1455903),
                new City("Казань", 1257391)
        );
        country1.setCities(cities1);
        countryList.add(country1);


        Country country2 = new Country();
        country2.setName("США");
        country2.setCapital("Вашингтон");
        country2.setDescription("Соединенные Штаты Америки — крупнейшая страна в Северной Америке.");
        country2.setImageUrl("/images/usa.png");
        List<City> cities2 = Arrays.asList(
                new City("Нью-Йорк", 8398748),
                new City("Лос-Анджелес", 3999759),
                new City("Чикаго", 2716000),
                new City("Хьюстон", 2320268),
                new City("Филадельфия", 1584138)
        );
        country2.setCities(cities2);
        countryList.add(country2);


        Country country3 = new Country();
        country3.setName("Китай");
        country3.setCapital("Пекин");
        country3.setDescription("Китай — крупнейшая страна в Восточной Азии, занимающая первое место в мире по численности населения.");
        country3.setImageUrl("/images/china.png");
        List<City> cities3 = Arrays.asList(
                new City("Шанхай", 24256800),
                new City("Пекин", 21516000),
                new City("Гуанчжоу", 13982500),
                new City("Шэньчжэнь", 13026700),
                new City("Тяньцзинь", 11115000)
        );
        country3.setCities(cities3);
        countryList.add(country3);
        

        Country country4 = new Country();
        country4.setName("Индия");
        country4.setCapital("Нью-Дели");
        country4.setDescription("Индия — страна в Южной Азии, вторая по численности населения в мире.");
        country4.setImageUrl("/images/india.png");
        List<City> cities4 = Arrays.asList(
                new City("Мумбаи", 22390000),
                new City("Дели", 18267000),
                new City("Бангалор", 12573000),
                new City("Хайдарабад", 10115000),
                new City("Колката", 4631400)
        );
        country4.setCities(cities4);
        countryList.add(country4);
        

        Country country5 = new Country();
        country5.setName("Бразилия");
        country5.setCapital("Бразилиа");
        country5.setDescription("Бразилия — крупнейшая страна в Южной Америке.");
        country5.setImageUrl("/images/brazil.png");
        List<City> cities5 = Arrays.asList(
                new City("Сан-Паулу", 21299119),
                new City("Рио-де-Жанейро", 6747815),
                new City("Сальвадор", 2940314),
                new City("Бразилиа", 3015268),
                new City("Форталеза", 2643247)
        );
        country5.setCities(cities5);
        countryList.add(country5);
        

        Country country6 = new Country();
        country6.setName("Германия");
        country6.setCapital("Берлин");
        country6.setDescription("Германия — страна в Западной Европе, одно из ведущих экономических государств мира.");
        country6.setImageUrl("/images/germany.png");
        List<City> cities6 = Arrays.asList(
                new City("Берлин", 3520031),
                new City("Гамбург", 1830584),
                new City("Мюнхен", 1484226),
                new City("Кёльн", 1085664),
                new City("Франкфурт-на-Майне", 753056)
        );
        country6.setCities(cities6);
        countryList.add(country6);
        

        Country country7 = new Country();
        country7.setName("Япония");
        country7.setCapital("Токио");
        country7.setDescription("Япония — страна в Восточной Азии, одна из ведущих технологических держав мира.");
        country7.setImageUrl("/images/japan.png");
        List<City> cities7 = Arrays.asList(
                new City("Токио", 37833000),
                new City("Йокогама", 3726167),
                new City("Осака", 2691279),
                new City("Нагоя", 2291956),
                new City("Саппоро", 1968927)
        );
        country7.setCities(cities7);
        countryList.add(country7);


        Country country8 = new Country();
        country8.setName("Франция");
        country8.setCapital("Париж");
        country8.setDescription("Франция — страна в Западной Европе, известная своей культурой, искусством и кулинарией.");
        country8.setImageUrl("/images/france.png");
        List<City> cities8 = Arrays.asList(
                new City("Париж", 2140526),
                new City("Марсель", 860363),
                new City("Лион", 515695),
                new City("Тулуза", 475438),
                new City("Ницца", 342295)
        );
        country8.setCities(cities8);
        countryList.add(country8);
        

        Country country9 = new Country();
        country9.setName("Великобритания");
        country9.setCapital("Лондон");
        country9.setDescription("Великобритания — островное государство в Северо-Западной Европе, включающее Англию, Шотландию, Уэльс и Северную Ирландию.");
        country9.setImageUrl("/images/uk.png");
        List<City> cities9 = Arrays.asList(
                new City("Лондон", 8982256),
                new City("Бирмингем", 1141816),
                new City("Манчестер", 547627),
                new City("Глазго", 635640),
                new City("Ливерпуль", 498042)
        );
        country9.setCities(cities9);
        countryList.add(country9);
        

        Country country10 = new Country();
        country10.setName("Канада");
        country10.setCapital("Оттава");
        country10.setDescription("Канада — крупнейшее по территории государство в Северной Америке.");
        country10.setImageUrl("/images/canada.png");
        List<City> cities10 = Arrays.asList(
                new City("Торонто", 2731571),
                new City("Монреаль", 1704694),
                new City("Калгари", 1239220),
                new City("Ванкувер", 631486),
                new City("Оттава", 994837)
        );
        country10.setCities(cities10);
        countryList.add(country10);

        return countryList;
    }
}
