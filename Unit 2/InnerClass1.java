/*class InnerClass1{
    public static void main(String[]bbb){
        Car c = new Car();
        Car.Engine e = c.new Engine();
    }
}

class Car{
    private int x = 10;
    Car(){
        System.out.println("Car constructor");
    }
    class Engine{
        Engine(){
            System.out.println("Eggine constructor");
        }
        public void show(){
            System.out.println("X ="+x);
        }
    }
}*/

class InnerClass1{
    public static void main(String[]kdj){
        I i1 = new I(){
            public void show(){
                System.out.println("Somethings");
            }
        };
        i1.show();

        I i2 = new I(){
            public void show(){
                System.out.println("Somethings else");
            }
        };
        i2.show();

        System.out.println("i1 ="+i1.getClass().getName());
        System.out.println("i2 ="+i2.getClass().getName());
    }
}

interface I{public void show();}