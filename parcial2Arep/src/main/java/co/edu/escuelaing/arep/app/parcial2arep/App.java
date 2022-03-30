/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.arep.app.parcial2arep;

/**
 *
 * @author nicolas.medina-va
 */

import static spark.Spark.*;
public class App {
    public static void main( String[] args )
    {
        port(getPort());
        HttpClient client = new HttpClient();
        get("/ln",(req,res) -> {
        String resp = client.getAnswerLn(req);
        return resp;}
        );
        get("/atan", (req,res) -> { 
        String resp = client.getAnswerAtan(req);
        return resp;
        });
    }


    static int getPort() {
       if (System.getenv("PORT") != null) {
           return Integer.parseInt(System.getenv("PORT"));
       }
       return 5000;
    }
}