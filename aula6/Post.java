package com.paradigmas.lab.aula6;

import java.util.ArrayList;
import java.util.List;

public class Post {

	private String idpost;
	private String postText;
	private List<Comment> comments;
	
	
	public Post(String idpost, String postText) {
		this.idpost = idpost;
		this.postText = postText;
		comments = new ArrayList<Comment>();
	}
	
	public String getIdpost() {
		return idpost;
	}

	public void addComment(Comment comment) {comments.add(comment);}

	@Override
	public String toString() {
		return "Post [id=" + idpost + ", postText=" + postText + "]";
	}
	
	
}
