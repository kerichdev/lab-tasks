nums = [int (i) for i in input().split()]
print([a for a in nums if nums.count(a) < 2])