package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrServiceTest {

    @Test
    public void shouldsqrcalc() {
        SqrService service = new SqrService();
        int expected = 15;
        int actual = service.sqrcalc(225);
        Assertions.assertEquals(expected, actual);
    }
}


