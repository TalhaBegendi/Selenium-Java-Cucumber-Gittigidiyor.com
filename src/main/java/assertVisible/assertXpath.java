package assertVisible;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;

public class assertXpath {

    @CacheLookup public static  By anasayfaKontrol =By.className("hKfdXF");
    @CacheLookup public static  By loginKontrol =By.cssSelector("div.hwMdSM>span");
    @CacheLookup public static  By sayfa2Kontrol =By.cssSelector("div.gg-d-24>ul.clearfix>li:nth-child(2)>a");
    @CacheLookup public static By sepetimUrunArtırKontrol = By.xpath("//input[@data-value='2']");


    @CacheLookup public static By urunDetayFiyat = By.id("sp-price-lowPrice");
    @CacheLookup public static By urunSepetFiyat = By.cssSelector("div.total-price>strong");

    @CacheLookup public static By urunSepetKaldirKontrol = By.xpath("//div[@data-product='622134853-0']");
}
