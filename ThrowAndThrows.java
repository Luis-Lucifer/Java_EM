import java.util.Scanner;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        int i=0, k,j=2;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the no -> ");
            j = sc.nextInt();
            k=i+j;
            if (k>20)
            {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Value should less than 20");
        }
    }
}
