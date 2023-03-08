/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author manch
 */
import java.util.Scanner;
public class TestUserprofile {
    
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         UserProfile user=new UserProfile();
         System.out.println("Please enter your name");
         String name=in.nextLine();
         System.out.println("Choose one");
         for(int i=0;i<user.genres.length;i++) {
             System.out.println(user.genres[i]);
         }
         System.out.println("Enter the choosen genres");
         String g=in.nextLine();
         new UserProfile(name,g);
         System.out.println("Userprofile created");
    }
}
