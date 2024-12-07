package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
      
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Device.class)
                .addAnnotatedClass(Smartphone.class)
                .addAnnotatedClass(Tablet.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Device device = new Device("Samsung", "Generic Model", 300.00);
            Smartphone smartphone = new Smartphone("Apple", "iPhone 13", 999.99, "iOS", 12.5);
            Tablet tablet = new Tablet("Samsung", "Galaxy Tab S8", 650.50, 11.0, 12);

            session.beginTransaction();

            session.save(device);
            session.save(smartphone);
            session.save(tablet);

            session.getTransaction().commit();

            System.out.println("Device, Smartphone, and Tablet records inserted!");

        } finally {
            factory.close();
        }
    }
}
