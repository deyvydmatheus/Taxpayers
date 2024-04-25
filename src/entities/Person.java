package entities;

import enums.PersonEnum;

public abstract class Person {
    private String name;
    private Double annualIncome;

    PersonEnum personType;

    private Person() {}

    public Person(String name, Double annualIncome , PersonEnum personType) {
        this.name = name;
        this.annualIncome = annualIncome;
        this.personType = personType;
    }

    public String getName() {
        return name;

    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public PersonEnum getPersonType() {
        return personType;
    }

    public void setPersonType(PersonEnum personType) {
        this.personType = personType;
    }

    public abstract double taxPayers();

}
