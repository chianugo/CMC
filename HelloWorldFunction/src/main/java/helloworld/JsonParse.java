package helloworld;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParse {
    public static void main(String[] args) {
        String json = "{\"name\":\"John Doe\",\"age\":21,\"email\":\"johndoe@example.com\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Convert JSON string to Java object
            Person person = objectMapper.readValue(json, Person.class);

            // Access the Java object's properties
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Email: " + person.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
