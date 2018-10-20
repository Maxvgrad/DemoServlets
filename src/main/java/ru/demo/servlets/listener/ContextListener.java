package ru.demo.servlets.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ContextListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Init database");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Free resources");
    }
}
