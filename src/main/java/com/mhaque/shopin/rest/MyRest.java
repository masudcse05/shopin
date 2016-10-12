/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhaque.shopin.rest;

import com.mhaque.shopin.model.Member;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author masud
 */
@Path(value = "my_rest")
public class MyRest {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Member> test(){
        List<Member> list = new ArrayList<>();
        list.add(new Member());
        list.add(new Member());
        list.add(new Member());
        list.add(new Member());
        return list;//"<html lang=\"en\"><body><h1>Hello, World!!</h1></body></html>";
    }
    
}
