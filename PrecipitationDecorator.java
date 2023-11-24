public abstract class PrecipitationDecorator implements WeatherData{
    private final WeatherData weatherData;
    public PrecipitationDecorator(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }
}
