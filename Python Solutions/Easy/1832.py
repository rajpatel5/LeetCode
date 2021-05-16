from typing import *

class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        """
            Time: O(n), where n = len(sentence)
            Space: O(1)
        """
        
        if len(sentence) < 26:
            return False
        
        letters = {
            'a': False, 'b': False, 'c': False, 'd': False, 'e': False, 'f': False,
            'g': False, 'h': False, 'i': False, 'j': False, 'k': False, 'l': False,
            'm': False, 'n': False, 'o': False, 'p': False, 'q': False, 'r': False,
            's': False, 't': False, 'u': False, 'v': False, 'w': False, 'x': False,
            'y': False, 'z': False
        }
        
        for char in sentence:
            letters[char] = True
            
        for letter in letters:
            if not letters[letter]:
                return False
            
        return True
        