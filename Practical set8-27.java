import java.io.*;

public class StudentFile {
    public static void main(String[] args) {

        File file = new File("students.txt");
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Writing data to file
            fw = new FileWriter(file);
            fw.write("101 Krishna 85\n");
            fw.write("102 Ravi 78\n");
            fw.write("103 Neha 92\n");

            System.out.println("Student records written to file.\n");

            fw.close(); // close after writing

            // Reading data from file
            br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("Reading student records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}