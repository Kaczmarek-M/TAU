from selenium import webdriver

#Chrome

driver = webdriver.Chrome(executable_path='C:\Drivers\chromedriver.exe')
driver.get('https://www.olx.pl/')
temp = driver.find_element_by_id('onetrust-accept-btn-handler')
temp.click()
temp = driver.find_element_by_id('topLoginLink')
temp.click()
temp = driver.find_element_by_id('userEmail').send_keys('total123@wrong.com')
temp = driver.find_element_by_id('userPass').send_keys('Pass')
temp = driver.find_element_by_id('se_userLogin')
temp.click()
driver.close()


#Firefox
  
driver = webdriver.Firefox(executable_path='C:\Drivers\geckodriver.exe')
driver.get('https://www.olx.pl/')
temp = driver.find_element_by_id('onetrust-accept-btn-handler')
temp.click()
temp = driver.find_element_by_id('topLoginLink')
temp.click()
temp = driver.find_element_by_id('userEmail').send_keys('total123@wrong.com')
temp = driver.find_element_by_id('userPass').send_keys('Pass')
temp = driver.find_element_by_id('se_userLogin')
temp.click()
  
driver.close()


