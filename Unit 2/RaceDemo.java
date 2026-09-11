class RaceDemo{
    public static void main(String[]qqq)throws InterruptedException{
       CounterNew c = new CounterNew();
       Thread t1 = new Thread("T1"){
        public void run(){
            c.increment(this.getName());
        }

       };
        Thread t2 = new Thread("T2"){
        public void run(){
            c.increment(this.getName());
        }

       };
       t1.start();
       t2.start();
       t1.join();t2.join();
       System.out.println("Expected = 2");
       System.out.println("Actual ="+c.count);
       if(c.count != 2){
        System.out.println("RACE");
       }
    }
}

class CounterNew{
    int count = 0;
    void increment(String name){
        int old = count;
        System.out.println(name+" Read count = "+old);
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){}
        count = old+1;
        System.out.println(name+" Wrote count = "+count);
    }
}