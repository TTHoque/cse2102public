package c;

public class Hybrid implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double gasMiles;
    private double electricMiles;
    private double gallons;
    private double kWh;

    private double galCost;
    private double kWhCost;

    private final double MPG_E = 33.7;

    public double calcGasMPG() {
        gasMPG = gasMiles/gallons;
        return gasMPG;
    }

    public double calcMPGe() {
        MpgE = (electricMiles/kWh) * MPG_E;
        return  MpgE;
    }

    public double calcHybridModeMPG() {
        double gasMPG = this.calcGasMPG();
        double mpge = this.calcMPGe();

        double aveMPG = (gasMPG + mpge) / 2;
        return aveMPG;
    }

    public void setMilesfromGas(double miles) {
        this.gasMiles = miles;
    }

    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    public void setElectricMiles(double totalElectricMiles) {
        this.electricMiles =  totalElectricMiles;
    }

    public void setTotalkWh(double totalkWh) {
        this.kWh = totalkWh;
    }

    public void setCostPerGal(double galCost) {
        this.galCost = galCost;
    }

    public double getCostPerGal() {
        return this.galCost;
    }

    public void setCostPerKWH(double kWhCost) {
        this.kWhCost = kWhCost;
    }

    public double getCostPerKWH() {
        return this.kWhCost;
    }

    public double totalGasCost() {
        double cost = this.gallons * this.getCostPerGal();
        return cost;
    }

    public double totalElectricCost() {
        double cost = this.kWh * this.getCostPerKWH();
        return cost;
    }

}