import java.io.*;
import java.util.*;
public class fileIOtest {
    public static void main(String[] Args) {
        Scanner scan;
        String fileString = "";

        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\schwa\\Desktop\\Project #0\\ledgerFile.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        try
        {
            scan = new Scanner(new File("C:\\Users\\schwa\\Desktop\\Project #0\\ledgerFile.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File doesn't exist");
            return;
        }

        while(scan.hasNextLine()) {
        fileString = fileString + scan.nextLine() + "\n";     
        }

        System.out.println(fileString);
    }
}
