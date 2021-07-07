
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


class Developer(Employee):
 def __init__(self, name, emp_num, salary, lang):
   self.lang = lang
   super().__init__(name, emp_num, salary)


class Tester(Employee):
  def __init__(self, name, emp_num, salary, web_mobile):
    self.web_mobile = web_mobile
    Employee.__init__(self, name, emp_num, salary)

emp1 = Developer('Developer John', 1, 120000, 'Python')
emp2 = Employee('Employee Jane', 2, 110000)
emp3 = Tester('Tester James', 3, 100000, 'Web')

print('Employee 1 Is A', emp1.lang, 'Developer')
print(emp1.add_bonus_to_salary())
print('Employee 3 Is A', emp3.web_mobile, 'Tester')
print(emp2.add_bonus_to_salary())