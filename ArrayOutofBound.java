public class ArrayOutofBound {
    public static void main(String[] args) {
        int arr[]=new int[10];
        try {

            System.out.println("The for-loop will skip and print the catch statement only.");
            for (int i=0; i<=arr.length; i++) {
                arr[i]= i+1;
            }

            for(int value : arr){
                System.out.println(value);
            }
        } catch (Exception e) {
            System.out.println("Array index out of bound occured..." + e);
        }
    }

}
