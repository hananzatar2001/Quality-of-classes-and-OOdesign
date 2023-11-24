import java.util.List;
import java.util.ArrayList;
public class StatisticsDisplay  implements WeatherDataObserver{
    //Statistics Display: Another concrete observer class that displays statistical information about the weather,
    // like average temperature and humidity.
    private List<Double> temperatureData=new ArrayList<>();
    private List<Double> humidityData=new ArrayList<>();
    private List<Double> rainData=new ArrayList<>();
    private List<Double> speedData=new ArrayList<>();
    private void displayStatistics() {

        // Implement your logic to calculate and display statistics
        double averageTemperature = calculateAverage(temperatureData);
        double averageHumidity = calculateAverage(humidityData);
        double averageRain = calculateAverage(rainData);
        double averageSpeed = calculateAverage(speedData);

        System.out.println("Statistics Display:");
        System.out.println("Average Temperature: " + averageTemperature);
        System.out.println("Average Humidity: " + averageHumidity);
        System.out.println("Average Rain: " + averageRain);
        System.out.println("Average Speed: " + averageSpeed);
        System.out.println("------------------------------");
    }
    private double calculateAverage(List<Double> data) {
        // Implement logic to calculate the average of the provided data
        if (data.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double value : data) {
            sum += value;
        }

        return sum / data.size();
    }
    @Override
    public void updateWeather(double temperature, double humidity, double rain, double speed) {
        temperatureData.add(temperature);
        humidityData.add(humidity);
        rainData.add(rain);
        speedData.add(speed);
        displayStatistics();
    }
}
