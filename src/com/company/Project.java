package com.company;

import com.company.Client;

public class Project {
    public String difficulty;
    public Integer frontEndDays;
    public Integer backEndDays;
    public Integer dataBaseDays;
    public Integer mobileDays;
    public Integer wordpressDays;
    public Integer prestashopDays;
    public Double  projectPrice;

    public Project(String difficulty, Integer frontEndDays, Integer backEndDays, Integer dataBaseDays, Integer mobileDays, Integer wordpressDays, Integer prestashopDays, Double projectPrice) {
        this.difficulty = difficulty;
        this.frontEndDays = frontEndDays;
        this.backEndDays = backEndDays;
        this.dataBaseDays = dataBaseDays;
        this.mobileDays = mobileDays;
        this.wordpressDays = wordpressDays;
        this.prestashopDays = prestashopDays;
        this.projectPrice = projectPrice;
    }

    public static Project project1 = new Project("easy", 0, 0, 0,0,4,0,10000.0);
    public static Project project2 = new Project("medium", 4,5,0,0,0,0, 35000.0);
    public static Project project3 = new Project("hard", 13,18,11,0,0,0, 55000.0);

}
