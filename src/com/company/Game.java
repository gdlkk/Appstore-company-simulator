package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Game {
    public Scanner sc;
    public Boolean isGameOver;
    public Company company;
    public Calendar startOfGame;

    public Game() {
        this.sc = new Scanner(System.in);
        this.isGameOver = false;
        this.company = new Company();
        this.startOfGame = new GregorianCalendar(2020,0,1);
    }

    public void startGame() {
        company.addAvaliableEmployees();
        company.addAvaliableSubcontractors();
      do {
            System.out.println("Current date: " + startOfGame.getTime());
            System.out.println("What you want to do? Select from actions above: ");
            showMenu();
            int yourChoice = Integer.parseInt(sc.nextLine());
            makeChoice(yourChoice);
        } while(!isGameOver);
    }

    public void showMenu() {
        System.out.println("\n1 - Sign the contract for project"
                + "\n2 - Search for clients"
                + "\n3 - Let's code"
                + "\n4 - Time for testing"
                + "\n5 - Hand over finished project"
                + "\n6 - Hire an employee"
                + "\n7 - Fire an employee"
                + "\n8 - Give your hard earned money to ZUS and GUS"
                + "\n9 - Get a subcontractor");
    }

    public void makeChoice(int yourChoice) {
        switch(yourChoice) {
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
            break;
            case 6: {
                company.showAvaliableEmployees();
                System.out.println("Which employee you want to hire?: ");
                int employeeChoice = Integer.parseInt(sc.nextLine());
                company.hireEmployee(employeeChoice);
                nextTurn();
            }
            break;
            case 7:{
                company.showHiredEmployees();
                System.out.println("Which employee you want to fire?");
                int fireChoice = Integer.parseInt(sc.nextLine());
                company.fireEmployee(fireChoice);
                nextTurn();
            }
            break;
            case 8:
            break;
            case 9: {
                company.showAvaliableSubcontractors();
            }
            break;
        }
    }
    public void nextTurn() {
        startOfGame.add(Calendar.DAY_OF_MONTH, 1);
    }
}

