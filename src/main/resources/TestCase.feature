
Feature: Gittigidiyor


  Scenario: Gittigidiyor Urun Senaryoları
    Given Chrome baslatilir.
    When Gittigidiyor.com giris yapilir.
    And Sitenin basariyla acildigi gorulur.
    And Login olunur.
    And Login isleminin basariyla yapildigi gorulur.
    And Arama kutucuguna iphone11 yazilir ve bul buttonu tiklanir.
    And Arama sonuclari sayfasindan 2. sayfa acilir.
    And 2. sayfanin basariyla acildigi gorulur.
    And Sonuca gore secilen urunlerden rastgele urun secilir.
    And Secilen urun sepete eklenir. Urun sayfasindaki fiyat ve sepette yer alan fiyatın dogrulugu basariyla goruntulenir.
    And Urun arttirilarak adet 2 yapilir.
    And Urun adedinin 2 yapildigi gorulur.
    And Urun sepetten silinir.
    And Urun sepetten silinerek sepetin bos oldugu gorulur.
