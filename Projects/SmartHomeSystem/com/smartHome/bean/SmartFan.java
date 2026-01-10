
package com.smarthome.bean;

public class SmartFan extends Device{
    private int speedLevel;

    public SmartFan(int deviceId, String deviceName, double energyConsumption, int speedLevel){
        super(deviceId, deviceName, energyConsumption);
        this.speedLevel = speedLevel;
    }

    @Override
    public void showDeviceInfo(){
        System.out.println("Smart Fan [" + getDeviceName() + "] - Speed: " + speedLevel + " , Status: " + (isOn()? "ON" : "OFf"));
    }
} 