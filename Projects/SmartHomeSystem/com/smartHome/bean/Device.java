/*
Design and implement smarthome devices management system
the system should manage various smart devices(like smart light, smart fan and smart ac). Each device has basic propertie such as:
device id, device name, power status(on or off), energy consumtion(in watt).
Methods: u must support operation like:
1) turn On/Off a device 
2) display details of all devices
3) track totsl energy consumption of all On devices.
Demonstrate method overloading, inheritance, polymorphism, encapsulation and use, this, super, static, final and instance of keywords.
add interface and abstract classes also

*/


package com.smarthome.bean;
import com.smarthome.service.*;

public abstract class Device implements Controllable, EnergyMonitor{

    private int deviceId;
    private String deviceName;
    private boolean powerStatus;
    private double energyConsumption;      //Watts per hr
    protected static int totalDevice = 0;
    protected final String COMPANY_NAME = "SmartTech";

    public Device(int deviceId, String deviceName, double energyConsumption){
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.energyConsumption = energyConsumption;
        totalDevice++;
    }

    @Override
    public void turnOn(){
        this.powerStatus = true;
    }

    @Override
    public void turnOff(){
        this.powerStatus = false;
    }

    @Override
    public boolean isOn(){
        return powerStatus;
    }

    @Override
    public double calculateEnergy(double hours){
        return energyConsumption * hours;
    }

    public abstract void showDeviceInfo();

    //Inner class to calculate cost
    public class EnergyCalculator{
        private static final double COST_PER_WATT = 0.05;

        public void showCost(double hours){
            double cost = calculateEnergy(hours) * COST_PER_WATT;
            System.out.println("Cost for " + deviceName + " (" + hours +"hrs): $ : " + cost);
        }
    }

    //Getters
    public int getDeviceID() { return deviceId;}
    public String getDeviceName() { return deviceName;}
    public boolean getPowerStatus() { return powerStatus;}
    public double getEnergyConsumption() { return energyConsumption;}

    @Override
    public String toString(){
        return "Device ID: " + deviceId +", Name: " + deviceName + ", Status: " + (powerStatus? "On" : "Off");
    }

}





