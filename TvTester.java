public class TvTester{
	
	
	public static void main(String[] remote)
{
System.out.println("JVM invoked main");

String value=remote[0];

String channelName=Tv.getChannel();

System.out.println("channelName"+channelName);
//System.out.println("unlockValue"+Mobile.getUnlock);

Tv.setChannel(value);

channelName=Tv.getChannel();

System.out.println("channelName"+channelName);
//System.out.println("unlockValue"+Mobile.getUnlock);

System.out.println("EXIT :: main");

}
	
}
