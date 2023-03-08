package ss13_search.data;

import ss13_search.model.SpendingClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static final String SPENDING_CLASS_CSV = "src\\ss13_search\\data\\spendingclass.csv";

    public static List<SpendingClass> readSpendingClass() throws IOException {
        List<SpendingClass> spendingClassList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(SPENDING_CLASS_CSV);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            SpendingClass spendingClass;
            while ((line = bufferedReader.readLine())!=null){
                temp = line.split(",");
                String maChiTieu = temp[0];
                String tenChiTieu = temp[1];
                String ngayChiTieu = temp[2];
                String soTienChiTieu = temp[3];
                String moTaThem = temp[4];
                spendingClassList.add(new SpendingClass(maChiTieu,tenChiTieu,ngayChiTieu,soTienChiTieu,moTaThem));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
