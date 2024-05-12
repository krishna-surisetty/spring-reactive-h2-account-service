CREATE SCHEMA IF NOT EXISTS mybank;
SET SCHEMA mybank;

CREATE TABLE IF NOT EXISTS ACCOUNT_TYPES (
    account_type_id NUMBER PRIMARY KEY,
    account_type_name VARCHAR2(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS ACCOUNT_STATUS(
    account_status_id NUMBER PRIMARY KEY,
    account_status_name VARCHAR2(50) NOT NULL
);


CREATE TABLE IF NOT EXISTS ACCOUNTS(
    account_number NUMBER PRIMARY KEY,
    account_holder_name VARCHAR2(50) NOT NULL,
    account_type_id NUMBER NOT NULL,
    account_status_id NUMBER,
    account_balance_amount NUMBER DEFAULT 0,
    FOREIGN KEY (account_type_id) REFERENCES ACCOUNT_TYPES (account_type_id),
    FOREIGN KEY (account_status_id) REFERENCES ACCOUNT_STATUS (account_status_id)
);



