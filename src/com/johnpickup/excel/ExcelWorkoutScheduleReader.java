package com.johnpickup.excel;

import com.johnpickup.parser.WorkoutSchedule;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * Created by john on 10/01/2017.
 */
public class ExcelWorkoutScheduleReader {
    private PaceSheetReader paceReader = new PaceSheetReader();

    public WorkoutSchedule read(String filename) throws IOException {
        WorkoutSchedule result = new WorkoutSchedule();
        FileInputStream inputFile = new FileInputStream(filename);

        Workbook wb = new HSSFWorkbook(inputFile);
        Sheet paceSheet = wb.getSheet("Pace");
        result.getPaces().putAll(paceReader.readPaces(paceSheet));
        wb.close();

        return result;
    }


}
