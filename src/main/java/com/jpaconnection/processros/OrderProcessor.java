package com.jpaconnection.processros;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import com.jpaconnection.classes.Order;

public class OrderProcessor implements Processor{
	final static Logger log = Logger.getLogger(OrderProcessor.class);
	
	@Override
	public void process(Exchange ex) throws Exception {
		Order orderJPA = ex.getIn().getBody(Order.class);
		
		com.jpaconnection.dataformater.Order order = new com.jpaconnection.dataformater.Order();
		
		order.setId(Integer.toString(orderJPA.getId()));
		order.setName(orderJPA.getName());
		order.setCountry(orderJPA.getCountry());
		order.setTotal(orderJPA.getTotal());
		order.setAccepted(orderJPA.getAccepted());
		order.setItemsQuantity(Integer.toString(orderJPA.getItemsQuantity()));
		order.setComments(orderJPA.getComments());
		
		ex.getIn().setHeader("orderId", order.getId());
		
		ex.getIn().setBody(order);
		
	}

}
