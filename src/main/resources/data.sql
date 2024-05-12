SET SCHEMA mybank;

INSERT INTO ACCOUNT_TYPES (account_type_id, account_type_name) VALUES (1, 'Savings Account');
INSERT INTO ACCOUNT_TYPES (account_type_id, account_type_name) VALUES (2, 'Current Account');
INSERT INTO ACCOUNT_TYPES (account_type_id, account_type_name) VALUES (3, 'Loan Account');
INSERT INTO ACCOUNT_TYPES (account_type_id, account_type_name) VALUES (4, 'Credit Card Account');


INSERT INTO ACCOUNT_STATUS (account_status_id, account_status_name) VALUES (1, 'Open');
INSERT INTO ACCOUNT_STATUS (account_status_id, account_status_name) VALUES (2, 'Pending Approval');
INSERT INTO ACCOUNT_STATUS (account_status_id, account_status_name) VALUES (3, 'Blocked');
INSERT INTO ACCOUNT_STATUS (account_status_id, account_status_name) VALUES (4, 'Rejected');


INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1001, 'John Doe', 1, 1, 5000);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1002, 'Jane Smith', 2, 1, 7500);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1003, 'Alice Johnson', 1, 2, 3000);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1004, 'Bob Williams', 3, 1, 10000);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1005, 'Emily Brown', 2, 2, 6000);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1006, 'Michael Davis', 4, 1, 8500);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1007, 'Sophia Wilson', 3, 2, 4000);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1008, 'Liam Martinez', 1, 1, 7000);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1009, 'Olivia Anderson', 2, 2, 9500);
INSERT INTO ACCOUNTS (account_number, account_holder_name, account_type_id, account_status_id, account_balance_amount)
VALUES (1010, 'Noah Taylor', 3, 1, 5500);
