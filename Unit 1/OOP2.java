class OOP2{
    public static void main(String[]args){
        Cow c1 = new Cow();
        Cow c = new Cow("HF","Femal","Cow",8,true);
        c.display();
    }
}

class Cow{
    private String breed, gender, name;
    private int age;
    private boolean isHealthy;
    Cow(){System.out.println("Blank");}
    Cow(String breed,String gender,String name, int age, boolean isHealthy){
        this.setBreed(breed);
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setIsHealthy(isHealthy);
    }

    public void setBreed(String breed){this.breed=breed;}
    public void setGender(String gender){this.gender=gender;}
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setIsHealthy(boolean isHealthy){this.isHealthy=isHealthy;}

    public String getBreed(){return this.breed;}
    public String getGender(){return this.gender;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public boolean getIsHealthy(){return this.isHealthy;}

    public void display(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getGender());
        System.out.println(this.getBreed());
        System.out.println(this.getIsHealthy());

    }
}