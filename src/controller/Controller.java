package controller;

import java.util.*;

import user.Profile;

import models.commentRepository;
import models.postRepository;
import service.AuthService;
import service.verfication;

import user.Profile;
import user.User;

public class Controller {
	
	private commentRepository commentRepo;
	private postRepository postRepo;
	private AuthService authService;
	private verfication verfication;
	
	public Controller(commentRepository commentRepo, postRepository postRepo, AuthService authService, verfication verfication) {
		
		this.commentRepo = commentRepo;
		this.postRepo = postRepo;
		this.authService = authService;
		this.verfication = verfication;
	}

	public void register(String name , String email , String password)
	{
		if(!verfication.Verfication(name,email,password))
		{
			return;
		}
		
		if(authService.register(name,email,password))
		{
			System.out.print("\nRegistration Successfull..");
			return;
		}
	}
	
	public void login(String name , String password)
	{
		if(authService.login(name,password))
		{
			System.out.print("\nLogin Successfull ---------- Welcome "+authService.loggedUser.getName()+"!");
			return;
		}
	}
	
	public boolean checkUser()
	{
		return authService.checkUser();
	}
	
	public void addPost(String title , String dicription , String postUrl)
	{
		postRepo.addPost(title, dicription, postUrl);
		
	}
	
	public void viewAllPost()
	{
		postRepo.viewPost();
		return;
	}
	
	public void addComment(int PostIndex, String content)
	{
		commentRepo.addComment(PostIndex,content);
		return;
	}
	
	public void editProfile(Profile profile)
	{
		authService.loggedUser.setProfile(profile);
		
		System.out.print("\nProfile updated succesfuly..");
		return;
	}
	
	public void logout()
	{
		authService.logout();
	}
	
	

}
