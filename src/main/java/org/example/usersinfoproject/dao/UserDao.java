package org.example.usersinfoproject.dao;

import com.mongodb.client.MongoCollection;
import org.example.usersinfoproject.models.User;

public class UserDao extends BaseDao<User> {
    private static final String USER_COLLECTION = "users";

    public MongoCollection<User> getCollection() {
        return mongoService.getMongoDatabase().getCollection(USER_COLLECTION, User.class);
    }

    public void create(User user) {
        getCollection().insertOne(user);
    }
}
