package ExelRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExelWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Sample sheet");
		
		/**/
		Map<String, Object[]> data = new HashMap<String, Object[]>();
		data.put("1", new Object[] {"Emp No.", "Name", "Salary"});
		data.put("2", new Object[] {1, "John", 1500000d});
		data.put("3", new Object[] {2, "Sam", 800000d});
		data.put("4", new Object[] {3, "Dean", 700000d});
		 
		Set<String> keyset = data.keySet();
		int rownum = 0;
		Row row ;
		Cell cell;
		Date date = new Date();
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue(date.toString());
		for (String key : keyset) {
		    row = sheet.createRow(rownum++);
		    Object [] objArr = data.get(key);
		    int cellnum = 1;
		    for (Object obj : objArr) {
		        cell = row.createCell(cellnum++);
		        if(obj instanceof Date) 
		            cell.setCellValue((Date)obj);
		        else if(obj instanceof Boolean)
		            cell.setCellValue((Boolean)obj);
		        else if(obj instanceof String)
		            cell.setCellValue((String)obj);
		        else if(obj instanceof Double)
		            cell.setCellValue((Double)obj);
		        else if(obj instanceof Integer)
		            cell.setCellValue((Integer)obj);
		    }
		}
		 
		try {
		    FileOutputStream out = new FileOutputStream(new File("D:\\new_prateek.xls"));
		    workbook.write(out);
		    out.close();
		    System.out.println("Excel written successfully..");
		     
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
