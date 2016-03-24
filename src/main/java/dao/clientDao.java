package dao;

import Table.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientDao {
    public void addClient(Client client)throws SQLException;
    public void deleteClient(Client client)throws SQLException;
    public Client getClient(int id)throws SQLException;
    public Client getClient(String lastName)throws SQLException;
    public List<Client> getClients()throws SQLException;


}

