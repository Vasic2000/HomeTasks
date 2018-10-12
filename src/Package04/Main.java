package Package04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("ddd");
        try {
            new FileReader(file);
        } catch(FileNotFoundException ff)
        {
            System.out.println("Биде");
        }
        m1();
//        Посмотреть final класс

        file = new File("fff");
//        try with ressurses
        try(FileReader file1 = new FileReader(file)){file1.read();}

        }
    public static void m1(){
        try {
            m2();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }



    }

    public static void m2() throws IOException {
        throw new IOException("22");
    }

}
