package nidhi_assignment;

//Write a program to demonstrate encapsulation



class privateData
{
	private String U_Name="hello@21"; 
	public void setU_Name(String U_Name)
	{
		this.U_Name=U_Name;
	}
	
	public String getU_Name()
	{
		return U_Name;
	}
	
}

public class Assignment64 
{

	public static void main(String[] args) 
	{
		privateData pd1=new privateData();
		pd1.setU_Name("hello@5342");
      System.out.println(pd1.getU_Name());
	}

}