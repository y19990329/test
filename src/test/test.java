package test;

import entity.House;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class test {
      public  static  void main(String[] args){
          Configuration configuration = new Configuration();
          configuration.configure("hibernate.cfg.xml");
          SessionFactory sf = configuration.buildSessionFactory();
          Session session = sf.openSession();
          String hql = "from House";
          Query query = session.createQuery(hql);
          List<House> list = new ArrayList<>();
          list = query.list();
          for (House h:list) {
              System.out.println(h.getDescription());
          }
      }
}
