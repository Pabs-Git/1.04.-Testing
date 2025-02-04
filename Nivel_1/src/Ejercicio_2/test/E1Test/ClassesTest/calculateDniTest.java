package E1Test.ClassesTest;

import E2.Classes.DniCalculation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class calculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "23456789, D",
            "11111111, H",
            "22222222, J",
            "33333333, P",
    })

    void calculateLetterTest(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, DniCalculation.calculateLetter(dniNumber));
    }
}
