import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Duke {

    private static void printFileContents(String filePath) throws FileNotFoundException {
        File f = new File(filePath); // create a File for the given file path
        Scanner s = new Scanner(f); // create a Scanner using the File as the source
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    private static Ui ui;
    public static void main(String[] args) throws UnexpectedCommandException, EmptyLineException, IOException, FileNotFoundException {
        ArrayList<Task> tasks = new ArrayList<Task>();
        ui = new Ui();
        ui.sayHi();
        try {
            System.out.println("Here are the items in your task list: ");
            printFileContents("TaskList.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        int index = 0;//number of items in the list
        String line = " ";
        File f = new File("TaskList.txt");
        if (!f.exists()) {
            try {
                if (f.createNewFile()) {
                    System.out.println("File created: " + f.getAbsolutePath());
                } else {
                    System.out.println("File creation failed.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + f.getAbsolutePath());
        }

        new Parser(tasks, index, line);
    }
}
