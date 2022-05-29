package com.softserve.edu.hw.hw5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
    private List<Car> garage=new ArrayList<Car>();

    public void parkToGarage(List<Car> objects){
        for(Car model:objects){
            garage.add(model);
        }
    }

    public List<Car> getGarage() {
        if(garage.size()>0){
            return garage;
        }else{
            return null;
        }
    }

    public List<Car> filterCars(){
        System.out.println("Enter year :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = 0;
        try {
            year = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int finalYear = year;
        return garage.stream().filter(x -> x.getYear() == finalYear).collect(Collectors.toList());
    }
}
