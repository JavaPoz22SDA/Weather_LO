package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GetWeather {

    public static void main(String[] args) throws IOException {

        String API_KEY = "30e61de350eea4de94c1d91addcaaca6";

        WeatherService weatherService = new WeatherService(
                "http://api.weatherstack.com/current", API_KEY);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj miasto:");
        String city = scanner.nextLine();
        Object weather = weatherService.getCityWeather(city);

        if(weather instanceof Weather) {
            System.out.println("Instancja weather");
            System.out.println("Temperatura w " +   ((Weather) weather).getLocation().getName()
                    + " wynosi: " + ((Weather) weather).getCurrent().getTemperature());
        }else if (weather instanceof ApiError){
            System.out.println("Instancja klasy ApiError");
            System.out.println(((ApiError) weather).getError().getInfo());
        }

    }
}
