public class UserDefined_Exception {
    public static void main(String[] args) {
        
        int a = 10 ;
        try {
            if(a<50){
                throw new Exception("This Userdefined error!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }
    
}
