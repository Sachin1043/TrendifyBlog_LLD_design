package user;

import java.util.*;

public class Profile {
	
	String name;
	String bio;
	String avatarUrl;
	String location;
	
	public Profile(){};
	
	public Profile(String name, String bio, String avatarUrl, String location) {
		super();
		this.name = name;
		this.bio = bio;
		this.avatarUrl = avatarUrl;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", bio=" + bio + ", avatarUrl=" + avatarUrl + ", location=" + location + "]";
	}
	
	
	

}
