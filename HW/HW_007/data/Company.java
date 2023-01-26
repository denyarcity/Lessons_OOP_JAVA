package data;

public class Company extends ContactMain {

    private String companyName;
    private String occupation;

    public String getCompanyName() {
        return companyName;
    }

    public String getOccupation() {
        return occupation;
    }

    public Company(String name, String companyName, String occupation) {
        super(name);
        this.companyName = companyName;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Company [name = " + super.name + ", company name = " 
        + companyName + ", occupation = "  
        + occupation + "CommunicationMethod" + ", " + super.communicationMethods + "]";
    }
 }