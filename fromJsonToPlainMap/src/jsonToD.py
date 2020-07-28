import json

with open('../exFile.json') as json_file:
    data = json.load(json_file)
    print(data)
    print("="*10)

    for _ in data :
        print("{} -> {}".format(_,data[_]))
        print("{} -> {}".format(type(_),type(data[_])))

    


if __name__=="__main__":
    print("Run from main")