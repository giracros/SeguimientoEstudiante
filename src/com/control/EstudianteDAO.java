package com.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conexion.ConexionDB;
import com.modelo.EstudianteDTO;

public class EstudianteDAO {

	public static void insertar(EstudianteDTO estudiante) {
		Connection con = ConexionDB.getConnection();

		try {
			PreparedStatement registroEstudiante = con
					.prepareStatement("call SP_InsertarEstudiante (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			registroEstudiante.setString(1, estudiante.getCarnet());
			registroEstudiante.setString(2, estudiante.getNombre());
			registroEstudiante.setString(3, estudiante.getFacultad());
			registroEstudiante.setString(4, estudiante.getSemestre());
			registroEstudiante.setString(5, estudiante.getMateria());
			registroEstudiante.setString(6, estudiante.getParcialI());
			registroEstudiante.setString(7, estudiante.getParcialII());
			registroEstudiante.setString(8, estudiante.getNotaI());
			registroEstudiante.setString(9, estudiante.getNotaII());
			registroEstudiante.setString(10, estudiante.getNotaIII());
			registroEstudiante.setString(11, estudiante.getCoevaluacion());
			registroEstudiante.setString(12, estudiante.getFinall());
			registroEstudiante.setString(13, estudiante.getDefinitiva());
			registroEstudiante.setString(14, estudiante.getObservacion());
			registroEstudiante.setString(15, "Activo");
			registroEstudiante.executeUpdate();

			System.out.print("Registro quedo almacenado en la DB");

		} catch (SQLException e) {

			System.out.println("No Inserto Mostrico!" + e);
		}

	}

	public static ArrayList<EstudianteDTO> listadogeneral() {
		ArrayList<EstudianteDTO> estudiantes = new ArrayList<EstudianteDTO>();
		Connection cnn = ConexionDB.getConnection();
		EstudianteDTO estudiante;
		try {
			PreparedStatement registroEstudiante = cnn.prepareStatement("call SP_ListadoGeneral()");
			ResultSet rs = registroEstudiante.executeQuery();
			while (rs.next()) {
				estudiante = new EstudianteDTO();
				estudiante.setCarnet(rs.getString("carnet"));
				estudiante.setNombre(rs.getString("nombre"));
				estudiante.setFacultad(rs.getString("facultad"));
				estudiante.setSemestre(rs.getString("semestre"));
				estudiante.setMateria(rs.getString("materia"));
				estudiante.setParcialI(rs.getString("parcialI"));
				estudiante.setParcialII(rs.getString("parcialII"));
				estudiante.setNotaI(rs.getString("notaI"));
				estudiante.setNotaII(rs.getString("notaII"));
				estudiante.setNotaIII(rs.getString("notaIII"));
				estudiante.setCoevaluacion(rs.getString("coevaluacion"));
				estudiante.setFinall(rs.getString("final"));
				estudiante.setDefinitiva(rs.getString("definitiva"));
				estudiante.setObservacion(rs.getString("observacion"));
				estudiantes.add(estudiante);
			}
		} catch (SQLException e) {
			System.out.print("Ocurrio un Error cuando trataba de listar los estudiantes" + e);
		}
		return estudiantes;

	}

	public static ArrayList<EstudianteDTO> listadoganan() {
		ArrayList<EstudianteDTO> estudiantesGanan = new ArrayList<EstudianteDTO>();
		Connection cnn = ConexionDB.getConnection();
		EstudianteDTO estudianteGana;
		try {
			PreparedStatement registroEstudiante = cnn.prepareStatement("call SP_Listado_Ganan()");
			ResultSet rs = registroEstudiante.executeQuery();
			while (rs.next()) {
				estudianteGana = new EstudianteDTO();
				estudianteGana.setCarnet(rs.getString("carnet"));
				estudianteGana.setNombre(rs.getString("nombre"));
				estudianteGana.setFacultad(rs.getString("facultad"));
				estudianteGana.setSemestre(rs.getString("semestre"));
				estudianteGana.setMateria(rs.getString("materia"));
				estudianteGana.setParcialI(rs.getString("parcialI"));
				estudianteGana.setParcialII(rs.getString("parcialII"));
				estudianteGana.setNotaI(rs.getString("notaI"));
				estudianteGana.setNotaII(rs.getString("notaII"));
				estudianteGana.setNotaIII(rs.getString("notaIII"));
				estudianteGana.setCoevaluacion(rs.getString("coevaluacion"));
				estudianteGana.setFinall(rs.getString("final"));
				estudianteGana.setDefinitiva(rs.getString("definitiva"));
				estudianteGana.setObservacion(rs.getString("observacion"));
				estudiantesGanan.add(estudianteGana);
			}
		} catch (SQLException e) {
			System.out.print("Ocurrio un Error cuando trataba de listar los estudiantes que Ganaron" + e);
		}
		return estudiantesGanan;

	}

	public static ArrayList<EstudianteDTO> listadohabilitan() {
		ArrayList<EstudianteDTO> estudiantesHabilitan = new ArrayList<EstudianteDTO>();
		Connection cnn = ConexionDB.getConnection();
		EstudianteDTO estudianteHabilita;
		try {
			PreparedStatement registroEstudiante = cnn.prepareStatement("call SP_ListadoHabilitan()");
			ResultSet rs = registroEstudiante.executeQuery();
			while (rs.next()) {
				estudianteHabilita = new EstudianteDTO();
				estudianteHabilita.setCarnet(rs.getString("carnet"));
				estudianteHabilita.setNombre(rs.getString("nombre"));
				estudianteHabilita.setFacultad(rs.getString("facultad"));
				estudianteHabilita.setSemestre(rs.getString("semestre"));
				estudianteHabilita.setMateria(rs.getString("materia"));
				estudianteHabilita.setParcialI(rs.getString("parcialI"));
				estudianteHabilita.setParcialII(rs.getString("parcialII"));
				estudianteHabilita.setNotaI(rs.getString("notaI"));
				estudianteHabilita.setNotaII(rs.getString("notaII"));
				estudianteHabilita.setNotaIII(rs.getString("notaIII"));
				estudianteHabilita.setCoevaluacion(rs.getString("coevaluacion"));
				estudianteHabilita.setFinall(rs.getString("final"));
				estudianteHabilita.setDefinitiva(rs.getString("definitiva"));
				estudianteHabilita.setObservacion(rs.getString("observacion"));
				estudiantesHabilitan.add(estudianteHabilita);
			}
		} catch (SQLException e) {
			System.out.print("Ocurrio un Error cuando trataba de listar los estudiantes que Habilitaron" + e);
		}
		return estudiantesHabilitan;

	}

	public static ArrayList<EstudianteDTO> listadopierden() {
		ArrayList<EstudianteDTO> estudiantesPierden = new ArrayList<EstudianteDTO>();
		Connection cnn = ConexionDB.getConnection();
		EstudianteDTO estudiantePierde;
		try {
			PreparedStatement registroEstudiante = cnn.prepareStatement("call SP_ListadoPierde()");
			ResultSet rs = registroEstudiante.executeQuery();
			while (rs.next()) {
				estudiantePierde = new EstudianteDTO();
				estudiantePierde.setCarnet(rs.getString("carnet"));
				estudiantePierde.setNombre(rs.getString("nombre"));
				estudiantePierde.setFacultad(rs.getString("facultad"));
				estudiantePierde.setSemestre(rs.getString("semestre"));
				estudiantePierde.setMateria(rs.getString("materia"));
				estudiantePierde.setParcialI(rs.getString("parcialI"));
				estudiantePierde.setParcialII(rs.getString("parcialII"));
				estudiantePierde.setNotaI(rs.getString("notaI"));
				estudiantePierde.setNotaII(rs.getString("notaII"));
				estudiantePierde.setNotaIII(rs.getString("notaIII"));
				estudiantePierde.setCoevaluacion(rs.getString("coevaluacion"));
				estudiantePierde.setFinall(rs.getString("final"));
				estudiantePierde.setDefinitiva(rs.getString("definitiva"));
				estudiantePierde.setObservacion(rs.getString("observacion"));
				estudiantesPierden.add(estudiantePierde);
			}
		} catch (SQLException e) {
			System.out.print("Ocurrio un Error cuando trataba de listar los estudiantes que Perdieron" + e);
		}
		return estudiantesPierden;

	}

	public static void eliminar(String carnet) {
		Connection cnn = ConexionDB.getConnection();
		try {
			PreparedStatement eliminarEstudiante = cnn.prepareStatement("call SP_EliminiarEstudiante(?)");
			eliminarEstudiante.setString(1, carnet);
			eliminarEstudiante.executeUpdate();
			
			System.out.print("Registro eliminado ");
			
		} catch (SQLException e) {
			
			System.out.println("No elimino Mostrico!!" + e);
		}
	}

	public EstudianteDTO consultar(String carnet) {
		
		Connection cnn = ConexionDB.getConnection();
		EstudianteDTO estudiante = new EstudianteDTO();
		
		try {
			PreparedStatement registroEstudiante = cnn.prepareStatement("call SP_ConsultarEstudiantesActivos (?)");
			registroEstudiante.setString(1, carnet);
			ResultSet rs = registroEstudiante.executeQuery();
			if (rs.next()) {

				estudiante.setCarnet(rs.getString("carnet"));
				estudiante.setNombre(rs.getString("nombre"));
				estudiante.setFacultad(rs.getString("facultad"));
				estudiante.setSemestre(rs.getString("semestre"));
				estudiante.setMateria(rs.getString("materia"));
				estudiante.setParcialI(rs.getString("parcialI"));
				estudiante.setParcialII(rs.getString("parcialII"));
				estudiante.setNotaI(rs.getString("notaI"));
				estudiante.setNotaII(rs.getString("notaII"));
				estudiante.setNotaIII(rs.getString("notaIII"));
				estudiante.setCoevaluacion(rs.getString("coevaluacion"));
				estudiante.setFinall(rs.getString("final"));
				estudiante.setDefinitiva(rs.getString("definitiva"));
				estudiante.setObservacion(rs.getString("observacion"));

			}
		} catch (SQLException se) {
			System.out.print("" + se);
		}
		return estudiante;
	}

	public void modificar(EstudianteDTO estudiante) {
		Connection cnn = ConexionDB.getConnection();
		try {
			PreparedStatement registroEstudiante = cnn
					.prepareStatement("call SP_ModificarEstudiante(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			registroEstudiante.setString(1, estudiante.getCarnet());
			registroEstudiante.setString(2, estudiante.getNombre());
			registroEstudiante.setString(3, estudiante.getFacultad());
			registroEstudiante.setString(4, estudiante.getSemestre());
			registroEstudiante.setString(5, estudiante.getMateria());
			registroEstudiante.setString(6, estudiante.getParcialI());
			registroEstudiante.setString(7, estudiante.getParcialII());
			registroEstudiante.setString(8, estudiante.getNotaI());
			registroEstudiante.setString(9, estudiante.getNotaII());
			registroEstudiante.setString(10, estudiante.getNotaIII());
			registroEstudiante.setString(11, estudiante.getCoevaluacion());
			registroEstudiante.setString(12, estudiante.getFinall());
			registroEstudiante.setString(13, estudiante.getDefinitiva());
			registroEstudiante.setString(14, estudiante.getObservacion());
			registroEstudiante.executeUpdate();
			
			System.out.print("Registro modificado,  ");
		} catch (SQLException e) {
			System.out.println("Mostro modifico Mostrico!!" + e);
		}
	}

}
