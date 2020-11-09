public class AllTester{

public static void main(String[] names)
{
	
   Bank[] allBanks=Bank.values();
	
	System.out.println(allBanks.length);
	//length will be +1 of index
	for(int banksInitial=0;banksInitial<allBanks.length;banksInitial++){
		System.out.println("index " + banksInitial);
		Bank bankValues=allBanks[banksInitial];
		System.out.println("bank enum Values " + bankValues);
		
	}
	
	Mobile[] allMobiles=Mobile.values();
	System.out.println(allMobiles.length);
	for(int mobilesInitial=0;mobilesInitial<allMobiles.length;mobilesInitial++){
		System.out.println("index " + mobilesInitial);
		Mobile mobileValue=allMobiles[mobilesInitial];
		System.out.println("mobile enum Value " + mobileValue);
		
}

	Laptop[] allLaptops=Laptop.values();
	System.out.println(allLaptops.length);
	for(int laptopsInitial=0;laptopsInitial<allLaptops.length;laptopsInitial++){
		System.out.println("index " + laptopsInitial);
		Laptop laptopValue=allLaptops[laptopsInitial];
		System.out.println("laptop enum Value " + laptopValue);
		
}
    FilmNames[] allFilms=FilmNames.values();
	System.out.println(allFilms.length);
	//length will be +1 of index
	for(int filmsInitial=0;filmsInitial<allFilms.length;filmsInitial++){
		System.out.println("index " + filmsInitial);
		FilmNames filmValue=allFilms[filmsInitial];
		System.out.println("film enum Value " + filmValue);
		
	}
	
	TvChannels[] allChannels=TvChannels.values();
	System.out.println(allChannels.length);
	//length will be +1 of index
	for(int channelsInitial=0;channelsInitial<allChannels.length;channelsInitial++){
		System.out.println("index " + channelsInitial);
		TvChannels channelValue=allChannels[channelsInitial];
		System.out.println("channel enum Value " + channelValue);

}
}
}