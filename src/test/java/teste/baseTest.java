package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class baseTest extends rota {
    @Test
    public void TestWebDriver() {
        chrome.findElement(By.name("q")).sendKeys("brics venezuela" + Keys.ENTER);
        String data = chrome.findElement(By.id("result-stats")).getText();
        System.out.println(data);
        Assert.assertTrue(data.contains("Aproximadamente"));
    }
}
