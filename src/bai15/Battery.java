package bai15;

public class Battery {
    private int energy;

    public Battery() {
    }
    public Battery(int energy) {
        this.energy = energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void decreaseEnergy() {
        if (energy > 2) {
            energy -= 2;
        }
    }
}
