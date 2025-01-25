package com.tit.week02.day05.singleinheritance.smarthome;

public class DeviceMain {

    public static void main(String[] args) {

        Thermostat thermostat =  new Thermostat(03,true,16.5f);
        thermostat.displayStatus();

    }
}
