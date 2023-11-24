public class humidity extends PrecipitationDecorator {
    private final double humidity;

    public humidity(WeatherData weatherData , double humidity) {
        super(weatherData);
        this.humidity = humidity;
    }

    public double getHumidity() {
        return humidity;
    }

    @Override
    public String getDiscreptinmTemperature() {
        return this.getWeatherData().getDiscreptinmTemperature() + " - Humidity " + getHumidity() + "%";
    }

}