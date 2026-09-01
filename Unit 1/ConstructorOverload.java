class MethodOverload{
    public static void main(String[]rrr){
        Shape s1 = new Shape(4);
        Shape s2 = new Shape(2,3);
        Shape s3 = new Shape(5,6,4);
        
    }
}

class Shape{
    private int side,x,y,a,b,c;
    Shape(int side){
        System.out.println("Square");
        this.side = side;
    }

    Shape(int x ,int y){
        System.out.println("Rectangle");
        this.x = x;
        this.y = y;

    }

    Shape(int a,int b, int c){
        System.out.println("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}