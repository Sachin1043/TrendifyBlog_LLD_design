package service;

import java.util.*;
import user.User;

import models.userRepository;

public class AuthService {
	
	private userRepository userRepo;
	private EmailService emailService;
	
	public User loggedUser = null;
	
	public AuthService(userRepository userRepo, EmailService emailService) {
	
		this.userRepo = userRepo;
		this.emailService = emailService;
	}

	public boolean register(String name , String email , String password)
	{
		if(userRepo.findByEmail(email)!=null)
		{
			System.out.print("\nEmail already exist..");
			return false;
		}
		User newUser = new User();
		newUser.setName(name);
		newUser.setEmail(email);
		newUser.setPassword(password);
		
		userRepo.addUser(newUser);
		emailService.sent(newUser);
		
		return true;
	}
	
	public boolean login(String email , String password)
	{
		if(userRepo.findByEmail(email)==null)
		{
			System.out.print("\nNo User available Register and login..");
			return false;
		}
		
		loggedUser = userRepo.getUser(email);
		return true;
	}
	
	public boolean checkUser()
	{
		return loggedUser!=null;
	}
	public void logout()
	{
		userRepo.logout(loggedUser);
	}

}
