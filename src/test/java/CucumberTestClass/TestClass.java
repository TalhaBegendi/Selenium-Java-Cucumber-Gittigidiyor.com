package CucumberTestClass;

import assertVisible.assertVisible;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageClick.pageClick;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class TestClass  {

    WebDriver Webdriver;

    public  void GittigidiyorGiris2()
    {
        assertVisible urunFiyatKontrol= new assertVisible(Webdriver);
    }
    @Given("^Chrome baslatilir.$")
    public  void Chromeİslemleri()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Talha BEĞENDİ/Documents/Selenium/ChromeDriver/chromedriver.exe");
        Webdriver = new ChromeDriver();
        Webdriver.manage().window().maximize();
        Webdriver.get("https://www.gittigidiyor.com/");
    }
    @When("^Gittigidiyor.com giris yapilir.$")
    public  void GittigidiyorGiris()
    {
        Webdriver.get("https://www.gittigidiyor.com/");
    }
    @And("^Login olunur.$")
    public  void Loginİslemleri()
    {
        pageClick loginİslemleri= new pageClick(Webdriver);
        loginİslemleri.LoginEkranıGiris();
        loginİslemleri.EpostaGiris("talhabegendi");
        loginİslemleri.SifreGiris("******");
        loginİslemleri.GirisYapButtonTikla();
    }
    @And("^Arama kutucuguna iphone11 yazilir ve bul buttonu tiklanir.$")
    public  void UrunAramaİslemleri()
    {
        pageClick urunAramaİslemleri= new pageClick(Webdriver);
        urunAramaİslemleri.UrunAra("iphone11");
        urunAramaİslemleri.BulButtonTikla();
    }
    @And("^Arama sonuclari sayfasindan 2. sayfa acilir.$")
    public  void İkinciSayfaİslemleri()
    {
        pageClick ikinciSayfaİslemleri= new pageClick(Webdriver);
        ikinciSayfaİslemleri.Sayfa2Git();
    }
    @And("^Sonuca gore secilen urunlerden rastgele urun secilir.$")
    public  void UrunSecİslemleri()
    {
        pageClick urunSecİslemleri= new pageClick(Webdriver);
        urunSecİslemleri.UrunTikla();
    }
    @And("^Secilen urun sepete eklenir.$")
    public  void UrunSepetEkle() throws Exception
    {
        pageClick urunSepetEkle= new pageClick(Webdriver);
        assertVisible urunFiyatKontrol= new assertVisible(Webdriver);
        Assert.assertTrue(urunFiyatKontrol.FiyatKiyaslama());
        urunSepetEkle.UrunSepetEkle();
        urunSepetEkle.Sepetim();
        Assert.assertTrue(urunFiyatKontrol.FiyatKiyaslama2());
        urunFiyatKontrol.FiyatKiyaslamaXXX();
    }
    @And("^Urun arttirilarak adedinin 2 oldugu dogrulanir.$")
    public  void UrunArttır()
    {
        pageClick urunArttır= new pageClick(Webdriver);
        urunArttır.SepetimUrunArtır();
    }
    @And("^Urun sepetten silinerek sepetin bos oldugu gorulur.$")
    public  void UrunSepettenSil()
    {
        pageClick urunSepettenSil= new pageClick(Webdriver);
        urunSepettenSil.SepetimUrunSil();
    }
}
