//package demo;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
///**
// * Created by 154400m on 11/14/2016.
// */
//
//
//@Path("/Hi")
//public class Hi {
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getMessage() {
//        return "Hi World!";
//    }
//}
package demo;
        import javax.ws.rs.*;
        import javax.ws.rs.core.*;

@Path("/Hi")
public class Hi {
    @GET
    @Produces(MediaType.TEXT_XML)
    public String getMessage() {
        return "<Hi>Hi World!</Hi>";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPlainMessage() {
        return "Hi World!";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHTMLMessage() {
        return "<b>Hi World!</b>";
    }
}