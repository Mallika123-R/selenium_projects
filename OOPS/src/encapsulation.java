class encp{
	private String name;
	private int age;
	private String id_num;
	
	public int getage() {
		return age;
	}
	public String getname()
	{
		return name;
	}
	public String getid_num() {
		return id_num;
	}
	
	public void setage(int newage)
	{
		age=newage;
	}
	public void setname(String newname)
	{
		name=newname;
	}
	public void setid_num(String newid)
	{
		id_num=newid;
	}
	
	
}

public class encapsulation {

	public static void main(String[] args) {
		encp en=new encp();
		en.setname("Mallika");
		en.setage(27);
		en.setid_num("m_27");
		
		System.out.println("Name: "+en.getname()+"\nAge:"+en.getage()+"\nID_Num: "+en.getid_num());

	}

}
