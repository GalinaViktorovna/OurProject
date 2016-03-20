package Services;

import Table.Client;
import Util.HibernateUtil;
import dao.ClientDao;
import org.hibernate.Session;

/**
 * Created by Admin on 20.03.2016.
 */
public class Project {
    public static void main(String[] args) throws Exception {
        Factory factory = Factory.getInstance();
         ClientDao clientDao =  factory.getClientDao();
         Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Client au = new Client();


        au.setFirstName("Васян");
        au.setPhoneNumber(380668796845L);


        session.save(au);
        session.getTransaction().commit();
        session.close();

    }

}
