# Day 8: Dictionaries and Maps

# Key-Value pair mappings using a Map or Dictionary data structure

# Enter your code here. Read input from STDIN. Print output to STDOUT

N=int(input())
phoneBook={}

for _ in range(N):
    name,contact=input().split()
    phoneBook[name]=contact

try:
    while(True):
        check=str(input())
        if check in phoneBook:
            print(check+"="+phoneBook[check])
        else:
            print('Not found')

except:
    pass