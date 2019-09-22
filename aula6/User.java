package com.paradigmas.lab.aula6;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String iduser;
	private String nome;
	private List<User> friends;
	public List<Post> posts;

	public User(String iduser, String nome) {
		super();
		this.iduser = iduser;
		this.nome = nome;
		friends = new ArrayList<User>();
		posts = new ArrayList<Post>();
	}
	
	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public String getIduser() {return iduser;}
	
	public void addFriend(User user) {friends.add(user);}

	public void addPost(Post post) {posts.add(post);}
	
	//public List<Post> getPost() {return posts;}
	

	@Override							// Altero aqui para poder printar os dados do usuario e nao o endereço na memoria.
	public String toString() {
		// TODO Auto-generated method stub
		return "User (" + iduser + ", " + nome + ")";
	}
}
