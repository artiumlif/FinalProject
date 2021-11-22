package utilities;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ManageDDT extends CommonOps
{
    @DataProvider(name = "data-provider-dates")
    public Object[][] getDataObject(){
        return getDataFromCSV(getData("DDTFile"));
    }

    public static List<String> readCSV(String csvFile){

        List<String> lines = null;
        File file = new File(csvFile);
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8 );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static Object[][] getDataFromCSV(String FilePath){
        Object[][] data = new  Object [3][2];
        List<String> csvDate = readCSV(FilePath);
        for (int i = 0;i < csvDate.size(); i++){
            data[i][0] = csvDate.get(i).split(",")[0];
            data[i][1] = csvDate.get(i).split(",")[1];
        }
        return data;
    }
}
