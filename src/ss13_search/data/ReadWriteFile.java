package ss13_search.data;

import ss13_search.model.SpendingClass;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static final String SPENDING_CLASS_CSV = "src\\ss13_search\\data\\spendingclass.csv";

    public static List<SpendingClass> ReadSpendingClass() throws IOException {
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
                spendingClassList.add(new SpendingClass(maChiTieu, tenChiTieu, ngayChiTieu, soTienChiTieu, moTaThem));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            }catch (IOException e ){
                e.printStackTrace();
            }
        }
        return spendingClassList;
    }

    public static void WriteSpendingClass(List<SpendingClass>spendingClasses) throws IOException{
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(SPENDING_CLASS_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SpendingClass spendingClass: spendingClasses){
                bufferedWriter.write(spendingClass.getMaChiTieu()+","+spendingClass.getTenChiTieu()+","+spendingClass.getNgayChiTieu()+","+spendingClass.getSoTienChiTieu()+","+spendingClass.getMoTaThem());
                bufferedWriter.newLine();
            }
        }catch (IOException e){
           e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
