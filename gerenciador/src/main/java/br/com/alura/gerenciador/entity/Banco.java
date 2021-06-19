package br.com.alura.gerenciador.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<Empresa>();

	public void adicionar(Empresa empresa) {
		empresas.add(empresa);
	}

	static {
		
		Empresa empresa = new Empresa("Google");
		Empresa empresa2 = new Empresa("Alura");
		Empresa empresa3 = new Empresa("Caelum");
		
		empresas.add(empresa);
		empresas.add(empresa2);
		empresas.add(empresa3);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Collections.unmodifiableList(empresas);
	}
}
