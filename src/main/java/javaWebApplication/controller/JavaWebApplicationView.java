package javaWebApplication.controller;

public interface JavaWebApplicationView {
	public String APP_CONTEXT= "/MyWebApplication";
	public String PLACE_FOLDER = "/jsp";
    public String Login = APP_CONTEXT + PLACE_FOLDER + "/login.jsp";
    public String register = APP_CONTEXT + PLACE_FOLDER + "/registration.jsp";
    public String home =  APP_CONTEXT + PLACE_FOLDER + "/home.jsp";
  
    
}
