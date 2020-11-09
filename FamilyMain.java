public class FamilyMain
{
	public static void main(String[] names)
	{
		System.out.println("JVM Invoked main");
		
		String familyMember=names[0];
		Family converted=Family.valueOf(familyMember);
		
		System.out.println("name: "+converted);
		
		System.out.println("EXIT :: main");
	}
	public static void Name(Family name)
	{
		System.out.println("Family: "+name);
	}
}