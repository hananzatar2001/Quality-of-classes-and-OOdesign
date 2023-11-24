import java.util.Scanner;

public class WeatherOrder {
    public static void Weather(double temperature ,double humidity ,double rain,double speed) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want the temperature in Celsius or Fahrenheit? (Enter C or F): ");
        String unitChoice = scanner.nextLine().toUpperCase();

        WeatherData weather = new Temperature(temperature);
        Temperatureget temperatur= new Temperature(temperature);

        if ("F".equals(unitChoice)) {
            weather = new TemperatureUnitsDecorator(temperatur, new FahrenheitTemperatureUnitStrategy());
        }



        // Precipitation and wind speed input
        System.out.println("Please enter Precipitate  (Rain, Wind Speed, Humidity): ");
        label:
        while (true) {
            String additions = scanner.nextLine();

            switch (additions.toLowerCase()) {
                case "rain":
                    weather = new Rain(weather, rain);
                    break;
                case "speed":
                    weather = new speed(weather, speed);
                    break;
                case "humidity":
                    weather = new humidity(weather, humidity);
                    break;
                case "done":
                    break label;
            }
            System.out.println("Do you need something else?");
        }

        // Display formatted weather
        System.out.println(weather.getDiscreptinmTemperature());
    }

}
