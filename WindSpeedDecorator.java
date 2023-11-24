public  class WindSpeedDecorator  extends PrecipitationDecorator{
    private  double Speed;
    public WindSpeedDecorator(WeatherData weatherData) {
        super(weatherData);

        this.Speed = Speed;
    }
    public double getSpeed() {
        return Speed;
    }
    @Override
    public String getDiscreptinmTemperature() {
        return this.getWeatherData().getDiscreptinmTemperature() + " - Speed " +  getSpeed() + "km ∕ h";

    }


}