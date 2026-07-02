class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        m=len(s)
        n=len(t)
        if m!=n:
            return False
        elif sorted(s)==sorted(t):
            return True
        else:
            return False