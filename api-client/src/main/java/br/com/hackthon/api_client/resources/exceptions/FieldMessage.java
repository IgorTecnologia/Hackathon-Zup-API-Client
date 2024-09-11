package br.com.hackthon.api_client.resources.exceptions;

import lombok.*;


@Data
public class FieldMessage {

    private String fieldName;
    private String fieldMessage;

    public FieldMessage(){
    }

    public FieldMessage(String fieldName, String fieldMessage){

        this.fieldName = fieldName;
        this.fieldMessage = fieldMessage;
    }
}
