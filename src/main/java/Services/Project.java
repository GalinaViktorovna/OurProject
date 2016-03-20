package Services;

import Table.Client;
import dao.ClientDaoImpl;

/**
 * Created by Admin on 20.03.2016.
 */
public class Project {
    public static void main(String[] args) throws Exception {
        ClientDaoImpl dao =  new ClientDaoImpl();

        Client au = new Client();
        au.setFirstName("Васян");
        au.setPhoneNumber(380668796845L);
        au.setLastName("Иванов");
        au.setMeans(200);
        dao.addClient(au);



    }

}
