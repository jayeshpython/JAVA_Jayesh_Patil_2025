
package com.smarthome.service;
import com.smarthome.bean.Device;
import com.smarthome.bean.SmartLight;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class DeviceServiceImpl extends DeviceService{
    
    @Override
    public void addDevice(Device d){
        devices.add(d);
        System.out.println("Device added: " + d.getDeviceName());
    }

    @Override
    public void displayDevice(){
        if(devices.isEmpty()){
            System.out.println("No device available");
            return;
        }
        System.out.println("\n============ Device List ============");
        for(Device d : devices){
            d.showDeviceInfo();

            if(d instanceof SmartLight){
                SmartLight s1 = (SmartLight) d;
                System.out.println("Adjusted energy (5 hrs): " + s1.calculateEnergy( 5, s1.getBrigthNess()) + " watts");
            }
            else{
                System.out.println("Estimated Energy (5 hr): " + d.calculateEnergy(5) + " watts");
            }

            Device.EnergyCalculator calc = d.new EnergyCalculator();
            calc.showCost(5);
            System.out.println("---------------------------------------------");
        }
    }

    @Override
    public void turnDeviceOn(int id){

        for(Device d: devices){
            if(d.getDeviceID() == id){
                d.turnOn();
                System.out.println(d.getDeviceName() + " Turned ON.");
                return;
            }
        }
        System.out.println("Device not found!");
    }

    @Override
    public void turnDeviceOff(int id){

        for(Device d : devices){
            if(d.getDeviceID() == id){
                d.turnOff();
                System.out.println(d.getDeviceName() + " turned OFF.");
                return;
            }
        }
        System.out.println("Device not found.");
    }

    @Override
    public int getTotalDevice(){
        return Device.totalDevice;
    }

    //Sorting devices alphabetically
    @Override
    public void sortDeviceByName(){
        devices.sort(Comparator.comparing(Device::getDeviceName));
        System.out.println("Devices sorted alphabetically by name.");
    }

    @Override
    public void searchDeviceByName(String name){

        List<Device> result = devices.stream()
                .filter(d -> d.getDeviceName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        if(result.isEmpty()){
            System.out.println("No device found with name: " + name);
        } else{
            System.out.println("Search Results: ");
            result.forEach(Device::showDeviceInfo);
        }
    }
}
