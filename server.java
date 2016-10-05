import spark.ModelAndView;
import java.util.HashMap;
import java.util.Map;


import static spark.Spark.*;


public class ApiServer {
    
    public static void main(Stringp[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("message", "Hello World!");
        
        get("/hello", "application/json", (request, response) -> {
                return new MyMessage("Hello World");
        }, new ApiServer());
    }

}