for i in range(int(input())):
    a=int(input())
    setA = set(map(int, input().split()))
    b=int(input())
    setB = set(map(int, input().split()))
    if(setA.issubset(setB)):
        print(True)
    else:
        print(False)