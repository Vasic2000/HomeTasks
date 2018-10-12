package Package05;

import java.io.FileNotFoundException;
import java.util.*;

public class MyFile implements Comparable{
    String name;
    Boolean exist;

    public Boolean ifExist() throws FileNotFoundException {
        if(exist) return true;
        else throw new FileNotFoundException(name + " NOT Found!");
    }

    public void changeExistence() {
        exist = !exist;
    }

    public static void main(String[] args) {
        MyFile file1 = new MyFile();
        MyFile file2 = new MyFile();
        MyFile file3 = new MyFile();
        MyFile file4 = new MyFile();
        MyFile file5 = new MyFile();

//       file1
        file1.exist = true;
        file1.name = "MyFile1.dwg";
        file1.changeExistence();
        try {
            System.out.println(file1.ifExist());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        file1.changeExistence();

//        file2
        file2.exist = true;
        file2.name = "MyFile2.dwg";
//        file3
        file3.exist = true;
        file3.name = "MyFile3.dwg";
//        file4
        file4.exist = true;
        file4.name = "MyFile4.dwg";
//        file5
        file5.exist = true;
        file5.name = "MyFile3.dwg";

        Set<MyFile> files = new HashSet<MyFile>();
        files.add(file1);
        files.add(file2);
        files.add(file3);
        files.add(file4);
        files.add(file5);

        for(MyFile ff : files)
            System.out.println(ff.name);

        List<MyFile> fil = new ArrayList<MyFile>(files);

        Collections.sort(fil);
        for(MyFile ff : fil)
            System.out.println(ff.name);

        for(MyFile ff : fil)
            System.out.println(ff.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyFile myFile = (MyFile) o;
        return Objects.equals(name, myFile.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((MyFile) o).name);
    }
}
