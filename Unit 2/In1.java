class In1{
    public static void main(String[]yyy){
        Engine a = new Engine();
        a.e.show();
    }
}

class Engine{
    public void show(){System.out.println("Engine");}
}

class Car{
    Engine e = new Engine(); 
    private int x = 90;
}