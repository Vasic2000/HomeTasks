package Package06;


import java.io.*;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) throws IOException {
/*        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        int i = 0;
        while(scanner.hasNextInt()) {
            a[i] = scanner.nextInt();
            i++;
        }
        for(int b : a)
                System.out.println(b);
*/
        File file = new File("Vas.txt");
        file.createNewFile();

        BufferedWriter bfw = new BufferedWriter(new FileWriter(file));
        bfw.write("Hellow world");
        bfw.close();

        BufferedReader bfr = new BufferedReader(new FileReader(file));
        System.out.println(bfr.readLine());
        bfr.close();

    }
}
