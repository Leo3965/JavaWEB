package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.alura.gerenciador.entity.Banco;
import br.com.alura.gerenciador.entity.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NovaEmpresaServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa(nomeEmpresa);
		Banco banco = new Banco();
		banco.adicionar(empresa);

		PrintWriter out = response.getWriter();

		//Chamar Java Server Page
		
		request.setAttribute("empresa", empresa.getNome());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/novemEmpresaCriada.jsp");
		dispatcher.forward(request, response);

	}

}
