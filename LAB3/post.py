import json

import requests

mdata = open('data.json', 'r').read()
r = requests.post("https://reqres.in/api/users", data=json.loads(mdata))

assert r.json()['name'] == "Michal", 'wrong name'

assert r.json()['job'] == 'Tester' , 'bad value'
