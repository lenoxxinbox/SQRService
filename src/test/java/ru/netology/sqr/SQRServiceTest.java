package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/range.csv")
    public void testSquareInsideTheRange(int expected, int initialRange, int finalRange) {

        SQRService service= new SQRService();

        int actual = service.calculateSQR(initialRange, finalRange);

        Assertions.assertEquals(expected, actual);
    }
}
