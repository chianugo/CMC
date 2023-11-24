package helloworld;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    @JsonProperty("data")
    private String[] data;

    // Getter
    public String[] getData() {
        return data;
    }

    // Setter
    public void setName(String[] data) {
        this.data = data;
    }

}
