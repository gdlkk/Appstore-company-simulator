package com.company;

import java.util.ArrayList;

public class Company {
    public Integer numberOfEmployees = 0;
    public Integer numberOfProjects = 3;
    public Double money = 30000.0;
    public ArrayList<Employee> avaliableEmployees = new ArrayList<>();
    public ArrayList<Project> avaliableProjects = new ArrayList<>();
    public ArrayList<Employee> hiredEmployees = new ArrayList<>();
    public ArrayList<Subcontractor> avaliableSubcontractors = new ArrayList<>();
    public ArrayList<Subcontractor> workingSubcontractors = new ArrayList<>();

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
        if (employeeChoice == 1) {
            avaliableEmployees.remove(Employee.coder1);
            hiredEmployees.add(Employee.coder1);
        } else if (employeeChoice == 2) {
            avaliableEmployees.remove(Employee.coder2);
            avaliableEmployees.add(Employee.coder2);
        } else if (employeeChoice == 3) {
            avaliableEmployees.remove(Employee.coder3);
            avaliableEmployees.add(Employee.coder3);
        } else if (employeeChoice == 4) {
            avaliableEmployees.remove(Employee.coder4);
            avaliableEmployees.add(Employee.coder4);
        } else if (employeeChoice == 5) {
            avaliableEmployees.remove(Employee.coder5);
            avaliableEmployees.add(Employee.coder5);
        } else if (employeeChoice == 0) {
        }
        else {
            System.out.println("Wrong input");
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
            avaliableEmployees.add(Employee.coder1);
            hiredEmployees.remove(Employee.coder1);
        } else if (employeeChoice == 2) {
            avaliableEmployees.add(Employee.coder2);
            avaliableEmployees.remove(Employee.coder2);
        } else if (employeeChoice == 3) {
            avaliableEmployees.add(Employee.coder3);
            avaliableEmployees.remove(Employee.coder3);
        } else if (employeeChoice == 4) {
            avaliableEmployees.add(Employee.coder4);
            avaliableEmployees.remove(Employee.coder4);
        } else if (employeeChoice == 5) {
            avaliableEmployees.add(Employee.coder5);
            avaliableEmployees.remove(Employee.coder5);
        } else if (employeeChoice == 0) {
        }
        else {
            System.out.println("Wrong input, try again");

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
}
