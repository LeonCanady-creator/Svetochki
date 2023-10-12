import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFName = "src/INPUT.txt";
        Scanner scan = new Scanner(new File(inputFName));
        int p = scan.nextInt();
        String[] svetochki = new String[] {"G","K","F"};
        for(int i = 0; i <= p; i++)
        {

           String empty;
           ///Masha
           empty = svetochki[1];
           svetochki[1] = svetochki[2];
           svetochki[2] = empty;
           ///Tanya
           empty = svetochki[0];
           svetochki[0] = svetochki[1];
           svetochki[1] = empty;
        }
        String outputFName = "OUTPUT";
        String s = Arrays.toString(svetochki);

        Files.writeString(Path.of(outputFName), s);
    }



}