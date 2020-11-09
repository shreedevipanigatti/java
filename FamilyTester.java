public class FamilyTester{

public static void main(String[] names)
{
	
	String family="GRANDPA";
	
	Family convertedGrandPaFromString=Family.valueOf(family);
	
	System.out.println(convertedGrandPaFromString);
	
	
	Family[] allFamily=Family.values();
	System.out.println(allFamily.length);
	//length will be +1 of index
	for(int familyInitial=0;familyInitial<allFamily.length;familyInitial++){
		System.out.println("index " + familyInitial);
		Family familyValue=allFamily[familyInitial];
		System.out.println("family enum Value " + familyValue);
		
	}
	
	
	//Institute[] allInstitute=Institute.values();
	//System.out.println(allInstitute.length);
}

}
