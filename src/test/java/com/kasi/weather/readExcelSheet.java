package com.kasi.weather;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readExcelSheet {

    @Test
    void readdata() throws IOException, InvalidFormatException {
        File file = new File("C:\\Users\\kamlesh\\Desktop\\Book1.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for(int i=5;i<sheet.getLastRowNum();i++)
        {
            Row row = sheet.getRow(i);
           int cellno= row.getLastCellNum();
           for(int j=0;j<cellno;j++)
           {

               Cell cell = row.getCell(j);

               if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
               {
                   System.out.print(cell.getNumericCellValue()+"  ");

               }
             else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
               {

                   System.out.print(" "+"  ");


               } else if (cell.getCellType()==Cell.CELL_TYPE_STRING)
               {
                   System.out.print(cell.getRichStringCellValue()+"  ");



               }

           }      System.out.println();
        }

    }
}
