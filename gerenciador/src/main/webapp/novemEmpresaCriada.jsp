<%
	String nomeEmpresa2 = "Alura";
	String nomeEmpresa = (String) request.getAttribute("empresa");
%>
<! -- Scriplet -->

<html>

	<body>
		<!-- atalho = nomeEmpresa ao invez de ut.println(nomeEmpresa); -->>
		Empresa <%out.println(nomeEmpresa);%> cadastrada com sucesso!
	</body>
	
</html>

<! -- java server page - JSP -->