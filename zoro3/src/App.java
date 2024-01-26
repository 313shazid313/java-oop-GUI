import java.io.*;
public class App {
    public static void main(String[] args) {
      File myF = new File("/media/shazid/BAD21F42D21F01F5/java practice//shafin");
      myF.mkdir();
      String location= myF.getAbsolutePath();
      System.out.println(location);
      System.out.println(myF.getName());
    }
}
