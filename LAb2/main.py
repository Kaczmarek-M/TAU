
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(executable_path='C:\chromedriver 97.0.4692.71\chromedriver.exe')

driver.get('https://www.x-kom.pl')
driver.maximize_window()

check = driver.find_element(By.LINK_TEXT, "Twoje listy")
check.click()

check = driver.find_element(By.LINK_TEXT, 'Koszyk')
check.click()

driver.quit()
© 2022 GitHub, Inc.
