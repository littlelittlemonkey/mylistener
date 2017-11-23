package com.imooc.listener;

import java.util.ArrayList;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.imooc.entity.User;
import com.imooc.util.SessionUtil;
public class MyHttpSessionListener implements HttpSessionListener {

    private static int userNumber = 0;

    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
        userNumber++;
        arg0.getSession().getServletContext().setAttribute("userNumber", userNumber);
        System.out.println("在线人数+1");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
        userNumber--;
        System.out.println("在线人数-1");
        arg0.getSession().getServletContext().setAttribute("userNumber", userNumber);

        ArrayList<User> userList = null;//在线用户List

        userList = (ArrayList<User>)arg0.getSession().getServletContext().getAttribute("userList");

        if(SessionUtil.getUserBySessionId(userList, arg0.getSession().getId())!=null){
            userList.remove(SessionUtil.getUserBySessionId(userList, arg0.getSession().getId()));
        }

    }

}
