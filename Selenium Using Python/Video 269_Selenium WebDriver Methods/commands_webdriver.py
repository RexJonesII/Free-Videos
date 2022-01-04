from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(ChromeDriverManager().install())
driver.maximize_window()
driver.get('https://the-internet.herokuapp.com/')
print(driver.name)
print(driver.title)
print(driver.current_url)
driver.quit()

