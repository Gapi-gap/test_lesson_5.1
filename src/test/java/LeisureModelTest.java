import org.junit.jupiter.api.Test;
import ru.netology.services.model.LeisureModel;
import org.junit.jupiter.api.Assertions;

public class LeisureModelTest {

    @Test
    public void twoFTestFromTheTermsOfReference() {
        LeisureModel leisureModel = new LeisureModel();
        int actual = leisureModel.сalculatingTheMonthsInWhichAnEmployeeCanTakeVacation(100000, 60000, 150000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstFTestFromTheTermsOfReference() {
        LeisureModel leisureModel = new LeisureModel();
        int actual = leisureModel.сalculatingTheMonthsInWhichAnEmployeeCanTakeVacation(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }
}
