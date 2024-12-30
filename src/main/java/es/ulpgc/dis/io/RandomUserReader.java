package es.ulpgc.dis.io;

import org.jsoup.Jsoup;

import java.io.IOException;

public class RandomUserReader implements UserReader {
    @Override
    public String read() {
        try {
            return Jsoup.connect("https://randomuser.me/api/")
                    .ignoreContentType(true)
                    .execute()
                    .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
