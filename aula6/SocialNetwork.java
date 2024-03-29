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
			System.out.println("Pelo menos um usu�rio nao foi encontrado!");
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
		User user1 = null, user2 = null;
		for(User u : users) {
			if(u.getIduser() == uAdicionador) {
				user1 = u;
			}
			if(u.getIduser() == uDestino) {
				user2 = u;
			}
			if(user1 != null && user2 != null) {
				System.out.println("-------------------------------");
				System.out.println("Usuarios encontrados.");
				System.out.println("-------------------------------");
				break;
			}
			
			/*
			if(u.getIduser() == uDestino) {
				for(Post p : u.getPost()) {
					if(p.getIdpost() == idPost) {
						p.addComment(comment);
					}
				}
			}*/
		}
		for(Post p : user2.posts) {
			if(p.getIdpost() == idPost) {
				p.addComment(comment);
				System.out.println("Comentario adicionado!");
			}
			if(p != null){
				break;
			}
		}
	}

	public void liked(String uCurtidor, String uCurtido, String idPost) {
		User user1 = null, user2 = null;
		for(User u : users) {
			if(u.getIduser() == uCurtidor) {
				user1 = u;
			}
			if(u.getIduser() == uCurtido) {
				user2 = u;
			}
			if(user1 != null && user2 != null) {
				System.out.println("-------------------------------");
				System.out.println("Usuarios encontrados.");
				System.out.println("-------------------------------");
				break;
			}
		}
		
		for(Post p : user2.posts) {
			if(p.getIdpost() == idPost) {
				p.addLike(uCurtidor);
				System.out.println("Like adicionado!");
				System.out.println("-------------------------------");
			}
			if(p != null){
				break;
			}
		}
	}

	public void printUpdates() {
		System.out.println("\nPosts dos usu�rios: \n");
		
		for(User u : users) {
			for(Post p : u.posts) {
				System.out.println(u + ": " + p);
				System.out.println("\tComent�rios:");
				for(Comment c : p.comments) {
					System.out.println("\t\t" + c);
				}
			}
		}
		
	}
}
