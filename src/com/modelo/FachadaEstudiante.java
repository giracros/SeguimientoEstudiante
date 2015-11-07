package com.modelo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.EstudianteDAO;

/**
 * Servlet implementation class FachadaEstudiante
 */
@WebServlet("/FachadaEstudiante")
public class FachadaEstudiante extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */

	private EstudianteDTO estudiante;
	private EstudianteDAO estudianteDAO;
	private static final String LISTARGENERAL = "/ListadoGeneral.jsp";
	private static final String LISTARGANAN = "/ListadoGanan.jsp";
	private static final String LISTARHABILITAN = "/ListadoHabilitan.jsp";
	private static final String LISTARPIERDEN = "/ListadoPierden.jsp";

	private static final String MODIFICAR = "/ModificarEstudiante.jsp";

	public FachadaEstudiante() {
		super();
		estudiante = new EstudianteDTO();
		estudianteDAO = new EstudianteDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opc = request.getParameter("opc");
		/* String opcc = request.getParameter("opcc"); */
		String accion = null;
		if (opc.equalsIgnoreCase("listadogeneral")) {
			try {
				accion = LISTARGENERAL;
				request.setAttribute("estudiantes", estudianteDAO.listadogeneral());

			} catch (Exception e) {
				System.out.print("Error en listar!!!" + e);
			}
		}

		else if (opc.equalsIgnoreCase("listadoganan")) {
			try {
				accion = LISTARGANAN;
				request.setAttribute("estudiantesG", estudianteDAO.listadoganan());

			} catch (Exception e) {
				System.out.print("Error en listar!!!" + e);
			}
		}

		else if (opc.equalsIgnoreCase("listadohabilitan")) {
			try {
				accion = LISTARHABILITAN;
				request.setAttribute("estudiantesH", estudianteDAO.listadohabilitan());

			} catch (Exception e) {
				System.out.print("Error en listar!!!" + e);
			}
		}

		else if (opc.equalsIgnoreCase("listadopierden")) {
			try {
				accion = LISTARPIERDEN;
				request.setAttribute("estudiantesP", estudianteDAO.listadopierden());

			} catch (Exception e) {
				System.out.print("Error en listar!!!" + e);
			}
		}

		else if (opc.equalsIgnoreCase("eliminar")) {
			String carnet = request.getParameter("carnet");
			estudianteDAO.eliminar(carnet);
			accion = LISTARGENERAL;
			request.setAttribute("estudiantes", estudianteDAO.listadogeneral());

		} else if (opc.equalsIgnoreCase("consultar")) {
			String carnet = request.getParameter("carnet");
			request.setAttribute("estudiantes", estudianteDAO.consultar(carnet));
			accion = MODIFICAR;
		} else
			accion = "modificar";

		try {
			RequestDispatcher view = request.getRequestDispatcher(accion);
			view.forward(request, response);
		} catch (Exception e) {
			System.out.print("Genero un error al listar la opcion de refrescar:::    " + e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String opc = request.getParameter("opc");
		estudiante.setCarnet(request.getParameter("carnet"));
		estudiante.setNombre(request.getParameter("nombre"));
		estudiante.setFacultad(request.getParameter("facultad"));
		estudiante.setSemestre(request.getParameter("semestre"));
		estudiante.setMateria(request.getParameter("materia"));
		estudiante.setParcialI(request.getParameter("parcialI"));
		estudiante.setParcialII(request.getParameter("parcialII"));
		estudiante.setNotaI(request.getParameter("notaI"));
		estudiante.setNotaII(request.getParameter("notaII"));
		estudiante.setNotaIII(request.getParameter("notaIII"));
		estudiante.setCoevaluacion(request.getParameter("coevaluacion"));
		estudiante.setFinall(request.getParameter("final"));
		estudiante.setDefinitiva(request.getParameter("definitiva"));
		estudiante.setObservacion(request.getParameter("observacion"));
		if (opc.equals("insertar"))
			try {
				estudianteDAO.insertar(estudiante);
				// Para que cada se invoque insertar llame listar

			} catch (Exception e) {
				System.out.print("Error en insertar!!!" + e);
			}
		else if (opc.equals("eliminar")) {
			try {
				estudianteDAO.eliminar("carnet");
			} catch (Exception e) {
				System.out.print("Error al eliminar!!!" + e);
			}
		} else if (opc.equals("modificar")) {

			estudianteDAO.modificar(estudiante);
			// Para que cada se invoque insertar llame listar

		}
		RequestDispatcher view = request.getRequestDispatcher(LISTARGENERAL);
		request.setAttribute("estudiantes", EstudianteDAO.listadogeneral());
		view.forward(request, response);
	}

}
