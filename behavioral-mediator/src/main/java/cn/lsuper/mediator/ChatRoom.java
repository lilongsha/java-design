package cn.lsuper.mediator;

import java.util.Date;

/**
 * @author ALGiii
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date()
                + " [" + user.getName() +"] : " + message);
    }
}
