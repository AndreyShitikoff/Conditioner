package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner();
        assertNull(conditioner.name);
        assertEquals(0, conditioner.maxTemperature);
        assertEquals(0, conditioner.minTemperature);
        assertEquals(0, conditioner.currentTemperature);
        assertFalse(conditioner.on);
    }

}
