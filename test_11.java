// abstract class and method 


// abstract class what{
//     abstract void name();//it have only header no body 
//     abstract void rolln();//if the method is abstract then we have to also made class abstract
//     abstract void clasu();
// }
// abstract class who extends what{// we cannot made the obj having abstract
//     void name(){
//         System.out.println("my name is kisshor??");// subclass define main class
//     }
//     void rolln(){
//         System.out.println("my rollnumber is 23");
//     }
// }
// class whom extends who{
//     void clasu(){
//         System.out.println("i read in class 12");
//     }
// }
// class abstruict{
//     public static void main(String[] args) {
//         whom whu = new whom();
//         whu.clasu();
//         whu.name();
//         whu.rolln();
//     }
// }


// interfaces

// interface riksha{

//     void broak();//not necessary to write abstruct
//     void speed_up();
 
// }
// // interface bellgadi {
// //     public void hawa();
// //     public void book(int b);//this type is also allowed

// // }
// // interface loly extends riksha, bellgadi{// writing multiple interface in another interface
// //     public void lolo();
// //     public void boot(int b);

// // }
// interface bellgadi extends riksha{
//     void hawa();
//     void book();

// }
// interface loly extends bellgadi{
//     void lolo();
//     void boot();

// }
// class last implements loly{
//     public void lolo(){//we have to write public while defining method
//         System.out.println("lolo is the first part");
//     }
//     public void boot(){
//         System.out.println("this is the bootstrap");
//     }
//     public void hawa(){
//         System.out.println("storm is the hawea ");
//     }
//     public void book(){
//         System.out.println("i want to buy book from library");
//     }
//     public void broak(){
//         System.out.println("stop the car with the help of break");
//     }
//     public void speed_up(){
//         System.out.println("speeding the car");
//     }
// }
// class inter{
//     public static void main(String[] args) {
//         last lw = new last();
//         lw.book();
//         lw.boot();
//         lw.broak();
//         lw.lolo();
//         lw.speed_up();
//         lw.hawa();
//     }
// }

// example

// interface camera{
//     void takephoto();
//     void shootvideo();
//     default void nation(){//default is written to add new method after interfaces
//         System.out.println("the game of the nation");
//     }
// }
// interface sound_part{
//     void calling();
//     void music();
// }
// class cellphone{
//     void callnumber(){
//         System.out.println("the phone is calling through frequency");
//     }
//     void nointer(){
//         System.out.println("the phone cannot access the internet");
//     }
// }
// class what extends cellphone implements camera, sound_part{
//     public void takephoto(){
//         System.out.println("the phone can shoot photo");
//     }
//     public void shootvideo(){
//         System.out.println("video shooting.....");
//     }
//     public void music(){
//         System.out.println("music.....");
//     }
//     public void calling(){
//         System.out.println("calling.....");
//     }
// }
// class intersting{
//     public static void main(String[] args) {
//         what wh = new what();
//         wh.nation();
//         wh.calling();
//         wh.callnumber();
//         wh.takephoto();
//         wh.music();
//         wh.shootvideo();
//         wh.nointer();
//     }
// }

// inheritances in interfaces

// interface sample{
//     void method1();
//     void method2();
// }
// interface sample1 extends sample{
//     void method3();
//     void method4();
// }
// class originanl implements sample1{
//     public void method1(){
//         System.out.println("method1");
//     }
//     public void method2(){
//         System.out.println("method2");
//     }
//     public void method3(){
//         System.out.println("method3");
//     }
//     public void method4(){
//         System.out.println("method3");
//     }
// }
// class changing{
//     public static void main(String[] args) {
//         originanl or = new originanl();
//         or.method1();
//         or.method2();
//         or.method3();
//         or.method4();
//     }
// }

// polymorphism interfaces


// interface camera{
//     void shoot_photo();
//     void shoot_video();
// }
// interface socialmedia{
//     void facebook();
//     void instaram();
// }
// interface calling{
//     void callnumber(int a); 
// }
// class last implements socialmedia, camera, calling{
//     public void shoot_photo(){
//         System.out.println("shooting photo");
//     }
//     public void shoot_video(){
//         System.out.println("recording video");
//     }
//     public void facebook(){
//         System.out.println("only use facebook");
//     }
//     public void callnumber(int number){
//         System.out.println(" number " + number);
//     }
//     public void instaram(){
//         System.out.println("only use instagram");
//     }

// }

// class polymorphism{
//     public static void main(String[] args) {
//         camera fb = new last();
//         fb.shoot_photo();
//         socialmedia sm = new last();
//         sm.facebook();
//         calling al = new last();
//         al.callnumber(984483920);
        
//     }
// }