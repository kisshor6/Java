

// practice_01

// import java.util.ArrayList;

// public class practice_15{
//     public static void main(String[] args) {
//         ArrayList<String>name = new ArrayList<>();
//         name.add("hatta");
//         name.add("hatti");
//         name.add("rangila");
//         name.add("dabba");
//         name.add("sandeep");
//         name.add("manohar");
//         for(Object o: name){
//         System.out.println(o);}

//     }    
// }

// practice_02

// import java.util.Date;
// class what{
//     public static void main(String[] args) {
//         Date d = new Date();
//         System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
//     }
// }

// practice_03

// import java.util.Calendar;
// class pro3{
//     public static void main(String[] args) {
//         Calendar c = Calendar.getInstance();
//         System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//     }
// }

// practice_04

// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// class timeapi{
//     public static void main(String[] args) {
//         LocalDateTime dt = LocalDateTime.now();
//         DateTimeFormatter ldt = DateTimeFormatter.ofPattern("dd-mm-yyyy");
//         String mydate = dt.format(ldt);
//         System.out.println(mydate);
//     }
// }

// practice_05

// import java.util.HashSet;

// class CWH{
//         public static void main(String[] args) {
//             HashSet<Integer> s = new HashSet();
//             s.add(5);
//             s.add(6);
//             s.add(46);
//             s.add(60);
//             s.add(9);
//             s.add(6);
//             System.out.println(s);
// }
// }