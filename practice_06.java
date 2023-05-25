
// practice_01

// public class practice_06 {
//     public static void main(String[] args) {
//         float sum = 0;
//         float [] nm = {24.2f, 34.2f, 45.76f, 23.4f};
//          for (int i = 0; i < nm.length; i++) {
//             sum = sum + nm[i];
//         }
//         System.out.println("the total sum is"+ sum);
//     }
// }

// practice_02

// public class practice_06 {
//     public static void main(String[] args) {
//         float sum = 34.67f;
//         boolean number = false;
//         float [] nm = {24.2f, 34.2f, 45.76f, 23.4f};
//          for (float element: nm){
//              System.out.println(element);
//              if (sum == element) {
//                  number = true;
//                  break;
//              }
//         }
//         if (number) {
//             System.out.println("the number is present");
//         }
//         else{
//             System.out.println("the number is not present");
//         }

//     }
// }

// practice_03

// public class practice_06 {
//     public static void main(String[] args) {
//         float som = 0;
//      float marks[] = {45.45f, 67.45f, 32.45f, 23.45f, 34.45f};
//      for (float f : marks) {
//         som = som + f;

//     }
//      System.out.println("the average marks of syudent is :"+som/marks.length );

//     }
// }

// practice_04

// it add the two matrixes
// public class practice_06 {
//     public static void main(String[] args) {
//        int bmw [][] = {{4, 3, 6},{5, 9, 2}};
//        int bmw2 [][] = {{4, 3, 6},{5, 9, 2}};
//        int vvk [][] = {{0, 0, 0},{0, 0, 0}};
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//             vvk[i][j] = bmw[i][j] + bmw2[i][j];
//             System.out.print(vvk[i][j] + " ");
//            }
//         System.out.println("");   
//        }
//     }
// }


// practice_05

// class ewr{
//     public static void main(String[] args) {
//         int ac[] = {1, 2, 3, 4, 5, 6};
//         int l = ac.length;
//         int temp;
//         int mth = Math.floorDiv(ac.length, 2);
//         for (int i = 0; i < mth; i++) {
//             temp = ac[i];
//             ac[i] = ac[l-i-1];
//             ac[l-1-i] = temp;
//         }
//         for (int i : ac) {
//            System.out.println(i);
//         }
//     }
// }

// practice_06

// class ewr{
//     public static void main(String[] args) {
//         int v[] = {3, 7, 2, 5, 4, 9};
//         int max = 0;
//       //int max = Integer.MAX_VALUE;
//         for (int i : v) {
//             if (i>max) {
//                 max = i;
//             }
//         }
//         System.out.println("the value of maximum of array is :" + max);
//     }
// }


// practice_07

// class errds{
//     public static void main(String[] args) {
//         int v[] = {3, 7, 2, 5, 4, 9};
//         // int min = 9;
//         int min = Integer.MIN_VALUE;
//         // for (int i : v) {
//         //     if (i<min) {
//         //         min = i;
//         //     }
//         // }
//         System.out.println("the value of minimum of array is :" + min);
//     }
// }

// practice_08
// class sort{
//     public static void main(String[] args) {
//         boolean nam = true;
//         int arr [] = {1, 2, 3, 4, 5, 6, 7, 8};
//         for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] > arr[i+1]){
//                nam = false;
//                break;
//            }
//         }
//         if(nam){
//             System.out.println("given array is shorted");
//         }
//         else{
//             System.out.println("given array is not shorted");   
//         }
//     }
// }
