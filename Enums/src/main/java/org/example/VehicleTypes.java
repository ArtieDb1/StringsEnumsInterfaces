package org.example;

public enum VehicleTypes {
    //Vehicle Types for a hiring company with 3 vehicles
    //all cars are identical
    //all vans are identical
    //all HGVs are identical
    CAR(1750, 3,50),
    VAN(3500, 6,30),
    HGV(7.5, 8,30),  
    ;

    private final double mass;
    private final double length;
    private final double mpg;


    VehicleTypes(double mass, double length, double mpg) {
        this.mass = mass;
        this.length = length;
        this.mpg = mpg;
    }

    static double calculateCost(VehicleTypes vehicle){
        return (vehicle.length*vehicle.mpg);
        //Length*mpg = daily charge - the higher the mpg the cheaper on the customer and I don't want that
    }

    public static void main(String[] args) {
        VehicleTypes vehicle = VehicleTypes.CAR;
        VehicleTypes vehicle1 = VehicleTypes.VAN;
        System.out.println("You will pay £"+vehicle1.calculateCost(vehicle1)+" for the day!");
    }
}
