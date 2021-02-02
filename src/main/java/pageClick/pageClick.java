package pageClick;

import org.openqa.selenium.WebDriver;

public class pageClick extends pageBaseClass {

    public pageClick(WebDriver driver)
    {
        super(driver);
    }
    public void LoginEkranıGiris() {
        ElementClick(girisYapPopAc);
        ElementClick(girisYap);
    }
    public void EpostaGiris(String eposta) {
        ElementSendkey(epostaGiris);
        elementSendKey.sendKeys(eposta);
    }
    public void SifreGiris(String sifre) {
        ElementSendkey(sifreGiris);
        elementSendKey.sendKeys(sifre);
    }
    public void GirisYapButtonTikla() {
        ElementClick(girisYapButton);
    }
    public void UrunAra(String urun) {
        ElementSendkey(araKutusu);
        elementSendKey.sendKeys(urun);
    }
    public void BulButtonTikla() {
        ElementClick(bulButton);
    }
    public void Sayfa2Git() {
        ElementClick(altMesajKapat);
        ElementClick(sayfa2);
    }
    public void UrunTikla() {
        ElementClick(urun);
        //ElementClick(popUpKapat);
    }
    public void UrunSepetEkle() {
        ElementClick(sepeteEkle);
    }
    public void Sepetim() {
        ElementClick(sepetim);
    }
    public void SepetimUrunArtır() {
        ElementClick(sepetimUrunArtır);
    }
    public void SepetimUrunSil() {
        ElementClick(sepetimUrunSil);
    }
}


