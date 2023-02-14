package resources;

import io.cucumber.java.an.Dada;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class dataDriven {

    public ArrayList<String> getData(String testCaseName) throws IOException {
        //Create a storage Array
        ArrayList<String> a = new ArrayList<String>();

        //create Workbook Object - with a fileInputStream argument
        FileInputStream inputFile = new FileInputStream("C:\\IntelliJ_Workspace\\API_SOv3_SBR\\SBR_TestMatrix.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputFile);

        //Check how many sheets in the Workbook - and retrieve the relevant WorkSheet
        int sheets = workbook.getNumberOfSheets();

        for (int i = 0; i < sheets; i++) {
            //System.out.println("Worksheet: " + workbook.getSheetName(i));
            if (workbook.getSheetName(i).equalsIgnoreCase("XT_POS_R")) {
                //Excel Spreadsheet
                XSSFSheet sheet = workbook.getSheetAt(i);  //sheet has ALL the contents of the 'XT_EnvelopeSize' worksheet
                //Get Rows
                Iterator<Row> rows = sheet.iterator();     //Sheet is a collection of Rows - has the contents of ALL the rows in the worksheet
                Row row = rows.next();
                Iterator<Cell> cell = row.cellIterator();  //Row is a collection of Cells - has the contents of ALL the cells in the row
                //check that there is another cell to read before moving
                int k = 0;
                int column = 0;

                //This gets ALL the cell values for the 1st Row
                while (cell.hasNext()) {
                    Cell value = cell.next();
                    //System.out.println("Column Cell Value (R1): " + value.getStringCellValue());

                    if (value.getStringCellValue().equalsIgnoreCase("Type")) {
                        //First Column
                        column = k;
                        //System.out.println("Colum: " + column);
                    }
                    k++;
                }

                //This gets ALL the cell values for the 1st Column
                while (rows.hasNext()) {
                    Row r = rows.next();
                    //System.out.println("Row Cell Value (C1): " + r.getCell(column).getStringCellValue());
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase("XT PPDLE4")) {
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellType() == CellType.STRING){
                                a.add(c.getStringCellValue());
                            } else {
                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }


                       }
                    }
                }
                System.out.println(a.toString());
            }
        }


        return a;
    }



    @Test
    public void main() throws IOException {

            ArrayList<String> d = getData("XT PPDLE4");
            System.out.println(d.toString());
    }
}