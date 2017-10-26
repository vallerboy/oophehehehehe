package task7Enum;

import java.time.LocalDate;

public class Weather {
    private LocalDate date;
    private WeatherInfo weatherInfo;

    public Weather(LocalDate date, WeatherInfo weatherInfo) {
        this.date = date;
        this.weatherInfo = weatherInfo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
    }
}
