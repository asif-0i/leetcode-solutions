class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        l = 0
        r = len(numbers) - 1
        while l < r:
            potentialMatch = numbers[l] + numbers[r]
            if potentialMatch == target:
                return [l + 1, r + 1]
            elif potentialMatch > target:
                r -= 1
            elif potentialMatch < target:
                l += 1

        return []
