package hack;
//write data into excel (write.xlsx)
import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class write {
	 
	public static  void writecellValue(int rownum,String str7,String str8,String str9,String str10,String str11,String str12,String str13,int srownum,String str14,String str15,String str16,String str17,String str18,String str20,int trownum,String str21,String str22,String str23,String str24,String str25,String str26,String str27)
	{
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Calculate Simple Interest");
		
		//Passing row number 0,1,2 by object 
		
		
	    //Row 1
	    Row header = sheet.createRow(rownum);
	    header.createCell(0).setCellValue(str7);
	    header.createCell(1).setCellValue(str8);
	    header.createCell(2).setCellValue(str9);
	    header.createCell(3).setCellValue(str10);
	    header.createCell(4).setCellValue(str11);
	    header.createCell(5).setCellValue(str12);
	    header.createCell(0).setCellValue(str13);
	    
	  //Row 2
	    Row dataRow = sheet.createRow(srownum);
	    dataRow.createCell(0).setCellValue(str14);
	    dataRow.createCell(1).setCellValue(str15);
	    dataRow.createCell(2).setCellValue(str16);
	    dataRow.createCell(3).setCellFormula(str17);
	    dataRow.createCell(4).setCellValue(str18);
	    //dataRow.createCell(5).setCellFormula(str19);
	    dataRow.createCell(5).setCellFormula(str20);
	    
	    
	    
	    //Row 3
	    Row dataRow2 = sheet.createRow(trownum);
	    dataRow2.createCell(0).setCellValue(str21);
	    dataRow2.createCell(1).setCellValue(str22);
	    dataRow2.createCell(2).setCellValue(str23);
	    dataRow2.createCell(3).setCellValue(str24);
	    dataRow2.createCell(4).setCellValue(str25);
	    dataRow2.createCell(5).setCellValue(str26);
	    dataRow2.createCell(5).setCellValue(str27);
	    
	      
	    try {
	        FileOutputStream out =  new FileOutputStream(new File("./write.xlsx"));
	        workbook.write(out);
	        out.close();
	        System.out.println("Table values from homeloan written successfully into Excel");
	          
	     
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
				
}
                

