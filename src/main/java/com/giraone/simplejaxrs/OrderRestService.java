package com.giraone.simplejaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/orders")
@Interceptors(LoggingInterceptor.class)
public class OrderRestService
{
	private static final ArrayList<Order> ORDERS = new ArrayList<Order>();

	static
	{
		ORDERS.add(new Order(1, 4711));
		ORDERS.add(new Order(2, 4712));
	}
	
	@GET
	@Produces({ "application/xml", "application/json" })
	public List<Order> orders()
	{
		return ORDERS;
	}
}