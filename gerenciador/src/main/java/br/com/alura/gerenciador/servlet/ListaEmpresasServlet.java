package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.alura.gerenciador.entity.Banco;
import br.com.alura.gerenciador.entity.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListaEmpresasServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<ul>");
		
		for (Empresa e : empresas) {
			out.println("<li>" + e.getNome() + "</li>");
		}
		
		out.println("</ul>");
		out.println("</html>");
		
	}

}
