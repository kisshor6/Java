// problem_01


// class circle{
//     public int radius;
//     circle(int c){
//          this.radius = c;
//     }

//     public double area(){
//         return this.radius*this.radius; 
//     }
// }

// class motor{
//     public static void main(String[] args) {
//         circle cr = new circle(4);
//         System.out.println(cr.area());
//     }
// }

// problem_02

// class rectangle{
//     public int lemgth;
//     public int breadth;
//     rectangle(int a, int b){
       
//          this.lemgth = a;
//          this.breadth = b;
//     }

//     public int area(){
//         return this.lemgth*this.breadth; 
//     }
// }
// class cuboid extends rectangle{
    
//     public int height;
    
//     cuboid (int c){
//         super(3, 6);
//         this.height = c;
//     }

//     public int areaof(){
//         return this.breadth*this.lemgth*this.height; 
//     }
// }

// class motor{
//     public static void main(String[] args) {
//         rectangle cr = new rectangle(9, 7);
//         cuboid t = new cuboid(5);
//         System.out.println(cr.area());
//         System.out.println(t.areaof());
//     }
// }
// problem_02 by getters and setters

// class rectangle{
//     private int a;
//     private int b;

//     public int getbreadth(){
//         return a;
//     }
//     public void setbreadth(int a){
//         this.a =  a;
//     }
//     public int getlemgrh(){
//         return b;
//     }
//     public void setlemgth(int b){
//         this.b =  b;
//     }
//     public int area(){
//         return a*b;
//     }
// }
// class motor{
//     public static void main(String[] args) {
//         rectangle cr = new rectangle();
//         cr.setbreadth(45);
//         cr.setlemgth(53);
//         System.out.println(cr.getbreadth());
//         System.out.println(cr.getlemgrh());
//         System.out.println(cr.area());
//     }
// }