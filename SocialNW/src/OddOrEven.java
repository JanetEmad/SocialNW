import java.sql.SQLOutput;
import java.util.Scanner;

public class OddOrEven
{
    public static void main(String args[])
    {
        int number;
        System.out.println("Please, Enter The Number.");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number %2 ==0) {
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is odd.");
        }

    }
}

