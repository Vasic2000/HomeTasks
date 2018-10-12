package Package07;

import java.io.*;

public class MyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Vas2.txt");
        try {
            file.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(file))) {
            bfw.write("Hey, hey, hey!");
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader bfw = new BufferedReader(new FileReader(file));) {
            System.out.println(bfw.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
