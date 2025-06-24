package service;

import java.util.*;

import user.User;

public class EmailService {
	
	void sent(User user)
	{
		if(user.getEmail()!=null)
		{
			System.out.print("\nEmail sent to account "+user.getEmail());
		}
	}

}
