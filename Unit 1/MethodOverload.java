class MethodOverload{
    public static void main(String[]atg){
        Shape s = new Shape();
        System.out.println(s.area(10));
        System.out.println(s.area(10,20));
        System.out.println(s.area(10,20,30));
    }
}

class Shape{
    public int area(int side){
        return side*side;
    }

    public float area(float a, float b){
        return a*b;
    }
    public double area(int a,int b, int c){
        float s = (a+b+c)/ 2.0f;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}