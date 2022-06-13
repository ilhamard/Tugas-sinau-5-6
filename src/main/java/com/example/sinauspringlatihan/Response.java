package com.example.sinauspringlatihan;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Response implements Serializable {

    Object data;
    String Message;
    HttpStatus status;

    public Response(Object object, String message, HttpStatus httpStatus){

        this.data = object;
        this.Message = message;
        this.status = httpStatus;
    }
}
