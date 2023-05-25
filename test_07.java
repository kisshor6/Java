// method in java

// public class test_07{
//     static int meth(int a, int b){// it is same like function
//        int c;
//        if (a>b) {
//             c = (a + b);
//        }
//        else{
//            c = (a*b) + 3;
//        }
//        return c;    
//     }
//    public static void main(String[] args) {
//        int s;
//     s =  meth(2, 5);
//     System.out.println(s);
//    } 
// }

// in case if we dont use static on method

// public class test_07{
//     int meth(int a, int b){
//        int c;
//        if (a>b) {
//             c = (a + b);
//        }
//        else{
//            c = (a*b) + 3;
//        }
//        return c;    
//     }
//    public static void main(String[] args) {
//     int s;
//     test_07 obj = new test_07();
//     s = obj.meth(2, 5);
//     System.out.println(s);
//    }
// }

// normally in methods in java thw value is not passed
//  but in array in could change because array pass the reference

// class ref{
//     static void change(int arr[]){
//         arr[3] = 876;
//     }
//     public static void main(String[] args) {
//         int namw[]  = {34, 23, 76, 86};
//         change(namw);
//         System.out.println("tha value of x after interchanging is :"+ namw[3]);
//     }
// }

// methods overloading in java

// class ref{
//     static void change(){
//         System.out.println("good morning broo");
//     }
//     static void change(int a){
//         System.out.println("good morning " + a +  " broo" );
//     }
//     static void change(int a, int b){
//         System.out.println("good morning " + a + b + " broo" );
//     }
//     public static void main(String[] args) {
//        change();
//        change(876);
//        change(86, 5);
//     }
// }

// variable arguments (varargs) in java

// class werwg{
//     // static int sum(int a, int b){
//     //     return a+b;
//     // }
//     // static int sum(int a, int b, int c){
//     //     return a+b+c;
//     // }
//     // static int sum(int a, int b, int c, int d ){
//     //     return a+b+c+d;
//     // }

//     static int sum(int...arr){
//         int result = 0;
//         for (int i : arr) {
//             result += i;
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         System.out.println("the sum of a and b is :  " + sum());
//         System.out.println("the sum of a and b is :  " + sum(4, 7));
//         System.out.println("the sum of a and b is :  " + sum(4, 7, 3));
//         System.out.println("the sum of a and b is :  " + sum(4, 7, 3, 9));
//     }
// }

// recursion
// class dsf{
//     static int factorial(int q){
//         if (q == 1 || q == 0) {
//             return 1;
//         }
//         else{
//             return q * factorial(q-1);
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("the factorial of q  is : " + factorial(7));
//     }
// }