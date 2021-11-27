#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char ch;
    char st[1000];
    char str[10000];
    scanf("%c", &ch);
    scanf("%s", st);
    scanf("\n");
    scanf("%[^'\n']s",str);

    printf("%c\n", ch);
    printf("%s\n", st);
    printf("%s\n", str);
   
    return 0;
}
