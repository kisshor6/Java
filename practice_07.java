
// practice_01

// public class practice_07 {
//    static void meth(int a){
//     for (int i = 0; i < 10; i++) {
//     System.out.printf("%d x %d = %d\n", a, i+1, a*(i+1));
//     }  
// }
//     public static void main(String[] args) {
//         meth(2);
//     }
// }

 // practice_02
// class rrtwe{
//     static void pattern(int n){
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i+1 ; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//        pattern(5); 
//     }
// }

// practice_03
// class sf{
//     static int bmw(int w){
//         if (w == 1) {
//             return 1;
//         }
        
//         return w + bmw(w-1);
        
//     }
//     public static void main(String[] args) {
//        int v = bmw(10);  
//        System.out.println(v);
//     }
// }

 // practice_04


// class rrtwe{
//     static void pattern(int n){
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n-i-1 ; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//        pattern(5); 
//     }
// }

 // practice_05
 
// class rrtwe{
//     static int fib(int f){
//         if (f == 1 || f == 2)  {
//             return f-1;
//         }
//         else{
//             return (f-1) + (f+1);
//         }
//     }
//     public static void main(String[] args) {
//         int series = fib(5);
//         System.out.println(series);
//     }
// }

// practice_06
 
// class rrtwe{
//     static int avg(int...arr){
//         int result = 0;
//         for (int i : arr) {
//             result += i/2;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//       System.out.println("the avarage of a and b is : " + avg(23,243,234));
//     }
// }

// practice_07
// class wer{
//     static void pattern(int n){
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i+1 ; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     static void pattern1(int n){
//              if (n>0) {
//             pattern1(n-1);
//             for (int i = 0; i < n; i++) {
//                 System.out.println("*");
//             }   
//         }
//     }
//     public static void main(String[] args) {
//        pattern(15); 
//     }
// }

// practice_08
// import java.util.Scanner;
// class tem{
//     static float faran(float n){
//         return n = (n * 9/5) + 32;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the temprature in celcius");
//         float cel = sc.nextFloat();
//         float rgn = faran(cel);
//         System.out.println("the temprature in celcius is " + rgn);
//     }
// }