package edu.escuelaing.arep.app;

import org.json.JSONObject;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
   private static Calculadora cal = new Calculadora();
    public static void main( String[] args )
    {
        port(getPort());
        get("/ln",(req,res) -> inputAnswer(req,res,"ln"));
        get("/atan", (req,res) -> inputAnswer(req,res,"atan"));
    }

    private static JSONObject inputAnswer(Request req, Response res, String operacion) {
        double num = Double.parseDouble(req.queryParams("value"));
        JSONObject ans = new JSONObject();
        ans.put("operation",operacion);
        ans.put("number", num);
        ans.put("answer", (operacion.equals("ln"))? cal.ln(num):cal.atan(num));
        return ans;
    }

    static int getPort() {
       if (System.getenv("PORT") != null) {
           return Integer.parseInt(System.getenv("PORT"));
       }
       return 4567;
    }
}
