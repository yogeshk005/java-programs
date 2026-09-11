class ThreadNoSyncRace{
    public static void main(String[]qqq){
        Counter c = new Counter();
        Thread t1 = new Thread("T1"){
            public void run(){
                for(int i =0;i<1000;i++)
                    c.increment(this.getName());
                    try{Thread.sleep(5);}
                    catch(InterruptedException ie){}
            }
        };
        Thread t2 = new Thread("T2"){
            public void run(){
                for(int i =0;i<1000;i++)
                    c.increment(this.getName());
                    try{Thread.sleep(1);}
                    catch(InterruptedException ie){}
            }
        };
        t1.start();
        t2.start();
        try{t1.join();t2.join();}
        catch(InterruptedException ie){}
        System.out.println("Exp =2000\nAct = "+c.count);
    }
}

class Counter{
    int count = 0;
    void increment(String name){
        int old = count;
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException ie){}
        if(old != count){
            System.out.println("Race\n");
            System.out.println("Thread = "+name);
            System.out.println("Old = "+old+"\nNew = "+count);
        }
        count++;
        System.out.println("Thread "+name+"\tCOunt ="+count);
    }
}