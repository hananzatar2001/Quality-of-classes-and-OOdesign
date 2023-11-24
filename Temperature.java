public class Temperature implements WeatherData ,Temperatureget{
    private final double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }
    @Override
    public String getDiscreptinmTemperature() {
        return new CelsiusTemperatureUnitStrategy().formatTemperature(getTemperature());
    }
    @Override
    public double getTemperature() {
        return temperature;
    }

}
