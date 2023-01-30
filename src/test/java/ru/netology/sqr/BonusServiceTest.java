package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvSource({
            "0, 99, 99",
            "1, 100, 100",
            "90, 100, 9801",
            "90, 100, 9802"
    })
    public void testBoundaryValue (int expected, int firsLimit, int secondLimit) {
        SQRService service = new SQRService();

        int actual = service.calcNumberSqrt(firsLimit, secondLimit);

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "0, 10, 22",
            "0, 10000, 15000"
    })
    public void testUnderAndOverLimits (int expected, int firsLimit, int secondLimit) {
        SQRService service = new SQRService();

        int actual = service.calcNumberSqrt(firsLimit, secondLimit);

        Assertions.assertEquals(expected, actual);
    }
}
