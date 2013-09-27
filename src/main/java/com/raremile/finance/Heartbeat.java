package com.raremile.finance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.raremile.finance.pojo.RmResponse;

@Path("/heartbeat")
public class Heartbeat {

	@GET
	@Path("/ping/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg() {

		RmResponse rmResponse = new RmResponse();
		rmResponse.setStatus("sucess");
		rmResponse.setData("I am alive!!");
		Gson gson = new Gson();
		return Response.status(200).entity(gson.toJson(rmResponse)).build();

	}


	@GET
	@Path("/mongo/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMongoMsg() {

		RmResponse rmResponse = new RmResponse();
		Response response = null;
		Gson gson = new Gson();

		try {
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			DB db = mongo.getDB("fmfinance");
			DBCollection table = db.getCollection("user");
			rmResponse.setStatus("sucess");
			rmResponse.setData("Mongo is also alive!! " + table.count());
			response =  Response.status(200).entity(gson.toJson(rmResponse)).build();
		} catch (Exception e) {

			rmResponse.setStatus("faluire");
			rmResponse.setData("Mongo is dead :-(");
			response =  Response.status(500).entity(gson.toJson(rmResponse)).build();
		}

		return response;

	}

}
