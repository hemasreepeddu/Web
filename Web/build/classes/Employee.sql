create table TBL_Employee_1341288(
EmployeeId number(8) primary key,
EmployeeName varchar2(25) not null,
Address varchar2(50) not null,
Mobile number(10) not null);

create Sequence empIdGenerator
start with 1001
increment by 1;

create table TBL_Department_1341288 (
DepartmentId number(8) primary key,
DepartmentName varchar2(25) not null);