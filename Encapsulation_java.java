class Product{
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String str) {
        userName = str;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String pass) {
        password = pass;
    }
}


public class Encapsulation_java {
    public static void main(String[] args) {
        Product obj = new Product();
        obj.setUserName("Nilanjan123");
        obj.setPassword("Nilanjan@123");
        System.out.println(obj.getUserName()+" : "+obj.getPassword());
    }
}
