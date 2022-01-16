from selenium import webdriver
from selenium.webdriver.common.by import By

#Chrome
driver = webdriver.Chrome(executable_path='C:\chromedriver 97.0.4692.71\chromedriver.exe')
driver.get('https://www.olx.pl/')
driver.maximize_window()
check = driver.find_element(By.ID, 'onetrust-accept-btn-handler')
check.click()
check = driver.find_element(By.ID, 'homeShowAllAds')
check.click()
check = driver.find_element(By.ID, 'search-text').send_keys('BMW')
check = driver.find_element(By.ID, 'cityField').send_keys('Gdansk')
check = driver.find_element(By.ID, 'search-submit')
check.click()

driver.close()
