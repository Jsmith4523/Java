package FileIO;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
    
    public static void main(String[] args) throws IOException {
        FileOutputStream fileStream = null;
        PrintWriter outFs = null;

        fileStream = new FileOutputStream("./fileio/output.txt", true);
        outFs = new PrintWriter(fileStream);

        outFs.println("Hello World! as well");

        outFs.close();
    }
}
