package chatbot.model;

public class Chatbot
{

	private String name;
	private int chatCount;
	
	public Chatbot(String name)
	{
		this.name = "Steve";
				
		chatCount = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getChatCount()
	{
		return chatCount;
	}

	public void setname(String name)
	{
		this.name = name;
	}
	
	private void updateChatCount()
	{
		chatCount++;
	}
}
