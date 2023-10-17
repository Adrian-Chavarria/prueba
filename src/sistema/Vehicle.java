package sistema;


   
public class Vehicle {

    private int age;

    String brand;

    private String colour;

    private String id;

    String model;
    
    private String plate;
    
    private String state;

    private String type;

    public Vehicle(int age, String brand, String colour, String id,
            String model,
            String plate, String state, String type) {
        this.age = age;
        this.brand = brand;
        this.colour = colour;
        this.id = id;
        this.model = model;
        this.plate = plate;
        this.state = state;
        this.type = type;
    }

    public Vehicle() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "age=" + age + ", brand=" + brand + ","
                + " colour=" + colour + ", id=" + id + ", model=" +
                model + ", plate=" + plate + ", state=" + state + ", type=" +
                type + '}';
    }

   
    

    
}
