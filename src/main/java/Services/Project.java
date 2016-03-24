package Services;

import Table.Client;
import dao.ClientDao;
import dao.ClientDaoImpl;

import java.util.List;

/**
 * Created by Admin on 20.03.2016.
 */
public class Project {
    public static void main(String[] args) throws Exception {
        Factory factory = Factory.getInstance();
        ClientDao cl = factory.getClientDao();
        ClientDaoImpl dao =  new ClientDaoImpl();


        Client client = new Client();
        client.setPhoneNumber(5656565656L);
        client.setLastName("Галя");
        client.setFirstName("Самолетова");
        client.setMeans(123567L);
        dao.addClient(client);


  List<Client> clients= cl.getClients();
        System.out.println("id  isdn title description");
        for (Client clien : clients){
    //if(client.getId()==6)bookDao.deleteBook(boo);


            System.out.println( clien.getId() +" "+clien.getPhoneNumber()+" "+ clien.getFirstName()+"  "+
                    clien.getLastName()+"  " +clien.getMeans());

        }

    }

}
