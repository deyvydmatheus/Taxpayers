package entities;

import enums.PersonEnum;

public class PhysicsPerson extends Person{

    private Double healthcareExpenses;

    public PhysicsPerson(String name, Double annualIncome, PersonEnum personType, Double healthcareExpenses) {
        super(name, annualIncome, personType);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    @Override
    public double taxPayers() {
        double taxPayerPhysics;

        if (getHealthcareExpenses() != 0.0) {
            if (getAnnualIncome() < 20000.0) {
                taxPayerPhysics = (getAnnualIncome() * 0.15) - (getHealthcareExpenses() * 0.50);
            } else {
                taxPayerPhysics = (getAnnualIncome() * 0.25) - (getHealthcareExpenses() * 0.50);
            }
        } else {
            if (getAnnualIncome() < 20000.0) {
                taxPayerPhysics = getAnnualIncome() * 0.15;
            } else {
                taxPayerPhysics = getAnnualIncome() * 0.25;
            }
        }

        return taxPayerPhysics;
    }
}
