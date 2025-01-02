package kr.co.greenart.server;

import java.io.IOException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/", "/index", "/server/status"})
public class ServerStatusServlet extends HttpServlet {
	private final DBStatusService service = new DBStatusServiceImpl(); //
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LocalDateTime serverTime = LocalDateTime.now();
		
		// 생성문; 클레스이름으로 생성자호출
		//DBStatusService service = new DBStatusServiceImpl();//ServerStatusServlet 사용되는 객체로 있었으면함
		LocalDateTime dbTime = service.selectDbTime();
		
		req.setAttribute("serverTime", serverTime);
		req.setAttribute("dbTime", dbTime);//리퀘스트 속성으로 db타입이랑 속성이름 전달
		req.getRequestDispatcher("/WEB-INF/views/serverStatus.jsp")
			.forward(req, resp);
	}
}




