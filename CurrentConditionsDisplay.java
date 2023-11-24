public class CurrentConditionsDisplay implements WeatherDataObserver {

    public void printCurrentWeather(double temperature ,double humidity,double speed,double rain) {
        System.out.println("Printer CurrentWeather:: temperature " + temperature+" ::humidity "+humidity+" ::speed"+speed+" ::rain"+rain);
    }


    public void subscribe(WeatherDataSubject channel) {
        channel.subscribe(this);
    }

    @Override
    public void updateWeather(double temperature ,double humidity ,double rain,double speed) {

        printCurrentWeather(temperature,humidity,speed,rain);

    }
}