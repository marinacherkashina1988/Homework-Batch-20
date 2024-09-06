package org.example.e167;


public class E167MultipleInterface {

    interface BaseDeviceInterface {
        public void basicFunctionality();
    }

    interface AdvancedDeviceInterface{
        public void advancedFunctionality();
        public void basicFunctionality();
    }

    public static class SmartDevice implements AdvancedDeviceInterface{
        @Override
        public void basicFunctionality() {
            System.out.println("Basic Functionality: Device is turning on");
        }

        @Override
        public void advancedFunctionality() {
            System.out.println("Advanced Functionality: Device is adjusting settings");
        }
    }

    public static void main(String[] args){

    SmartDevice smart = new SmartDevice();
    smart.basicFunctionality();
    smart.advancedFunctionality();
    }
}


