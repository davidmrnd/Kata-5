package es.ulpgc.dis;

import es.ulpgc.dis.io.*;
import es.ulpgc.dis.model.User;

public class Main {
    public static void main(String[] args) {
        UserReader reader = new RandomUserReader();
        UserDeserializer deserializer = new RandomUserDeserializer();
        UserAdapter adapter = new RandomUserAdapter();

        UserLoader loader = new UserLoader(reader, deserializer, adapter);

        for (int i = 0; i < 10; i++) {
            User user = loader.loadUser();
            System.out.println(user);
        }
    }
}