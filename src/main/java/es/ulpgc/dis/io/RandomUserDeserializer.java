package es.ulpgc.dis.io;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import es.ulpgc.dis.io.pojos.UserResponse;

public class RandomUserDeserializer implements UserDeserializer {
    @Override
    public UserResponse deserialize(String json) {
        JsonObject results = new Gson().fromJson(json, JsonObject.class);
        return new UserResponse(results.getAsJsonArray("results"));
    }
}
