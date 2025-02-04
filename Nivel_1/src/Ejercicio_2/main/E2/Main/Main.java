package E2.Main;

import E2.Classes.DniCalculation;

public class Main {

    public static void main(String[] args) {

        char res = DniCalculation.calculateLetter(25626561);

        System.out.println("Pequeña prueba.");
        System.out.println("La letra del DNI escrito es: " + res);

    }
}
