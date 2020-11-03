package hack;
//Only for read from Excel file (abc.xlsx)

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excel {
				
                public static String getcellValue(String sheetName, int rowNum, int colNum) throws Exception
                {
                                String cellValue = null;
                                try
                                {
                                                FileInputStream excelfile = new FileInputStream("./Input.xlsx") ;
                                                @SuppressWarnings("resource")
												XSSFWorkbook wb = new XSSFWorkbook(excelfile);
                                                XSSFSheet sheet = wb.getSheet(sheetName);
                                                XSSFRow row = sheet.getRow(rowNum);
                                                XSSFCell cell = row.getCell(colNum);
                                                if(cell.getCellTypeEnum()==CellType.STRING) {
                                                cellValue = cell.getStringCellValue();
                                                //if string pass this 
                                                }
                                                else
                                                {
                                                	//if not a string then get the numeric value and then convert it in string (tsxt format)
                                                	cellValue=NumberToTextConverter.toText(cell.getNumericCellValue());
                                                }
                                                
                                }
                                catch(Exception e)
                                {
                                                e.printStackTrace();
                                }
                                return cellValue;

                }

}