package dao;

import Table.Client;

import java.sql.SQLException;

public interface clientDao {
    public void addClient(Client client)throws SQLException;
    public void deleteAuthor(Client client)throws SQLException;
    public Client getAuthor(int id)throws SQLException;
    public Client getAuthor(String lastName)throws SQLException;

}

