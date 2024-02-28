import itertools
n = int(input())
l = list(map(int,input().split()))
lst = list(itertools.combinations(l, 3))
nC3 = n * (n-1) * (n-2) // 6

def judgement(t: tuple):
    return (t[0] < t[1] + t[2]) and (t[1] < t[2] + t[0]) and (t[2] < t[0] + t[1])

result = 0
for i in range(nC3):
    if(judgement(lst[i])):
        result = result + 1

print(result)