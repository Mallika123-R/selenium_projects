package xls_Reader;

import util.xlsReader;

public class xlsFile {

	public static void main(String[] args) {
		String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\xls_data\\rediff_portfolio.xlsx";
		//Xls_Reader xls=new Xls_Reader(filePath);
		xlsReader xls=new xlsReader(filePath);
		String sheetName="StockManagement";
		String flag="addexistingsStock";
		int flagRowNo=0;
		while(!xls.getCellData(sheetName, 0, flagRowNo).equals(flag))
		{
			flagRowNo++;
			
		}
		System.out.println("flag Row No--"+flagRowNo);
		int columnNameRowNo=flagRowNo+1;
		int datastartRowNo=flagRowNo+2;
		
		while(!xls.getCellData(sheetName, 0, datastartRowNo).equals(""))
		{
			int colIndex=0;
			while(!xls.getCellData(sheetName, colIndex , columnNameRowNo).equals(""))
			{
				colIndex++;
			    String data_row=xls.getCellData(sheetName, colIndex, datastartRowNo);
			    System.out.println(data_row);
			    String data_col=xls.getCellData(sheetName, colIndex, columnNameRowNo);
			    System.out.println(data_col);
			    
			}
			System.out.println("---------");
			datastartRowNo++;
		}
		

	}

}
