package utils;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;

import com.monotype.commonUtils.data_read;

public class DecodeXLData {

public static HashMap<String,String> getXLSXData(String sheetName, String pathToXLSX)
{
	
	ArrayList<String> key = new ArrayList<String>();
	ArrayList<String> value = new ArrayList<String>();
	HashMap<String,String> readData = new HashMap<String,String>();
	try
	{
	data_read data_read_object = new data_read(pathToXLSX);
	System.out.println("Row Count " + data_read_object.xlsGetRowCount(sheetName));
	System.out.println("Column Count " + data_read_object.xlsGetColumnCount(sheetName));
	for(int i=0; i<data_read_object.xlsGetRowCount(sheetName);i++)
	{
		XSSFCell cell_key = data_read_object.xlsGetColumnData(sheetName,1).get(i);
		XSSFCell cell_value = data_read_object.xlsGetColumnData(sheetName,2).get(i);
		String result_key;
		String result_value;
				
		if(cell_key.getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			result_key = String.valueOf(cell_key.getNumericCellValue());
		}
		else
		{
			result_key =  data_read_object.xlsGetColumnData(sheetName,1).get(i).getStringCellValue();
		}
		if(cell_value.getCellType() == Cell.CELL_TYPE_NUMERIC)
		{
			result_value = String.valueOf(cell_value.getNumericCellValue());
			
		}
		else
		{
			result_value =  data_read_object.xlsGetColumnData(sheetName,2).get(i).getStringCellValue();
		}
		
	key.add(result_key);
	value.add(result_value);
	}
	
	for(int j=0; j<data_read_object.xlsGetRowCount(sheetName); j++)
	{
		readData.put(key.get(j), value.get(j));
	}
	
	System.out.println(readData);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return readData;
}
	
}
