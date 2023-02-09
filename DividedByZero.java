public class DividedByZero {
    public static void main(String[] args) {
        int i,j,k=0;
        i = 12;
        j= 0;
        try {
            k = i/j;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero" + e);
           
        }
        System.out.println(k);
    }
}
