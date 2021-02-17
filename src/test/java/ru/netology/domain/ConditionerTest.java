package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void shouldCGet(){
        Conditioner conditioner = new Conditioner();
    }

    @Test
    public void checkTemperature(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0,conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20,conditioner.getCurrentTemperature());

    }

}
