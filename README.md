# Building a Weather Monitoring System
Problem Description:
Imagine you are tasked with building a weather monitoring system that observes and
displays real-time weather data. The system should allow users to customize their
experience by adding various decorators to enhance or modify the displayed
information.

In this assignment I have used Observer Pattern and Decorator Pattern
In the Decorator Pattern section, the user chooses the unit of measurement for temperature, either Celsius or Fahrenheit, and also chooses additions such as humidity, wind speed, and amount of rain.
In the Observer Pattern, I set an initial peak for the temperature, humidity, wind speed, and rainfall amount. Then the user enters the values he would like to change and publishes his change.
In the main class
Information is entered and the functions that we want to work are called .

This is simplified Now let's go in and analyze the code

Temperature Unit Strategies:- CelsiusTemperatureUnitStrategy and FahrenheitTemperatureUnitStrategy to Formats the temperature in Fahrenheit or Celsius.

CurrentConditionsDisplay:- print the current weather conditions use (printCurrentWeather) and updateWeather method to update and print the weather conditions.

humidity,Rain,speed:- Decorates weather data with humidity ,speed information and rain information.

StatisticsDisplay:- make average  temperature ,humidity,Rain and speed.

PrecipitationDecorator:- reference to the original WeatherData object. 

WindSpeedDecorator:- adds information about wind speed to the displayed weather data.

TemperatureUnitsDecorator:- Decorator Temperature in the unit format desired by the user.

Temperature:- Temperature data info .

WeatherDataSubject:-Implements the subscriber interface. Maintains a list of observers and notifies them of weather updates.

WeatherOrder:- Takes user input for temperature unit choice and additional weather information. Uses decorators to decorate the basic temperature data with precipitation and wind speed information and He displays it.

weatherstation:- Its work is similar to work Window  in The example I presented in the lecture.

Observer:- Updates the subject with initial weather data and Creates instances of weather stations and a statistics display.

Temperatureget and WeatherData  these interfaces 
We could have put them in one interface, but to adhere to the Interface Segregation Principle (ISP), I separated them.

TemperatureUnitStrategy:- interface is used to define a strategy for formatting temperatures in different units and i use it to make my code more Flexibility and Extensibility  and Encapsulation .

WeatherDataObserver Interface:- interface is part of the Observer pattern Defines an interface for objects that should be notified of changes in weather data and i use it to get Loose Coupling code .

Also, here I present the class diagram for the program
![Assignment # 3 Design Pattern drawio](https://github.com/hananzatar2001/Advanced-topics-in-software-development/assets/90716074/541c34c3-c080-4e41-abdd-8f0abb003529)

