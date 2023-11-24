public class Rain  extends PrecipitationDecorator {
    private final double rainAmount;

    public Rain(WeatherData weatherData, double rainAmount) {
        super(weatherData);
        this.rainAmount = rainAmount;
    }
    public double getRainAmount() {
        return rainAmount;
    }
    @Override
    public String getDiscreptinmTemperature() {
        return this.getWeatherData().getDiscreptinmTemperature() + " - Rain " + getRainAmount() + " mm";
    }

}
