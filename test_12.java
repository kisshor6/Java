// class demo{
//     public int a = 32;//it can used any where class, packages, subclass and another
//     private int b = 90;//it can only used on same class
//     protected int c = 67;//it can only used on same class and packages
//     int d = 54;//it can used any where class, packages and subclass
//     //its a default which is not necessary to write
//     public void nmf(){
//     System.out.println(b);  
//     } 
// }
// class demo1 extends demo{
//     void what(){
//         System.out.println(a);
//         // System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//     }
// }
// public class test_12{
//     public static void main(String[] args) {
//         demo d = new demo();
//         System.out.println(d.a);
//         // System.out.println(d.b);because it is private so it is not working
//         System.out.println(d.c);
//         System.out.println(d.d);

//     //it is the same as upper code    

//         demo1 et = new demo1();
//         et.what();

//     //to show private only access on same class
//     demo hj = new demo();
//     hj.nmf();// it can only used in same class    
//     }
// }
