package stage4;

import java.util.Scanner;

public class Stage4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello! My name is Aid.");
            System.out.println("I was created in 2018.");
            System.out.print("Please, remind me your name.");


            String name =  scanner.next();

            System.out.println("What a great name you have, " + name + "!");
            System.out.println("Let me guess your age.");
            System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

            // reading all remainders

            int remainder3 = scanner.nextInt();
            int remainder5 = scanner.nextInt();
            int remainder7 = scanner.nextInt();

            int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

            System.out.println("Your age is "+age+" that's a good time to start programming!");

            System.out.println("Now I will prove to you that I can count to any number you want.");
            int num = scanner.nextInt();
            for (int i = 0; i <= num; i++) {
                System.out.printf("%d!\n", i);
            }
            System.out.println("Completed, have a nice day!");
        }
}

