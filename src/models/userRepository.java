package models;

import java.util.*;
import user.User;

public class userRepository {
	
	List<User> user = new ArrayList<>();
	
	public User findByEmail(String email)
	{
		for(User user : user)
		{
			if(user.getEmail().equals(email))
			{
				return user;
			}
		}
		return null;
	}
	
	public void addUser(User newUser)
	{
		user.add(newUser);
		return;
	}
	
	public User getUser(String email)
	{
		for(User user : user)
		{
			if(user.getEmail().equals(email))
			{
				return user;
			}
		}
		return null;
	}
	
	public void logout(User logoutUser)
	{
		if(user.size()==0)
		{
			System.out.print("\n[Error]No user available...");
			return;
		}
		user.remove(logoutUser);
		System.out.print("\n Logout successfully..");
		return;
	}

}
