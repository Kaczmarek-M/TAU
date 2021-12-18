import requests

r = requests.delete("https://reqres.in/api/users/2")

assert r.status_code == 204 , "User deletion faild"