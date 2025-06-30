begin
    for rec in(
        select customerid from customers where balance > 10000
    ) loop 
    update CUSTOMERS set ISVIP = 'true' where CUSTOMERID = rec.customerid;
    end loop;
    COMMIT;
    end;
    /