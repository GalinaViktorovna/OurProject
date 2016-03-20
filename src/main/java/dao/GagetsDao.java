package dao;


import Table.Gagets;

import java.sql.SQLException;

/**
 * Created by Admin on 20.03.2016.
 */
public interface GagetsDao {
    public void addGadget(Gagets gadget)throws SQLException;
    public void deleteGagets(Gagets gadget)throws SQLException;
    public void getGagets(int id)throws SQLException;

}
