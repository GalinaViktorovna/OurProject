package Services;

import Table.Client;
import dao.ClientDao;
import dao.ClientDaoImpl;

/**
 * Created by Admin on 20.03.2016.
 */
public class Project {
    public static void main(String[] args) throws Exception {
        Factory factory = Factory.getInstance();
        ClientDao cl = factory.getClientDao();
        ClientDaoImpl dao =  new ClientDaoImpl();


        Client client = new Client();
        client.setPhoneNumber(254645645654L);
        client.setLastName("dfh");
        client.setFirstName("g");
        client.setMeans(1232323L);
        dao.addClient(client);

       /* Client au = new Client();
        au.setFirstName("Васянн");
        au.setPhoneNumber(380668796845L);
        au.setLastName("Иванов");
        au.setMeans(200);
        dao.addClient(au);*/



    }

}
