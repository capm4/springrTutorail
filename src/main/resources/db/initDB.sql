CREATE TABLE Student(
        ID   INT NOT NULL AUTO_INCREMENT,
        NAME VARCHAR(20) NOT NULL,
        AGE  INT NOT NULL,
        PRIMARY KEY (ID)
        );

CREATE TABLE Marks(
        SID INT NOT NULL,
        MARKS  INT NOT NULL,
        YEAR   INT NOT NULL
        );