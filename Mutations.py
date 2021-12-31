def mutate_string(string, position, character):
    i=0
    t=""
    for j in string:
        if i==position:
            t+=character
        else:
            t+=j
        i += 1

    return t

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)