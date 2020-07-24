package org.example.usersinfoproject.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class User {
    private ObjectId id;
    @NotNull
    private String name;
    @Email
    private String email;
    private Integer age;
    private Date createdAt;
    private Date lastActiveTime;
}
