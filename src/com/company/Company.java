package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    public Integer numberOfEmployees = 0;
    public Integer numberOfProjects = 3;
    public Double money = 30000.0;
    public Double businessExpense = 0.0;
    public ArrayList<Employee> avaliableEmployees = new ArrayList<>();
    public ArrayList<Project> avaliableProjects = new ArrayList<>();
    public ArrayList<Employee> hiredEmployees = new ArrayList<>();
    public ArrayList<Subcontractor> avaliableSubcontractors = new ArrayList<>();
    public ArrayList<Subcontractor> workingSubcontractors = new ArrayList<>();
    public ArrayList<Project> startedProjects = new ArrayList<>();
    public ArrayList<Project> endedProjects = new ArrayList<>();
    public ArrayList<Office> avaliableOffice = new ArrayList<>();
    public Office yourOffice = null;
    public Scanner sc = new Scanner(System.in);

    public void addAvaliableOffice() {
        avaliableOffice.add(Office.officeSmall);
        avaliableOffice.add(Office.officeMedium);
        avaliableOffice.add(Office.officeBig);
    }

    public void addAvaliableEmployees() {
        avaliableEmployees.add(Employee.coder1);
        avaliableEmployees.add(Employee.coder2);
        avaliableEmployees.add(Employee.coder3);
        avaliableEmployees.add(Employee.coder4);
        avaliableEmployees.add(Employee.coder5);
    }

    public void addAvaliableProjects() {
        avaliableProjects.add(Project.project1);
        avaliableProjects.add(Project.project2);
        avaliableProjects.add(Project.project3);
    }

    public void showAvaliableEmployees() {
        for (Employee employee : avaliableEmployees) {
            System.out.println("First name: " + employee.getFirstName() + " Last name: " + employee.getLastName() + " Salary: " + employee.getSalary() + " Skills(front-end/back-end/data-base/mobile/wordpress/prestashop): "
                    + employee.getFrontEnd() + "/" + employee.getBackEnd() + "/" + employee.getDataBase() + "/" + employee.getMobile() + "/" + employee.getWordpress() + "/" + employee.getPrestashop());
        }
        System.out.println("If you want go back press 0");
    }

    public void hireEmployee(int employeeChoice) {
        if (yourOffice == null) {
            System.out.println("You dont have office, you cant hire anyone :(");
        } else {
            if (employeeChoice == 1 & numberOfEmployees < yourOffice.officeCapacity) {
                if (Employee.coder1.isHired == true) {
                    System.out.println("Wrong input!");
                } else {
                    avaliableEmployees.remove(Employee.coder1);
                    hiredEmployees.add(Employee.coder1);
                    Employee.coder1.isHired = true;
                    numberOfEmployees += 1;
                }
            } else if (employeeChoice == 2 & numberOfEmployees < yourOffice.officeCapacity) {
                if (Employee.coder2.isHired == true) {
                    System.out.println("Wrong input!");
                } else {
                    avaliableEmployees.remove(Employee.coder2);
                    hiredEmployees.add(Employee.coder2);
                    Employee.coder2.isHired = true;
                    numberOfEmployees += 1;
                }
            } else if (employeeChoice == 3 & numberOfEmployees < yourOffice.officeCapacity) {
                if (Employee.coder3.isHired == true) {
                    System.out.println("Wrong input!");
                } else {
                    Employee.coder3.isHired = true;
                    avaliableEmployees.remove(Employee.coder3);
                    hiredEmployees.add(Employee.coder3);
                    numberOfEmployees += 1;
                }
            } else if (employeeChoice == 4 & numberOfEmployees < yourOffice.officeCapacity) {
                if (Employee.coder4.isHired == true) {
                    System.out.println("Wrong input!");
                } else {
                    avaliableEmployees.remove(Employee.coder4);
                    hiredEmployees.add(Employee.coder4);
                    Employee.coder4.isHired = true;
                    numberOfEmployees += 1;
                }
            } else if (employeeChoice == 5 & numberOfEmployees < yourOffice.officeCapacity) {
                if (Employee.coder5.isHired == true) {
                    System.out.println("Wrong input!");
                } else {
                    avaliableEmployees.remove(Employee.coder5);
                    hiredEmployees.add(Employee.coder5);
                    Employee.coder5.isHired = true;
                    numberOfEmployees += 1;
                }
            } else if (employeeChoice == 0) {
            } else {
                System.out.println("Wrong input or your office is to small!");
            }
        }
    }

    public void showHiredEmployees() {
        for (Employee employee : hiredEmployees) {
            System.out.println("First name: " + employee.getFirstName() + " Last name: " + employee.getLastName() + " Salary: " + employee.getSalary() + " Skills(front-end/back-end/data-base/mobile/wordpress/prestashop): "
                    + employee.getFrontEnd() + "/" + employee.getBackEnd() + "/" + employee.getDataBase() + "/" + employee.getMobile() + "/" + employee.getWordpress() + "/" + employee.getPrestashop());
        }
        System.out.println("If you want go back press 0");
    }

    public void fireEmployee(int employeeChoice) {
        if (employeeChoice == 1) {
            if (Employee.coder1.isHired == false) {
                System.out.println("Wrong input!");
            } else {
                avaliableEmployees.add(Employee.coder1);
                hiredEmployees.remove(Employee.coder1);
                Employee.coder1.isHired = false;
                numberOfEmployees -= 1;
                money -= 2000.0;
            }
        } else if (employeeChoice == 2) {
            if (Employee.coder2.isHired == false) {
                System.out.println("Wrong input!");
            } else {
                avaliableEmployees.add(Employee.coder2);
                avaliableEmployees.remove(Employee.coder2);
                Employee.coder2.isHired = false;
                numberOfEmployees -= 1;
                money -= 2000.0;
            }
        } else if (employeeChoice == 3) {
            if (Employee.coder3.isHired == false) {
                System.out.println("Wrong input!");
            } else {
                avaliableEmployees.add(Employee.coder3);
                avaliableEmployees.remove(Employee.coder3);
                Employee.coder3.isHired = false;
                numberOfEmployees -= 1;
                money -= 2000.0;
            }
        } else if (employeeChoice == 4) {
            if (Employee.coder4.isHired == false) {
                System.out.println("Wrong input!");
            } else {
                avaliableEmployees.add(Employee.coder4);
                avaliableEmployees.remove(Employee.coder4);
                Employee.coder4.isHired = false;
                numberOfEmployees -= 1;
                money -= 2000.0;
            }
        } else if (employeeChoice == 5) {
            if (Employee.coder5.isHired == false) {
                System.out.println("Wrong input!");
            } else {
                avaliableEmployees.add(Employee.coder5);
                avaliableEmployees.remove(Employee.coder5);
                Employee.coder5.isHired = false;
                numberOfEmployees -= 1;
                money -= 2000.0;
            }
        } else if (employeeChoice == 0) {
        }
        else {
            System.out.println("Wrong input!");

        }
    }

    public void addAvaliableSubcontractors() {
        avaliableSubcontractors.add(Subcontractor.bestStudent);
        avaliableSubcontractors.add(Subcontractor.avgStudent);
        avaliableSubcontractors.add(Subcontractor.worstStudent);
    }

    public void showAvaliableSubcontractors() {
        for (Subcontractor subcontractor : avaliableSubcontractors) {
            System.out.println("First name: " + subcontractor.getFirstName() + " Last name: " + subcontractor.getLastName() + " Salary: " + subcontractor.getSubcontractorCost() + " Skills(front-end/back-end/data-base/mobile/wordpress/prestashop): "
                    + subcontractor.getFrontEnd() + "/" + subcontractor.getBackEnd() + "/" + subcontractor.getDataBase() + "/" + subcontractor.getMobile() + "/" + subcontractor.getWordpress() + "/" + subcontractor.getPrestashop());
        }
        System.out.println("If you want go back press 0");
    }

    public void hireSubcontractor(int subcontractorChoice) {
        if (subcontractorChoice == 1 & avaliableSubcontractors.contains(Subcontractor.bestStudent)) {
            avaliableSubcontractors.remove(Subcontractor.bestStudent);
            workingSubcontractors.add(Subcontractor.bestStudent);
            Subcontractor.bestStudent.isWorking = true;
        } else if (subcontractorChoice == 2 & avaliableSubcontractors.contains(Subcontractor.avgStudent) ) {
            avaliableSubcontractors.remove(Subcontractor.avgStudent);
            workingSubcontractors.add(Subcontractor.avgStudent);
            Subcontractor.avgStudent.isWorking = true;
        } else if (subcontractorChoice == 3 & avaliableSubcontractors.contains(Subcontractor.worstStudent)) {
            avaliableSubcontractors.remove(Subcontractor.worstStudent);
            workingSubcontractors.add(Subcontractor.worstStudent);
            Subcontractor.worstStudent.isWorking = true;
        } else if ( subcontractorChoice == 0) {

        } else {
            System.out.println("Wrong input!");
        }
        System.out.println("If you want go back press 0");
    }

    public void showAvaliableProjects() {
        for (Project project : avaliableProjects) {
            System.out.println("Difficulty: " + project.getDifficulty() + " Days needed(front-end/back-end/data-base/mobile/wordpress/prestashop): "
                    + project.frontEndDays + "/" + project.backEndDays + "/" + project.dataBaseDays + "/" + project.mobileDays + "/" + project.wordpressDays + "/" + project.prestashopDays
                    + " Reward: " + project.getProjectPrice() + "$");
        }
        System.out.println("If you want go back press 0");
    }

    public void startProject(int projectChoice) {
        if (projectChoice == 1 & avaliableProjects.contains(Project.project1)) {
            avaliableProjects.remove(Project.project1);
            startedProjects.add(Project.project1);
        } else if (projectChoice == 2 & avaliableProjects.contains(Project.project2)) {
            avaliableProjects.remove(Project.project2);
            startedProjects.add(Project.project2);
        } else if (projectChoice == 3 & avaliableProjects.contains(Project.project3)) {
            avaliableProjects.remove(Project.project3);
            startedProjects.add(Project.project3);
        } else if (projectChoice == 0) {

        } else {
            System.out.println("Wrong input!");
        }
    }

    public void showStartedProject() {
        for (Project project : startedProjects) {
            System.out.println("Difficulty: " + project.getDifficulty() + " Days needed(front-end/back-end/data-base/mobile/wordpress/prestashop): "
                    + project.frontEndDays + "/" + project.backEndDays + "/" + project.dataBaseDays + "/" + project.mobileDays + "/" + project.wordpressDays + "/" + project.prestashopDays
                    + " Reward: " + project.getProjectPrice() + "$");
        }
    }

    public void letsCode(int whichProject) {
        if (whichProject == 1 & startedProjects.contains(Project.project1)) {
            if (Project.project1.frontEndDays != 0) {
                Project.project1.frontEndDays --;
            } else {
                if (Project.project1.backEndDays != 0) {
                    Project.project1.backEndDays --;
                } else {
                    if (Project.project1.dataBaseDays != 0) {
                        Project.project1.dataBaseDays --;
                    } else {
                        if (Project.project1.wordpressDays != 0) {
                            Project.project1.wordpressDays --;
                        } else {
                            if (Project.project1.prestashopDays != 0) {
                                Project.project1.prestashopDays --;
                            } else {
                                if (Project.project1.mobileDays != 0) {
                                    System.out.println("You don't know how to code mobile, hire someone or get a subcontractor!");
                                }
                            }
                        }
                    }
                }
            }
            if (Project.project1.frontEndDays <= 0 & Project.project1.backEndDays <= 0 & Project.project1.dataBaseDays <= 0 & Project.project1.mobileDays <= 0 & Project.project1.wordpressDays <= 0 & Project.project1.prestashopDays == 0) {
                System.out.println("This project is ended!");
                startedProjects.remove(Project.project1);
                endedProjects.add(Project.project1);
            }
        } else if (whichProject == 2 & startedProjects.contains(Project.project2)) {
            if (Project.project2.frontEndDays != 0) {
                Project.project2.frontEndDays --;
            } else {
                if (Project.project2.backEndDays != 0) {
                    Project.project2.backEndDays --;
                } else {
                    if (Project.project2.dataBaseDays != 0) {
                        Project.project2.dataBaseDays --;
                    } else {
                        if (Project.project2.wordpressDays != 0) {
                            Project.project2.wordpressDays --;
                        } else {
                            if (Project.project2.prestashopDays != 0) {
                                Project.project2.prestashopDays --;
                            } else {
                                if (Project.project2.mobileDays != 0) {
                                    System.out.println("You don't know how to code mobile, hire someone or get a subcontractor!");
                                }
                            }
                        }
                    }
                }
            }
            if (Project.project2.frontEndDays <= 0 & Project.project2.backEndDays <= 0 & Project.project2.dataBaseDays <= 0 & Project.project2.mobileDays <= 0 & Project.project2.wordpressDays <= 0 & Project.project2.prestashopDays == 0) {
                System.out.println("This project is ended!");
                startedProjects.remove(Project.project2);
                endedProjects.add(Project.project2);
            }
        } else if (whichProject == 3 & startedProjects.contains(Project.project3)) {
            if (Project.project3.frontEndDays != 0) {
                Project.project3.frontEndDays --;
            } else {
                if (Project.project3.backEndDays != 0) {
                    Project.project3.backEndDays --;
                } else {
                    if (Project.project3.dataBaseDays != 0) {
                        Project.project3.dataBaseDays --;
                    } else {
                        if (Project.project3.wordpressDays != 0) {
                            Project.project3.wordpressDays --;
                        } else {
                            if (Project.project3.prestashopDays != 0) {
                                Project.project3.prestashopDays --;
                            } else {
                                if (Project.project3.mobileDays != 0) {
                                    System.out.println("You don't know how to code mobile, hire someone or get a subcontractor!");
                                }
                            }
                        }
                    }
                }
            }
            if (Project.project3.frontEndDays <= 0 & Project.project3.backEndDays <= 0 & Project.project3.dataBaseDays == 0 & Project.project3.mobileDays <= 0 & Project.project3.wordpressDays <= 0 & Project.project3.prestashopDays <= 0) {
                System.out.println("This project is ended!");
                startedProjects.remove(Project.project3);
                endedProjects.add(Project.project3);
            }
        } else if (whichProject == 0) {

        } else {
            System.out.println("Wrong input!");
        }
    }

    public void showEndedProjects() {
        for (Project project : endedProjects) {
            System.out.println("Difficulty: " + project.getDifficulty()
                    + " Reward: " + project.getProjectPrice() + "$");
        }
        System.out.println("If you want go back press 0");
    }

    public void endProject(int whichEnd) {
        if (whichEnd == 1 & endedProjects.contains(Project.project1)) {
            endedProjects.remove(Project.project1);
            money += Project.project1.projectPrice;
        } else if (whichEnd == 2 & endedProjects.contains(Project.project2)) {
            endedProjects.remove(Project.project2);
            money += Project.project2.projectPrice;
        } else if (whichEnd == 3 & endedProjects.contains(Project.project3)) {
            endedProjects.remove(Project.project3);
            money += Project.project3.projectPrice;
        } else if (whichEnd == 0) {

        } else {
            System.out.println("Wrong input!");
        }
    }

    public void businessExpenseSum() {
        for (Employee employee : hiredEmployees) {
            businessExpense += employee.getSalary() + (0.2 * employee.getSalary());
        }
        businessExpense += 600.0 * numberOfEmployees;
        if (yourOffice == null) {
            businessExpense += 0;
        } else {
            businessExpense += yourOffice.officeCost;
        }
    }

    public void showAvaliableOffices() {
        for (Office office : avaliableOffice) {
            System.out.println(office.officeName + " Number of avaliable work stations: " + office.officeCapacity + " Monthly cost: " + office.officeCost + "$");
        }
        System.out.println("If you want go back press 0");
    }

    public void rentOffice(int officeChoice) {
        if (officeChoice == 1 & yourOffice != Office.officeSmall) {
            yourOffice = null;
            yourOffice = Office.officeSmall;
            avaliableOffice.remove(Office.officeSmall);
        } else if (officeChoice == 2 & yourOffice != Office.officeMedium) {
            yourOffice = null;
            yourOffice = Office.officeMedium;
            avaliableOffice.remove(Office.officeMedium);
        } else if (officeChoice == 3 & yourOffice != Office.officeBig) {
            yourOffice = null;
            yourOffice = Office.officeBig;
            avaliableOffice.remove(Office.officeBig);
        } else if (officeChoice == 0) {

        } else {
            System.out.println("Wrong input!");
        }
    }

    public boolean isBusy(Employee employee) {
        for (Project project : startedProjects)
        if (project.thisProjectWorkers.contains(employee)) {
            return true;
        }
            return false;
        }

    public void addWorkersToProject(int projectChoice) {
        if (projectChoice == 1) {
            System.out.println("Which employee you want to add to project?");
            showHiredEmployees();
            Integer employeeChoice = Integer.parseInt(sc.nextLine());
            if (employeeChoice == 1 & isBusy(Employee.coder1) == false & Employee.coder1.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder1);
            } else if (employeeChoice == 2 & isBusy(Employee.coder2) == false & Employee.coder2.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder2);
            } else if (employeeChoice == 3 & isBusy(Employee.coder3) == false & Employee.coder3.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder3);
            } else if (employeeChoice == 4 & isBusy(Employee.coder4) == false & Employee.coder4.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder4);
            } else if (employeeChoice == 5 & isBusy(Employee.coder5) == false & Employee.coder5.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder5);
            } else if (employeeChoice == 0) {

            } else {
                System.out.println("Wrong input or employee is busy!");
            }
        } else if (projectChoice == 2) {
            System.out.println("Which employee you want to add to project?");
            showHiredEmployees();
            Integer employeeChoice = Integer.parseInt(sc.nextLine());
            if (employeeChoice == 1 & isBusy(Employee.coder1) == false & Employee.coder1.isHired == true) {
                Project.project2.thisProjectWorkers.add(Employee.coder1);
            } else if (employeeChoice == 2 & isBusy(Employee.coder2) == false & Employee.coder2.isHired == true) {
                Project.project2.thisProjectWorkers.add(Employee.coder2);
            } else if (employeeChoice == 3 & isBusy(Employee.coder3) == false & Employee.coder3.isHired == true) {
                Project.project2.thisProjectWorkers.add(Employee.coder3);
            } else if (employeeChoice == 4 & isBusy(Employee.coder4) == false & Employee.coder4.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder4);
            } else if (employeeChoice == 5 & isBusy(Employee.coder5) == false & Employee.coder5.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder5);
            } else if (employeeChoice == 0) {

            } else {
                System.out.println("Wrong input or employee is busy!");
            }
        } else if (projectChoice == 3) {
            System.out.println("Which employee you want to add to project?");
            showHiredEmployees();
            Integer employeeChoice = Integer.parseInt(sc.nextLine());
            if (employeeChoice == 1 & isBusy(Employee.coder1) == false & Employee.coder1.isHired == true) {
                Project.project3.thisProjectWorkers.add(Employee.coder1);
            } else if (employeeChoice == 2 & isBusy(Employee.coder2) == false & Employee.coder2.isHired == true) {
                Project.project3.thisProjectWorkers.add(Employee.coder2);
            } else if (employeeChoice == 3 & isBusy(Employee.coder3) == false & Employee.coder3.isHired == true) {
                Project.project3.thisProjectWorkers.add(Employee.coder3);
            } else if (employeeChoice == 4 & isBusy(Employee.coder4) == false & Employee.coder4.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder4);
            } else if (employeeChoice == 5 & isBusy(Employee.coder5) == false & Employee.coder5.isHired == true) {
                Project.project1.thisProjectWorkers.add(Employee.coder5);
            } else if (employeeChoice == 0) {

            } else {
                System.out.println("Wrong input or employee is busy!");
            }
        }
    }

    public void workingTime() {
        for (Project project : startedProjects) {
            for (Employee employee : project.thisProjectWorkers) {
                if (employee.frontEnd == true & project.frontEndDays > 0) {
                    project.frontEndDays--;
                } else {
                    if (employee.backEnd == true & project.backEndDays > 0) {
                        project.backEndDays--;
                    } else {
                        if (employee.dataBase == true & project.dataBaseDays > 0) {
                            project.dataBaseDays--;
                        } else {
                            if (employee.mobile == true & project.mobileDays > 0) {
                                project.mobileDays--;
                            } else {
                                if (employee.wordpress == true & project.wordpressDays > 0) {
                                    project.wordpressDays--;
                                } else {
                                    if (employee.prestashop == true & project.prestashopDays > 0) {
                                        project.prestashopDays--;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (project.frontEndDays <= 0 & project.backEndDays <= 0 & project.dataBaseDays <= 0 & project.mobileDays <= 0 & project.wordpressDays <= 0 & project.prestashopDays <= 0) {
                System.out.println("This project is ended!");
                startedProjects.remove(project);
                endedProjects.add(project);
            }
        }
    }
}
