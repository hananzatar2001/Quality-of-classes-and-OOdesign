public class TemperatureUnitsDecorator implements WeatherData ,Temperatureget {
    private final Temperatureget weatherData;

    private final TemperatureUnitStrategy unitStrategy;

    public TemperatureUnitsDecorator(Temperatureget weatherData, TemperatureUnitStrategy unitStrategy) {
        this.weatherData = weatherData;
        this.unitStrategy = unitStrategy;
    }

    @Override
    public String getDiscreptinmTemperature() {
        return unitStrategy.formatTemperature(weatherData.getTemperature());
    }

    @Override
    public double getTemperature() {
        return weatherData.getTemperature();
    }
}