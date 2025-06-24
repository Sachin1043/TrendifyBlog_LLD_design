package test;

import java.util.*;

import user.User;

import models.userRepository;
import models.commentRepository;
import models.postRepository;

import post.Post;
import post.Comment;

import service.AuthService;
import service.EmailService;
import service.verfication;

import controller.Controller;

public class main {

		public static void main(String[] args) {
			
		userRepository userRepository = new userRepository();
		verfication Verfication = new verfication();
	    EmailService emailService = new EmailService();
	    AuthService authService = new AuthService(userRepository, emailService);
	    postRepository postRepository = new postRepository(authService);
	    commentRepository commentRepository = new commentRepository(postRepository,authService);
		Controller controller = new Controller(commentRepository, postRepository, authService,Verfication);
			
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\n\n=====Trendify Blog=====");
			
			System.out.println("\n1. Register");
			System.out.println("2. Login");
			System.out.println("3. AddPost");
			System.out.println("4. ViewAllPost");
			System.out.println("5. AddComments");
			System.out.println("6. EditProfile");
			System.out.println("7. Logout");
			System.out.println("8. Exit\n");
			System.out.print("\nEnter a choice: ");
			
			 if (!sc.hasNextInt()) {
                System.out.println("[Error] Please enter a valid number.");
                sc.nextLine();
                continue;
	            }
			int choice = sc.nextInt();
			sc.nextLine();
//			
			switch(choice)
			{
				case 1 :      //Register
					
					System.out.print("\nUsername: ");
					String name = sc.nextLine();
					
					System.out.print("Email: ");
					String email = sc.nextLine();
					
					System.out.print("Password: ");
					String password = sc.nextLine();
					
					controller.register(name,email,password);
					break;
					
				case 2 :      //Login
					
					System.out.print("\nEmail: ");
					String Email = sc.nextLine();
					
					System.out.print("Password: ");
					String Password = sc.nextLine();
					
					controller.login(Email,Password);
					break;
					
				case 3 :      //Add Post
					
					if(!controller.checkUser())
					{
						System.out.print("\nLogin first!..");
						break;
					}
					System.out.print("\nPost title: ");
					String title = sc.nextLine();
					
					System.out.print("Discription: ");
					String discription = sc.nextLine();
					
					System.out.print("Post url: ");
					String postUrl = sc.nextLine();
					
					controller.addPost(title,discription,postUrl);
					break;
					
				case 4 :     //View Post
					
					controller.viewAllPost();
					break;
				
				case 5 :   // Add Comments
					
					
					if(postRepository.post.size()==0)
					{
						System.out.print("\nNo post available..");
						break;
					}
					if(!controller.checkUser())
					{
						System.out.print("\nLogin first!..");
						break;
					}
					
					System.out.print("Enter the post index for comment: ");
					int postIndex = sc.nextInt();
					sc.nextLine();
					
					
					
					if(postIndex<0 || postIndex>postRepository.post.size())
					{
						System.out.print("\nEnter a valid Index..");
						break;
					}
					
					System.out.print("\npost a comment: ");
					String content = sc.nextLine();
					
					
					controller.addComment(postIndex,content);
					
					System.out.print("\nComment added successfully...");
					break;
					
				case 6 :
					
					if(!controller.checkUser())
					{
						System.out.print("\nLogin first!..");
						break;
					}
					
					System.out.print("\nProfile bio: ");
					String bio = sc.nextLine();
					
					System.out.print("Location: ");
					String location = sc.nextLine();
					
					System.out.print("avartarUrl: ");
					String avatarUrl = sc.nextLine();
					
					user.Profile newProfile = new user.Profile();
					
					newProfile.setBio(bio);
					newProfile.setLocation(location);
					newProfile.setAvatarUrl(avatarUrl);
					
					controller.editProfile(newProfile);
					break;
					
				case 7 :
					
					controller.logout();
					break;
					
				case 8 :
					
					 System.out.print("\nExiting... Goodbye! 👋");
	                    sc.close();
	                    System.exit(0);
	                    break;
					
	             default :
	            	 
	            	 System.out.print("Invalid Choice , Try Again...");
	            	 break;
			}
		}

	}

}
