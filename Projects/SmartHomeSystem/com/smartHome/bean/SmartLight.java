
package com.smarthome.bean;

public class SmartLight extends Device{
    private int brightness;

    public SmartLight(int deviceId, String deviceName, double energyConsumption, int brightness){
        super(deviceId, deviceName, energyConsumption);
        this.brightness = brightness;
    }

    @Override
    public void showDeviceInfo(){
        System.out.println("Smart Light [" + getDeviceName() + "] - Brightness: " + brightness + " %, Status: " + (isOn()? "ON" : "OFf"));
    }

    //Overload method 
    public double calculateEnergy(double hours, int brightness){
        return super.calculateEnergy(hours) * (brightness/100.0);
    }

    public int getBrigthNess() { return brightness;}
}