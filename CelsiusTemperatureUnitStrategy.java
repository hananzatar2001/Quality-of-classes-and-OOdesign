public class CelsiusTemperatureUnitStrategy implements TemperatureUnitStrategy {
    @Override
    public String formatTemperature(double temperature) {
        return ("Temperature in Celsius"+ temperature);
    }
}