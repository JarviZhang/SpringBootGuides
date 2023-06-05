package com.example.projectcode2;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//indicate that any properties not bound in this type should be ignored
//To directly bind your data to your custom types, you need to specify the variable name to be exactly the same as the key in the JSON document returned from the API
@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) {
}
