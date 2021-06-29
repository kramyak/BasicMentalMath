package javaprogramming;
import java.util.Scanner;
import static java.lang.System.exit;

public class BasicMentalMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Addition:1\n Subtraction:2\n Multiplication:3\n Division:4\n Modules:5\n");
        System.out.println("enter your choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int num1 = (int) (Math.random() * 100);
                int num2 = (int) (Math.random() * 100);
                System.out.println(num1 + "+" + num2 + ":");
                int ans = sc.nextInt();
                while (true) {
                    if ((num1 + num2) == ans) {
                        System.out.println("right answer practice more");
                        num1 = (int) (Math.random() * 100);
                        num2 = (int) (Math.random() * 100);
                        System.out.println(num1 + "+" + num2 + ":");
                        ans = sc.nextInt();
                    }
                    if ((num1 + num2) != ans) {
                        System.out.println("wrong answer try again");
                        System.out.println(num1 + "+" + num2 + ":");
                        ans = sc.nextInt();
                    }

                }

            case 2:
                num1 = (int) (Math.random() * 100);
                num2 = (int) (Math.random() * 100);
                System.out.println(num1 + "-" + num2 + ":");
                ans = sc.nextInt();
                while (true) {
                    if ((num1 - num2) == ans) {
                        System.out.println("right answer practice more");
                        num1 = (int) (Math.random() * 100);
                        num2 = (int) (Math.random() * 100);
                        System.out.println(num1 + "-" + num2 + ":");
                        ans = sc.nextInt();
                    }
                    if ((num1 - num2) != ans) {
                        System.out.println("wrong answer try again");
                        System.out.println(num1 + "-" + num2 + ":");
                        ans = sc.nextInt();
                    }

                }
            case 3:
                num1 = (int) (Math.random() * 100);
                num2 = (int) (Math.random() * 100);
                System.out.println(num1 + "*" + num2 + ":");
                ans = sc.nextInt();
                while (true) {
                    if ((num1 * num2) == ans) {
                        System.out.println("right answer practice more");
                        num1 = (int) (Math.random() * 100);
                        num2 = (int) (Math.random() * 100);
                        System.out.println(num1 + "*" + num2 + ":");
                        ans = sc.nextInt();
                    }
                    if ((num1 * num2) != ans) {
                        System.out.println("wrong answer try again");
                        System.out.println(num1 + "*" + num2 + ":");
                        ans = sc.nextInt();
                    }

                }
            case 4:
                num1 = (int) (Math.random() * 100);
                num2 = (int) (Math.random() * 100);
                System.out.println(num1 + "/" + num2 + ":");
                ans = sc.nextInt();
                while (true) {
                    if ((num1 / num2) == ans) {
                        System.out.println("right answer practice more");
                        num1 = (int) (Math.random() * 100);
                        num2 = (int) (Math.random() * 100);
                        System.out.println(num1 + "/" + num2 + ":");
                        ans = sc.nextInt();
                    }
                    if ((num1 / num2) != ans) {
                        System.out.println("wrong answer try again");
                        System.out.println(num1 + "/" + num2 + ":");
                        ans = sc.nextInt();
                    }

                }
            case 5:
                num1 = (int) (Math.random() * 100);
                num2 = (int) (Math.random() * 100);
                System.out.println(num1 + "%" + num2 + ":");
                ans = sc.nextInt();
                while (true) {
                    if ((num1 % num2) == ans) {
                        System.out.println("right answer practice more");
                        num1 = (int) (Math.random() * 100);
                        num2 = (int) (Math.random() * 100);
                        System.out.println(num1 + "%" + num2 + ":");
                        ans = sc.nextInt();
                    }
                    if ((num1 % num2) != ans) {
                        System.out.println("wrong answer try again");
                        System.out.println(num1 + "%" + num2 + ":");
                        ans = sc.nextInt();
                    }

                }
            default:
                System.out.println("invalid choice");
                exit(1);

        }
    }
}
