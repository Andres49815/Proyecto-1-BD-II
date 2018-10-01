package controllers;

import prendapps.RequestEJBBean;

public class ProgramState {
    
    private static ProgramState instance;
    private static int conn;
    private static RequestEJBBean bean;
    
    
    public ProgramState() {
        super();
    }

    public static ProgramState getInstance() {
        if (instance == null){
            instance = new ProgramState();
        }
        return instance;
    }

    public static void setConn(int conn1) {
        conn = conn1;
    }

    public static int getConn() {
        return conn;
    }

    public static void setBean(RequestEJBBean bean) {
        ProgramState.bean = bean;
    }

    public static RequestEJBBean getBean() {
        return bean;
    }
}
