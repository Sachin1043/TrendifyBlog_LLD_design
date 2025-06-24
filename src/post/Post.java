package post;


import user.User;
import java.util.*;

public class Post {
	
	String title;
	String discription;
	String postUrl;
	String owner;
	
	List<Comment>  comment = new ArrayList<>();
	
	public Post(){};
	
	public Post(String title, String discription, String postUrl,String owner,List<Comment>  comment ) {
		
		this.title = title;
		this.discription = discription;
		this.postUrl = postUrl;
		this.owner = owner;
		this.comment = comment;
	}
	
	
	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getPostUrl() {
		return postUrl;
	}

	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + ", discription=" + discription + ", postUrl=" + postUrl + ", owner=" + owner
				+ ", comment=" + comment + "]";
	}
	
	
}
