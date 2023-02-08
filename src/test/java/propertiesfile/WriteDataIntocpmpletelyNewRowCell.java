package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntocpmpletelyNewRowCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		//create new row
		Row  r = s.createRow(4);
		//create new cell
		Cell c =r.createCell(0);
		//write data into the cell
		c.setCellValue("Hello");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/TestScriptData.xlsx");
		wb.write(fos);
		wb.close();

	}

}
