package sistema;

public class ElectricVehicle extends Vehicle {

    private double autonomy;

    private double batteryCapacity;

    private int chargingTime;

    private String fastcharging;

    public ElectricVehicle(double autonomy, double batteryCapacity,
            int chargingTime, String fastcharging) {
       
        this.autonomy = autonomy;
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
        this.fastcharging = fastcharging;
    }

    public ElectricVehicle() {
    }

    public double getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(double autonomy) {
        this.autonomy = autonomy;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(int chargingTime) {
        this.chargingTime = chargingTime;
    }

    public String getFastcharging() {
        return fastcharging;
    }

    public void setFastcharging(String fastcharging) {
        this.fastcharging = fastcharging;
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" + "autonomy=" + autonomy + ","
                + " batteryCapacity=" + batteryCapacity + ", chargingTime=" +
                chargingTime + ", fastcharging=" + fastcharging + '}';
    }

   
    
}
