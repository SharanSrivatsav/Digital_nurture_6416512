create or replace procedure UpdateEmployeeBonus(
    p_department in VARCHAR2,
    p_bonus in NUMBER
)
as
begin
    update EMPLOYEES
    set salary = salary + (salary * p_bonus / 100)
    where department = p_department;

    commit;
end;