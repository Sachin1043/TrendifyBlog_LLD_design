package models;

import java.util.*;

import post.Comment;
import service.AuthService;

public class commentRepository {
	
	private postRepository postRepo;
	private AuthService authService;

	public commentRepository(postRepository postRepo,AuthService authService)
	{
		this.postRepo=postRepo;
		this.authService = authService;
	}
	
	public void addComment(int index , String content)
	{
		Comment cmt = new Comment();
		List<Comment> comment = postRepo.post.get(index).getComment();
		cmt.setContent(content);
		cmt.setUser(authService.loggedUser.getName());
		
		comment.add(cmt);
		return;
		
	}
	
	

}
