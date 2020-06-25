package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;

public enum Project {
    project1("1. easy", 0, 0, 0,0,4,0,10000.0, Client.ClientEasy, new ArrayList<>()),
    project2("2. medium", 4,5,0,0,0,0, 35000.0, Client.ClientScmbg, new ArrayList<>()),
    project3("3. hard", 13,18,11,0,0,0, 55000.0, Client.ClientNorm, new ArrayList<>());

    public String difficulty;
    public Integer frontEndDays;
    public Integer backEndDays;
    public Integer dataBaseDays;
    public Integer mobileDays;
    public Integer wordpressDays;
    public Integer prestashopDays;
    public Double  projectPrice;
    public Client client;
    public ArrayList<Employee> thisProjectWorkers;

    public String getDifficulty() {
        return difficulty;
    }

    public Integer getFrontEndDays() {
        return frontEndDays;
    }

    public Integer getBackEndDays() {
        return backEndDays;
    }

    public Integer getDataBaseDays() {
        return dataBaseDays;
    }

    public Integer getMobileDays() {
        return mobileDays;
    }

    public Integer getWordpressDays() {
        return wordpressDays;
    }

    public Integer getPrestashopDays() {
        return prestashopDays;
    }

    public Double getProjectPrice() {
        return projectPrice;
    }

    public Client getClient() {
        return client;
    }

    Project(String difficulty, Integer frontEndDays, Integer backEndDays, Integer dataBaseDays, Integer mobileDays, Integer wordpressDays, Integer prestashopDays, Double projectPrice, Client client, ArrayList<Employee> thisProjectWorkers) {
        this.difficulty = difficulty;
        this.frontEndDays = frontEndDays;
        this.backEndDays = backEndDays;
        this.dataBaseDays = dataBaseDays;
        this.mobileDays = mobileDays;
        this.wordpressDays = wordpressDays;
        this.prestashopDays = prestashopDays;
        this.projectPrice = projectPrice;
        this.client = client;
        this.thisProjectWorkers = thisProjectWorkers;
    }
}
