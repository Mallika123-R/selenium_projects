package mvn_projectCMD;

public class sample {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"//Data.xlsx";
		Xls_Reader file=new Xls_Reader(path);
		System.out.println(file.getRowCount("LoginTest"));

	}

}
