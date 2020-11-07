public class Tv
{
	private  static String channel="colours";
	
	//getter
	public static String getChannel()
	{
		
		return channel;
	}
	
	
	//setter
	public static void setChannel(String newChannel)
	{
		
		if(newChannel.equals("suvarna") || newChannel.equals("starMaa") || newChannel.equals("zee") || newChannel.equals("uday"))	//compare the string 		
		{
			System.out.println("new channel is "+newChannel);
			channel=newChannel;
		}
		else{
			System.out.println("you cannot change the channel");
		}	}
	}	
	
	