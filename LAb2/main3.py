from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(executable_path='C:\chromedriver 97.0.4692.71\chromedriver.exe')
driver.get('https://www.olx.pl/')
driver.maximize_window()
check = driver.find_element(By.ID, 'C:\chromedriver 97.0.4692.71\chromedriver.exe')
check.click()
check = driver.find_element(By.ID, 'topLoginLink')
check.click()
check = driver.find_element(By.ID, 'userEmail').send_keys('total234@wrong.com')
check = driver.find_element(By.ID, 'userPass').send_keys('Pass')
check = driver.find_element(By.ID, 'se_userLogin')
check.click()
driver.close()
