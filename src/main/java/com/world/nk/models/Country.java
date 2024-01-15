package com.world.nk.models;

import java.util.List;
public class Country {
    private String name;
    private String capital;
    private String description;
    private String imageUrl;
    private List<City> cities;
    
    public Country() {
    }

    public Country(String name, String capital, String description, String imageUrl, List<City> cities) {
        this.name = name;
        this.capital = capital;
        this.description = description;
        this.imageUrl = imageUrl;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    
}