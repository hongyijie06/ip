import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileContents {

    private static void printFileContents(String filePath) throws FileNotFoundException {
        File f = new File(filePath); // create a File for the given file path
        Scanner s = new Scanner(f); // create a Scanner using the File as the source
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    public static void main(String[] args) {
        try {
            printFileContents("TaskList.txt");

        } catch (FileNotFoundException e) {
            new CreateFile();
            System.out.println("File not found");
        }
    }

}