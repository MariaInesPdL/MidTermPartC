/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author m_pdl
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Available genres: ");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        System.out.print("Choose your favorite genre (enter the corresponding number): ");
        int choice = input.nextInt();
        input.nextLine();
    
        if (choice < 1 || choice > genres.length) {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        String favoriteGenre = genres[choice - 1];
        UserProfile userProfile = new UserProfile(name, favoriteGenre);

        System.out.println("User profile created successfully!");
        System.out.println("Name: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }
}
