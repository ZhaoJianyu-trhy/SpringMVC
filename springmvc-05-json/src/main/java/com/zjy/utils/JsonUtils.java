package com.zjy.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.lang.Nullable;

import java.text.SimpleDateFormat;

public class JsonUtils {

    public static final String getJson(Object obj) {
        return getJson(obj, "yyyy-MM-dd HH:mm:ss");
    }

    public static final String getJson(Object obj, String format) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat(format));
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
