setA=set(map(int, input().split()))
setB=set()
for i in range(int(input())):
    setB.add(map(int, input().split()))
if(setA.issuperset(setB)):
    print(True)
else:
    print(False)