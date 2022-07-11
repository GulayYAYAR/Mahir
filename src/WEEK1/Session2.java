package WEEK1;

public class Session2 {
    public static void main(String[] args) {
        //variables: it's used to store data.(every information is data)
        int myBirthYear=1997;
        int currentYear=2022;
        int myAge=currentYear-myBirthYear;
        System.out.println("My age is :" +myAge);


        System.out.println("*********************************************");

        String schoolName = "Renastech";
        System.out.println(schoolName);

//How to create variable?
        //typeOfVariable name=value;

        //Type of the variables(primitive): byte, int, long, float, double, boolean. char

        //byte
        byte b1=35; //limited useage because of the range
        //int
        int myBirthYear2=1997;
        //double
      double priceOfBanana=2.90; //usually for price use double
      //boolean
      boolean older18=true;
      boolean isLivingInColorada=false;
        System.out.println("Am i living in colorado?="+isLivingInColorada);

isLivingInColorada=true; //updated variable with new value
        System.out.println("Am i living in colorado?="+isLivingInColorada);

        String school="MIT";
        System.out.println("School"+school);
        school="Renastech"; //reassign the value
        //char
        char gender='F';
        System.out.println("Gender = "+gender);
char gender1='M';
        System.out.println(gender1); //shortcut gender1.sout

        //strings
        String name="Jane";
        System.out.println(name); //shortcut name.sout
        String lastName="XYZ";
        System.out.println(name + lastName);// shortcut name+lastName.sout


        String instructorName="Ziya";
        System.out.println("instructorName = " + instructorName); // shortcut  instructorName.soutv


    }
}

