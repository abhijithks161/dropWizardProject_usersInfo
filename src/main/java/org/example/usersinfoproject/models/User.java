package org.example.usersinfoproject.models;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.Date;

@Data
public class User {
    private ObjectId id;
    private String name;
    private Integer age;
    private Date createdAt;
    private Date lastActiveTime;
}
