package E3.Main;

import E3.Classes.OutOfBounds;

public class Main {

    public static void main(String[] args) {

        try {

            OutOfBounds.gettingOutOfBoundsError();

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Caught exception: " + e);
        }

    }
}
