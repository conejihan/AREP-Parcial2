/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.arep.app.parcial2arep;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import spark.Request;

/**
 *
 * @author nicolas.medina-va
 */
public class HttpClient {
    String url="ec2-52-207-225-209.compute-1.amazonaws.com";
    String port="4567";
    public String getAnswerLn(Request req) throws UnirestException{
        HttpResponse<String> apiRes = Unirest.get(url+port+"/ln"+req.queryParams("value")).asString();
        System.out.println("Peticion de"+url+port);
        return apiRes.getBody();
    }
    public String getAnswerAtan(Request req) throws UnirestException{
        HttpResponse<String> apiRes = Unirest.get(url+port+"/atan"+req.queryParams("value")).asString();
        System.out.println("Peticion de"+url+port);
        return apiRes.getBody();
    }
}
