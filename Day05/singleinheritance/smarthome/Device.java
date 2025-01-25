package com.tit.week02.day05.singleinheritance.smarthome;

public class Device {
    protected int deviceId ;
     protected boolean status;

    public Device(int deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}
