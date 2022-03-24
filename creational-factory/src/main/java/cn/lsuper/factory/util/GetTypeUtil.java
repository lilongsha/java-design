package cn.lsuper.factory.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ALGiii
 */
public class GetTypeUtil {
    public static String getType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type: ");
        String type = null;
        try {
            type = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }
}
