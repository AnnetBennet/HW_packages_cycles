import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelanceService;

public class FreelanceServiceTest {


    @Test
    public void test() {
        FreelanceService service = new FreelanceService();

        int income = 10_000;
        int expensive = 3000;
        int threshold = 20_000;
        int expected = 3;

// вызываем целевой метод:
        int actual = service.calculate(income, expensive, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
}
