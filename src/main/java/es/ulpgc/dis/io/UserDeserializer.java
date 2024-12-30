package es.ulpgc.dis.io;

import es.ulpgc.dis.io.pojos.UserResponse;

public interface UserDeserializer {
    UserResponse deserialize(String json);
}
