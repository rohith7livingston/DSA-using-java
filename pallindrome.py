from functools import lru_cache
def isPallindrome(s:str) -> bool:
    @lru_cache(None)
    def recursion(left:int,right:int) -> bool:
        if left > right:
            return True 
        if s[left] == s[right]:
            recursion(left+1,right-1)
        else:
            return False
        return True
    return recursion(0,len(s)-1)

while True: print(isPallindrome(input("Str : ")))