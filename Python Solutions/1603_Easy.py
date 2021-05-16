from typing import *

class ParkingSystem:

    def __init__(self, big: int, medium: int, small: int):
        self.parkingSlots = [big, medium, small]

    def addCar(self, carType: int) -> bool:
        if self.parkingSlots[carType - 1] == 0:
            return False
        
        self.parkingSlots[carType - 1] -= 1
        return True