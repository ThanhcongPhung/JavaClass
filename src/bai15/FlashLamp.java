package bai15;

public class FlashLamp {
    private boolean status;
    private Battery battery;

    FlashLamp() {
        status = false;
    }

    public void setBattery(Battery b) {
        battery = b;
        b.setEnergy(10);
    }

    public int getBatteryInfo() {
        return battery.getEnergy();
    }

    public void turnOn() {
        if ((status == true) && (battery.getEnergy() > 0)) {
            System.out.println("Den sang");
        }
    }

    public void turnOff() {
        if (!((status == true) && (battery.getEnergy() > 0))) {
            System.out.println("Den khong sang");
        }
    }
}

