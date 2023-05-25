// practice_01

// class firstclass extends Thread{
//     public void run(){
//         for (int i = 0; i < 4; i++) {
//           System.out.println("this is the first class");  
//         } 
//     }
// }
// class secondclass extends Thread{
//     public void run(){
//         for (int i = 0; i < 4; i++) {
//            System.out.println("this is the second class");  
//         } 
//     }
// }
// public class practice_13 {
//     public static void main(String[] args) {
//         firstclass fr = new firstclass();
//         secondclass se = new secondclass();
//         fr.start();
//         se.start();
//     }
// }

// practice_02

// class fan extends Thread{
//     public void run(){
//         for (int i = 0; i < 10; i++) {
//             try {
//                 Thread.sleep(300);
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//           System.out.println("using try and catch class");  
//         } 
//     }
// }
// class tavle extends Thread{
//     public void run(){
//         for (int i = 0; i < 10; i++) {
//            System.out.println("simple class");  
//         } 
//     }
// }
// public class practice_13 {
//     public static void main(String[] args) {
//         fan fr = new fan();
//         tavle se = new tavle();
//         fr.start();
//         se.start();
//     }
// }


// practice_03

// class satisfied extends Thread{
//     public void run(){
//         for (int i = 0; i < 9; i++) {
//             System.out.println("first priority");
//         }
        
//     }
// }
// class notsatisfied extends Thread{
//     public void run(){
//         for (int i = 0; i < 8; i++) {
//            System.out.println("second priority"); 
//         }
        
//     }
// }
// class priority{
//     public static void main(String[] args) {
//         satisfied sf = new satisfied();
//         notsatisfied ns = new notsatisfied();
//         sf.setPriority(Thread.MIN_PRIORITY);
//         ns.setPriority(Thread.MAX_PRIORITY);
//         // sf.setPriority(5);
//         // ns.setPriority(1);
//         sf.start();
//         ns.start();
//         // System.out.println(sf.getPriority());
//         // System.out.println(ns.getPriority());
//     }
// }

// practice_04



// class sea extends Thread{
//     public void run(){
//         System.out.println("good morning everyone");
//     }
// }
// class whatd extends Thread{
//     public void run(){

//     }
// }
// class last{
//     public static void main(String[] args) {
//         sea p1 = new sea();
//         whatd p2 = new whatd();

//         System.out.println(p1.getPriority());
//         System.out.println(p2.getPriority());
//         System.out.println(p2.getState());

//         p2.start();
//         System.out.println(p2.getState());
//         System.out.println(Thread.currentThread().getState());

//     }
// }

