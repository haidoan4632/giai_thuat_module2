package ss13_search.data;

import ss13_search.model.SpendingClass;

import java.io.*;
import java.util.List;

public class ReadWriteBinaryFile  {
    private static String FILE_PATH = "E:\\module_2_giai_thuat\\src\\ss13_search\\data\\spendingclass.txt";
    public static void writeSpendingClassBinaryFile(List<SpendingClass>spendingClassList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(spendingClassList);
            objectOutputStream.close();
    }
    public static List<SpendingClass> readSpendingClassBinaryFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
        return (List<SpendingClass>) objectInputStream.readObject();
    }
}
