
package com.smarthome.service;
import com.smarthome.bean.*;
import java.util.*;

public abstract class DeviceService {
    protected List<Device> devices = new ArrayList<>();

    public abstract void addDevice(Device d);
    public abstract void displayDevice();
    public abstract void turnDeviceOn(int id);
    public abstract void turnDeviceOff(int id);
    public abstract int getTotalDevice();

    //New Advanced feature
    public abstract void sortDeviceByName();
    public abstract void searchDeviceByName(String name);

}
