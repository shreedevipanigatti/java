package com.xworkz.dtObject.DTO;

public class ComapanyDTO {

	

	public class CompanyDTO {
		private String name;
		private String type;
		private String location;
		private int companyId;
		private String webSite;
	    public CompanyDTO()
	    {
	    	System.out.println("Default constructor ");
	    }
	    public CompanyDTO(String name,String type,String location,int companyId,String website )
	    {
	    	System.out.println("CompanyDTO constructor");
	    	this.name=name;
	    	this.type=type;
	    	this.location=location;
	    	this.companyId=companyId;
	    	this.webSite=webSite;
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getCompanyId() {
			return companyId;
		}
		public void setCompanyId(int companyId) {
			this.companyId = companyId;
		}
		public String getWebSite() {
			return webSite;
		}
		public void setWebSite(String webSite) {
			this.webSite = webSite;
		}
	    
	}

	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getCompanyId() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getType() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getWebSite() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}




}
