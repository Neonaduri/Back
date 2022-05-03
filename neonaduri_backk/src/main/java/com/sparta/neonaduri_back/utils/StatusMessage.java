package com.sparta.neonaduri_back.utils;

import lombok.Data;

@Data
public class StatusMessage {

    private StatusEnum status;
    private Object data;
    public StatusMessage(){
        this.status = StatusEnum.BAD_REQUEST;
    }

    public enum StatusEnum{
        OK(200, "OK"),
        BAD_REQUEST(400, "BAD_REQUEST"),
        NOT_FOUND(404, "NOT_FOUND"),
        INTERNAL_SERER_ERROR(500, "INTERNAL_SERVER_ERROR");

        int statusCode;
        String code;

        StatusEnum(int statusCode, String code) {
            this.statusCode = statusCode;
            this.code = code;
        }
    }
}
