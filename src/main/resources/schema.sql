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
 projectId SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
 projectName VARCHAR(50) NOT NULL,
 projectDescription TEXT NOT NULL,
 projectType ENUM('frontend', 'backend', 'fullstack') DEFAULT 'fullstack',
 projectGithubLink VARCHAR(100) NOT NULL,
 CONSTRAINT projects_pk PRIMARY KEY (projectId),
 KEY idx_projectName (projectName),
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP,
 lastUpdatedOn DATETIME DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--
-- Table structure for `projectTools`
--

CREATE TABLE IF NOT EXISTS projectTools (
 projectToolId SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
 projectId SMALLINT UNSIGNED NOT NULL,
 projectToolName VARCHAR(50) NOT NULL,
 CONSTRAINT projectTools_pk PRIMARY KEY (projectToolId),
 CONSTRAINT projectTools_projects_fk FOREIGN KEY (projectId)
 REFERENCES projects (projectId) ON DELETE CASCADE ON UPDATE CASCADE,
 UNIQUE uidx_projectId_projectToolName (projectId,projectToolName),
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP,
 lastUpdatedOn DATETIME DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--
-- Table structure for `emails`
--

CREATE TABLE IF NOT EXISTS emails(
 emailId SMALLINT  UNSIGNED NOT NULL AUTO_INCREMENT,
 emailAddress VARCHAR(100) NOT NULL,
 emailSubject VARCHAR(100) NOT NULL,
 emailMessage TEXT NOT NULL,
 CONSTRAINT emails_pk PRIMARY KEY (emailId),
 KEY idx_emailAddress (emailAddress),
 dateCreatedOn DATETIME DEFAULT CURRENT_TIMESTAMP,
 lastUpdatedOn DATETIME DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
