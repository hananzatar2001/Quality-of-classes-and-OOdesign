import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements subscriber {
    private double statustemperature;
    private double statushumidity;
    private double statusrain;
    private double statusspeed;
    private final ArrayList<Double> temperature = new ArrayList<>();
    private final ArrayList<Double> humidity = new ArrayList<>();
    private final ArrayList<Double> rain = new ArrayList<>();
    private final ArrayList<Double> speed = new ArrayList<>();
    private final List<WeatherDataObserver> observables = new ArrayList<>();
    public void addWeatherData(double temperature ,double humidity ,double rain,double speed) {
        this.statustemperature = temperature;
        this.statushumidity=humidity;
        this.statusrain=rain;
        this.statusspeed=speed;

        for (WeatherDataObserver observable : observables) {
            observable.updateWeather(temperature, humidity, rain, speed);
        }
    }
    @Override
    public void subscribe(WeatherDataObserver observable) {
        observables.add(observable);
    }


}