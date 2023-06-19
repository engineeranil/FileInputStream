import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("java.txt");
            int i = input.read();
            System.out.println("KULLANILABILIR BYTE SAYISI : "+input.available());
           while(i != -1){
               System.out.print((char)i);
               i = input.read();
           }
           input.close();
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

    }
}
