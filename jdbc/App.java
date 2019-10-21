package com.paradigmas.lab.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost/agenda?user=root&password=1234&useTimezone=true&serverTimezone=UTC";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
