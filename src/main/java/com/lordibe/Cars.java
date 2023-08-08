package com.lordibe;

import java.util.HashMap;

public class Cars {

        HashMap<String, Integer> carList = new HashMap<>();
        public Cars() {
            carList.put("TOYOTA", 3_500_000);
            carList.put("BENZ", 8_500_000);
            carList.put("NISSAN", 2_500_000);
            carList.put("HONDA", 4_000_000);
            carList.put("CHEVROLET", 10_500_000);
            carList.put("IVM", 15_000_000);
            carList.put("KIA", 6_500_000);
            carList.put("TESLA", 30_800_000);
        }

        public void addCars (String carName, int carPrice){
            carList.put(carName, carPrice);
        }

    public void getCarsList() {
        System.out.println(carList.keySet());
    }

    public int getCarPrice (String carName) {
        return carList.get(carName);
    }
}
