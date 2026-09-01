class Inh1{
    public static void main(String[]rags){
        //Vehicle v = new Vehicle(1099,"Petrol");
        //v.start();
        Car c = new Car("Toyota","Fortuner",1099,"Petrol");
        //c.start();
        c.setEngineCC(1877);
        c.setModel("Suz");
        c.start();

    }
}

class Vehicle{
    private int engineCC;
    private String fuelType;

    Vehicle(int engineCC,String fuelType){
        this.setEngineCC(engineCC);this.setFuelType(fuelType);
    }

    public void setEngineCC(int engineCC){this.engineCC = engineCC;}
    public void setFuelType(String fuelType){this.fuelType = fuelType;}

    //Getters
    public int getEngineCC(){
        return this.engineCC;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public void start(){
        System.out.println("Vehicle Started");
        System.out.println("Engine CC = "+this.getEngineCC());
        System.out.println("FuelType = "+this.getFuelType());

    }
}

class Car extends Vehicle{
    private String brand,model;
    Car(String brand,String model,int engineCC,String fuelType){
        super(engineCC,fuelType);
        System.out.println("Car constructor invoked");
        this.setBrand(brand);this.setModel(model);
    }
    //setters
    public void setModel(String model){
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    //getters
    public String getModel(){
        return this.model;
    }
    public String getBrand(){
        return this.brand;
    }
    public void start(){
        System.out.println("Car started");
        System.out.println("Brand = "+this.brand);
        System.out.println("Model = "+this.model);
        System.out.println("Engine CC = "+getEngineCC());
        System.out.println("Fuel = "+getFuelType());
    }
}
