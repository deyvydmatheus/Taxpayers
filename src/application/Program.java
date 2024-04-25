package application;

import entities.JuridicPerson;
import entities.Person;
import entities.PhysicsPerson;
import enums.PersonEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + ":");
            System.out.print("Individual or Company? (i/c): ");
            char ch = input.next().charAt(0);


            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Anual Income: ");
            double anualIncome = input.nextDouble();

            if (ch == 'i') {
                PersonEnum personType = PersonEnum.valueOf("PHYSICS_PERSON");

                System.out.print("Health expenditures: ");
                double healthExpenditures = input.nextDouble();


                people.add(new PhysicsPerson(name, anualIncome, personType,healthExpenditures));
            } else {
                PersonEnum personType = PersonEnum.valueOf("JURIDIC_PERSON");

                System.out.print("Number of Employees: ");
                int numOfEmployees = input.nextInt();

                people.add(new JuridicPerson(name, anualIncome, personType, numOfEmployees));
            }
        }

        double totalTaxes = 0.0;

        System.out.println();
        System.out.println("TAXES PAID: ");

        for (Person person : people) {
            double tax = person.taxPayers();
            totalTaxes += tax;

            System.out.println(person.getName() + ": " + " $ " + String.format("%.2f", tax));
        }

        System.out.println("TOTAL TAXES : " + totalTaxes);

        input.close();
    }

}
