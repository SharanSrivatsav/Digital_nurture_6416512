CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN NUMBER,
    to_account   IN NUMBER,
    amount       IN NUMBER
)
AS
    f_balance Accounts.Balance%TYPE;
BEGIN

    SELECT Balance INTO f_balance
    FROM Accounts 
    WHERE AccountID = from_account
    FOR UPDATE;


    IF f_balance >= amount THEN

        UPDATE Accounts
        SET Balance = Balance - amount,
            LastModified = SYSDATE
        WHERE AccountID = from_account;

        UPDATE Accounts
        SET Balance = Balance + amount,
            LastModified = SYSDATE
        WHERE AccountID = to_account;

        COMMIT;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance to transfer the funds');
    END IF;
END;