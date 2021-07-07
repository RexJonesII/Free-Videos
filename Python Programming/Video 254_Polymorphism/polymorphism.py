
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

 def develop_applications(self):
     return 'Employed To Develop'


class Tester(Employee):
  def __init__(self, name, emp_num, salary, web_mobile):
    self.web_mobile = web_mobile
    Employee.__init__(self, name, emp_num, salary)

  def test_applications(self):
      return 'Employed To Test'


class Automation_Engineer(Tester, Developer):
    def __init__(self, name, emp_num, salary, web_mobile, lang):
        Developer.__init__(self, name, emp_num, salary, lang)
        super().__init__(name, emp_num, salary, web_mobile)

    def get_employee_info(self):
      return 'Employee: ' + self.name + '\n' \
            'Emp #: ' + str(self.emp_num) + '\n' \
            'Salary: ' + str(self.salary) + '\n'

automation = Automation_Engineer('Automation Joe', 4, 105000,
                                 'mobile', 'Python')
employee = Employee('Employee Ed', 5, 100000)
print(automation.get_employee_info())
print(employee.get_employee_info())













