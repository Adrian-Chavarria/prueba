package sistema;


import java.util.Date;

public class Maintenance {

    private Date date;

    private String typeMaintenance;

    private double cost;

    public Maintenance(Date date, String typeMaintenance, double cost) {
        this.date = date;
        this.typeMaintenance = typeMaintenance;
        this.cost = cost;
    }

    public Maintenance() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTypeMaintenance() {
        return typeMaintenance;
    }

    public void setTypeMaintenance(String typeMaintenance) {
        this.typeMaintenance = typeMaintenance;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Maintenance{" + "date=" + date + ", typeMaintenance=" + 
                typeMaintenance + ", cost=" + cost + '}';
    }
    
    
}
