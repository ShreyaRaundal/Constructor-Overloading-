public class DeveloperProfile {
    String name;
    String email;
    String primaryLanguage;
    int yearsOfExperience;
    String linkdin;
    String github;

    // Constructor1:For new devs with basic info
    DeveloperProfile(String name,String email){
        this.name=name;
        this.email=email;
        this.primaryLanguage="Not specified";
        this.yearsOfExperience=0;
        this.linkdin="not linked";
        this.github="not linked";

    }

    // Constructor2:For experence devs
    DeveloperProfile(String name,String email,String primaryLanguage,int yearsOfExperience){
        this.name=name;
        this.email=email;
        this.primaryLanguage=primaryLanguage;
        this.yearsOfExperience=yearsOfExperience;
        this.linkdin="Not linked";
        this.github="Not linked";

    }
    // Constructor 3:for full detail profile
    DeveloperProfile(String name,String email,String primaryLanguage,int yearsOfExperience,String linkdin,String github){
        this.name=name;
        this.email=email;
        this.primaryLanguage=primaryLanguage;
        this.yearsOfExperience=yearsOfExperience;
        this.linkdin=linkdin;
        this.github=github;

    }
    public void displayProfile(){
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("PrimaryLanguage: "+primaryLanguage);
        System.out.println("Years Of Experiance :"+yearsOfExperience);
        System.out.println("Linkdin: "+linkdin);
        System.out.println("Github: "+github);

        System.out.println("----------------------------------------------------------------------");
    } 
}
