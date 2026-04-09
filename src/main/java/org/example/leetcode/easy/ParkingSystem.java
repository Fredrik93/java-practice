package org.example.leetcode.easy;

public class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;


    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:

                if (this.big > 0) {
                    big--;
                    return true;

                }
                break;
            case 2:
                if (this.medium > 0) {
                    medium--;
                    return true;

                }
                break;
            case 3:
                if (this.small > 0) {
                    small--;
                    return true;

                }
                break;
            default:
                System.out.println("No such type");
        }
        return false;
    }


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
}
