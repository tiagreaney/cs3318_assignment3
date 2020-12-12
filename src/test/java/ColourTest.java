import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

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
        Colour colourObj2 = new Colour(68, 100, 20);

        assertThrows(IllegalArgumentException.class, () -> {
            colourObj1.addColours(colourObj2);
        });
    }
}
