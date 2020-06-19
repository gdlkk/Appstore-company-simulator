package com.company;

import java.util.Scanner;

public class Game {
    public Scanner sc;
    public Boolean isGameOver;
    public Company company;
    public Integer turn;

    public Game() {
        this.sc = new Scanner(System.in);
        this.isGameOver = false;
        this.company = new Company();
        this.turn = 0;
    }

    public void startGame() {
        company.addAvaliableEmployees();
         company.addAvaliableSubcontractors();
      do {
            System.out.println("Number of turns: " + turn);
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
                turn++;
            }
            break;
            case 7:{
                company.showHiredEmployees();
                System.out.println("Which employee you want to fire?");
                int fireChoice = Integer.parseInt(sc.nextLine());
                company.fireEmployee(fireChoice);
                turn ++;
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
}

