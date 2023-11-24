public class Observer {

    public static void observer(double temperature, double humidity, double rain, double speed) {
        weatherstation weatherstation1 = new weatherstation("1");
        weatherstation weatherstation2 = new weatherstation("2");
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        WeatherDataSubject channel = new WeatherDataSubject();
        CurrentConditionsDisplay printer = new CurrentConditionsDisplay();
        weatherstation2.subscribe(channel);
        weatherstation1.subscribe(channel);
        channel.subscribe(printer);
        channel.subscribe(statisticsDisplay);
        addInitialMessage(channel, weatherstation1, 11,2.5,2.3,3);
        channel.addWeatherData(temperature,humidity,rain,speed);
    }
    private static void addInitialMessage(WeatherDataSubject channel, weatherstation weatherstation, double temperature, double humidity , double rain, double speed) {
        channel.addWeatherData(temperature,humidity,rain,speed);

    }
}
