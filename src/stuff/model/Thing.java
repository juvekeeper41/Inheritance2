package stuff.model;

public abstract class Thing implements DoAble
{
	private String thingData;

	public String getThingData()
	{
		return thingData;
	}

	public void setThingData(String data)
	{
		this.thingData = data;
	}
	
	private void untouchable()
	{
		
	}
	
	public void doesThat()
	{
		System.out.println("asdasdasdasdasdasdas");
	}
	
	public void doesThoseThings()
	{
		
	}
}