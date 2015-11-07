CREATE DATABASE `SeguimientoDB`;

USE `SeguimientoDB`;

CREATE TABLE `estudiante` (
  `carnet` char(12) NOT NULL,
  `nombre` char(40) NOT NULL,
  `facultad` char(40) NOT NULL,
  `semestre` char(1) NOT NULL,
  `materia` char(20) NOT NULL,
  `parcialI` float(3,1) NOT NULL,
  `parcialII` float(3,1) NOT NULL,
  `notaI` float(3,1) NOT NULL,
  `notaII` float(3,1) NOT NULL,
  `notaIII` float(3,1) NOT NULL,
  `coevaluacion` float(3,1) NOT NULL,
  `final` float(3,1) NOT NULL,
  `definitiva` float(3,1) DEFAULT NULL,
  `observacion` char(15) NOT NULL,
  `estado` char(10) NOT NULL,
  PRIMARY KEY (`carnet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DELIMITER //
CREATE PROCEDURE `SP_ConsultarEstudiantesActivos`(in _carnet char(12))
begin
select * from estudiante where carnet=_carnet and estado="Activo";
END ;
//
DELIMITER ;


DELIMITER //
CREATE PROCEDURE `SP_EliminiarEstudiante`(in _carnet char (12))
begin
update estudiante set estado="Inactivo" where carnet=_carnet;
END ;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE `SP_InsertarEstudiante`(in _carnet char(12), in _nombre char(40), in _facultad char(40), in _semestre char (1), in _materia char(20), in _parcialI float(3,1), in _parcialII float (3,1), in _notaI float(3,1), in _notaII float(3,1), in _notaIII float(3,1), in _coevaluacion float(3,1), in _final float(3,1), in _definitiva float(3,1), in _observacion char(15), in _estado char(10))
begin
insert into estudiante values (_carnet, _nombre,_facultad, _semestre, _materia, _parcialI, _parcialII,  _notaI,  _notaII,  _notaIII ,  _coevaluacion, _final ,  (parcialI*0.2)+(parcialII*0.2)+(((notaI+notaII+notaIII)/3)*0.3+(coevaluacion * 0.1)+(final*0.2)) ,  _observacion, _estado);
END ;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE `SP_Listado_Ganan`()
begin
select * from estudiante where definitiva >= "3.0";
END ;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE `SP_ListadoGeneral`()
begin
select carnet, nombre, facultad, semestre, materia, parcialI, parcialII,notaI, notaII, notaIII, coevaluacion, final, definitiva, observacion from estudiante where estado="Activo";
END ;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE `SP_ListadoHabilitan`()
begin
select * from estudiante where definitiva between "2.6" and "2.9";
END ;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE `SP_ListadoPierde`()
begin
select * from estudiante where definitiva <= "2.5";
END ;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE `SP_ModificarEstudiante`(in _carnet char(12), in _nombre char(40), in _facultad char(40), in _semestre char (1), in _materia char(20), in _parcialI float(3,1), in _parcialII float (3,1), in _notaI float(3,1), in _notaII float(3,1), in _notaIII float(3,1), in _coevaluacion float(3,1), in _final float(3,1), in _definitiva float(3,1), in _observacion char(15))
begin
update estudiante set nombre=_nombre, facultad=_facultad, semestre=_semestre, materia=_materia, parcialI=_parcialI, parcialII=_parcialII, notaI=_notaI, notaII=_notaII, notaIII=_notaIII, coevaluacion=_coevaluacion, final=_final, definitiva= (parcialI*0.2)+(parcialII*0.2)+(((notaI+notaII+notaIII)/3)*0.3+(coevaluacion * 0.1)+(final*0.2)), observacion=_observacion where carnet=_carnet and estado="Activo";
END ;
//
DELIMITER ;

