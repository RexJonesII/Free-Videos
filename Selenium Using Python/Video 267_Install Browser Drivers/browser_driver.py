from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(ChromeDriverManager().install())
#driver = webdriver.Chrome(executable_path="/drivers/chromedriver.exe")
driver.get("https://www.google.com")