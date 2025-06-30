begin
    for rec in(
        select c.name, l.loanid, l.enddate
        from loans l
        join customers c on l.customerid = c.customerid
        where l.enddate between sysdate and sysdate + 30
    )loop
    dbms_output.put_line('Reminder: Loan ID ' || rec.loanid || 'for customer ' || rec.name || ' is due on ' || to_char(rec.enddate,'DD-MON-YYYY'));
    end loop;
    end;