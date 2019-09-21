package com.paradigmas.lab.aula6;

public class Post {

	private String idpost;
	private String postText;

	public Post(String idpost, String postText) {
		this.idpost = idpost;
		this.postText = postText;
	}

	@Override
	public String toString() {
		return "Post [id=" + idpost + ", postText=" + postText + "]";
	}
	
	
}
