import requests

p={'page':2}

r = requests.get("https://reqres.in/api/users",params=p)
print(r.url)
json_resp = r.json()

assert json_resp['per_page'] == 6, 'per_page is not correct'
assert json_resp['total_pages'] == 2, 'total_pages is not correct'
assert (json_resp['data'][0]['email']).endswith('reqres.in') , 'incorrect email'
