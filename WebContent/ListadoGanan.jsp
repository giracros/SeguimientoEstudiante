<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ganan</title>
<link rel="stylesheet" type="text/css" href="formatocss.css"/>
</head>
<body>
	<table width="500" border="0" align="center">
		<thead>
			<tr>
				<td colspan="14" align="center">Estudiantes que Ganan</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>Carnet</td>
				<td>Nombre</td>
				<td>Facultad</td>
				<td>Semestre</td>
				<td>Materia</td>
				<td>Primer Parcial</td>
				<td>Segundo Parcial</td>
				<td>Primera Nota</td>
				<td>Segunda Nota</td>
				<td>Tercera Nota</td>
				<td>Coevaluacion</td>
				<td>Final</td>
				<td>Definitiva</td>
				<td>Observaciones</td>



			</tr>
		</thead>
		<tbody>
			<c:forEach items="${estudiantesG}" var="lestudiantes">
				<tr>
					<td>&nbsp;<c:out value="${lestudiantes.carnet}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.nombre}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.facultad}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.semestre}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.materia}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.parcialI}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.parcialII}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.notaI}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.notaII}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.notaIII}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.coevaluacion}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.finall}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.definitiva}" /></td>
					<td>&nbsp;<c:out value="${lestudiantes.observacion}" /></td>
					<td>&nbsp;<a
						href="FachadaEstudiante?opc=eliminar&carnet=<c:out value="${lestudiantes.carnet}"/>">Eliminar</a></td>
					<td>&nbsp;<a
						href="FachadaEstudiante?opc=consultar&carnet=<c:out value="${lestudiantes.carnet}"/>">Modificar</a></td>
				</tr>
			</c:forEach>						<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2"><a href="Index.jsp">Home</a></td>
			</tr>
		</tbody>

	</table>
</body>
</html>