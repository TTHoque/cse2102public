import httpx

url = ""

response = httpx.get(url)
print(response.status_code)
print(response)

response = httpx.get(url)
print(response.status_code)
print(response)

my_data = {
    "text":"Hello there",
    "param2":"Making a POST request",
    "body":"my own value"
}

response = httpx.post(url + "echo", )