import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.FreelanceService;

public class FreelanceServiceTest {


    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")
    public void test(int income, int expenses, int threshold, int expected) {
        FreelanceService service = new FreelanceService();

        //int income = 10_000;
        //int expenses = 3000;
        //int threshold = 20_000;
        //int expected = 3;

// вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}

//    @Test
//    public void testFreelance() {
//        FreelanceService service = new FreelanceService();
//
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//
//// вызываем целевой метод:
//        int actual = service.calculate(income, expenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//
//    }
//}

