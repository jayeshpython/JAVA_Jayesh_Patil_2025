
package com.smarthome.bean;

public class SmartAC extends Device{
    private int temperature;

    public SmartAC(int deviceId, String deviceName, double energyConsumption, int temperature){
        super(deviceId, deviceName, energyConsumption);
        this.temperature = temperature;
    }

    @Override
    public void showDeviceInfo(){
        System.out.println("Smart AC [" + getDeviceName() + "] - Temperature: " + temperature + "(C), Status" + (isOn() ? "ON" : "OFf"));
    }
}