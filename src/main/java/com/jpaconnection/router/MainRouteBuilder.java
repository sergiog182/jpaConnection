package com.jpaconnection.router;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;

import com.jpaconnection.processros.*;

public class MainRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		DataFormat jaxb = new JaxbDataFormat("com.jpaconnection.dataformater");
		
		from("jpa:com.jpaconnection.classes.Order?persistenceUnit=mysql&consumer.namedQuery=Order.findAll")
		.split(body())
		.process(new OrderProcessor())
		.marshal(jaxb)
		.toD("file:files/outgoing?fileName=order_${headers.orderId}.xml&fileExist=append");
	}
	
}
