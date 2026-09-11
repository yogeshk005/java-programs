class ProdCons{
    public static void main(String[]qqq){
        Buffer b = new Buffer();
        Thread producer = new Thread("Producer"){
            public void run(){
                for(int i =0;i<=10;i++)
                    b.produce(i);
                    try{Thread.sleep(200);}
                    catch(InterruptedException ie){}
            }
        };
        Thread consumer = new Thread(){
            public void run(){
                for(int i = 0;i<=10;i++)
                    b.consume();
                    try{Thread.sleep(1000);}
                    catch(InterruptedException ie){}
            }
        };
        producer.start();
        consumer.start();
    }
}

class Buffer{
    int [] buffer = new int [5];
    int count = 0, in = 0,out = 0;
    synchronized void produce(int value){
        while(count == buffer.length){
            try{
                System.out.println("Buffer full producer waiting");
                wait();
            }
            catch(InterruptedException ie){}
        }
        buffer[in]=value;
        System.out.println("Produceed "+value+" at "+in);
        in = (in+1)%buffer.length;
        count++;
        notify();
    }
   

    synchronized void consume(){
        while(count == 0){
            try{
                System.out.println("Buffer EMpty. Consumer waiting");
                wait();
            }
            catch(InterruptedException ie){}
        }
        int value = buffer[out];
        System.out.println("Consumed "+value+" At "+out);
        out = (out+1)%buffer.length;
        count--;
        notify();
    }
}