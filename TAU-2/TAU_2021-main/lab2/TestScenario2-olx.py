om selenium import webdriver

#Chrome
driver = webdriver.Chrome(executable_path='C:\Drivers\chromedriver.exe')
driver.get('https://www.olx.pl/')
temp = driver.find_element_by_id('onetrust-accept-btn-handler')
temp.click()
temp = driver.find_element_by_id('homeShowAllAds')
temp.click()
temp = driver.find_element_by_id('search-text').send_keys('BMW')
temp = driver.find_element_by_id('cityField').send_keys('Gdansk')
temp = driver.find_element_by_id('search-submit')
temp.click()

driver.close()
fr
#Firefox

driver = webdriver.Firefox(executable_path='C:\Drivers\geckodriver.exe')

driver.get('https://www.olx.pl/')
temp = driver.find_element_by_id('onetrust-accept-btn-handler')
temp.click()
temp = driver.find_element_by_id('homeShowAllAds')
temp.click()
temp = driver.find_element_by_id('search-text').send_keys('BMW')
temp = driver.find_element_by_id('cityField').send_keys('Gdansk')
temp = driver.find_element_by_id('search-submit')
temp.click()
   
driver.close()

