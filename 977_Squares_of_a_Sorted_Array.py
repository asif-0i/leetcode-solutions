class Solution:
    def sortedSquares(self, nums: list[int]) -> list[int]:
        for idx, n in enumerate(nums):
            nums[idx] = n * n

        nums.sort()

        return nums
