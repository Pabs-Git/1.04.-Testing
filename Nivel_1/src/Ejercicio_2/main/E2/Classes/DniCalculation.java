package E2.Classes;

public class DniCalculation {

    public static char calculateLetter(int dniNumber) {

        String letter = "TRWAGMYFPDXBNJZSQVHLCKET";
        int rest = dniNumber % 23;
        return letter.charAt(rest);
    }
}
