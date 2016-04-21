package com.giraone.simplejaxrs;

import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * Interceptor to log the REST calls.
 */
public class LoggingInterceptor
{
	private Logger logger = Logger.getLogger(LoggingInterceptor.class.getName());

	@AroundInvoke
	public Object log(InvocationContext ic) throws Exception
	{
		logger.info("#" + ic.getMethod().toString());
		return ic.proceed();
	}
}