
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    @Test
    void januaryHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(
            checker.has31Days(Month.JANUARY),
            "January should have 31 days"
        );
    }

    @Test
    void marchHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(
            checker.has31Days(Month.MARCH),
            "March should have 31 days"
        );
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
        "JANUARY", "MARCH", "MAY", "JULY",
        "AUGUST", "OCTOBER", "DECEMBER"
    })
    void test31DayMonths(Month month) {
        DateChecker checker = new DateChecker();

        assertTrue(
            checker.has31Days(month),
            month + " should have 31 days"
        );
    }

@ParameterizedTest
@EnumSource(value = Month.class, names = {
    "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"
})
void test30DayMonths(Month month) {
    DateChecker checker = new DateChecker();

    assertFalse(
        checker.has31Days(month),
        month + " should not have 31 days"
    );
}

@Test
void testFebruary() {
    DateChecker checker = new DateChecker();

    assertFalse(
        checker.has31Days(Month.FEBRUARY),
        "February does not have 31 days"
    );
}

@Test
void testNullMonth() {
    DateChecker checker = new DateChecker();

    assertThrows(
        IllegalArgumentException.class,
        () -> checker.has31Days(null)
    );
}

}
