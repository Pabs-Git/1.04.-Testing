package E3Test.ClassesTest;

import E3.Classes.OutOfBounds;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OutOfBoundsTest {

    @Test
    void testGettingOutOfBoundsError() {

        assertThrows(ArrayIndexOutOfBoundsException.class, OutOfBounds::gettingOutOfBoundsError);
    }
}

