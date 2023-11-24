//Problem Description:
//        Imagine you are tasked with building a weather monitoring system that observes and
//        displays real-time weather data. The system should allow users to customize their
//        experience by adding various decorators to enhance or modify the displayed
//        information.
//        Part 1: Observer Pattern
//        Implement the observer pattern to handle real-time weather data updates. Design
//        classes for the following components:
//        WeatherDataSubject: A subject class that holds the real-time weather data
//        (temperature, humidity, etc.) and notifies observers when the data changes.
//        WeatherDataObserver: Observer interface that defines the update method for receiving
//        and displaying the weather data.
//        CurrentConditionsDisplay: Concrete observer class that displays the current weather
//        conditions when notified.
//        StatisticsDisplay: Another concrete observer class that displays statistical information
//        about the weather, like average temperature and humidity.
//        Part 2: Decorator Pattern
//        Implement the decorator pattern to allow users to customize the displayed weather
//        information. Design classes for the following decorators:
//        TemperatureUnitsDecorator: Decorator that allows users to switch between Celsius and
//        Fahrenheit.
//        WindSpeedDecorator: Decorator that adds information about wind speed to the
//        displayed weather data.
//        PrecipitationDecorator: Decorator that adds information about precipitation (rain, snow,
//        etc.) to the displayed weather data.
//        Part 3: Integration
//        Integrate the observer and decorator patterns to create a flexible weather monitoring
//        system. Users should be able to add and remove observers dynamically and decorate
//        the displayed weather information based on their preferences.

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter Temperature: ");
            double temperature = Double.parseDouble(scanner.nextLine());
            System.out.println("Please enter Humidity percentage: ");
            double humidity = Double.parseDouble(scanner.nextLine());
            System.out.println("Please enter Rain percentage: ");
            double rain = Double.parseDouble(scanner.nextLine());
            System.out.println("Please enter speed percentage: ");
            double speed = Double.parseDouble(scanner.nextLine());

            Observer.observer(temperature, humidity, rain, speed);
            WeatherOrder.Weather(temperature, humidity, rain, speed);
            String message = scanner.nextLine();
            if (message.equals("exit")) {
                break;
            }
        }




    }
}