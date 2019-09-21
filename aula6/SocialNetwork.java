package com.paradigmas.lab.aula6;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
	
	private List <User> users;
	
	public SocialNetwork() {
		users = new ArrayList<User>();
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void printUsers() {
		for(User u : users) {
			System.out.println(u);
		}
	}
	

	public void addFriendly(String idUser1, String idUser2) {		
		User user1 = null;
		User user2 = null;
		for(User u : users) {
			if(u.getIduser() == idUser1) {
				// System.out.println("Achei primeiro usuario");
				user1 = u;

			}
			
			if(u.getIduser() == idUser2) {
				// System.out.println("Achei segundo usuario");
				user2 = u;
			}
			
			if(user1 != null && user2 != null) {
				// System.out.println("Amizade efetuada!");
				break;
			}
		}
		
		if(user1 != null && user2 != null) {
			user1.addFriend(user2);
			user2.addFriend(user1);
		}	
		else {
			System.out.println("Pelo menos um usuário nao foi encontrado!");
		}
		
	}

	public void addPost(String idUser, Post post) {
		for(User u : users) {
			if(u.getIduser() == idUser) {
				u.addPost(post);
			}
		}
	}

	public void addComment(String uAdicionador, String uDestino, String idPost, Comment comment) {
		for(User u : users) {
			if(u.getIduser() == uDestino) {
				for(Post p : u.getPost()) {
					if(p.getIdpost() == idPost) {
						p.addComment(comment);
					}
				}
			}
		}
	}
}
