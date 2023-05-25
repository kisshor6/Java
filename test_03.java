// String in java

// import java.util.Scanner;
// public class test_03 {
//     public static void main(String[] args) {
//         String str = new String("hello my name is kisshor");//same as below
//         // String str = "hello my name is kisshor";
//         System.out.print("content = ");
//         System.out.println(str);
//         int a = 89;
//         float b = 97.565f;
//         System.out.printf("the value of a and b is %d and %.2f\n",a ,b);//same as c programming
//         System.out.format("the value of a and b is %d and %.2f\n",a ,b);
//     }
// }

// get input of string from the user

// import java.util.Scanner;
// public class test_03 {
//     public static void main(String[] args) {
//         Scanner gf = new Scanner(System.in);
//         String st = gf.nextLine();
//         System.out.println(st);        

//     }
// }


// string method in java

// 01 program to find the length of a string 

// class length{
//     public static void main(String[] args) {
//         String name = "kisshor";
//         // System.out.println(name);
//         int len = name.length();
//         System.out.println(len);// it helps to find the length of string
//     }
// }

// 02 program to change a string into small letters

// class lowercase{
//     public static void main(String[] args) {
//         String name = "kisshor";
//         String lw = name.toLowerCase();
//         System.out.println(lw);//it convert string into small letters
//     }
// }

// 03 program to convert a string into capital letters

// class uppercase{
//     public static void main(String[] args) {
//         String name = "kisshor";

//         String up = name.toUpperCase();
//         System.out.println(up);//it convert string into capital letters
//     }
// }

// 04 program to remove the spaces of a string

// class trim{
//     public static void main(String[] args) {
//         String naae = "  .. i am a bad boy";
//         String rm = naae.trim();
//         System.out.println(rm);//it removes the spaces

//     }
// }

// 05 program to print a string from given length

// class substring{
//     public static void main(String[] args) {
//         String name = "kisshor";
//         String vv = name.substring(2,5);
//         // String vv = name.substring(2);
//         System.out.println(vv);//it print the string from that point to end if endpoint is not given


//     }
// }
// 06 program to replace  a string and character

// class replace{
//     public static void main(String[] args) {
//         String name = "kisshor";
//         // String vv = name.replace("ss", "su");
//         String vv = name.replace('k', 'm');
//         System.out.println(vv);

//     }
// }

// 07 program to check a string starts from

// class startsrtwith{
//     public static void main(String[] args) {
//         String name = "kisshor";
//         System.out.println(name.startsWith("kiss"));
//         System.out.println(name.startsWith("mon"));
//     }
// }

// 08 program to check a string ends from

// class endswith{
//     public static void main(String[] args) {
//         String name = "kisshor";
//         System.out.println(name.endsWith("or"));// double comma is needed
//     }
// }

// 09 program to find what is the character at that index

// class char_at{
//     public static void main(String[] args) {
//         String name = "kisshor";
//         System.out.println(name.charAt(4));
//     }
// }

// 10 program to find what is the index of given character

// class indexof{
//     public static void main(String[] args) {
//         String name = "kisshoror";
//         System.out.println(name.indexOf("or",6));//it gives the priority from 
//         //left to right if the index is not given
//     }
// }

// 11 program to find what is the last index of given string

// class lastindexof{
//     public static void main(String[] args) {
//         String name = "arrayarray";
//         System.out.println(name.lastIndexOf("ay"));//it read from last

//     }
// }

// 12 program to check given string is equal or not

// class equals{
//     public static void main(String[] args) {
//         String name = "array";
//         System.out.println(name.equals("array"));

//     }
// }

// 12 program to check given string is equal or not and doesnot read upper and lower case

// class equalignorecase{
//     public static void main(String[] args) {
//         String name = "array";
//         System.out.println(name.equalsIgnoreCase("Array"));

//     }
// }

// 13 escape sequence character 

// class sequence{
//     public static void main(String[] args) {
//         System.out.println("hello ! my name is \\ kisshor khanal");
//         System.out.println("hello ! my name is \" kisshor khanal");
//         System.out.println("hello ! my name is \n kisshor khanal");
//         System.out.println("hello ! my name is \t kisshor khanal");

//     }
// }


