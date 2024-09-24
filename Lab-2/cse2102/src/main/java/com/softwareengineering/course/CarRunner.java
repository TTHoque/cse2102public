package com.softwareengineering.course;
public class CarRunner {

    public static void main(String[] args) {
        Hybrid hybridCar = new Hybrid();

        double galCost = 3.50;
        double kwhCost = 0.24;
        hybridCar.setCostPerGal(galCost);
        hybridCar.setCostPerKWH(kwhCost);

        double electricMiles = 300;
        hybridCar.setElectricMiles(electricMiles);
        hybridCar.setTotalkWh(70.0);
        double MPGe = hybridCar.calcMPGe();
        System.out.println("Electric Mode MPGe: " + MPGe);

        double gasMiles = 120;
        double gal = 6;
        hybridCar.setMilesfromGas(gasMiles);
        hybridCar.setGallonsfromGas(gal);
        double mpg = hybridCar.calcGasMPG();
        System.out.println("Gas Mode MPG: " + mpg);

        double avgMPG = hybridCar.calcHybridModeMPG();
        System.out.println("Hybrid Mode Average MPG: " + avgMPG);

        double gasCost = hybridCar.totalGasCost();
        System.out.println("Total cost of gasoline: " + gasCost);

        double elecCost = hybridCar.totalElectricCost();
        System.out.println("Total cost of electricity: " + elecCost);

    }



}