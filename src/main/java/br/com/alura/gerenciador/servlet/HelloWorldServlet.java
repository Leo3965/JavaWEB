package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Hello
@WebServlet(urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1494927739854334905L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello Word");
		out.println("</body>");
		out.println("</html>");

	}

}
