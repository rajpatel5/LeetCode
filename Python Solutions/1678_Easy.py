from typing import *

class Solution:
    def interpret(self, command: str) -> str:
        """
            Time: O(n), where n = len(command)
            Space: O(n), where n = len(command)
        """
        
        result = ""
        
        i = 0
        while i < len(command):
            if command[i] == "G":
                result += "G"  
            elif command[i] == "(":
                if command[i + 1] == ")":
                    result += "o"
                elif command[i + 1] == "a":
                    result += "al"
                    
            i += 1
            
        return result