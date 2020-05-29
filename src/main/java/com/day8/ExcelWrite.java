package com.day8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Excel Write Operations...");
        Student starr[]=new Student[3];

        Student st1=new Student("1","Surjashish","Hyderabad");
        Student st2=new Student("2","mohor","Bangalore");
        Student st3=new Student("3","Dada","NY");
        starr[0]=st1;
        starr[1]=st2;
        starr[2]=st3;
        for(Student st:starr)
        {
            System.out.println("id: "+st.getId());
        }
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet();
//        Row row=sheet.createRow(0);
//        Cell cell=row.createCell(0);
//        cell.setCellValue("Welcome");
//
//
//        FileOutputStream fo=new FileOutputStream("C:\\practice\\student.xlsx");
//        workbook.write(fo);
//        workbook.close();
//        System.out.println("Excel file created successfully...");

        int rowcnt=0;
        for(Student st:starr)
        {
            Row row=sheet.createRow(rowcnt);

            Cell cell1=row.createCell(0);
            cell1.setCellValue(st.getId());

            Cell cell2=row.createCell(1);
            cell2.setCellValue(st.getName());

            Cell cell3=row.createCell(2);
            cell3.setCellValue(st.getAddress());

            rowcnt++;
        }

        FileOutputStream fo=new FileOutputStream("C:\\practice\\student.xlsx");
        workbook.write(fo);
        workbook.close();
        System.out.println("Excel file created successfully...");

    }
}
