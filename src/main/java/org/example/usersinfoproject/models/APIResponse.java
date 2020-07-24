package org.example.usersinfoproject.models;

import lombok.Data;

@Data
public class APIResponse {
    private Integer status;
    private String message;
    private Object data;
}
