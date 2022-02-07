package genericLib;

public class Constants  {
	
	//Read DATA from EXCEL File
	static String EXCELPATH = "./src/test/resources/testDataVtiger.xlsx";
	String VtURL = ExcelLib.readStringData("Sheet1", 0, 0);
	String CHROMEKEY = ExcelLib.readStringData("Sheet1", 0, 2);
	String CHROMEPATH = ExcelLib.readStringData("Sheet1", 1, 2);
	String USERNAME =ExcelLib.readStringData("Sheet1", 0, 1);
	String PASSWORD =ExcelLib.readStringData("Sheet1", 1, 1);
//	String SCREENSHOTPATH = "./errorshots/";
	
	
	

	//Read DATA from PROPERTY File
	static String propertyPath ="./src/test/resources/testDataVtiger.properties";
//	VtURL =
//	CHROMEKEY = 
//	CHROMEPATH = 
//	USERNAME =
//	PASSWORD =
//	
	
	
	
	
	
//	//Read DATA from JSON File
	static String jsonPath ="./src/test/resources/testDataVtiger.json";
//	VtURL = 
//	CHROMEKEY = 
//	CHROMEPATH = 
//	USERNAME =
//	PASSWORD =
	
	
}
