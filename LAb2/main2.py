from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome(executable_path='C:\chromedriver 97.0.4692.71\chromedriver.exe')

driver.get('https://www.ceneo.pl')
driver.maximize_window()


check = driver.find_element(By.ID, 'form-head-search-q').send_keys('laptopy')
check.click()

driver.quit()
