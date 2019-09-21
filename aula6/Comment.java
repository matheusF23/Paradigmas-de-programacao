package com.paradigmas.lab.aula6;

public class Comment {
	
	private String idComment;
	private String commentText;
	
	public Comment(String idComment, String commentText) {
		super();
		this.idComment = idComment;
		this.commentText = commentText;
	}

	@Override
	public String toString() {
		return "Comment [idComment=" + idComment + ", commentText=" + commentText + "]";
	}

	

}
