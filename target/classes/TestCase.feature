
Feature: Gittigidiyor


  Scenario: Gittigidiyor Urun Senaryoları
    Given Chrome baslatilir.
    When Gittigidiyor.com giris yapilir.
    And Login olunur.
    And Arama kutucuguna iphone11 yazilir ve bul buttonu tiklanir.
    And Arama sonuclari sayfasindan 2. sayfa acilir.
    And Sonuca gore secilen urunlerden rastgele urun secilir.
    And Secilen urun sepete eklenir.
    And Urun arttirilarak adedinin 2 oldugu dogrulanir.
    And Urun sepetten silinerek sepetin bos oldugu gorulur.