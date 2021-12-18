import requests

r = requests.get("https://reqres.in/api/users?page=2")
c = r.status_code
assert c == 200 , "Doesn't work"
