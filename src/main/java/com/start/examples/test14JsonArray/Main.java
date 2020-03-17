package com.start.examples.test14JsonArray;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       // String json = "{\"groups\": [\"create\", \"view_own\", \"sss\"], \"places\": [\"view\", \"create\"]}";
        //JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        JsonObject jsonObject = (JsonObject) (new JsonParser().parse((new FileReader("P:\\BOOK!!!\\BookFirst - Copy\\src\\main\\java\\com\\start\\test14JsonArray\\test.json"))));

        String firstName = jsonObject.get("firstName").getAsString();
        String lastName = jsonObject.get("lastName").getAsString();
        int age = jsonObject.get("age").getAsInt();

        JsonObject addressObject = jsonObject.getAsJsonObject("address");
        String streetAddress = addressObject.get("streetAddress").getAsString();
        String city = addressObject.get("city").getAsString();

        JsonArray jsonArray = jsonObject.getAsJsonArray("phoneNumbers");
        JsonObject phoneNumber = jsonArray.get(0).getAsJsonObject();




    }
}
