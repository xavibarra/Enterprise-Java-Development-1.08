package com.ironhack.lab08.clases;

public class UtilityVehicle extends Car {
    public boolean fourWheelDrive;

    public UtilityVehicle(int vinNumber, String make, String model, String mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

}
