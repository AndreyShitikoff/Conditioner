package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void shouldCGetAndSet(){
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldIncreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0,conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20,conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldDecreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0,conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20,conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());

    }

}
