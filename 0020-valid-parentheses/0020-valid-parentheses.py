class Solution:
    def isValid(self, s: str) -> bool:
        st=[]
        pairs={')':'(','}':'{',']':'['}
        for ch in s:
            if ch in pairs.values():
                st.append(ch)
            else:
                if not st or st.pop()!=pairs[ch]:
                    return False   
        return not st

        