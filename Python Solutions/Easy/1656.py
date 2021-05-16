from typing import *

class OrderedStream:
    """
        Time: O(n), where n = len(self.stream)
        Space: O(n), where n = len(self.stream)
    """
    
    def __init__(self, n: int):
        self.stream = ["" for x in range(n)]
        self.index = 0

    def insert(self, idKey: int, value: str) -> List[str]:
        self.stream[idKey - 1] = value
        stream = self.stream
        result = []
        
        i = self.index
        while i < len(stream) and stream[i] != "":
            result.append(stream[i])
            i += 1
        self.index = i
        
        return result