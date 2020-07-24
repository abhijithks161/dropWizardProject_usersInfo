package org.example.usersinfoproject.models;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class APIResponse {
    @NotNull
    private Integer status;
    @NotNull
    private String message;
    private Object data;
}
