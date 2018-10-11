package bai15;



public class TestFlashLamp {
    public static void main(String[] args) {
        Battery bt = new Battery(0);
        FlashLamp fl = new FlashLamp();
        fl.setBattery(bt);
        fl.turnOn();
        bt.decreaseEnergy();
        fl.turnOff();
        fl.turnOn();
        bt.decreaseEnergy();
        fl.turnOff();
        fl.turnOn();
        bt.decreaseEnergy();
        fl.turnOff();
        fl.turnOn();
        bt.decreaseEnergy();
        fl.turnOff();
        fl.turnOn();
        bt.decreaseEnergy();
        fl.turnOff();

        System.out.println("Muc nang luong hien co: "+fl.getBatteryInfo());
    }
}


