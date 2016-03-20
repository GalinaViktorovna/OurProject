package Services;

import dao.ClientDao;
import dao.ClientDaoImpl;

/**
 * Created by Admin on 20.03.2016.
 */
public class Factory {
    private static Factory instance = new Factory();

    private ClientDao clientDao;



    private Factory(){}

    public static Factory getInstance(){
        return Factory.instance;
    }
    public  ClientDao getClientDao(){
        if(clientDao==null)clientDao = new ClientDaoImpl();
        return clientDao;
    }

}



