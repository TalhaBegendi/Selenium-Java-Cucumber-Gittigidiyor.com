package assertVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;

public class assertXpath {


    @CacheLookup public static By urunDetayFiyat = By.xpath("//div[@id='sp-price-lowPrice']");
    @CacheLookup public static By urunSepetFiyat = By.xpath("//strong[@class='real-discounted-price']");
}
