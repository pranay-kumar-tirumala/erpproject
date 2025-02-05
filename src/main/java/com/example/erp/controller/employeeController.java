package com.example.erp.controller;

import com.example.erp.bean.employee;
import com.example.erp.service.employeeService;
import com.example.erp.utils.AddingData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("employee")
public class employeeController
{
    employeeService employeeService = new employeeService();

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDepartments() {
        List<String> departments = new ArrayList<>();
        departments.add("IT");
        departments.add("Management");
        departments.add("Admission");
        departments.add("outreach");
        departments.add("Library");
        return Response.ok().entity(departments).build();
    }

    @POST
    @Path("/add")
    public Response addEmployee() throws URISyntaxException{
        //employeeService.addEmployee();  => dont remove this.
        AddingData addingData = new AddingData();
        addingData.add();
        return Response.ok().build();
    }

    @POST
    @Path("/login")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response loginStudent(employee emp) throws URISyntaxException {
        if(employeeService.verifyEmail(emp)){
            return Response.ok().build();
        }else{
            return Response.status(203).build();
        }
    }

    @GET
    @Path("/options")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOptions() {
        List<String> options = new ArrayList<>();
        options.add("Placed");
        options.add("Not Placed");
        options.add("Organisation");
        options.add("Year");
        options.add("Domain");
        options.add("Specialisation");
        return Response.ok().entity(options).build();
    }

}
