package Generic_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet1 {
	public String readData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/DMS.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String testdata = workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return testdata;
		
	}

}
