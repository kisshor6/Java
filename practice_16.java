
// practice_01

// class MyDeprecated{
//     @Deprecated
//     void meth1(){
//         System.out.println("I am method 1");
//     }
// }

// class whatis{
//     public static void main(String[] args) {
//         MyDeprecated d = new MyDeprecated();
//         d.meth1();
//     }
// }

// practice_02


// class MyDeprecated{
//     @Deprecated
//     void meth1(){
//         System.out.println("I am method 1");
//     }
// }

// class CWH {
//     public static void main(String[] args) {
//         @SuppressWarnings("deprecation")
//         MyDeprecated d = new MyDeprecated();
//         d.meth1();
//     }
// }

// practice_03


// interface myinterface{
//     void whatisg();
// }
// class eagle{
//     public static void main(String[] args) {
//         myinterface frog  = ()->System.out.println("this is my practice");
//         frog.whatisg();
//     }
// }

// practice_04

//import java.io.FileWriter;
// class table{
//     public static void main(String[] args) {
//         String table = "";
//         int a = 91;
//         for (int i = 1; i < 11; i++) {
//             table += a + "X" + i + "=" +  a*i;
//             table += "\n";
//         }
//         try {
//             FileWriter fw = new FileWriter("multipication.txt");
//             fw.write(table);
//             fw.close();
//         } catch (Exception e) {
//             System.out.println("unexpected error occur");
//         }
//     }
// }