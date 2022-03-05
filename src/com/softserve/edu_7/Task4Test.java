package com.softserve.edu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    @Test
    void main() {
        Car car = new Car(2001, 4, "Ford");
        assertEquals("Ford", car.getType());
        assertEquals(2001, car.getYearOfProduction());
        assertEquals(4, car.getEngineCapacity());
    }
}