// multithreading in java
// 01-creating thread by extending thread class

// it print both program randomly


// class first extends Thread{
//     public void run(){
//         for (int i = 1; i < 15; i++) {
//             System.out.println("from first thead :"+ i);
//         }
//         System.out.println("getting out from first class");
        
//     }
// }
// class second extends Thread{
//     public void run(){
//         for (int i = 2; i < 15; i++) {
//             System.out.println("from second thread :"+i);
//         }
//         System.out.println("getting out from second class");
        
//     }
// }
// public class test_13 {
//     public static void main(String[] args) {
//         first fr = new first();
//         second sc = new second();
//         fr.start();
//         sc.start();
//     }
// }

// 01-creating thread Implementing Runnable Interface in Java

// class first implements Runnable{
//     public void run(){
//         for (int i = 0; i < 10; i++) {
//             System.out.println("first thread");
//         }
//     }
// }
// class second implements Runnable{
//     public void run(){
//         for (int i = 0; i < 10; i++) {
//             System.out.println("second thread");
//         }
//     }
// }
// class test_13{
//     public static void main(String[] args) {
//         first fr = new first();
//         second sc = new second();
//         Thread th = new Thread(fr);//there we have to pass argument in interface
//         Thread tw = new Thread(sc);//there we have to pass argument in interface
//         th.start();
//         tw.start();
//     }
// }

// Constructors from Thread class in Java
// by extending thread class

// class first extends Thread{
//     public first(String name){
//         super(name);
//         }
//         public void run(){
//             for (int i = 1; i < 3; i++) {
//                 System.out.println("construct from thread");  
//         }   
//     }
// }
// class second extends Thread{
//         public second(String roll){
//             super(roll);
//         }
//         public void run(){
//             for (int i = 1; i < 3; i++) {
//                 System.out.println("same as first but second");
//             }
            
//         }
//     }

// public class test_13 {
//     public static void main(String[] args) {
//         first fr = new first("kisshor");
//         second sc = new second("this is my name");
//         System.out.println("the id of this thread is " + fr.getId());
//         System.out.println("the id of second thread is " + sc.getId());
//         fr.start();
//         sc.start();
        
//     }
// }
// thread Implementing Runnable Interface in Java

// class first implements Runnable{
//     public first(String what){
//         // super(what);//may be it is not necessary to write
//     }
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("first thread");
//         }
//     }
// }
// class second implements Runnable{
//     public second(String name){
//         // super(name);
//     }
//     public void run(){
//         for (int i = 0; i < 5; i++) {
//             System.out.println("second thread");
//         }
//     }
// }
// class test_13{
//     public static void main(String[] args) {
//         first fr = new first("what is my name");
//         second sc = new second("jackale");
//         Thread th = new Thread(fr);
//         Thread tw = new Thread(sc);
//         System.out.println("the id of this thread is " + th.getId());
//         System.out.println("the id of second thread is " + tw.getId());
//         th.start();
//         tw.start();
//     }
// }

/* priorities in java //we can set priorities as our choice*/


// class what extends Thread{
//     public what(String name){
//         super(name);
//     }
//     public void run(){
//         for (int i = 0; i < 50; i++) {
//             System.out.println("thank you" + this.getName()); 
//         }      
//     }
// }
// class priorities{
//     public static void main(String[] args) {
//         what wh = new what(" kisshor1 ");
//         what wh1 = new what(" kisshor2 ");
//         what wh2 = new what(" kisshor3 ");
//         what wh3 = new what(" kisshor4 ");
//         what wh4 = new what(" kisshor5 (highly affected)");
//         wh.setPriority(Thread.MIN_PRIORITY);
//         wh1.setPriority(Thread.MIN_PRIORITY);
//         wh2.setPriority(Thread.MIN_PRIORITY);
//         wh3.setPriority(Thread.MIN_PRIORITY);
//         wh4.setPriority(Thread.MAX_PRIORITY);
//         wh.start();
//         wh1.start();
//         wh2.start();
//         wh3.start();
//         wh4.start();
//     }
// }

// thread methods//it run program turn by turn not print random

 class first extends Thread{
    
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("first thread");
            }
        }
    }
    class second extends Thread{

        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("second thread");
                // try{
                //     Thread.sleep(144);
                // }catch(InterruptedException e){
                //     e.printStackTrace();
                // }

            }
        }
    }
    class test_13{
        public static void main(String[] args) {
            first fr = new first();
            second sc = new second();
         
             fr.start();//to join fr.start with sc.start we use fr.join in try case
            try {
                fr.join();
            } catch (Exception e) {
                System.out.println(e);
            }
            sc.start();
        }
    }