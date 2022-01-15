from selenium import webdriver

# Chrome

driver = webdriver.Chrome(executable_path='C:\Drivers\chromedriver.exe')
   
driver.get('https://www.x-kom.pl')

temp = driver.find_element_by_link_text('Kariera')
temp.click()

temp = driver.find_element_by_id('xkom_search_opening_text').send_keys('Programista')

driver.close()

# Firefox

driver = webdriver.Chrome(executable_path='C:\Drivers\geckodriver.exe')

driver.get('https://www.x-kom.pl')

temp = driver.find_element_by_link_text('Kariera')
temp.click()

   
temp = driver.find_element_by_id('xkom_search_opening_text').send_keys('Programista')

driver.close()
