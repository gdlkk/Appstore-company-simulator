package com.company;

public enum Office {
    officeSmall ("1. small",5, 3000.0),
    officeMedium("2. medium",10, 7000.0),
    officeBig("3. big",15, 15000.0);

    String officeName;
    Integer officeCapacity;
    Double officeCost;

    Office(String officeName ,Integer officeCapacity, Double officeCost) {
        this.officeName = officeName;
        this.officeCapacity = officeCapacity;
        this.officeCost = officeCost;
    }
}
