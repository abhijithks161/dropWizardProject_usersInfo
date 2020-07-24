package org.example.usersinfoproject.heplers;

import org.example.usersinfoproject.dao.UserDao;
import org.example.usersinfoproject.models.APIResponse;
import org.example.usersinfoproject.models.User;

import java.util.Date;

public class UserResourceHelper {
    private static final UserDao userDao = new UserDao();

    public APIResponse createUser(User user) {
        APIResponse response = new APIResponse();
        user.setCreatedAt(new Date());
        userDao.create(user);
        response.setStatus(0);
        response.setMessage("created");
        return response;
    }
}
