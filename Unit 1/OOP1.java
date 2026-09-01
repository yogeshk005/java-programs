class OOP1{
    public static void main(String[]srgs){
        Car c = new Car();
        Car c1 = new Car("red","model","brand",123,true);
        System.out.println(c1.getColor());
        c1.setColor("Blue");
        System.out.println(c1.getColor());
        System.out.println("For balnk :");
        System.out.println(c.getColor());
        System.out.println(c.getEngineCC());
        System.out.println(c.getIsManual());
        System.out.println(c.getModel());
        System.out.println(c.getBrand());
        
        c.setBrand("New Brand");
        c.setColor("black");
        c.setEngineCC(1090);
        c.setIsManual(true);
        c.setModel("MAr")

    }
}
class Car {
    //Membes / Data/ Variables/ Properties
    private String color, model, brand;
    private int engineCC;
    private boolean isManual;
    Car(){System.out.println("Blank Constructor");}
    Car(String color,String model,String brand,int engineCC,boolean isManual) {
        System.out.println("Inside parameterized constructor");
        this.setColor(color);
        this.setBrand(brand);
        this.setEngineCC(engineCC);
        this.setModel(model);
        this.setIsManual(isManual);

    }
    public void setColor(String color){this.color = color;}
    public void setModel(String model){this.model = model;}
    public void setBrand(String brand){this.brand = brand;}
    public void setEngineCC(int engineCC){this.engineCC = engineCC;}
    public void setIsManual(boolean  ismanual){this.isManual = isManual;}
    public String getColor() {return this.color;}
     public String getBrand() {return this.brand;}
    public String getModel() {return this.model;}
    public int getEngineCC() {return this.engineCC;}
    public boolean getIsManual() {return this.isManual;}

}