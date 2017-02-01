
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloListener implements ServletContextListener{
    private final static Logger LL = LoggerFactory.getLogger(HelloListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LL.info("Context initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        LL.info("Context destroyed");
    }
}