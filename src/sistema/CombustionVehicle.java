package sistema;

public class CombustionVehicle extends Vehicle {

    private double fuelConsumption;

    private String fuelType;

    private double gasEmission;

    private double tankCapacity;

    public CombustionVehicle(double fuelConsumption, String fuelType,
            double gasEmission, double tankCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
        this.gasEmission = gasEmission;
        this.tankCapacity = tankCapacity;
    }

    public CombustionVehicle() {
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getGasEmissions() {
        return gasEmission;
    }

    public void setGasEmission(double gasEmission) {
        this.gasEmission = gasEmission;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String toString() {
        return "CombustionVehicle{" + "fuelConsumption=" + fuelConsumption +
                ", fuelType=" + fuelType + ", gasEmission=" + gasEmission + 
                ", tankCapacity=" + tankCapacity + '}';
    }
    
    
}
