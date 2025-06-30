create or replace procedure ProcessMonthlyInterest as
BEGIN
    for rec in (
        select accountid, balance
        from ACCOUNTS
        where accouttype = 'Savings'
    ) LOOP
    update accounts 
    set balance = BALANCE + (balance * 0.01),
    lastmodified = sysdate
    where accountid = rec.accountid;
    end loop;
    commit;
    end;