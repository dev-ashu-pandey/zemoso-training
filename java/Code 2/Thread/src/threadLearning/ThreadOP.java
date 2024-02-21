package threadLearning;

class UserThread extends Thread{
    public void run()
    {
        System.out.println("this is user defined thread.");
    }
}
class ThreadOp
{
//    main thread
    public static void main(String[] args) {
        System.out.println("program started..");
        int x=56+34;
        System.out.println("sum is "+x);
        //Thread currentThread
        Thread t=Thread.currentThread();
        //Thread name
        String tname=t.getName();
        System.out.println("current running thread is=> "+tname);
        //setName
        t.setName("MyMain");
        System.out.println(t.getName());
        try{
            Thread.sleep(3000);
        }catch(Exception e){
        };
        System.out.println("Thread id=> "+t.getId());
        //going to start user defined thread.
        System.out.println("program ended..");
        UserThread thread=new UserThread();
        thread.start();

    }
}
