
public class try_catch {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
	}
		catch(Exception e){
			System.out.println("someting is wrong" +e.getMessage());
			//e.printStackTrace();
		}
		finally {
			System.out.println("always execute");
		}
			
		}

}
