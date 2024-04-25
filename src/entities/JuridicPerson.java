package entities;

import enums.PersonEnum;

public class JuridicPerson extends Person {

    private Integer numberOfEmployee;

    public JuridicPerson(String name, Double annualIncome, PersonEnum personType, Integer numberOfEmployee) {
        super(name, annualIncome, personType);
        this.numberOfEmployee = numberOfEmployee;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployee;
    }

    @Override
    public double taxPayers() {
        double taxPayers;

        taxPayers = getAnnualIncome() * (numberOfEmployee > 10 ? 0.14 : 0.16);

        return taxPayers;
    }

}
