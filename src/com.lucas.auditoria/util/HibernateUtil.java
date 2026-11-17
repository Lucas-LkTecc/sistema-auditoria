package com.lucas.auditoria.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    // A variável é "static" para que exista apenas UMA cópia dela no sistema todo.
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try {
            // 1. Chama o "engenheiro"/
            Configuration configuration = new Configuration();

            // 2. Manda o engenheiro ler a "planta" (ele vai procurar o hibernate.cfg.xml sozinho)
            configuration.configure();

            // 3. O engenheiro constrói a fábrica e a devolve pronta
            return configuration.buildSessionFactory();

        }catch (Throwable ex) {
            // Se você digitou a senha do banco errada no XML, o erro vai estourar aqui.
            System.err.println("Deu ruim na de criar a fabrica" + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
