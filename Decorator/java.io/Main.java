import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("./in.txt");
        firstRead(file);
        secondRead(file);
        
    }

    public static void firstRead(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStream inputStream = new UpperCaseInputStream(fileInputStream);
        inputStream = new BufferedInputStream(inputStream);

        while(inputStream.available() > 0) {
            System.out.print((char)inputStream.read());
        }
    }

    public static void secondRead(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStream inputStream = new BufferedInputStream(fileInputStream);
        inputStream = new UpperCaseInputStream(inputStream);

        while(inputStream.available() > 0) {
            System.out.print((char)inputStream.read());
        }
    }
}

