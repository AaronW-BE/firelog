package vip.fastgo.firelog.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class PhoneSerializer extends JsonSerializer<String> {
    @Override
    public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (s != null && s.length() > 8) {
            String prefix = s.substring(0, 3);
            String suffix = s.substring(8);
            jsonGenerator.writeString(prefix + "*****" + suffix);
            return;
        }
        jsonGenerator.writeString(s);
    }
}
