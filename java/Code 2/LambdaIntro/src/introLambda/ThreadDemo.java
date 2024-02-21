package introLambda;

public class ThreadDemo {
    public static void main(String []args){
//        Runnable is functional interface
        Runnable thread=()->{
//            this is a body of thread
            for(int i=0;i<10;i++){
                if(i==2) {
                    try{
                        Thread.sleep(3000);
                    }catch (Exception e){

                    }
                }
                else System.out.println("value of i "+i);
            }
        };
        Thread thread1=new Thread(thread);
        thread1.setName("Ashu");
        thread1.start();
    }
}
