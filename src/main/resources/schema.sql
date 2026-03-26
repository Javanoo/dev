/*
* author: Matthews Offen
* author's github: https://github.com/javanoo
* date of creation : 26-03-2026
* version: 0.0.1
* title: dev database schema
*/

DROP DATABASE IF EXISTS dev;
CREATE DATABASE dev;
USE dev;


--
-- Table structure for `projects`
--

CREATE TABLE IF NOT EXISTS projects (
 projectId SMALLINT NOT NULL UNSIGNED AUTO_INCREMENT,
 projectName VARCHAR(50) NOT NULL,
 projectDescription TEXT NOT NULL,
 projectType ENUM('frontend', 'backend', 'fullstack');
 projectGithubLink VARCHAR(100) NOT NULL,
 CONSTRAINT projects_pk PRIMARY KEY (projectId),
 KEY idx_projectName (projectName),
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP,
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--
-- Table structure for `projectTools`
--

CREATE TABLE IF NOT EXISTS projectTools (
 projectToolId SMALLINT NOT NULL UNSIGNED AUTO_INCREMENT,
 projectId SMALLINT NOT NULL UNSIGNED,
 projectToolName VARCHAR(50) NOT NULL,
 CONSTRAINT projectTools_pk PRIMARY KEY (projectToolId),
 CONSTRAINT projectTools_projects_fk FOREIGN KEY (projectId)
 REFERENCES projects (projectId) ON DELETE CASCADE ON UPDATE CASCADE,
 UNIQUE uidx_projectId_projectToolName (projectId,projectToolName),
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP,
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--
-- Table structure for `collaborators`
--

CREATE TABLE IF NOT EXISTS collaborators (
 collaboratorId SMALLINT NOT NULL UNSIGNED AUTO_INCREMENT,
 collaboratorEmail VARCHAR(100) NOT NULL,
 collaboratorEmailSubject VARCHAR(100) NOT NULL,
 collaboratorMessage TEXT NOT NULL,
 CONSTRAINT collaborators_pk PRIMARY KEY (collaboratorId),
 UNIQUE uidx_collaboratorEmail (collaboratorEmail),
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP,
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
