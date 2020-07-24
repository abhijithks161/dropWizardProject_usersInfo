package org.example.usersinfoproject.dao;

import com.mongodb.client.MongoCollection;
import org.example.usersinfoproject.services.MongoService;

public abstract class BaseDao<T> {
    protected static MongoService mongoService = new MongoService();

    public abstract MongoCollection<T> getCollection();
}
