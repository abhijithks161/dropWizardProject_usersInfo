package org.example.usersinfoproject.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.bson.types.ObjectId;
import org.example.usersinfoproject.utils.serde.ObjectIdJacksonSerializer;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class User {
    @JsonSerialize(using = ObjectIdJacksonSerializer.class)
    private ObjectId id;
    @NotNull
    private String name;
    @Email
    private String email;
    private Integer age;
    private Date createdAt;
    private Date lastActiveTime;
}
