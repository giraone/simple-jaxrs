package com.giraone.simplejaxrs;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Order
{
	private long id;
	private int amount;
	private int productId;
	private boolean delivered;

	public Order()
	{
	}

	public Order(int amount, int productId)
	{
		this.amount = amount;
		this.productId = productId;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public int getProductId()
	{
		return productId;
	}

	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	public boolean isDelivered()
	{
		return delivered;
	}

	public void setDelivered(boolean delivered)
	{
		this.delivered = delivered;
	}
}