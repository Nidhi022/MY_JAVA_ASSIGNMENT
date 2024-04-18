package nidhi_assignment;

//Try to find area of circle using PI from Math.PI, and radius from Math.random in the for loop  for 10 times.



public class Assignment62 
{

	public static void main(String[] args) 
	{
		double pi=Math.PI;
	
		double areaofCircle;
		for(int i=1;i<=10;i++)
		{
			areaofCircle=pi*Math.random()*Math.random();
			System.out.println(areaofCircle);
		}
		

	}

}