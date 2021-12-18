import json
import requests

payLoad = {
    "name": "Nick",
    "job": "Api tester"
    }

r = requests.put("https://reqres.in/api/users/2", data=payLoad)

assert r.json()['name'] == "Nick", 'the change was not successful'

assert r.json()['job'] == 'Api tester', 'the change was not successful'
