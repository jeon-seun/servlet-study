package me.seun.common.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import me.seun.common.db.Connector;

@WebListener
public class ServletContextEventListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext context = event.getServletContext();

        String driverClassName = context.getInitParameter("driverClassName");
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = context.getInitParameter("jdbcUrl");
        String dbUsername = context.getInitParameter("dbUsername");
        String dbPassword = context.getInitParameter("dbPassword");

        Connector connector = new Connector(jdbcUrl, dbUsername, dbPassword);

        context.setAttribute("connector", connector);
    }

}
