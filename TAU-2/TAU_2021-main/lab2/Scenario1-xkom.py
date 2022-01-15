from selenium import webdriver

#Chrome

driver = webdriver.Chrome(executable_path='C:\Drivers\chromedriver.exe')

driver.get('https://www.x-kom.pl')

temp = driver.find_element_by_link_text('Pomoc i kontakt')
temp.click()

temp = driver.find_element_by_link_text('Najczęściej zadawane')
temp.click()

driver.close()

# Firefox

driver = webdriver.Chrome(executable_path='C:\Drivers\geckodriver.exe')

 
driver.get('https://www.x-kom.pl')

temp = driver.find_element_by_link_text('Pomoc i kontakt')
temp.click()

    
temp = driver.find_element_by_link_text('Najczęściej zadawane')
temp.click()

driver.close()
