public  class speed extends WindSpeedDecorator{
    private final double windSpeed;
    public speed(WeatherData weatherWindSpeed, double windSpeed) {
        super(weatherWindSpeed);
        this.windSpeed = windSpeed;
    }
    public double getWindSpeed() {
        return windSpeed;
    }
    @Override
    public String getDiscreptinmTemperature() {
        return this.getWeatherData().getDiscreptinmTemperature() + " - Wind Speed " + getWindSpeed() + " km/h";
    }
}