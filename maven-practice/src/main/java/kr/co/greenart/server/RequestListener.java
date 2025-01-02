package kr.co.greenart.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServletRequest;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {
	private static final Logger log
		= LoggerFactory.getLogger(RequestListener.class);
	
	@Override //속성값이 잘 정의되고있는지..
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		String attrName = srae.getName();
		Object attrValue = srae.getValue();
		
		log.info("{} : {} added", attrName, attrValue.toString());
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		
		String uri = req.getRequestURI();
		String method = req.getMethod();
		
		String logMessage = String.format("%s %s", uri, method);
		
//		System.out.println(log);
		
		log.info(logMessage);
	}
}




