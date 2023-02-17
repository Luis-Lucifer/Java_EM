abstract class laptop{
    public abstract void showConfiguration();
}

class Macbook extends laptop{
    public void showConfiguration(){
        System.out.println("Released in 2022, with latest MacOS Catalina.");
    }
}

class HPPavilion extends laptop{
    public void showConfiguration(){
        System.out.println("Released in 2023, with latest Windows 11.");
    } 
}
public class AbstractClassExample {
   public static void main(String[] args) {
    Macbook M2Pro = new Macbook();
    HPPavilion X7 = new HPPavilion();
    show(M2Pro);
    show(X7);
   }

   public static void show(laptop obj){
    obj.showConfiguration();
   }
}
