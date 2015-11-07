<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario Estudiante</title>
<link rel="stylesheet" type="text/css" href="formatocss.css"/>
<script type="text/javascript" src="validacion.js"></script>
</head>
<body>

	<form action="FachadaEstudiante?opc=insertar" id="frm" name="frm" onsubmit="return validar()" method="post">

		<table border="0" width="450" align="center">
			<tr>
				<td colspan="2">
					<H3 align="center">Ingreso Estudiante</H3>
				</td>
			</tr>

			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>

			<tr>
				<td>Carnet</td>
				<td><input text="text" id="carnet" name="carnet" required
					placeholder="Carnet" autofocus /></td>
			</tr>
			<tr>
				<td>Nombre</td>
				<td><input text="text" id="nombre" name="nombre" required
					placeholder="Nombre" /></td>
			</tr>
			<tr>
				<td>Facultad</td>
				<td><input text="text" id="facultad" name="facultad" required
					placeholder="Facultad" /></td>
			</tr>
			<tr>
				<td>Semestre</td>
				<td><input text="text" id="semestre" name="semestre" required
					placeholder="Semestre" /></td>
			</tr>
			<tr>
				<td>Materia</td>
				<td><input text="text" id="materia" name="materia" required
					placeholder="Materia" /></td>
			</tr>
			<tr>
				<td>Primer Parcial</td>
				<td><input text="text" id="pacialI" name="parcialI" required
					placeholder="Primer Parcial" /></td>
			</tr>
			<tr>
				<td>Segundo Parcial</td>
				<td><input text="text" id="parcialII" name="parcialII" required
					placeholder="Segundo Parcial" /></td>
			</tr>
			<tr>
				<td>Primera Nota</td>
				<td><input text="text" id="notaI" name="notaI" required
					placeholder="Primera Nota" /></td>
			</tr>
			<tr>
				<td>Segunda Nota</td>
				<td><input text="text" id="notaII" name="notaII" required
					placeholder="Segunda Nota" /></td>
			</tr>
			<tr>
				<td>Tercera Nota</td>
				<td><input text="text" id="notaIII" name="notaIII" required
					placeholder="Tercera Nota" /></td>
			</tr>
			<tr>
				<td>Coevaluacion</td>
				<td><input text="text" id="coevaluacion" name="coevaluacion"
					required placeholder="Coevaluacion" /></td>
			</tr>
			<tr>
				<td>Final</td>
				<td><input text="text" id="final" name="final" required
					placeholder="Final" /></td>
			</tr>

  			<tr>
				<td>Definitiva</td>
				<td><input text="text" id="definitiva" name="definitiva" disabled="disabled"/></td>
			</tr>  

			<tr>
				<td>Observaciones</td>
				<td><input text="text" id="observacion" name="observacion"
					required placeholder="Observaciones" /></td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Guardar" /> <input type="reset" value="Limpiar" /></td>
			</tr>


		</table>


	</form>

</body>
</html>