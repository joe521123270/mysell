package com.immooc.sell.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class DataTransformSerialize extends JsonSerializer<String> {
    @Override
    public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {

        System.out.println("-----------------------test:"+s);

        if(s.equals("")){
            jsonGenerator.writeNull();
        }else{
            jsonGenerator.writeString(s);
        }
    }
}
