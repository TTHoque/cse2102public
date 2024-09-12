package c;
public interface GasolineInterface {
    double calcGasMPG();
    void setMilesfromGas(double miles);
    void setGallonsfromGas(double gallons);

    void setCostPerGal(double galCost);
    double getCostPerGal(); 
}