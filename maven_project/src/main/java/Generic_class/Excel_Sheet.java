package Generic_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_Sheet {
	
	@Test(dataProvider = "data1")
	public void testCase(String s1 , String s2) {
		
		
		System.out.println(s1);
		System.out.println(s2);
	}
	@DataProvider(name = "data1")
	public  Object[][] readData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		File f=new File("./src/test/resources/TestData/DemoWebShop.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook book = WorkbookFactory.create(fis);
		Sheet shet = book.getSheet("sheet1");
		int rowsize = shet.getPhysicalNumberOfRows();
		 int colomsize = shet.getRow(0).getPhysicalNumberOfCells();
		 Object[][] data = new Object[rowsize][colomsize];
		for (int i = 0; i < rowsize ; i++) {
			
			for(int j = 0;j<colomsize;j++) {
				
				data[i][j] = shet.getRow(i).getCell(j).toString();
			}
			
		}
		
		return data;
	}

}
//we have to create one more method and we have to override it,