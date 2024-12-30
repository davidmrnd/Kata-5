package es.ulpgc.dis.io;

import com.google.gson.JsonObject;
import es.ulpgc.dis.io.pojos.UserResponse;
import es.ulpgc.dis.model.User;

public class UserLoader {

    private final UserReader reader;
    private final UserDeserializer deserializer;
    private final UserAdapter adapter;

    public UserLoader(UserReader reader, UserDeserializer deserializer, UserAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public User loadUser() {
        String json = reader.read();
        UserResponse response = deserializer.deserialize(json);
        JsonObject externalUser = response.results().get(0).getAsJsonObject();

        return adapter.adaptUser(externalUser);
    }
}
