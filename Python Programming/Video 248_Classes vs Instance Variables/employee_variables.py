
class Employee:
  """A class for an employee's information"""
  bonus = 10000
  total_employees = 0

  def __init__(self, name, emp_num, salary):
    self.name = name
    self.emp_num = emp_num
    self.salary = salary
    Employee.total_employees += 1

  def get_employee_info(self):
    return 'Employee: ' + self.name + '\n' \
          'Emp #: ' + str(self.emp_num) + '\n'

  def add_bonus_to_salary(self):
      salary_bonus = int(self.salary + self.bonus)
      return ' Employee Name: ' + self.name + '\n' \
            ' Salary + Bonus: ' + str(salary_bonus) + '\n'

emp1 = Employee('John Doe', 1, 134000)
emp2 = Employee('Jane Doe', 2, 150000)

Employee.bonus = 15000
print(emp1.name, emp1.salary, emp1.bonus)
print(emp1.add_bonus_to_salary())
emp2.bonus = 20000
print(emp2.name, emp2.salary, emp2.bonus)
print(emp2.add_bonus_to_salary())
print(Employee.total_employees)