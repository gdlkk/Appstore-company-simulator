package com.company;

public enum Subcontractor {
    bestStudent("1. SpongeBob", "SquarePants",  5000.0, randomBoolean(),randomBoolean(),randomBoolean(),randomBoolean(),randomBoolean(),randomBoolean(),0.0,0.0, false),
    avgStudent("2. Winnie", "the-Pooh", 3000.0, randomBoolean(), randomBoolean(), randomBoolean(), randomBoolean(), randomBoolean(),randomBoolean(),0.10,0.0, false),
    worstStudent("3. Donkey", "Kong", 2500.0, randomBoolean(), randomBoolean(), randomBoolean(), randomBoolean(), randomBoolean() ,randomBoolean(), 0.20,0.20, false);

    public String firstName;
    public Double subcontractorCost;
    public String lastName;
    public Boolean frontEnd;
    public Boolean backEnd;
    public Boolean dataBase;
    public Boolean mobile;
    public Boolean wordpress;
    public Boolean prestashop;
    public Double buggedCodeChance;
    public Double delayChance;
    public Boolean isWorking;
    public static boolean randomBoolean() {
        return Math.random() < 0.5;
    }

    public String getFirstName() {
        return firstName;
    }

    public Double getSubcontractorCost() {
        return subcontractorCost;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getFrontEnd() {
        return frontEnd;
    }

    public Boolean getBackEnd() {
        return backEnd;
    }

    public Boolean getDataBase() {
        return dataBase;
    }

    public Boolean getMobile() {
        return mobile;
    }

    public Boolean getWordpress() {
        return wordpress;
    }

    public Boolean getPrestashop() {
        return prestashop;
    }

    public Double getBuggedCodeChance() {
        return buggedCodeChance;
    }

    public Double getDelayChance() {
        return delayChance;
    }

    Subcontractor(String firstName, String lastName, Double subcontractorCost, Boolean frontEnd, Boolean backEnd, Boolean dataBase, Boolean mobile, Boolean wordpress, Boolean prestashop, Double buggedCodeChance, Double delayChance, Boolean isWorking) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subcontractorCost = subcontractorCost;
        this.frontEnd = frontEnd;
        this.backEnd = backEnd;
        this.dataBase = dataBase;
        this.mobile = mobile;
        this.wordpress = wordpress;
        this.prestashop = prestashop;
        this.buggedCodeChance = buggedCodeChance;
        this.delayChance = delayChance;
        this.isWorking = isWorking;
    }

}
