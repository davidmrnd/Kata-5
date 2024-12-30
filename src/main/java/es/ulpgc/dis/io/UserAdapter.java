package es.ulpgc.dis.io;

import com.google.gson.JsonObject;
import es.ulpgc.dis.model.User;

public interface UserAdapter {
    User adaptUser(JsonObject externalUser);
}
