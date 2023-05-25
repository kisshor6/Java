

// Generating our own JavaDocs for our Package

class javadoc{
    public void add(int a, int b){
        System.out.println("the result is a + b" + a+b);
    }
    public static void main(String[] args) {
        System.out.println("this is the main method");
    }
}

// Annotations in Java

// @FunctionalInterface//it allows only one abstract method
// interface myenterface{
//     void thismethod();
//     // void thismethod2();//it shows error
// }
// class phone{
//     public void time(){
//         System.out.println("the current time is : 11 am");
//     }
// }
// class sellphone extends phone{
//     @Override// this is called annotation
//     public void time(){
//         System.out.println("the current time is : 11 pm");
//     }
//     @Deprecated
//     public int sum(int a, int b){
//         return a+b;
//     }
// }
// class Annotationsof{
//     @SuppressWarnings("deprecation")
//     public static void main(String[] args) {
//         sellphone ph = new sellphone();
//         ph.time();
//         ph.sum(5, 8);
//     }
// }

// Java Anonymous Classes & Lambda Expressions


// @FunctionalInterface
// interface original{
//     void display();
// }
// // class photocopy implements original{
// //     public void display(){
// //         System.out.println("this is the part of anonymous class");
// //     }
// //     public void ownpart(){
// //         System.out.println("this is the own-part of anonymous class");
// //     }
// // }
// class finalpart{
//     public static void main(String[] args) {
//         // photocopy pc = new photocopy();
//         // pc.display();
//         // pc.ownpart();
//         //Anonymous class
//         original obj = new original(){//we can use to run at only one time
//             public void display(){//this is the anonymous class
//                 System.out.println("this is the real anonymous");
//             }
//         };
//         obj.display();
//     }
// }

// Lambda Expressions

// @FunctionalInterface//it allows only one abstract in given interface
// interface oflamda{
//     void what(int a);
// }
// class lamdaexp{
//     public static void main(String[] args) {
//         oflamda none = (a)->{//also we can pass argument
//             System.out.println("this is lamda expression from interface " + a);
//         };
//         none.what(6);
//     }
// }

// Java Generics

// import java.util.ArrayList;
// class javagenerics{
//     public static void main(String[] args) {
//         ArrayList allist = new ArrayList<>();
//         allist.add("this is the string");
//         allist.add(34);
//         allist.add(34.8f);
//         String a = (String)allist.get(0);
//         System.out.println(a);
//     }
// }

// Generics class in java 

// class noinput<W1,W2>{//this is the way to made javagenerics
//     int a;
//     private W1 b;
//     private W2 c;

//     public noinput(int a, W1 b, W2 c){
//         this.a = a;
//         this.b = b;
//         this.c = c;
//     }
//     public void setb(W1 b){
//         this.b = b;
//     }
//     public W1 getb(){
//         return b;
//     }
//     public void setc(W2 c){
//         this.c = c;
//     }
//     public W2 getc(){
//         return c;
//     }
//     public void seta(int a){
//         this.a = a;
//     }
//     public int geta(){
//         return a;
//     }

// }
// class javagenericsk{
//     public static void main(String[] args) {
//         noinput<String ,Integer> in = new noinput(23," why error occurred ", 58);
//         int x = in.geta();
//         String k = in.getb();
//         float f = in.getc();
//         System.out.println(x + k + f);
//     }
// }

// File Handling in Java

// class filehandling{
//     public static void main(String[] args) {
//         File myfile = new File("www.world.txt");//creating file
//         try {
//             myfile.createNewFile();
//         } catch (Exception e) {
//             System.out.println("unable to create this file");
//         }
        
//     }
// }

// import java.io.File;
// import java.util.Scanner;

// class filehandling{
//     public static void main(String[] args) {
//         //writing file

//         // try {
//         //     FileWriter fw = new FileWriter("www.world.txt");
//         //     fw.write("this is the first file\nwhich is very best");
//         //     fw.close();
//         // } catch (Exception e) {
//         //     System.out.println("unable to create this file");
//         // }

//         //reading file

//         File fw = new File("www.world.txt");
//         try {
//             Scanner sc = new Scanner(fw);
//             while (sc.hasNextLine()) {
//                 String line = sc.nextLine();
//                 System.out.println(line);
//             }
//             sc.close();
//         } catch (Exception e) {
//             System.out.println("unable to create this file");
//         }
        
//     }
// }

// deleting file 

// import java.io.File; 
// class deletingf{
//     public static void main(String[] args) {
//         File myfile = new File("www.world.txt");
//         if (myfile.delete()) {
//             System.out.println("file is deleted" + myfile.getName());
//         }
//         else{
//             System.out.println("some file is deleted");
//         }
//     }
// }


