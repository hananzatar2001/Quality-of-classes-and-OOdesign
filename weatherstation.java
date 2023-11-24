public class weatherstation implements WeatherDataObserver {

    private final String name;

    public weatherstation(String name){
        this.name = name;
    }
    public void display(double temperature ,double humidity ,double rain,double speed){
        System.out.println( "temperature :: " + name + " :: " + temperature +"humidity :: " + humidity + "rain :: " + rain+ "speed :: "  + speed);


    }
    public void subscribe(subscriber topic) {
        topic.subscribe(this);
    }
    @Override
    public void updateWeather(double temperature ,double humidity ,double rain,double speed) {

        display(temperature, humidity,rain,speed);
    }
}