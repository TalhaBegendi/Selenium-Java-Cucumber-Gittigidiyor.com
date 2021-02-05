package assertVisible;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class assertVisible extends assertBaseClass{

    public assertVisible(WebDriver driver)
    {
        super (driver);
    }
    public Boolean Anasayfa_Assert()
    {
        ElementVisible(anasayfaKontrol);
        return element.isDisplayed();
    }
    public Boolean Login_Assert()
    {
        ElementVisible(loginKontrol);
        return element.isDisplayed();
    }
    public Boolean Sayfa2_Assert()
    {
        ElementVisible(sayfa2Kontrol);
        return element.isDisplayed();
    }
    public Boolean SepetimUrunArtır_Assert()
    {
        ElementVisible(sepetimUrunArtırKontrol);
        return element.isDisplayed();
    }
    public Boolean UrunDetayFiyat_Assert()
    {
        ElementVisible(urunDetayFiyat);
        textDetayFiyat=element.getText();
        return element.isDisplayed();
    }
    public Boolean UrunSepetFiyat_Assert()
    {
        ElementVisible(urunSepetFiyat);
        textSepetFiyat=element.getText();
        return element.isDisplayed();
    }
    public Boolean UrunSepettenKaldir_Assert()
    {
        ElementCount(urunSepetKaldirKontrol);
        return true;
    }
    public void Sepet_FiyatKarsilastirma() throws Exception
    {
        System.out.println("sepet "+textDetayFiyat);
        System.out.println("detay "+textSepetFiyat);
        Assert.assertEquals(textDetayFiyat,textSepetFiyat);
    }
}
