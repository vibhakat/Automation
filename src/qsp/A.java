package qsp;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin=new FileInputStream("./data/Book1.xlsx");
		Workbook w = WorkbookFactory.create(fin);
	}
}
