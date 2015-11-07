<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar</title>
<link rel="stylesheet" type="text/css" href="formatocss.css"/>
</head>
<body>

	<form action="FachadaEstudiante?opc=modificar" id="frm" name="frm" onsubmit="return validar()" method="post">

		<table border="0" width="450" align="center">
			<tr>
				<td colspan="2">
					<H3 align="center">Modificar Estudiante</H3>
				</td>
			</tr>

			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>

			<tr>
				<td>Carnet</td>
				<td><input text="text" id="carnet" name="carnet" readonly="readonly" value="${estudiantes.carnet}" required
					placeholder="Carnet" autofocus /></td>
			</tr>
			<tr>
				<td>Nombre</td>
				<td><input text="text" id="nombre" name="nombre" value="${estudiantes.nombre}"required
					placeholder="Nombre" /></td>
			</tr>
			<tr>
				<td>Facultad</td>
				<td><input text="text" id="facultad" name="facultad" value="${estudiantes.facultad}" required
					placeholder="Facultad" /></td>
			</tr>
			<tr>
				<td>Semestre</td>
				<td><input text="text" id="semestre" name="semestre" value="${estudiantes.semestre}"required
					placeholder="Semestre" /></td>
			</tr>
			<tr>
				<td>Materia</td>
				<td><input text="text" id="materia" name="materia" value="${estudiantes.materia}"required
					placeholder="Materia" /></td>
			</tr>
			<tr>
				<td>Primer Parcial</td>
				<td><input text="text" id="pacialI" name="parcialI" value="${estudiantes.parcialI}"required
					placeholder="Primer Parcial" /></td>
			</tr>
			<tr>
				<td>Segundo Parcial</td>
				<td><input text="text" id="parcialII" name="parcialII" value="${estudiantes.parcialII}" required
					placeholder="Segundo Parcial" /></td>
			</tr>
			<tr>
				<td>Primera Nota</td>
				<td><input text="text" id="notaI" name="notaI" value="${estudiantes.notaI}" required
					placeholder="Primera Nota" /></td>
			</tr>
			<tr>
				<td>Segunda Nota</td>
				<td><input text="text" id="notaII" name="notaII" value="${estudiantes.notaII}" required
					placeholder="Segunda Nota" /></td>
			</tr>
			<tr>
				<td>Tercera Nota</td>
				<td><input text="text" id="notaIII" name="notaIII" value="${estudiantes.notaII}"  required
					placeholder="Tercera Nota" /></td>
			</tr>
			<tr>
				<td>Coevaluacion</td>
				<td><input text="text" id="coevaluacion" name="coevaluacion" value="${estudiantes.coevaluacion}" 
					required placeholder="Coevaluacion" /></td>
			</tr>
			<tr>
				<td>Final</td>
				<td><input text="text" id="final" name="final" value="${estudiantes.finall}"  required
					placeholder="Final" /></td>
			</tr>

  			<tr>
				<td>Definitiva</td>
				<td><input text="text" id="definitiva" name="definitiva" disabled="disabled" value="${estudiantes.definitiva}" /></td>
			</tr>  

			<tr>
				<td>Observaciones</td>
				<td><input text="text" id="observacion" name="observacion" value="${estudiantes.observacion}" 
					required placeholder="Observaciones" /></td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Guardar" /> </td>
			</tr>


		</table>


	</form>

</body>
</html>