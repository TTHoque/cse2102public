public interface ElectricInterface {
    double calcMPGe();
    void setElectricMiles(double totalElectricMiles);
    void setTotalkWh(double totalkWh);
    
    void setCostPerKWH(double kWhCost);
    double getCostPerKWH();
}