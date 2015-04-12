package com.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;

import com.DTO.ResponseDTO;
import com.hibernate.HibernateConnector;
import com.hibernate.confidenceFactor.ConfidenceCalculator;
import com.prolog.CropSerachPOJO;
import com.prolog.JPLDataAccessorObject;
import jpl.*;

@Path("/agro")
public class SimpleRestService {

	
	private static final Logger logger = Logger.getLogger(SimpleRestService.class);

	@GET
	@Path("/placeSearch/{crop}/{subCrop}")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Object getSomething
			( @DefaultValue("1") @QueryParam("version") int version,
			 @PathParam("crop") String cropstring,
			 @PathParam("subCrop") String subCropString) {

		String request=subCropString+","+cropstring;
		//if (logger.isDebugEnabled()) {
			logger.debug("Start getSomething");
			logger.debug("data: '" + request + "'");
			logger.debug("version: '" + version + "'");
		//}

		ResponseDTO response = new ResponseDTO();

        try{		
        	String target=request;
        	JPLDataAccessorObject dataAccessorObject=new JPLDataAccessorObject();
            response= dataAccessorObject.assign(target);
            ConfidenceCalculator calculator=new ConfidenceCalculator();
            response=calculator.calculate(target,response);
        }
        catch(Exception e){
        	response .setError( e.getMessage().toString());
        }
        
//        if(logger.isDebugEnabled()){
            logger.info("result: '"+response+"'");
            logger.info("End getSomething");
//        }
        return Response.ok().entity(response).build();	
	}

	@GET
	@Path("/cropSearch/{place}/{area}/{year}")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Object postSomething(@PathParam("place") String place , 
			@PathParam("area") String area,
			@PathParam("year") String year) {

		//if (logger.isDebugEnabled()) {
			logger.debug("Start postSomething");
			logger.debug("data: '" + place + "'");
			logger.debug("version: '" + area + "'");
		//}

		CropSerachPOJO response = new CropSerachPOJO();

		JPLDataAccessorObject accessorObject=new JPLDataAccessorObject();
        
		response.setPlace(accessorObject.assignMod(place, area, year));
     //   if(logger.isDebugEnabled()){
            logger.debug("result: '"+response+"'");
            logger.debug("End postSomething");
     //   }
        
        return Response.ok().entity(response).build();	
	}

	@PUT
	@Path("/<add method name here>")
    @Produces(MediaType.TEXT_PLAIN)
	public String putSomething(@FormParam("request") String request ,  @DefaultValue("1") @FormParam("version") int version) {
		if (logger.isDebugEnabled()) {
			logger.debug("Start putSomething");
			logger.debug("data: '" + request + "'");
			logger.debug("version: '" + version + "'");
		}

		String response = null;

        try{			
            switch(version){
	            case 1:
	                if(logger.isDebugEnabled()) logger.debug("in version 1");

	                response = "Response from Jersey Restful Webservice : " + request;
                    break;
                default: throw new Exception("Unsupported version: " + version);
            }
        }
        catch(Exception e){
        	response = e.getMessage().toString();
        }
        
        if(logger.isDebugEnabled()){
            logger.debug("result: '"+response+"'");
            logger.debug("End putSomething");
        }
        return response;	
	}

	@DELETE
	@Path("/<add method name here>")
	public void deleteSomething(@FormParam("request") String request ,  @DefaultValue("1") @FormParam("version") int version) {
		
		if (logger.isDebugEnabled()) {
			logger.debug("Start deleteSomething");
			logger.debug("data: '" + request + "'");
			logger.debug("version: '" + version + "'");
		}


        try{			
            switch(version){
	            case 1:
	                if(logger.isDebugEnabled()) logger.debug("in version 1");

                    break;
                default: throw new Exception("Unsupported version: " + version);
            }
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        
        if(logger.isDebugEnabled()){
            logger.debug("End deleteSomething");
        }
	}
}
