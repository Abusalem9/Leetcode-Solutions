class Solution:
    def numberOfArrays(self, differences: List[int], lower: int, upper: int) -> int:

        current = 0
        low = 0
        high = 0

        for d in differences:
            current += d

            low = min(low, current)
            high = max(high, current)

        low += upper - high

        return max(low - lower + 1, 0)
