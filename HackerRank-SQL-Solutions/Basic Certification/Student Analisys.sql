Select a.roll_number, a.name

from student_information a

inner join

examination_marks b

on a.roll_number = b.roll_number

where (subject_one + subject_two + subject_three )< 100;