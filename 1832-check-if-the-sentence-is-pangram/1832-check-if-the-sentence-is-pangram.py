class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        sentence=sentence.lower()
        inp='abcdefghijklmnopqrstuvwxyz'
        count=0
        for i in inp:
            if i in sentence:
                count+=1
        return count==26   
        
        