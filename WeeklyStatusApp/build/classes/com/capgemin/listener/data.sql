DROP table PROJECT IF EXISTS;
DROP TABLE STREAM IF EXISTS;
CREATE TABLE IF NOT EXISTS PROJECT (
	project_id int(10) NOT NULL AUTO_INCREMENT,
	project_name varchar(35) NOT NULL UNIQUE,
	stream_id int(10) NOT NULL,
	country_name varchar(25),
	PRIMARY KEY (project_id)
);

CREATE TABLE IF NOT EXISTS STREAM (
	stream_id int(5) NOT NULL AUTO_INCREMENT,
	stream_name varchar(25) NOT NULL UNIQUE,
	PRIMARY KEY (stream_id)
);



INSERT INTO STREAM VALUES(10001,'AUTOMATION');
INSERT INTO STREAM(stream_name) VALUES('SCRUM');
INSERT INTO STREAM(stream_name) VALUES('GSP-TECHNICAL');
INSERT INTO STREAM(stream_name) VALUES('MOBILE-TESTING');
INSERT INTO STREAM(stream_name) VALUES('MORTGAGE');
INSERT INTO STREAM(stream_name) VALUES('EVERGREENING');
INSERT INTO STREAM(stream_name) VALUES('OTHERS');


INSERT INTO PROJECT VALUES(1000123412,'GSP_EGYPT_RELEASE_3',10001,'EGYPT');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('GSP_UK_HMR12',10001,'UK');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('GSP_HK_AMH12',10001,'INDIA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('GSP_ROLL_OUT_US',10001,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('SAAS_ROLL_OUT',10001,'INDIA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('AUTOMATION_PRODUCTION',10001,'OMAN');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('AUTOMATION_HAS',10001,'BAHRAIN');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('GSP_ACCESSIBILITY',10001,'EGYPT');

INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('ACCOUNT_OPENING',10002,'AMSTERDAM');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('M2M',10002,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('M2NM1_M2NM2',10002,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('MFD',10002,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('LANDING PAGE',10002,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('COMMUNICATIONS2',10002,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('ACCOUNT_SERVICING',10002,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('REGULATORY_PROJECT',10002,'CANADA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('GPWS',10002,'UK');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('GSP_ACCESS',10002,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('COMMUNICATIONS4',10002,'EGYPT');


INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('SYSTEM_API_REST_ASSURED',10003,'UK');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('PROCESS_API_REST_ASSURED',10003,'CANADA');


INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('MOBILE_X',10004,'FRANCE');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('MOBILE_AWS',10004,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('MOBILE_Q1_13',10004,'FRANCE');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('MENA_Q1_MOBILE',10004,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('MSP_GREEN_FIELD',10004,'FRANCE');

INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('GLOBAL_MORTGAGES',10005,'CANADA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('ESIS',10005,'UK');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('CGI-R2-SCRUME',10005,'USA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('CGI-R2-SCRUMF',10005,'EGYPT');

INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('EVER_BANG',10006,'BANGLADESH');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('EVER_HK',10006,'CANADA');


INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('ROCKET',10007,'BANGLADESH');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('FASTER_PAY_SYSTEM',10007,'CANADA');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('VADMK',10007,'UK');
INSERT INTO PROJECT(project_name,stream_id,country_name) VALUES('EU_DIGITAL',10007,'CANADA')