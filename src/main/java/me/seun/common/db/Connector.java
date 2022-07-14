package me.seun.common.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private final String jdbcUrl;
    private final String dbUsername;
    private final String dbPassword;

    public Connector(String jdbcUrl, String dbUsername, String dbPassword) {
        this.jdbcUrl = jdbcUrl;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
