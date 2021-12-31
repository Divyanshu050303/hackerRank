import textwrap

def wrap(string, max_width):
    j=0
    for i in range(len(string)):
        if j<=max_width:
            print(string[i], end=" ")
        else:
            j=0

    return

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)