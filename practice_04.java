// practice_01

// import java.util.Scanner;
// public class practice_04 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your marks of math");
//         int a = sc.nextInt();
//         System.out.println("enter your marks of science");
//         int b = sc.nextInt();
//         System.out.println("enter your marks optional math");
//         int c = sc.nextInt();
//         float d = (a+b+c)/3f;
//         System.out.printf("your percentege is %.2f\n",d);
//         if (d<40 && a<33 && b<33 && c<33) {
//             System.out.println("sorry! you have been failed");
//         }
//         else{
//             System.out.println("you have been passed");
//         }
//     }
// }

// practice_02

// import java.util.Scanner;
// class taxx{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your income in laks");
//         float income = sc.nextFloat();
//         float tax = 0;
//         if (income <= 2.5) {
//             tax +=  0;
//         }
//         else if (income<=5 && income>2.5) {
//             tax += 0.05f *(income -2.5f);
//         }
//         else if (income<=10 && income>5) {
//             tax += 0.05f *(5 -2.5f);
//             tax += 0.2f *(income -5f);
//         }
//         else if (income>10) {
//             tax += 0.05f *(5 -2.5f);
//             tax += 0.2f *(10 -5f);
//             tax += 0.3f *(income -10f);
//         }
//         System.out.printf("the total tax amount paid by citizen is %.2f",tax);
   
//     }
// }

// practice_03
// import java.util.Scanner;
// class swit{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int week = sc.nextInt();
//         switch (week){
//             case 1 -> System.out.println("sunday");
//             case 2 -> System.out.println("monday");
//             case 3 -> System.out.println("tuesday");
//             case 4 -> System.out.println("wenesday");
//             case 5 -> System.out.println("thursday");
//             case 6 -> System.out.println("friday");
//             case 7 -> System.out.println("saturday");
//         }
  
//     }
// }


// practice_04

// import java.util.Scanner;
// class leap{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the name of year");
//         int year = sc.nextInt();
//         if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
//             System.out.println("this year is a leap year");
//         }
//         else{
//             System.out.println("this year is not a leap year");
//         }
//     }
// }

// practice_05
// import java.util.Scanner;
// class web{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("entre the last name of domain");
//         String st = sc.next();
//         if (st.endsWith(".com")) {
            
//             System.out.println("this is the commercial website");
//         }
//         else if (st.endsWith(".in")) {
            
//             System.out.println("this is the indian website");
//         }
//         else if(st.endsWith(".org")) {
            
//             System.out.println("this is the orginanizational website");
//         }
//         else{
//             System.out.println("invaild domain");
//         }
//     }
// }