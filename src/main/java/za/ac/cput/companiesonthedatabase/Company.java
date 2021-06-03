/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.companiesonthedatabase;

/**
 *
 * @author imraan
 */
public class Company {
    private String companyName;
    private String companyAddress;
    private String companyDescription;
    
    public Company()
    {
        companyName = null;
        companyAddress = null;
        companyDescription = null;
    }

    public Company(String companyName, String companyAddress, String companyDescription) 
    {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyDescription = companyDescription;
    }
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    public String getCompanyName()
    {
        return this.companyName;
    }
    
    public void setCompanyAddress(String companyAddress) 
    {
        this.companyAddress = companyAddress;
    }
    
    public String getCompanyAddress() 
    {
        return companyAddress;
    }

    public void setCompanyDescription(String companyDescription) 
    {
        this.companyDescription = companyDescription;
    }

    public String getCompanyDescription() 
    {
        return companyDescription;
    }

    public String toString()
    {
        
        return "Name: " + companyName + "\nAddress" + companyAddress + "\nDescription" + companyDescription;
    }
    
    public void show()
    {
        System.out.println("Company name: " + this.companyName);
        System.out.println("Company address: " + this.companyAddress);
        System.out.println("Company description: " + this.companyDescription);
    }
}
/*System.out.println("--------------------------------------------------------");
        System.out.println("COMPANIES ON THE DATABASE");
        System.out.println("--------------------------------------------------------");
       CompanyController as = new CompanyController();
       as.menuControl();*/