import httpx

url = "https://studious-computing-machine-9rvr6rj69wg377g6-5000.app.github.dev/"

response = httpx.get(url)
print(response.status_code)
print(response)

response = httpx.get(url)
print(response.status_code)
print(response.text)

mydata = {
    "text": "Hello!",
    "param2": "Making a POST request",
    "body": "my own value"
}

response = httpx.post(url + "echo", data=mydata)

print(response.status_code)
print(response.text) 

print("\n")

authdata = {
    "id":"tahera.hoque", 
    "token": "cse2102-lab4"
}

response = httpx.post(url + "home", data=authdata)
print(response.status_code)
print(response.text)

print("\n")

response = httpx.post(url + "home")
print(response.status_code)
print(response.text)