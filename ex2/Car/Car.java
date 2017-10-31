public class Car
{
	private int carNo;
	private String modelName;
	private String make;
	private int price;
	private String color;
	public void setDetails(int carNo,String modelName,String make,int price,String color)
	{
		this.carNo=carNo;
		this.modelName=modelName;
		this.make=make;
		this.price=price;
		this.color=color;
	}
	public int getCarNo()
	{
		return this.carNo;
	}
	public String getModelName()
	{
		return this.modelName;
	}
	public String getMake()
	{
		return this.make;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getColor()
	{
		return this.color;
	}
	public void displayCarDetails()
	{
		System.out.println("\t"+carNo+"\t"+modelName+"\t"+make+"\t"+price+"\t\t"+color);
	}
	public Car copy()
	{
		Car temp=new Car();
		temp.carNo=this.carNo;
		temp.modelName=this.modelName;
		temp.make=this.make;
		temp.price=this.price;
		temp.color=this.color;
		return temp;
	}
}