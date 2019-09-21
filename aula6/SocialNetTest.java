package com.paradigmas.lab.aula6;

// Program test
public class SocialNetTest {	
	public static void main(String[] args) {
		SocialNetwork rede = new SocialNetwork();
		
		rede.addUser(new User("u1", "Joao Carlos"));
		rede.addUser (new User("u2", "Maria Antonia"));
		rede.addUser (new User("u3", "Emanuel Benedito"));
		rede.addUser (new User("u4", "Josefina de Almeida"));
		
		rede.printUsers();		// Imprime lista de usuários.
		
		// adiciona uma amizade, dado dois user ids
		rede.addFriendly ("u1", "u2");
		rede.addFriendly ("u1", "u3");
		rede.addFriendly ("u2", "u4");
		
		// adiciona um post, dado um usuário e uma mensagem
		rede.addPost("u1", new Post ("p1", "Tomando cafe"));
		rede.addPost("u2",new Post ("p2", "amizade é tudo de bom "));
		rede.addPost("u2", new Post ("p3", "passeando com meu cachorro"));
	}
}
