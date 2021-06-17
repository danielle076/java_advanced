package T_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice", 85);
        assertEquals(42, 24);
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @Test
    void getPercentFull() {
        Cup c = new Cup("Orange Juice", 85);
        assertEquals(85, c.getPercentFull(), 0.001);
    }
}