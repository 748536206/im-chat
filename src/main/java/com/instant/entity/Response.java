package com.instant.entity;


public class Response<T> {

    private static final String OK = "ok";
    private static final String ERROR = "error";
    private static final String codeOk="0";
    private static final String codeError="-1";
    private String code;
    private String msg;
    private T data;

    public Response success() {
        this.code=codeOk;
        this.msg=OK;
        return this;
    }

    public Response success(T data) {
        this.code=codeOk;
        this.msg=OK;
        this.data = data;
        return this;
    }

    public Response  userDefined(String code,String msg,T data){
        this.code=code;
        this.msg=msg;
        this.data = data;
        return this;
    }

    public Response failure() {
        this.code=codeError;
        this.msg=ERROR;
        return this;
    }

    public Response failure(String msg) {
        this.code=codeError;
        this.msg=msg;
        return this;
    }
    public Response httpfailure(String code,String msg,T data) {
        this.code=code;
        this.msg=msg;
        this.data=data;
        return this;
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
