package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;

public enum Project {
    project1("1. easy", 0.0, 0.0, 0.0,0.0,4.0,0.0,10000.0, Client.ClientEasy, new ArrayList<>(), new ArrayList<>(), 0,0,0),
    project2("2. medium", 4.0,5.0,0.0,0.0,0.0,0.0, 35000.0, Client.ClientScmbg, new ArrayList<>(), new ArrayList<>(),0,0,0),
    project3("3. hard", 13.0,18.0,11.0,0.0,0.0,0.0, 55000.0, Client.ClientNorm, new ArrayList<>(), new ArrayList<>(),0,0,0),
    project4("4. medium", 8.0,10.0,0.0,0.0,0.0,0.0,40000.0, Client.ClientEasy, new ArrayList<>(), new ArrayList<>(), 0 ,0 ,0),
    project5("5. medium", 8.0,9.0,6.0,0.0,0.0,0.0,45000.0, Client.ClientEasy, new ArrayList<>(), new ArrayList<>(), 0 ,0 ,0);


    public String difficulty;
    public Double frontEndDays;
    public Double backEndDays;
    public Double dataBaseDays;
    public Double mobileDays;
    public Double wordpressDays;
    public Double prestashopDays;
    public Double  projectPrice;
    public Client client;
    public ArrayList<Employee> thisProjectWorkers;
    public ArrayList<Subcontractor> thisProjectSubcontractors;
    public Integer bugs;
    public Integer numberOfTesters;
    public Integer numberOfCoders;
    public String getDifficulty() {
        return difficulty;
    }

    public Double getFrontEndDays() {
        return frontEndDays;
    }

    public Double getBackEndDays() {
        return backEndDays;
    }

    public Double getDataBaseDays() {
        return dataBaseDays;
    }

    public Double getMobileDays() {
        return mobileDays;
    }

    public Double getWordpressDays() {
        return wordpressDays;
    }

    public Double getPrestashopDays() {
        return prestashopDays;
    }

    public Double getProjectPrice() {
        return projectPrice;
    }

    public Client getClient() {
        return client;
    }

    Project(String difficulty, Double frontEndDays, Double backEndDays, Double dataBaseDays, Double mobileDays, Double wordpressDays, Double prestashopDays, Double projectPrice, Client client, ArrayList<Employee> thisProjectWorkers, ArrayList<Subcontractor> thisProjectSubcontractors, Integer bugs, Integer numberOfTesters, Integer numberOfCoders) {
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
        this.thisProjectSubcontractors = thisProjectSubcontractors;
        this.bugs = bugs;
        this.numberOfTesters = numberOfTesters;
        this.numberOfCoders = numberOfCoders;
    }
}
