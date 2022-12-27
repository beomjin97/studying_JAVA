import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
  public static void main (String[] args) throws IOException {
    FileWriter f = new FileWriter("Data.txt");
  }
}