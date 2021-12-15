import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

@Epic("Test")
@Story("#1")
@DisplayName("Name displayed")
public class FirstTest {

    @Test
    @Description("One")
    public void testOne() {
        Assert.assertNotEquals("Не должны быть равны", 4,5);
    }

    @Test
    @Description("Second")
    public void testTwo() {
        Assert.assertEquals("Одинаковые слова", "Дженкинс круто", "Дженкинс круто");
    }

    @Test
    @Description("Third")
    public void testThird() {
        Assert.assertEquals("Не одинаковые слова", "Дженкинс Не круто", "Дженкинс круто");
    }
}
