/*
* world.city country-countrylonguage de eklenebilir bunun için insert parametresi için world adlı
* bi java dosyasının extend edebilirler insert parametresi direk world nesnesi kabul edecek şeklide
* değiştirilir
 */
public class City {
    String name, countryCode, district;
    int population;

    public City(String name, String countryCode, String district, int population) {
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }
}
