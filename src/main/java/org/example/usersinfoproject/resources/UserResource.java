package org.example.usersinfoproject.resources;

import org.example.usersinfoproject.dao.UserDao;
import org.example.usersinfoproject.heplers.UserResourceHelper;
import org.example.usersinfoproject.models.APIResponse;
import org.example.usersinfoproject.models.User;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserResource {
    private static final UserDao userDao = new UserDao();
    private static final UserResourceHelper userResourceHelper = new UserResourceHelper();

    @PUT
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    private Response createUser(@Valid User user) {
        APIResponse response = new APIResponse();
        try {
            response = userResourceHelper.createUser(user);
            return Response.ok().entity(response).build();
        } catch (Exception e) {
            e.printStackTrace();
            response.setMessage("not created");
            response.setStatus(1);
            return Response.status(Response.Status.BAD_REQUEST).entity(response).build();
        }
    }
}
