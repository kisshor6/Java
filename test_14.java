
// exception handling
// try-catch block in java//it helps to solve the error not to crash program

// public class test_14 {
//     public static void main(String[] args) {
//         int a = 600;
//         int b = 0;
//         try {
//             int c = a/b;
//             System.out.println("the given number is " + c);
//         } catch (Exception e) {
//             System.out.println("make sure that the number is not divided by 0");
//         }
//         System.out.println("thank you");

//     }
// }

// handling specific exception

// import java.util.Scanner;
// class test_14{
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0] = 23;
//         marks[1] = 40;
//         marks[2] = 30;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array value that you want to divide");
//         int a = sc.nextInt();
//         System.out.println("Enter the dividing number");
//         int b = sc.nextInt();
//         try {
//             System.out.println("the number that divide by that number is " + marks[a]);
//             System.out.println("the result of that number is " + marks[a]/b);
//         }
//          catch (ArithmeticException e) {//likewise we can use may exception in try and block 
//             System.out.println("ArithmeticException occured");
//             System.out.println(e);
//         }
//          catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException occured");
//             System.out.println(e);//it shows the real exception
//         }
//          catch (Exception e) {
//             System.out.println("some exception occured");
//             System.out.println(e);
//         }
//     }
// }

// nested- try catch in java 

// import java.util.Scanner;
// class nestedfor{
//     public static void main(String[] args) {
//         int []num = new int[4];
//         num[0] = 23;
//         num[1] = 92;
//         num[2] = 30;
//         num[3] = 20;
//         Scanner er = new Scanner(System.in);
//         System.out.println("enter the value of array");
//         int v = er.nextInt();
//         try {
//             System.out.println("this is the first exception handling ");
//             try {
//                 System.out.println("the value of given index in array id " + num[v]);
//             }
//              catch (Exception e) {
//                 System.out.println("the given index is not occured");
//                 System.out.println("This is the inner exception");
//             }
//         } catch (Exception e) {
//             System.out.println("this is the final or outer exception");
//         }

//     }
// }

// the exception class in java

// import java.util.Scanner;
// class exceptionmy extends Exception{//making own custom exception
//     public String toString(){
//         return "what the hail";
//     }
// }
// class excep extends Exception{
//     public String getMessage(){
//         return "how discusting";
//     }
// }
// class exceptionclass{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = 8;
//         sc.nextInt();
//         if (a <34) {
//             try {
//                 // throw new exceptionmy();//we can run both built-in and custom exception
//                 throw new excep();
//                 // throw new ArithmeticException("this is an exception part");
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 System.out.println(e);
//                 e.printStackTrace();//its not an error
//             }
//         }
//     }
// }

// difference between throw and throws
//throw is used for the other programmers who used our code

// class NegativeRadiusException extends Exception {
//     public String toString() {
//         return "your radius cannot be negative";
//     }
// }
//     class throwsa {
//         static double AreaOfCircle(int a) throws NegativeRadiusException {
//             if (a < 0) {
//                 throw new NegativeRadiusException();
//             }
//             double result = Math.PI * a * a;
//             return result;

//         }

//         public static void main(String[] args) {
//            try {
//             double db = AreaOfCircle(5);
//             System.out.println(db);
//         }
//         catch (Exception e) {
//            System.out.println("exception occur");
    
//         }
//     }
// }


// Finally Block in Java & Why is it needed!
// finally run in any condition


// class Finallyblock{
//     public static int greet(){
//         try {
//             int w = 45;
//             int n = 0;
//             int c = w/n;
//             return c;
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         finally{
//             System.out.println("this is run in any condition");
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//        int k =  greet();
//        System.out.println(k);
//     //    for (int i = 0; i < 9; i++) {
//     //        try {
//     //            System.out.println(45/0);
//     //        } catch (Exception e) {
//     //         System.out.println("some error occur");
//     //         break;
//     //        }
//     //        finally{
//     //         System.out.println("now breaking the condition");
//     //     }
//         // }
    
//     }
// }