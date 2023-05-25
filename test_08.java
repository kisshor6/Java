
// oops (object oriented programming)


// examples of class

// class employee{
//     int id;
//     float salary;
//     String name;
// }
// public class tesr_08 {
//     public static void main(String[] args) {
//         System.out.println("the major names of class are");
//         employee jkl = new employee();
//         jkl.id = 43;
//         jkl.salary = 43.67f;
//         jkl.name = "daku mangal singh";

//         System.out.println("the id of employee is : " + jkl.id);
//         System.out.println("the name of employee is : " + jkl.salary);
//         System.out.println("the salary of employee is : " + jkl.name);


//     }
// }

// examples of oops (class with method)

// class employee{
//     int id;
//     float salary;
//     String name;
//     public void output(){
//         System.out.println("the id of employee is : " + id);
//         System.out.println("the name of employee is : " + salary);
//         System.out.println("the salary of employee is : " + name);
//     }
// }
// public class tesr_08 {
//     public static void main(String[] args) {
//         System.out.println("the major names of class are");
//         employee jkl = new employee();
//         jkl.id = 43;
//         jkl.salary = 43.67f;
//         jkl.name = "daku mangal singh";
//         jkl.output();


//     }
// }

// multiple methods in java

// class employee{
//     int id;
//     float salary;
//     String name;
//     public void output(){
//         System.out.println("the salary of employee is : " + name);
//     }
//     public float get_salary(){
//         return salary;
       
//     }
//     public int get_id(){
//         return id;
//     }
// }
// public class tesr_08 {
//     public static void main(String[] args) {
//         System.out.println("the major names of class are");
//         employee horse = new employee();
//         horse.id = 43;
//         horse.salary = 43.67f;
//         horse.name = "daku mangal singh";

//         horse.output();

//         float salary = horse.get_salary();
//         System.out.println(salary);

//         int id = horse.get_id();
//         System.out.println(id);


//     }
// }


// access modified getters and setters

// class myname{
//     private int id;
//     private String name;

//     public void setid(int i){
//         id = i;
//     }
//     public void setName(String n){
//         name = n;
//     }
//     public String getName(){
//         return name;
//     }
//     public int getid(){
//         return id;
//     }
// }
// class rolls34{
//     public static void main(String[] args) {
//     myname ghj = new myname();
//     ghj.setName("Roman reings");
//     ghj.setid(45);
//     System.out.println(ghj.getName()); 
//     System.out.println(ghj.getid()); 
//     }
// }

// examples

// class circle{
//     private float radius;

//     public void setradius(Float r){
//         radius = r;
//     }
//     public float getarea(){
//         return radius*3.14f;
//     }
// }
// class rolls34{
//     public static void main(String[] args) {
//     circle cir = new circle();
//     cir.setradius(45.0f);
//     System.out.println("the area of a circle is : " + cir.getarea()); 
//     }
// }