package post;

import java.util.*;
import user.User;

public class Comment {
	
	String content;
	String user;
	
	public Comment() {};
	
	public Comment( String content, String user) {
		super();
		this.content = content;
		this.user = user;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Comment - " + content + "-> user=" + user + "]";
	}
	
	
}
