/* Problems which are solve using Recursion  */

// Tower of Hanoi

// public class recursion {
//     private static int stepCount = 0;

//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             stepCount++;
//             // System.out.println("Step " + stepCount + ": Transfer disk " + n + " from " + src + " to " + dest);
//             return;
//         }
//         // Transfer top n-1 from src to helper using dest as 'helper'
//         towerOfHanoi(n - 1, src, dest, helper);
//         // Transfer nth from src to dest
//         stepCount++;
//         // System.out.println("Step " + stepCount + ": Transfer disk " + n + " from " + src + " to " + dest);
//         // Transfer n-1 from helper to dest using src as 'helper'
//         towerOfHanoi(n - 1, helper, src, dest);
//     }

//     public static void main(String args[]) {
//         int n = 10; // You can change this to any positive integer
//         towerOfHanoi(n, "A", "B", "C");
//         System.out.println("Total steps taken: " + stepCount);
//     }
// }

// //String Reverse
// public class recursion {

//     public static void stringreverse(String str, int index)
//     {
//         int first  = -1;
//         int last = -1;

//         if(index==0)
//         {
//             System.out.println(str.charAt(index));
//             return;
//         }
//         System.out.print(str.charAt(index));

//         stringreverse(str, index-1);
//     }
//     public static void main(String[] args) {
//         String str = "nahsrad";
//         stringreverse(str, str.length()-1);
//     }
// }

// First and last index of element in string 
// public class recursion {

//     public static int first = -1;
//     public static int last = -1;

//     public static void findindex(String str, int index, char element) {

//         if (index == str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currentchar = str.charAt(index);
//         if (currentchar == element) {
//             if (first == -1)
//                 first = index;
//             else
//                 last = index;
//         }

//         findindex(str, index + 1, element);
//     }

//     public static void main(String[] args) {
//         String str = "abaacdaefaah";
//         findindex(str, 0, 'a');
//     }

// }

// Move all the X to the end of the string 
// public class recursion {
//     public static void movex(String str, int index, int count, String newstring) {
//         if (index == str.length()) {
//             for (int i = 0; i < count; i++) {
//                 newstring += 'x';
//             }
//             System.out.println(newstring);
//             return;
//         }
//         char currentchar = str.charAt(index);
//         if (currentchar == 'x') {
//             count++;
//             movex(str, index + 1, count, newstring);
//         } else {
//             newstring += currentchar;
//             movex(str, index + 1, count, newstring);

//         }
//     }

//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         movex(str, 0, 0, "");
//     }
// }

// Subsequences
// public class recursion {
//     public static void printsub(String str, int index, String substring) {
//         if (index == str.length()) {
//             System.out.println(substring);
//             return;
//         }
//         char currentchar = str.charAt(index);

//         printsub(str, index + 1, substring + currentchar);

//         printsub(str, index + 1, substring);
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         printsub(str, 0, "");
//     }
// }

// for the unique Subsequences

import java.util.HashSet;

public class recursion {
    public static void printsub(String str, int index, String substring, HashSet<String> set)  {
        if (index == str.length()) {
            if(set.contains(substring))
            {
                return;
            }
            else
            {
                System.out.println(substring);
                set.add(substring);
                return;
            }
        }
        char currentchar = str.charAt(index);

        printsub(str, index + 1, substring + currentchar,set);

        printsub(str, index + 1, substring,set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printsub(str, 0, "",set);
    }
}