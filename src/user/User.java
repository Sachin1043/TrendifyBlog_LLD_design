package user;

import java.util.*;

import post.Post;
import post.Comment;

public class User {
	
	int id;
	String name;
	String email;
	String password;
	
	List<Post> post = new ArrayList<>();
	List<Comment> comment = new ArrayList<>();
	
	Profile profile;
	
	public User() {};
	
	
	public User(int id, String name, String email, String password, List<Post> post, List<Comment> comment,
			Profile profile) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.post = post;
		this.comment = comment;
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", post=" + post
				+ ", comment=" + comment + ", profile=" + profile + "]";
	}
	
	

}
