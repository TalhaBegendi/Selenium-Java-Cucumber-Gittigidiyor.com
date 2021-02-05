package pageClick;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;

public class pageXpaths {


    @CacheLookup public static  By girisYapPopAc =By.className("hUmHQV");
    @CacheLookup public static  By girisYap =By.className("kNKwwK");

    @CacheLookup public static  By epostaGiris =By.id("L-UserNameField");
    @CacheLookup public static  By sifreGiris =By.id("L-PasswordField");
    @CacheLookup public static  By girisYapButton =By.id("gg-login-enter");
    @CacheLookup public static  By araKutusu =By.className("iYMTpq");
    @CacheLookup public static  By bulButton =By.className("hKfdXF");
    @CacheLookup public static  By sayfa2 =By.cssSelector("div.gg-d-24>ul.clearfix>li:nth-child(2)>a");
    @CacheLookup public static  By urun =By.id("product_id_622134853");

    @CacheLookup public static  By popUpKapat =By.className("wis-clsbtn-72245");
    @CacheLookup public static  By altMesajKapat =By.className("icon-close");



    @CacheLookup public static By sepeteEkle = By.id("add-to-basket");
    @CacheLookup public static By sepetim = By.className("basket-icon-container");
    @CacheLookup public static By sepetimUrunArtır = By.className("gg-icon-plus");
    @CacheLookup public static By sepetimUrunSil = By.cssSelector("div.row>a.hidden-m >i.gg-icon-bin-medium");

}
