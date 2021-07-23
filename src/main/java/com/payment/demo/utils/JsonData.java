package com.payment.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Blue_Sky 7/20/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private Object data;
    private String msg;

    public static JsonData buildSuccess(){
        return new JsonData(0,null,null);
    }

    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data,null);
    }

    public static JsonData buildSuccess(int code, Object data){
        return new JsonData(code,data,null);
    }

    public static JsonData buildSuccess(Object data, String msg){
        return new JsonData(0,data,msg);
    }

    public static JsonData buildFailure(String msg){
        return new JsonData(-1,null,msg);
    }

    public static JsonData buildFailure(int code,String msg){
        return new JsonData(code,null,msg);
    }
}
