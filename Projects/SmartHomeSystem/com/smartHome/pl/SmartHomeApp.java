
package com.smarthome.pl;
import com.smarthome.bean.*;
import com.smarthome.service.*;

import SmartHomeSystem.com.smartHome.bean.SmartAC;
import SmartHomeSystem.com.smartHome.bean.SmartFan;
import SmartHomeSystem.com.smartHome.bean.SmartLight;
import SmartHomeSystem.com.smartHome.service.DeviceServiceImpl;

import java.util.Scanner;

public class SmartHomeApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        DeviceServiceImpl service = new DeviceServiceImpl();

        //Preloaded devices
        service.addDevice(new SmartLight(101, "Bedroom Light", 12, 80));
        service.addDevice(new SmartFan(102, "Ceiling Fan", 40, 3));
        service.addDevice(new SmartAC(103, "Living Room AC", 1050, 24));

        while(true){
            System.out.println("\n======== SMART HOME SYSTEM ========");
            System.out.println("1. Add Device");
            System.out.println("2. Display Device");
            System.out.println("3. Turn Device ON");
            System.out.println("4. Turn Device OFF");
            System.out.println("5. Sort Device By Name");
            System.out.println("6. Search Device By Name");
            System.out.println("7. Show Total Devices");
            System.out.println("8. Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter id, name, energy: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    double energy = sc.nextDouble();
                    System.out.println("Select type: 1 - light, 2 - fan, 3 - AC");
                    int type = sc.nextInt();

                    if(type == 1)
                        service.addDevice(new SmartLight(id, name, energy, 70));
                    else if(type == 2)
                        service.addDevice(new SmartFan(id, name, energy, 3));
                    else if(type == 3)
                        service.addDevice(new SmartAC(id, name, energy, 20));
                    else 
                        System.out.println("Invalid type!");
                    break;

                case 2:
                    service.displayDevice();
                    break;

                case 3:
                    System.out.println("Enter id to turn on: ");
                    service.turnDeviceOn(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter id to turn off: ");
                    service.turnDeviceOff(sc.nextInt());
                    break;

                case 5:
                    service.sortDeviceByName();
                    break;

                case 6:
                    System.out.println("Enter device name to search: ");
                    service.searchDeviceByName(sc.next());
                    break;

                case 7:
                    System.out.println("Total Devices: ");
                    service.getTotalDevice();
                    break;
                
                case 8:
                    System.out.println("Exiting..... GoodBye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
