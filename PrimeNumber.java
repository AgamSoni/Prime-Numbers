import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (num == 2) System.out.println(num + " is a prime number");
        System.out.println("");
        int primeNum = 0;
        int compNum = 0;
        // tells how many numbers divide evenly or not evenly into the inputted number 
        for (int i = 2; i<=num-1; i++)
        {
            if((num % i) == 0) 
            {
                compNum++;
            }
            else 
            {
                primeNum++;
            }
        }
        // check if number is prime or not
        if(compNum>=1) System.out.println (num + " is not a prime number");
        else System.out.println(num + " is a prime number");
        System.out.println("");
        //initialize arrays
        int[]primeNums = new int[primeNum];
        int[]compNums = new int[compNum];
        int a = 0;
        int b = 0;
        // store the number in arrays
        for (int i = 2; i<=num-1; i++)
        {
            if((num % i) == 0) 
            {
                if(a<=compNum-1)
                {
                    compNums[a] = i;
                }
                a = a + 1;
            }
            else 
            {
                if(b<=primeNum-1)
                {
                    primeNums[b] = i;
                }
                b = b + 1;
            }
        }
        // print the arrays
        System.out.print("There are " + compNum + " numbers that evenly divide into " + num + ": ");
        for(int i =0; i<compNum; i++)
        {
            System.out.print(compNums[i] + " ");
        }
        System.out.println("");
        System.out.print("There are " + primeNum + " numbers that do not evenly divide into " + num + ": ");
        for(int i = 0; i<primeNum; i++)
        {
            System.out.print(primeNums[i] + " ");
        }
        System.out.println("     ");
    }
}

