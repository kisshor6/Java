// import java.util.Scanner;

// class library {
//     Scanner fg = new Scanner(System.in);
//     String[] book = { " physic ", " biology ", " math ", " social ", " pli-science " };

//     public void greet() {
//         System.out.printf(
//     "===== welcome to our library =====\n please share your problem with us we will help you\n what can we done for you\n we have the following services for you\n 1.get books\n 2.return books\n3.renue books\n4.check available books\n");
//     }

//     public void getbook() {
//         System.out.println("which book you want to get among : ");
//         for (String string : book) {
//             System.out.print(string);
//         }
//         System.out.printf("\n");
//         String gi = fg.nextLine();

//         System.out.println("thanks for getting service to yourself");
//         System.out.println("but you have to renue " + gi + " book in 30 days");
//     }

//     public void issuebook() {
//         System.out.print("which book you want to issue : ");
//         for (String string : book) {
//             System.out.print(string);
//         }
//         System.out.printf("\n");
//         String fs = fg.nextLine();
//         System.out.println("thanks for renue book in time");
//     }

//     public void returnbook() {
//         System.out.print("which book you want to issue : ");
//         for (String string : book) {
//             System.out.print(string);
//         }
//         System.out.printf("\n");
//         String ge = fg.nextLine();
//         System.out.println("thanks for returning book in time I hope you enjoyed it");
//     }

//     public void availablebook() {
//         System.out.println("available books are : ");
//         for (String book : this.book) {
//            if (book == null) {
//                continue;
//            }
//            System.out.println("* " + book);
//         } 
//         System.out.println("thanks to you came in library and using it");
//     }
// }

// class project_04 {
//     public static void main(String[] args) {
//         library l = new library();
//         l.greet();
//         // l.showAvailableBooks();


//         l.availablebook();
//         l.getbook();
//         l.returnbook();
//         l.issuebook();
//     }
// }