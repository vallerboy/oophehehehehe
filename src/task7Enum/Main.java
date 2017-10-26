package task7Enum;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Weather today = new Weather(LocalDate.now(), WeatherInfo.CLOUDY);
        Weather yesterday = new Weather(LocalDate.now().minusDays(1), WeatherInfo.RAINY);

        System.out.println(today.getWeatherInfo().getDescription());
        System.out.println(yesterday.getWeatherInfo().getAvgTemp());
    }
}
