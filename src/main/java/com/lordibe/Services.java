package com.lordibe;

import java.util.HashMap;

public class Services {
    public void getServices() {
        HashMap<Integer, String> services = new HashMap<>();
        services.put(1,"Buy Cars");
        services.put(2,"Sell Cars");
        services.put(3,"Inquiry");
        services.put(4,"Automobile Repair");

        System.out.println(services.toString());
    }
}
