select s.roll_number, s.name from student_information as s, 
faculty_information as f 
where
(s.advisor = f.employee_id and f.gender = 'M' and f.salary > 15000)
or
(s.advisor = f.employee_id and f.gender = 'F' and f.salary > 20000);