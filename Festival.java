public class Festival{	
	public static void main(String[] politicians)
	{
		System.out.println("JVM invokes main");		
		String[] ministersArray={"BSY",
		"HDK",
		"Siddaramiah",
		"Jagadish Shettar",
		"SM Krishna"};
		chiefMinisters(ministersArray);	

			
		System.out.println("exit main ");
	}		
	public static void chiefMinisters(String[] names)
	{

		System.out.println("cheifMinisters "+ names );		
		int size=names.length;
		System.out.println(size);
		
		System.out.println("Chief Minister @ index 1 "+names[1]);
		System.out.println("Chief Minister @ index 2 "+names[2] );
		System.out.println("Chief Minister @ index 3 "+names[3]);
	}
}
