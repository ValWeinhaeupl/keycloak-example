package boundary;

import io.quarkus.security.Authenticated;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/teachers")
@Authenticated
public class TeacherResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String teachers() {
        return "granted";
    }
}
