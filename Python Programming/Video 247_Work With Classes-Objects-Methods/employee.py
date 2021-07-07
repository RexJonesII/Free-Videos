
class Employee:
  """A class for an employee's information"""
  pass

  def __init__(self, name, emp_num, salary):
    self.name = name
    self.emp_num = emp_num
    self.salary = salary

  def get_employee_info(self):
    return 'Employee: ' + self.name + '\n' \
          'Emp #: ' + str(self.emp_num) + '\n'

emp1 = Employee('John Doe', 1, 134000)
emp2 = Employee('Jane Doe', 2, 150000)
print(emp1.get_employee_info())
print(Employee.get_employee_info(emp2))