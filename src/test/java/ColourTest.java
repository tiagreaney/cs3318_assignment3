import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ColourTest {

    @Test
    public void testErrorThrownWhenComponentValuesNotInRange() {
        assertThrows(IllegalArgumentException.class, () -> {
            Colour colourObj = new Colour(278, 123, 212);
        });
    }

    @Test
    public void testErrorThrownWhenAddingColours() {
        Colour colourObj1 = new Colour(120, 123, 212);
        Colour colourObj2 = new Colour("HSL", 68, 100, 20);
        Colour colourObj3 = new Colour(208, 100, 20);

        // Test error when colour models are different
        assertThrows(IllegalArgumentException.class, () -> {
            colourObj1.addColours(colourObj2);
        });

        // Test error when values added exceed 255
        assertThrows(IllegalArgumentException.class, () -> {
            colourObj1.addColours(colourObj3);
        });
    }

    @Test
    public void TestEqualityOfColours() {
        Colour colourObj1 = new Colour(123, 234, 132);
        Colour colourObj2 = new Colour(123, 234, 132);

        assertTrue(colourObj1.equals(colourObj2));
    }
}
