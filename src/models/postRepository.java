package models;

import user.User;

import post.Post;
import post.Comment;
import service.AuthService;

import java.util.*;

public class postRepository {
	
	
	private AuthService authService;
	
	public postRepository(AuthService authService)
	{
		this.authService = authService;
	}
	
	List<Comment> comment = new ArrayList<>();
	
	public List<Post> post = new ArrayList<>();
	
	Post pos = new Post();
	
	public void addPost(String title , String dicription , String postUrl)
	{
		pos.setTitle(title);
		pos.setDiscription(dicription);
		pos.setPostUrl(postUrl);
		pos.setComment(comment);
		pos.setOwner(authService.loggedUser.getName());;
		
		post.add(pos);
		System.out.print("\nPost added succesfully..");
		return;
	}
	
	public void viewPost()
	{
		if(post.size()==0)
		{
			System.out.print("No post available..");
			return;
		}
		for(Post post : post)
		{
			System.out.println(post);
		}
		return;
	}
}
