import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColourTest {

    @Test
    public void testErrorThrownWhenComponentValuesNotInRange() {
        assertThrows(IllegalArgumentException.class, () -> {
            Colour colourObj = new Colour(255, 123, 212);
        });
    }
}
