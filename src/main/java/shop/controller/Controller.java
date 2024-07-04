package shop.controller;

import java.io.FileInputStream; 
import java.io.IOException; 
import java.lang.reflect.InvocationTargetException; 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 
import java.util.Properties; 
 
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletConfig; 
import javax.servlet.ServletContext; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebInitParam; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import shop.process.CommandAction; 


@WebServlet(
		urlPatterns = { 
				"/Controller", 
				"*.do"
		}, 
		initParams = { 
				@WebInitParam(name = "propertyConfig", value = "commandMapping.properties")
		})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Controller() {
        super();
    }

    public void init(ServletConfig config) throws ServletException {
    	
    	String props = config.getInitParameter("propertyConfig");
    }

}
