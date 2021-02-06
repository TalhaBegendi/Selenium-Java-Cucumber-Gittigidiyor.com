package CucumberTestClass;

import assertVisible.assertVisible;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageClick.pageClick;
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
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        Webdriver = new ChromeDriver();
        Webdriver.manage().window().maximize();
    }
    @When("^Gittigidiyor.com giris yapilir.$")
    public  void GittigidiyorGiris()
    {
        assertVisible gittigidiyorGirisKontrol= new assertVisible(Webdriver);
        Webdriver.get("https://www.gittigidiyor.com/");
    }
    @And("^Sitenin basariyla acildigi gorulur.$")
    public  void GittigidiyorGiris_Assert()
    {
        assertVisible gittigidiyorGirisKontrol= new assertVisible(Webdriver);
        Assert.assertTrue(gittigidiyorGirisKontrol.Anasayfa_Assert());
    }
    @And("^Login olunur.$")
    public  void Loginİslemleri()
    {
        pageClick loginİslemleri= new pageClick(Webdriver);
        loginİslemleri.LoginEkranıGiris();
        loginİslemleri.EpostaGiris("*****");
        loginİslemleri.SifreGiris("******");
        loginİslemleri.GirisYapButtonTikla();
    }
    @And("^Login isleminin basariyla yapildigi gorulur.$")
    public  void Loginİslemleri_Assert()
    {
        assertVisible loginİslemleriKontrol = new assertVisible(Webdriver);
        Assert.assertTrue(loginİslemleriKontrol.Login_Assert());
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
        assertVisible ikinciSayfaİslemleri= new assertVisible(Webdriver);
        ikinciSayfaİslemleri.Sayfa2_Assert();
    }
    @And("^2. sayfanin basariyla acildigi gorulur.$")
    public  void İkinciSayfaİslemleri_Assert()
    {
        pageClick ikinciSayfaİslemlerikontrol= new pageClick(Webdriver);
        ikinciSayfaİslemlerikontrol.Sayfa2Git();
    }
    @And("^Sonuca gore secilen urunlerden rastgele urun secilir.$")
    public  void UrunSecİslemleri()
    {
        pageClick urunSecİslemleri= new pageClick(Webdriver);
        urunSecİslemleri.UrunTikla();
    }
    @And("^Secilen urun sepete eklenir. Urun sayfasindaki fiyat ve sepette yer alan fiyatın dogrulugu basariyla goruntulenir.$")
    public  void UrunSepetEkle() throws Exception
    {
        pageClick urunSepetEkle= new pageClick(Webdriver);
        assertVisible urunFiyatKontrol= new assertVisible(Webdriver);
        Assert.assertTrue(urunFiyatKontrol.UrunDetayFiyat_Assert());
        urunSepetEkle.UrunSepetEkle();
        urunSepetEkle.Sepetim();
        Assert.assertTrue(urunFiyatKontrol.UrunSepetFiyat_Assert());
        urunFiyatKontrol.Sepet_FiyatKarsilastirma();
    }
    @And("^Urun arttirilarak adet 2 yapilir.$")
    public  void UrunArttır()
    {
        pageClick urunArttır= new pageClick(Webdriver);
        urunArttır.SepetimUrunArtır();
    }
    @And("^Urun adedinin 2 yapildigi gorulur.$")
    public  void UrunArttır_Assert()
    {
        assertVisible urunArttırKontrol= new assertVisible(Webdriver);
        urunArttırKontrol.SepetimUrunArtır_Assert();
    }
    @And("^Urun sepetten silinir.$")
    public  void UrunSepettenKaldir()
    {
        pageClick urunSepettenSil= new pageClick(Webdriver);
        urunSepettenSil.SepetimUrunSil();
    }
    @And("^Urun sepetten silinerek sepetin bos oldugu gorulur.$")
    public  void UrunSepettenKaldir_Assert()
    {
        assertVisible urunSepettenKaldirKontrol= new assertVisible(Webdriver);
        urunSepettenKaldirKontrol.UrunSepettenKaldir_Assert();
    }
}
