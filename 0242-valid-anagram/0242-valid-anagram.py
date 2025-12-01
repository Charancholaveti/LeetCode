class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # count=[0]*26
        # for x in s:
        #     count[ord(x)-97]+=1
        # for y in t:
        #     count[ord(y)-97]-=1
        # for value in count:
        #     if value!=0:
        #         return False
        # return True   
        sorted_s=sorted(s)
        sorted_t=sorted(t)
        return sorted_s==sorted_t             