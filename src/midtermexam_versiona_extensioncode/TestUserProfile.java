
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Brittany
 */
public class TestUserProfile extends UserProfile{

    public static void main(String[] args) {
        UserProfile up = new UserProfile();
//        up.getUserID(); 
//        up.getGenre(); 
//        System.out.println("up.getGenre(); "+up.getGenre());
//        System.out.println("up.getUserID(); "+up.getUserID());
//        System.out.println("BEGINNING.");
        
        
        
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter your Name: ");
        String name = input.nextLine(); 
        
        System.out.println("Please enter your Genre: ");
        up.genreTypes(); 
        
        String genree = input.nextLine(); 
       
        
        UserProfile up2 = new UserProfile(name, genree); 
        
        
        System.out.println("Your profile has been created.");
    }

    
}
