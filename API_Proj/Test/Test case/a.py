import json
import jsonpath
import requests


def addNewData():
    App_URL="http://www.thetestingworldapi.com/api/studentsDetails"
    f = open('Documents/req.json', 'r')
    request_json=json.load(f.read())
    Response= requests.post(App_URL,request_json)
    print(Response.text)
    id=jsonpath.jsonpath(Response.json(),'id')
    print(id(0))