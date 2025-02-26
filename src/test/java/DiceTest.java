import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
    }


    @Test
    void roll() {
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
        assertEquals(dice.getDie1(), dice.getDie2());
    }

    @Test
    void getDie1() {
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6);
    }

    @Test
    void getDie2() {
        dice.roll();
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6);
    }
}