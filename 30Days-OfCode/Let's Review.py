# Enter your code here. Read input from STDIN. Print output to STDOUT

inp = int(input())

for i in range(0, inp):
    strr = str(input())
    print(strr[0::2] + " " + strr[1::2])