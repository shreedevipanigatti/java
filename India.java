public class India{	
	public static void main(String[] map)
	{
		System.out.println("JVM invokes main");		
		String[] statesArray={"Goa","Harayan","Manipur","Karnataka","Gujarat","Assam","Bihar","AdrharPradesh","Odisha","Nagaland","Meghalaya","Mizoram","Maharashtra",
		"Kerala","HimachalPradesh",};
		
		satesOfIndia(statesArray);	

			
		System.out.println("exit main ");
	}		
	public static void satesOfIndia(String[] states)
	{

		System.out.println("statesOfIndia "+ states);		
		int size=states.length;
		System.out.println(size);
		
		System.out.println("statesOfIndia @ index 0 "+states[0]);
		System.out.println("statesOfIndia @ index 1 "+states[1]);
		System.out.println("statesOfIndia @ index 2 "+states[2] );
		System.out.println("statesOfIndia @ index 3 "+states[3]);
		System.out.println("statesOfIndia @ index 4 "+states[4]);
		System.out.println("statesOfIndia @ index 5 "+states[5] );
		System.out.println("statesOfIndia @ index 6 "+states[6]);
	}
	}

