package com.xworkz.dtObject;

import com.xworkz.dtObject.DTO.CountryDTO;


public class CountryTester {

	public static void main(String[] args) {
		

			
				CountryDTO countryDto = new CountryDTO();
				System.out.println(countryDto.getName());
				System.out.println(countryDto.getPrimeMinister());
				
				CountryDTO countryDto1=new CountryDTO("Rajastan");
				countryDto1.setName("India");
				System.out.println(countryDto1.getName());
				
				CountryDTO countryDto2=new CountryDTO("India", 2100232l);
				System.out.println(countryDto2.getName());
				countryDto.setPopulation(210004385l);
				System.out.println(countryDto.getPopulation());
				
				
				CountryDTO countryDto3=new CountryDTO(210004385l, "Narendra Modi", "Pranab Mukarji");
				System.out.println(countryDto3.getPopulation());
				System.out.println(countryDto3.getPrimeMinister());
				countryDto3.setPresident("Ramanath Kovind");
				System.out.println(countryDto3.getPresident());
				
				String[] states=new String[3];
				states[0]="Karnataka";
				states[1]="Gujarat";
				states[2]="Hydrabad";
				
				String[] language=new String[2];
				language[0]="kannada";
				language[1]="Hindi";
				CountryDTO countryDto4=new CountryDTO(states, "Narendra Modi", language);
				System.out.println(countryDto4.getStates());
				countryDto4.setStates(new String[] { "Jammu&Kashmir", "New Delhi", "Rajastan", "Gujarat", "Orissa", "MP",
						"Assam", "west Bengal", "Goa", "Maharastra", "Arunachal Pradesh", "Jharkand", "Karnataka", "An                                                                                                                                                                                                                                                                draPradesh", "TN",
						"Kerala", "Jharkand", "Bihar" });
				System.out.println(countryDto4.getStates());
				System.out.println(countryDto4.getPrimeMinister());
				System.out.println(countryDto4.getPresident());
				countryDto4.setLanguages(new String[] { "Kannada","Tamil","Teluga","Marathi","Rajastani","Mlayalam","Gujarati"});
				System.out.println(countryDto4.getLanguages());
				
				
				
				

			}

		}
