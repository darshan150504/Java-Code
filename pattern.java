// solid Butterfly
// public class pattern {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             int space = 2 * (n - i);
//             for (int j = 1; j <= space; j++) {
//                 System.out.print("  ");
//             }

//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }

//         for (int i = n; i>=1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             int space = 2 * (n - i);
//             for (int j = 1; j <= space; j++) {
//                 System.out.print("  ");
//             }

//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }

/**
 * pattern rohbus
 */
// public class pattern {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }

//             for (int j = 0; j <= 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern Diamond
 */
public class pattern {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}