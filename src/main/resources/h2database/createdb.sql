CREATE TABLE IF NOT EXISTS PASSENGER
(
  ID INTEGER NOT NULL IDENTITY,
  FIRST_NAME       VARCHAR(20),
  LAST_NAME        VARCHAR(20),
  COUNTRY          VARCHAR(20),
  OPT_LOCK_VERSION INTEGER,
  PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS PLANE
(
	ID INTEGER NOT NULL IDENTITY,
	NAME             VARCHAR(50),
	YEAR             INTEGER,
	OPT_LOCK_VERSION INTEGER,
	PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS FLIGHT
(
  ID INTEGER NOT NULL IDENTITY,
  DEPART            VARCHAR(3),
  ARRIVE            VARCHAR(3),
  PLANE_ID          INTEGER,
  OPT_LOCK_VERSION INTEGER,
  PRIMARY KEY (ID),
  FOREIGN KEY (PLANE_ID) REFERENCES PLANE (ID)
);


CREATE TABLE IF NOT EXISTS FLIGHT_PASSENGER
(
	FLIGHT_ID      INTEGER,
  PASSENGER_ID       INTEGER,
	PRIMARY KEY (FLIGHT_ID , PASSENGER_ID),
	FOREIGN KEY (FLIGHT_ID) REFERENCES FLIGHT (ID),
	FOREIGN KEY (PASSENGER_ID) REFERENCES PASSENGER (ID)
);

