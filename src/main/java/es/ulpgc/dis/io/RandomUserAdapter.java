package es.ulpgc.dis.io;

import com.google.gson.JsonObject;
import es.ulpgc.dis.model.User;

public class RandomUserAdapter implements UserAdapter {
    @Override
    public User adaptUser(JsonObject externalUser) {
        String fullName = externalUser.getAsJsonObject("name").get("title").getAsString()
                + " " + externalUser.getAsJsonObject("name").get("first").getAsString()
                + " " + externalUser.getAsJsonObject("name").get("last").getAsString();
        String email = externalUser.get("email").getAsString();
        String country = externalUser.getAsJsonObject("location").get("country").getAsString();

        return new User(fullName, email, country);
    }
}
