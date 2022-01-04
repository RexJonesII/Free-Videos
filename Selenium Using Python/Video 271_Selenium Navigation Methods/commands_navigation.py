import time

from selenium import webdriver
from webdriver_manager.microsoft import EdgeChromiumDriverManager

driver = webdriver.Edge(EdgeChromiumDriverManager().install())
driver.get("https://the-internet.herokuapp.com/")
print("Home Page: ", driver.title)

driver.get("https://the-internet.herokuapp.com/javascript_error")
print("New Page Has Error: ", driver.title)
driver.back()
print("(Back) Go To Home Page: ", driver.title)

driver.forward()
print("(Forward) Verify Error Page: ", driver.title)
driver.get("https://the-internet.herokuapp.com/entry_ad")
time.sleep(1)
driver.refresh()
time.sleep(1)
print("(Refresh) Ad Showed Up 2 Times", driver.title)
