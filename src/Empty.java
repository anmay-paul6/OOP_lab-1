import java.util.Scanner;
public class Empty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>0){
            System.out.println("This Number is Positive");
        }
        else if(a==0)
        {
            System.out.println("This Number is Zero");
        }
        else
        {
            System.out.println("This Number is Negative");
        }
    }
}
