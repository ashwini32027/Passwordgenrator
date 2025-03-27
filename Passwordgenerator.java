import java.util.*;
class Passwordgenerator
{
    public static String passmaker(Scanner sc)
    {
        System.out.println("how many digit mean length want to create Enter the Length");
        int len=sc.nextInt();
         String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String lower="abcdefghijklmnopqrstuvwxyz";
         String num="0123456789";
         String special="!@#$%^&*";
         String combination=upper+lower+num+special;
         char[] password =new char[len];
         Random r1 = new Random();
         for(int i=0;i<len;i++)
         {
            password[i]=combination.charAt(r1.nextInt(combination.length()));
         }
return new String(password);
    }
  
   
    public static void main(String[]args)
    {
        while(true)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to Create a password type only"+ " yes/no ");
        String result=sc.next();
       

        
        switch (result.toLowerCase()) {
            case "yes":
            System.out.println("Generrated Password is " +passmaker(sc));
                break;
            case "no" : System.out.println("our password genrator software is free of cost use unlimited time  ");
            sc.close();
            System.exit(0);

            return;
                  default:System.out.println("Please click only yes or no");
                break;
        }
        }
    }
}