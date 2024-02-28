package boundary;

import entity.User;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.eclipse.microprofile.jwt.JsonWebToken;
import org.jboss.resteasy.reactive.NoCache;

import io.quarkus.security.identity.SecurityIdentity;

@Path("/api/user")
public class UserResource {

    @Inject
    SecurityIdentity identity;

    @Inject
    JsonWebToken jwt;

    @GET
    @NoCache
    public User me() {

        return new User(identity);
    }
}
