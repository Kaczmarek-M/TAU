from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(executable_path='C:\chromedriver 97.0.4692.71\chromedriver.exe')
driver.get('https://www.olx.pl/')
driver.maximize_window()
check = driver.find_element(By.XPATH, '/html/body/div[1]/header/div[2]/div[3]/div[3]/a')
check.click()
check = driver.find_element(By.XPATH, '/html/body/div[5]/div[2]/div/div/div/div/form/div[1]/div/input[1]').send_keys('l23@wrong.com')
check = driver.find_element(By.XPATH, '/html/body/div[5]/div[2]/div/div/div/div/form/div[1]/div/input[2]').send_keys('Password')
check = driver.find_element(By.CLASS_NAME, 'button button--accent button--extra-large button--block')
check.click()
driver.close()
