// inheritance in java
// single inheritance


// class base{
//     int x;
//     public void printme(){
//         System.out.println("the ptinting number");
//     }
//     public int getx(){
//         return x;
//     }
//     public void setx(int x){
//         this.x = x;
//     }
// }
// class son extends base{
//     int y;
//     public int gety(){
//         return y;
//     }
//     public void sety(int y){
//         this.y = y;
//     }
// }
// public class test_10 {
//     public static void main(String[] args) {
//     base b = new base();
//     b.setx(4);    
//     b.getx();
//     System.out.println(b.getx());    
//     son c = new son();
//     c.setx(435);    
//     c.getx();
//     System.out.println(c.getx());   

//     }
// }

// quick quiz

// class animal{
//     String x;
//     public void printme(){
//         System.out.println("the ptinting number");
//     }
//     public String getx(){
//         return x;
//     }
//     public void setx(String x){
//         this.x = x;
//     }
// }
// class dog extends animal{
//     String y;
//     public String gety(){
//         return y;
//     }
//     public void sety(String y){
//         this.y = y;
//     }
// }
// public class test_10 {
//     public static void main(String[] args) {
//     animal b = new animal();
//     b.setx("four legs");    
//     b.getx();
//     System.out.println(b.getx());    
//     dog c = new dog();
//     b.setx("two years !!");    
//     b.getx();
//     c.sety("bhow bhow !!");    
//     c.gety();
//     System.out.println(c.gety());   
//     System.out.println(b.getx());   

//     }
// }

// constructors on inheritance
// multi line constructor

// class base{
//     base(){
//         System.out.println("this is the constructer");
//     }
//     base(int a){
//         System.out.println("this is the constructer with argument");
//     }
// }
// class derved extends base{
//     derved(){
//         System.out.println("this is the instructer");
//     }
//     derved(int x, int y){
//         super(2);
//         System.out.println("this is the instructer by argument");
//     }
// }    
// class what extends derved{
//     what(){
//         System.out.println("this is the third illustrator");
//     }
//     what(int a, int r, int e){
//         super(3, 5);
//         System.out.println("this is the fourth class constructor");
//     }
// }
// class werf{
//     public static void main(String[] args) {
//         what ew = new what(2, 3, 5);
//     }
// }

// this and super keyword
// class inter{
//     int a = 0;

//     public int geta(){
//         return a;
//     }
//      inter(int a){ 
//         this.a = a;
//     }
//     public int returnone(){
//         return 1;
//     }
// }
// class key{
//     public static void main(String[] args) {
//         inter it = new inter(6);
//         System.out.println(it.geta());
//     }
// }

// method overriding we can only overwrite when nethod is public
// class gui{
//     public int harnry(){
//         return 4;
//     }
//     public void harnry2(){
//         System.out.println("method2 of class harnry");//this is method overwriting
//     }
// }

// class huss extends gui{
//     @Override//it for readable it is written when method is overwrite otherwise it show error
//     public void harnry2(){
//         System.out.println("method2 of jack class harnry");//this is method overwriting
//     }
//     public void harnry3(){
//         System.out.println("method3 of class huss");
//     }
// }
// class me34{
//     public static void main(String[] args) {
//         huss jgh = new huss();
//         System.out.println();
//         jgh.harnry2();
//     }
// }

// dynamic method dispatch
// class first{
//     public void welcome(){
//     System.out.println("this is the welcome class");
//     }
//     public void name(){
//     System.out.println("this is the name class");
//     }
// }
// class second extends first{
//     public void erroe(){
//     System.out.println("this is the brother class");
//     }
//     public void name(){
//     System.out.println("this is the ending class");
//     }
// }
// class dynamic{
//     public static void main(String[] args) {

//       first horse = new second();  //this is dynamic memeory dispatch
//     //   second horse = new first();//it is not allowed   
//       horse.name();
//     }
// }