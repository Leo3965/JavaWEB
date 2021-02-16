package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listaEmpresas
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaEmpresas() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><ul>");
		empresas.forEach(e -> out.println("<li>" + e.getNome() + "</li>"));
		out.println("</ul></body></html>");
		
	}

}
