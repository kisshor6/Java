// import java.time.*;
// import java.time.format.DateTimeFormatter;
// import java.util.*;

// java collection framework

// import java.util.*;
// public class test_15 {
//     public static void main(String[] args) {
//         ArrayList<Integer> ai = new ArrayList<>();
//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(45);
//         al.add(36);
//         al.add(83);

//         ai.add(3);
//         ai.add(5);
//         ai.add(9);
//         ai.add(2, 354);//changing the value according to the index
//         ai.add(7);
//         ai.add(3); 
//         ai.addAll(al);//we can also add the elements from another arraylist by this method

//        // ai.addAll(0,al);//we can also add the elements in first by giving index

//        // ai.clear();//to clear the data we should use this keyword it show nothing

//        //System.out.println(ai.contains(9));// to check it is present in arraylist or not

//        //System.out.println(ai.indexOf(2));//it give the index of given num

//        System.out.println(ai.lastIndexOf(3));//it give the index of given num from last

//         for (int i = 0; i < ai.size(); i++) {
//             System.out.print(ai.get(i));
//             System.out.print(", ");
//         }

//     }
// }
// LinkedList in Java: Demo & Methods//same as arraylist but some methods are diferent
import java.util.*;
class LinkedListof{
    public static void main(String[] args) {
        LinkedList<Integer> it = new LinkedList<>();
        it.add(6);
        it.add(9); 
        it.add(8);
        it.addFirst(456);//it is only available on linked list
        it.addLast(34674573);//it is only available on linked list

        for (int i = 0; i < it.size(); i++) {
            System.out.print(it.get(i));
            System.out.print(", ");
        }
    }
}

// ArrayDeque in Java
// class ArrayDeque1{
//     public static void main(String[] args) {
//         ArrayDeque<Integer> aq = new ArrayDeque<>();
//         aq.add(35);
//         aq.add(92);
//         aq.add(92);
//         aq.add(84);
//         aq.add(9);
//         aq.addFirst(5);
//         aq.offerFirst(10);
//         System.out.println(aq);
//     }
// }
// Hashing in Java*(HashSet)it cannot reprat same data

// class hashingtech{
//     public static void main(String[] args) {
//         HashSet<Integer> hw = new HashSet<>(100, 0.002f);
//         hw.add(23);
//         hw.add(82);
//         hw.add(23);
//         hw.add(45);
//         hw.add(23);
//         hw.add(67);
//         System.out.println(hw);
//     }
// }

// Date and Time in Java

// class dateandtime{//date and time have its new packages in java
//     public static void main(String[] args) {
//         System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//         Date dt = new Date();// it show the current date and time with full clarity
//         System.out.println(dt.getTime());//except this
//         // System.out.println(dt.getDay());
//         // System.out.println(dt.getDate());//they all are deplecatrd but they do thei work
//         // System.out.println(dt.getYear());
//     }
// }

// calendar class in java

// class calendarclass{
//     public static void main(String[] args) {
//         // Calendar c = Calendar.getInstance();
//         // System.out.println(c.getTimeZone().getID());
//         // System.out.println(c.getCalendarType());

//         Calendar c = Calendar.getInstance();
//         System.out.println(c.getTimeZone().getID());
//         System.out.println(c.getCalendarType());
//         System.out.println(c.getTime());
//     }
// }

// gregorian calendarclass

// class gregoriancal {
//     public static void main(String[] args) {
//         Calendar c = Calendar.getInstance();
//         // System.out.println(c.get(Calendar.HOUR)); //it show exact hour
//         // System.out.println(c.get(Calendar.MINUTE));//it show exact minute
//         // System.out.println(c.get(Calendar.SECOND));//it show exact second
//         // System.out.println(c.get(Calendar.HOUR_OF_DAY));// it print continuous time
//         // 1-24
//         System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//         GregorianCalendar gal = new GregorianCalendar();
//         System.out.println(gal.isLeapYear(2020));
//         // System.out.println(TimeZone.getAvailableIDs()[0]);//just for knowledge
//         // System.out.println(TimeZone.getAvailableIDs()[1]);
//         // System.out.println(TimeZone.getAvailableIDs()[2]);
//     }

// }


// java.time API - Classes & Methods

// class timeinjava{
//     public static void main(String[] args) {
//         LocalDate ld = LocalDate.now();
//         System.out.println(ld);

//         LocalTime lt = LocalTime.now();
//         System.out.println(lt);

//         LocalDateTime lcd = LocalDateTime.now();//it print both time and date of upper code
//         System.out.println(lcd);
//     }
// }

// DateTimeFormatter in Java//it print date and time according to our format


// class DateTimeFormatte{
//     public static void main(String[] args) {
//         LocalDateTime ldt = LocalDateTime.now();
//         System.out.println(ldt);

//         DateTimeFormatter df = DateTimeFormatter.ofPattern("MM / dd / yyyy ||-> E h:m a");//our custom format
//         DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;//built-in format
//         System.out.println(ldt.format(df));
//         System.out.println(ldt.format(df2));
//     }
// }



