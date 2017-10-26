package task7Enum;

public enum WeatherInfo {
    SUNNY(35, "Grzeje ostro"),
    SNOWY(-15, "Ziuziu"),
    RAINY(12, "Parasolka tralal"),
    CLOUDY(16, "Halny");

    private int avgTemp;
    private String description;

    WeatherInfo(int avgTemp, String description) {
        this.avgTemp = avgTemp;
        this.description = description;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        return description;
    }
}
