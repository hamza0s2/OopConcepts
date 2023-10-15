package nustsheet1;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

import static jdk.internal.org.jline.utils.Colors.s;

public class NUST_SHEET1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        {
            System.out.println(":::TASK 1:::\n");
            System.out.print("Enter your Year: ");
            String StudentYear = input.nextLine();
            System.out.print("Enter your GPA: ");
            double GPA = input.nextDouble();
            System.out.print("Enter the number of Subjects: ");
            int Subjects = input.nextInt();

            System.out.printf("%s\n", StudentYear);
            System.out.printf("%.1f\n", GPA);
            System.out.printf("%d\n", Subjects);
        }

        {
            System.out.println("\n:::TASK 2:::\n");
            System.out.print("Enter a five digit number: ");
            int number = input.nextInt();
            int i = 10000;
            Integer num = new Integer("88");

            while (number > 0) {
                System.out.print(number / i + " ");
                number = number % i;
                i = i / 10;
            }
        }

        {
            System.out.println("\n:::TASK 3:::\n");
            System.out.println("\n");
            System.out.print("Enter time:");
            double t = input.nextDouble();
            System.out.print("Enter acceleration: ");
            double a = input.nextDouble();
            System.out.print("Enter initial velocity: ");
            double v = input.nextDouble();
            System.out.print("Enter distance:");
            double s = input.nextDouble();

            double answer = s + (v * t) + 0.5 * (a * (Math.pow(t, 2)));
            System.out.println(answer);
        }

        {
            System.out.println("\n:::TASK 4:::\n");
            System.out.print("Enter a five digit number: ");
            int PalNumber = input.nextInt();
            int RevNumber = 0;
            int RealNum = PalNumber;
            int i = 10;
            if (PalNumber < 100000) {
                while (PalNumber > 0) {
                    RevNumber = (PalNumber % i) + (RevNumber * i);
                    PalNumber = PalNumber / i;
                }
                System.out.println(RevNumber);
                if (RevNumber == RealNum) {
                    System.out.println("Number is Palindrome");
                } else {
                    System.out.println("Number is not a palindrome");
                }
            } else {
                System.out.println("Invalid!");
                System.out.print("Enter a five digit number: ");
                PalNumber = input.nextInt();
                while (PalNumber > 0) {
                    RevNumber = (PalNumber % i) + (RevNumber * i);
                    PalNumber = PalNumber / i;
                }
                if (RevNumber == RealNum) {
                    System.out.println("Number is Palindrome");
                } else {
                    System.out.println("Number is not a palindrome");
                }
            }
        }

        {
            System.out.println("\n:::TASK 5:::\n");
            System.out.print("Enter a number in Binary: ");
            int BinNum = input.nextInt();
            int RevNum = 0;
            int i = 10;
            int Answer = 0;
            int j = 1;

            while (BinNum > 0) {
                RevNum = BinNum % i;
                Answer = (RevNum * j) + Answer;
                j = j * 2;
                BinNum = BinNum / i;
            }
            System.out.printf("Entered Binary number in Decimal is: %d", Answer);
            System.out.println("\n");
        }

        {
            System.out.println("\n:::TASK 6:::\n");
            System.out.print("Enter a number: ");
            int Fact = input.nextInt();
            int i = 0;
            int Answer = 1;

            for (i = Fact; Fact > 0; Fact--) {
                Answer *= Fact;
            }
            System.out.printf("Factorial of Entered number is: %d", Answer);
            System.out.println("\n");
        }

        {
            System.out.println("\n:::TASK 7:::\n");
            int i = 1;
            int k = 1;
            int j = 1;
            System.out.println("N       10*N    100*N   1000*N");
            for (i = 1;i <= 5; i++)
            {

                k = 1;
                for(j = 1;j <= 4; j++)
                {
                    int Val = i * k;
                    System.out.print(Val +"    \t" );
                    k = k * 10;
                }
                System.out.println("\n");
            }
        }
    }
}

