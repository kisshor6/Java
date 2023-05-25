//Your First Program

// class what {
//     public static void main(String[] args) {
//         System.out.println("the sum of given below value is:"); 
//         int a = 45;
//         int b = 50;
//         int c = 23;
//         System.out.println(a+b+c);
//     }
// }

// litreles

// class prime{
//     public static void main(String[] args) {
//         byte b = 23;
//         int q = 32;
//         float h = 56.3f;
//         double e = 56.3; //not necessary to write
//         char y = 'r';
//         long x = 3453245353l;
//         short s = 87;
//         boolean v = true;
//         String str = "horse";
//         System.out.println(str);
//         System.out.println(b);
//         System.out.println(q);
//         System.out.println(h);
//         System.out.println(e);
//         System.out.println(y);
//         System.out.println(x);
//         System.out.println(s);
//         System.out.println(v);
//     }
// }

// getting input from the user

// import java.util.Scanner;
// class input{
//     public static void main(String[] args) {
//         System.out.println("practice for input");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("input the first number :");
//         int a = sc.nextInt();
//         System.out.println("input the second number :");
//         int b = sc.nextInt();//we can also write float in place of Int
//         int sum = (a+b);
//         System.out.println("the sum of a and b is :");
//         System.out.println(sum);
//         // boolean n = sc.hasNextInt();
//         // System.out.println(n);
//         // String str = sc.next();//it read only word and it doesnot read space
//         String str = sc.nextLine();//it also read space
//         System.out.println(str);

//     }
// }

// solution to find the percentage of user

// import java.util.Scanner;
// class percent{
//     public static void main(String[] args) {
//         System.out.println("Input the marks of your subject");
//         Scanner bw = new Scanner(System.in);
//         System.out.println("enter the marks of math subject");
//         int a = bw.nextInt();      
//         System.out.println("enter the marks of science subject");
//         int b = bw.nextInt();           
//         System.out.println("enter the marks of optional math subject");
//         int c = bw.nextInt();       
//         System.out.println("enter the marks of science subject");
//         int d = bw.nextInt();       
//         System.out.println("enter the marks of englush subject"); 
//         int e = bw.nextInt(); 
//         float per = (a+b+c+d+e)/5.0f;
//         System.out.println("your percentage is :");    
//         System.out.println(per);    
//     }
// }

// additional outdoor practice

// class what{
//     int meth(int a, int b){
//         return a*b;
//     }
//     int divide(int b, int c){
//         return b+c;
//     }
//     public static void main(String[] args) {
//         what obj = new what();
//         int y = obj.divide(19, 31);
//         int t = obj.meth(3, 9);
//         System.out.println("the value of y is : " + y);
//         System.out.println("the value of t is : " + t);
//     }
// }