package it.develhope.encapsulation;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Person p = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        p.setName(name);

        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();
        p.setSurname(surname);

        System.out.println("Please enter your height: ");
        double height = scanner.nextDouble();
        p.setHeight(height);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        p.setAge(age);

        p.printDetails();

    }
}





/*
"Applica i principi di incapsulamento alla classe Person https://www.w3schools.com/java/java_encapsulation.asp
Nel main vanno stampati gli attributi di Person rispettando le indicazioni date"
 */

