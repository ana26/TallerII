/*
SQLyog Community v8.71 
MySQL - 5.5.25a : Database - comovamos
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`comovamos` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `comovamos`;

/*Table structure for table `com_actividades` */

DROP TABLE IF EXISTS `com_actividades`;

CREATE TABLE `com_actividades` (
  `ACT_id` int(11) NOT NULL AUTO_INCREMENT,
  `ACT_nombre` varchar(45) DEFAULT NULL,
  `ACT_TipodeActividad` int(11) NOT NULL,
  PRIMARY KEY (`ACT_id`),
  KEY `fk_Actividad_TipoDeActividad1_idx` (`ACT_TipodeActividad`),
  CONSTRAINT `fk_Actividad_TipoDeActividad1` FOREIGN KEY (`ACT_TipodeActividad`) REFERENCES `com_tipodeactividades` (`TIP_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `com_actividades` */

/*Table structure for table `com_detallepreguntas` */

DROP TABLE IF EXISTS `com_detallepreguntas`;

CREATE TABLE `com_detallepreguntas` (
  `DET_id` int(11) NOT NULL AUTO_INCREMENT,
  `DET_Pregunta` varchar(100) NOT NULL,
  `DET_TipoResultado` varchar(20) DEFAULT NULL,
  `DET_Formula` varchar(100) DEFAULT '0',
  `DET_Resultado` varchar(100) DEFAULT NULL,
  `DET_Periodo` varchar(100) DEFAULT NULL,
  `DET_Fecha` date DEFAULT NULL,
  `DET_Color` varchar(10) DEFAULT NULL,
  `DET_Plantilla` int(11) NOT NULL,
  PRIMARY KEY (`DET_id`),
  KEY `fk_COM_DetallesEncuestas_COM_Encuestas1_idx` (`DET_Plantilla`),
  CONSTRAINT `fk_COM_DetallesEncuestas_COM_Encuestas1` FOREIGN KEY (`DET_Plantilla`) REFERENCES `com_plantilla` (`PLA_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `com_detallepreguntas` */

insert  into `com_detallepreguntas`(`DET_id`,`DET_Pregunta`,`DET_TipoResultado`,`DET_Formula`,`DET_Resultado`,`DET_Periodo`,`DET_Fecha`,`DET_Color`,`DET_Plantilla`) values (1,'El num de aprobados con 9-10','no calculada','0','15','2012-11-25','2012-11-25','Verde',25),(2,'El num de aprob con 7-8','no calc','0','50','2012-11-25','2012-11-25','Naranja',1),(3,'El num de aprob con 6','no calc','0','25','2012-11-25','2012-11-25','Azul',26),(4,'El num de reprobados','no calc','0','10','2012-11-25','2012-11-25','Rojo',27);

/*Table structure for table `com_entidad` */

DROP TABLE IF EXISTS `com_entidad`;

CREATE TABLE `com_entidad` (
  `DZN_id` int(11) NOT NULL AUTO_INCREMENT,
  `DZN_NombreEntidad` varchar(100) NOT NULL,
  `DZN_descripcion` varchar(400) DEFAULT NULL,
  `DZN_Region` int(11) NOT NULL,
  PRIMARY KEY (`DZN_id`),
  KEY `fk_COM_DetalleZonas_COM_Zonas1_idx` (`DZN_Region`),
  CONSTRAINT `fk_COM_DetalleZonas_COM_Zonas1` FOREIGN KEY (`DZN_Region`) REFERENCES `com_region` (`REG_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `com_entidad` */

insert  into `com_entidad`(`DZN_id`,`DZN_NombreEntidad`,`DZN_descripcion`,`DZN_Region`) values (1,'Fac. Economía','Campus xalapa',1),(2,'Fac.Psicología','Campus Coatzacoalcos',4);

/*Table structure for table `com_historial` */

DROP TABLE IF EXISTS `com_historial`;

CREATE TABLE `com_historial` (
  `HIS_id` int(11) NOT NULL AUTO_INCREMENT,
  `HIS_Usuario` int(11) NOT NULL,
  `HIS_Actividad` int(11) NOT NULL,
  `HIS_fecha` varchar(45) DEFAULT NULL,
  `HIS_hora` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`HIS_id`),
  KEY `fk_Historial_Usuario_idx` (`HIS_Usuario`),
  KEY `fk_Historial_Actividad1_idx` (`HIS_Actividad`),
  CONSTRAINT `fk_Historial_Usuario` FOREIGN KEY (`HIS_Usuario`) REFERENCES `com_usuarios` (`USU_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Historial_Actividad1` FOREIGN KEY (`HIS_Actividad`) REFERENCES `com_actividades` (`ACT_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `com_historial` */

/*Table structure for table `com_indicador` */

DROP TABLE IF EXISTS `com_indicador`;

CREATE TABLE `com_indicador` (
  `IND_id` int(11) NOT NULL AUTO_INCREMENT,
  `IND_Nombre` varchar(45) NOT NULL,
  `IND_Formula` varchar(100) DEFAULT NULL,
  `IND_Color` varchar(10) DEFAULT NULL,
  `IND_Padre` int(11) DEFAULT NULL,
  PRIMARY KEY (`IND_id`),
  KEY `fk_COM_Indicador_COM_Indicador1_idx` (`IND_Padre`),
  CONSTRAINT `fk_COM_Indicador_COM_Indicador1` FOREIGN KEY (`IND_Padre`) REFERENCES `com_indicador` (`IND_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `com_indicador` */

insert  into `com_indicador`(`IND_id`,`IND_Nombre`,`IND_Formula`,`IND_Color`,`IND_Padre`) values (1,'Tiempo de espera','2+2','Azul',1),(2,'Edad de egreso','a+4','verde',2);

/*Table structure for table `com_perfiles` */

DROP TABLE IF EXISTS `com_perfiles`;

CREATE TABLE `com_perfiles` (
  `PERF_id` int(11) NOT NULL AUTO_INCREMENT,
  `PERF_nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`PERF_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `com_perfiles` */

insert  into `com_perfiles`(`PERF_id`,`PERF_nombre`) values (1,'Administrador');

/*Table structure for table `com_plantilla` */

DROP TABLE IF EXISTS `com_plantilla`;

CREATE TABLE `com_plantilla` (
  `PLA_id` int(11) NOT NULL AUTO_INCREMENT,
  `PLA_NomPlantilla` varchar(100) NOT NULL,
  `PLA_Descripcion` varchar(300) DEFAULT NULL,
  `PLA_FechaRegistro` datetime DEFAULT NULL,
  `PLA_TituloResultado` varchar(100) NOT NULL,
  `PLA_Meta` int(11) DEFAULT NULL,
  `PLA_Indicador` int(11) NOT NULL,
  `PLA_Usuario` int(11) NOT NULL,
  `PLA_Region` int(11) DEFAULT NULL,
  `PLA_Entidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`PLA_id`),
  KEY `fk_COM_Encuestas_COM_Usuario1_idx` (`PLA_Usuario`),
  KEY `fk_COM_Plantila_COM_Indicador1_idx` (`PLA_Indicador`),
  KEY `fk_COM_Plantilla_COM_Region1_idx` (`PLA_Region`),
  KEY `fk_COM_Plantilla_COM_Entidad1_idx` (`PLA_Entidad`),
  CONSTRAINT `fk_COM_Encuestas_COM_Usuario1` FOREIGN KEY (`PLA_Usuario`) REFERENCES `com_usuarios` (`USU_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_COM_Plantila_COM_Indicador1` FOREIGN KEY (`PLA_Indicador`) REFERENCES `com_indicador` (`IND_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_COM_Plantilla_COM_Entidad1` FOREIGN KEY (`PLA_Entidad`) REFERENCES `com_entidad` (`DZN_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_COM_Plantilla_COM_Region1` FOREIGN KEY (`PLA_Region`) REFERENCES `com_region` (`REG_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

/*Data for the table `com_plantilla` */

insert  into `com_plantilla`(`PLA_id`,`PLA_NomPlantilla`,`PLA_Descripcion`,`PLA_FechaRegistro`,`PLA_TituloResultado`,`PLA_Meta`,`PLA_Indicador`,`PLA_Usuario`,`PLA_Region`,`PLA_Entidad`) values (1,'Calif entre 7-10','Numero de aprobados con 7-8','2012-11-20 00:00:00','Aprobado 7-8',10,1,1,1,1),(25,'Calif entre 9-10','Numero de aprobados con 9 o 10','2012-11-20 00:00:00','Aprobado 9-10',10,1,1,1,1),(26,'Calif 6','Numero de aprobados con 6','2012-11-20 00:00:00','Aprobado 6',10,1,1,1,1),(27,'Calif de 5 o menos','Numero de reprobados','2012-11-20 00:00:00','Reprobado',1,1,1,1,1);

/*Table structure for table `com_region` */

DROP TABLE IF EXISTS `com_region`;

CREATE TABLE `com_region` (
  `REG_id` int(11) NOT NULL AUTO_INCREMENT,
  `REG_nombreRegion` varchar(150) NOT NULL,
  PRIMARY KEY (`REG_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `com_region` */

insert  into `com_region`(`REG_id`,`REG_nombreRegion`) values (1,'Veracruz'),(2,'Xalapa'),(3,'Poza Rica'),(4,'Coatza');

/*Table structure for table `com_tipodeactividades` */

DROP TABLE IF EXISTS `com_tipodeactividades`;

CREATE TABLE `com_tipodeactividades` (
  `TIP_id` int(11) NOT NULL AUTO_INCREMENT,
  `TIP_nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TIP_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `com_tipodeactividades` */

/*Table structure for table `com_usuarios` */

DROP TABLE IF EXISTS `com_usuarios`;

CREATE TABLE `com_usuarios` (
  `USU_id` int(11) NOT NULL AUTO_INCREMENT,
  `USU_usuario` varchar(45) NOT NULL,
  `USU_contraseña` varchar(45) NOT NULL,
  `USU_Perfiles` int(11) NOT NULL,
  `USU_nombreCompleto` varchar(45) DEFAULT NULL,
  `USU_dirección` varchar(45) DEFAULT NULL,
  `USU_teléfono` varchar(45) DEFAULT NULL,
  `USU_correo` varchar(45) DEFAULT NULL,
  `USU_PreguntaSecreta` int(11) NOT NULL,
  PRIMARY KEY (`USU_id`),
  KEY `fk_Usuario_Perfil1_idx` (`USU_Perfiles`),
  CONSTRAINT `fk_Usuario_Perfil1` FOREIGN KEY (`USU_Perfiles`) REFERENCES `com_perfiles` (`PERF_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `com_usuarios` */

insert  into `com_usuarios`(`USU_id`,`USU_usuario`,`USU_contraseña`,`USU_Perfiles`,`USU_nombreCompleto`,`USU_dirección`,`USU_teléfono`,`USU_correo`,`USU_PreguntaSecreta`) values (1,'marisol','marisol',1,'marisol','conocdia','2','2',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
