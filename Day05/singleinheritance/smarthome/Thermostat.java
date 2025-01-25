package com.tit.week02.day05.singleinheritance.smarthome;

public class Thermostat extends Device {
    float temperatureSetting;


    public Thermostat(int deviceId, boolean status, float temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    protected void displayStatus()
    {
        System.out.println("Device ID : "+deviceId+
                            "\n Status : "+status+
                            "\n Temprature : "+ temperatureSetting);
    }
}
