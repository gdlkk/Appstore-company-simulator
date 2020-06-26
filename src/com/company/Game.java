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
        this.startOfGame = new GregorianCalendar(2020,0,1,9,0,0);
    }

    public void startGame() {
        company.addAvaliableEmployees();
        company.addAvaliableSubcontractors();
        company.addAvaliableProjects();
        company.addAvaliableOffice();
      do {
          if (startOfGame.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || startOfGame.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) { } else {
              company.workingTime();
          }
            payoutTime();
            System.out.println("Current date: " + startOfGame.getTime()
                    + "\nYour funds: " + company.money + "$");
            System.out.println("What you want to do? Select from actions above: ");
            showMenu();
            int yourChoice = Integer.parseInt(sc.nextLine());
            makeChoice(yourChoice);
          if (company.money < 0) {
              System.out.println("You lose!");
              isGameOver = true;
          }
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
                + "\n9 - Get a subcontractor"
                + "\n10 - Lets rent an office"
                + "\n11 - Add employees to project"
                + "\n12 - Check your project progress");
    }

    public void makeChoice(int yourChoice) {
        switch(yourChoice) {
            case 1:
                company.showAvaliableProjects();
                System.out.println("Which project you want to start?");
                int projectChoice = Integer.parseInt(sc.nextLine());
                company.startProject(projectChoice);
                if (projectChoice == 0) { } else {
                    nextTurn();
                }
            break;
            case 2:
            break;
            case 3:
                System.out.println("Which project you want to code?");
                company.showStartedProject();
                System.out.println("If you want go back press 0");
                int whichStart = Integer.parseInt(sc.nextLine());
                company.letsCode(whichStart);
                if (whichStart == 0) { } else {
                    nextTurn();
                }
            break;
            case 4:
                System.out.println("In which project you want to repair bugs?");
                Integer whichProject = Integer.parseInt(sc.nextLine());
                company.repairBugs(whichProject);
                if (whichProject == 0) { } else {
                    nextTurn();
                }
            break;
            case 5:
                company.showEndedProjects();
                System.out.println("Which project you want to hand over?");
                int whichEnd = Integer.parseInt(sc.nextLine());
                company.endProject(whichEnd);
                if (whichEnd == 0) { } else {
                    nextTurn();
                }
            break;
            case 6: {
                company.showAvaliableEmployees();
                System.out.println("Which employee you want to hire?: ");
                int employeeChoice = Integer.parseInt(sc.nextLine());
                company.hireEmployee(employeeChoice);
                if (employeeChoice == 0) { } else {
                    nextTurn();
                }
            }
            break;
            case 7:{
                company.showHiredEmployees();
                System.out.println("Which employee you want to fire?");
                int fireChoice = Integer.parseInt(sc.nextLine());
                company.fireEmployee(fireChoice);
                if (fireChoice == 0) { } else {
                    nextTurn();
                }
            }
            break;
            case 8:
            break;
            case 9: {
                company.showAvaliableSubcontractors();
                System.out.println("Which subcontractor you want to hire?");
                int subcontractorChoice = Integer.parseInt(sc.nextLine());
                company.hireSubcontractor(subcontractorChoice);
                if (subcontractorChoice == 0) { } else {
                 nextTurn();
                }
            }
            break;
            case 10: {
                company.showAvaliableOffices();
                System.out.println("Which office you want to rent?");
                int whichOffice = Integer.parseInt(sc.nextLine());
                company.rentOffice(whichOffice);
                if (whichOffice == 0) { } else {
                    nextTurn();
                }
            }
            break;
            case 11: {
                System.out.println("Which project do you want to add an employee to?");
                company.showStartedProject();
                projectChoice = Integer.parseInt(sc.nextLine());
                company.addWorkersToProject(projectChoice);
                if (projectChoice == 0) { } else {
                    nextTurn();
                }
            }
            case 12: {
                company.showStartedProject();
            }
            break;
        }
    }
    public void nextTurn() {
        startOfGame.add(Calendar.DAY_OF_MONTH, 1);
    }
    public void payoutTime() {
        if (startOfGame.get(Calendar.DAY_OF_MONTH) == 10) {
            company.businessExpenseSum();
            company.money -= company.businessExpense;
            company.businessExpense = 0.0;
        }
    }
}

