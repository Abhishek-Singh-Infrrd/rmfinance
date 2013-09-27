package com.raremile.finance;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/credit")
public class CreditTransaction {



	@POST
	@Path("/creditcardtrans")
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateCCTransaction(final CreditTransaction data) {

		System.out.println(data);


	}

}
