package pl.samouczekprogramisty.szs.aoc2016.day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoorPasswordCrackerTest {
    @Test
    public void shouldFindPasswordForTestRoomName() {
        DoorPasswordCracker cracker = new DoorPasswordCracker("abc");
        assertEquals("18f47a30", cracker.getPassword());
    }

    @Test
    public void shouldFindEnhancedPasswordForTestRoomName() {
        DoorPasswordCracker cracker = new DoorPasswordCracker("abc");
        assertEquals("05ace8e3", cracker.getEnhancedPassword());
    }
}