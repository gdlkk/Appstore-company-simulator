package com.company;

import java.util.ArrayList;
import java.util.List;

public enum Employee {
    me("Mateusz", "Dettlaff",0.0, true, true, true, false, true, true, true),
    coder1("1. Janusz", "Tracz", 6500.0, true, true, false, true, false, false, false),
    coder2("2. Ryszard", "Drań", 5350.0, false, false, true, false, true, true, false),
    coder3("3. Krzysztof", "Zapalarski", 4550.0, false, false, true, true, false, false, false),
    coder4("4. Andrew", "Golara", 3550.0, false, false, false, false, true, true, false),
    coder5("5. Ferdynand", "Kiepski", 6200.0, true, true, false, true, true, true, false);

    public int numberOfEmployees = 0;
    public String firstName;
    public Double salary;
    public String lastName;
    public Boolean frontEnd;
    public Boolean backEnd;
    public Boolean dataBase;
    public Boolean mobile;
    public Boolean wordpress;
    public Boolean prestashop;
    public Boolean isHired;

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getFirstName() {
        return firstName;
    }

    public Double getSalary() {
        return salary;
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

    Employee(String firstName, String lastName, Double salary, Boolean frontEnd, Boolean backEnd, Boolean dataBase, Boolean mobile, Boolean wordpress, Boolean prestashop, Boolean isHired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.frontEnd = frontEnd;
        this.backEnd = backEnd;
        this.dataBase = dataBase;
        this.mobile = mobile;
        this.wordpress = wordpress;
        this.prestashop = prestashop;
        this.isHired = isHired;
    }
}
