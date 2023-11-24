public class FahrenheitTemperatureUnitStrategy implements TemperatureUnitStrategy {
    @Override
    public String formatTemperature(double temperature) {
        return ("Temperature in Fahrenheit "+(temperature * 9 / 5) + 32);
    }
}