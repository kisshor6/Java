// problem_01

// class cylinder{
//     private int height;
//     private int radius;
//     public int getradius(){
//         return radius;
//     }
//     public int getheight(){
//         return height;
//     }
//     public void setradius(int r){
//         radius = r;
//     }
//     public void setheight(int h){
//         height = h;
//     }
// }

// public class practice_09 {
//     public static void main(String[] args) {
//         cylinder mysi = new cylinder();
//         mysi.setheight(4);
//         mysi.setradius(9);
//         System.out.println(mysi.getheight());
//         System.out.println(mysi.getradius());
//     }
    
// }

// problem_02

// class cylinder{
//     private int height;
//     private int radius;
//     private float volume;

//     public int getradius(){
//         return radius;
//     }
//     public int getheight(){
//         return height;
//     }
//     public float getvolume(){
//         return height*radius*radius*3.14f;
//     }
//     public void setradius(int r){
//         radius = r;
//     }
//     public void setheight(int h){
//         height = h;
//     }
// }

// public class practice_09 {
//     public static void main(String[] args) {
//         cylinder mysi = new cylinder();
//         mysi.setheight(4);
//         mysi.setradius(9);
//         System.out.println("the volume of cylinder is : "+ mysi.getvolume());
//     }
    
// }
// problem_02 using constructor

// class cylinder{
//     private int height;
//     private int radius;
//     private float volume;

//     cylinder(int a, int b){
//         height = a;
//         radius = b;
//     }
//     public float getvolume(){
//         return height*radius*radius*3.14f;
//     }
 
// }

// public class practice_09 {
//     public static void main(String[] args) {
//         cylinder mysi = new cylinder(9, 2);
//         System.out.println("the volume of cylinder is : "+ mysi.getvolume());
//     }
    
// }
// problem_03
// class rectangle{
//     private int length;
//     private int breadth;
//     rectangle(int a, int b){
//         length = a;
//         breadth = b;
//     }
//     public int getlength(){
//         return length;
//     }
//     public int getbreadth(){
//         return breadth;
//     }
// }
// class area{
//     public static void main(String[] args) {
//       rectangle maan = new rectangle(10, 7);
//       System.out.println(maan.getlength()); 
//       System.out.println(maan.getbreadth()); 
//     }
// }

// problem_05

// class sphere{
//     private int radius;
//     private float area;
//     private float volume;
//     sphere(int a){
//         radius = a;
//     }  
//     public float area(){
//         return radius*radius*4*3.14f;
//     }
//     public float getvolume(){
//         return radius*radius*radius*(4/3)*3.14f;
//     }
  
// }

// public class practice_09 {
//     public static void main(String[] args) {
//         sphere mysi = new sphere(9);
//         System.out.println("the area of sphere is "+ mysi.area());
//         System.out.println("the volume of sphere is "+ mysi.getvolume());
//     }
    
// }