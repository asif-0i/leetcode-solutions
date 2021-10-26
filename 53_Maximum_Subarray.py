class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        max_local = max_global = nums[0]

        for i in range(1, len(nums)):
            max_local = max(nums[i], max_local + nums[i])
            if max_local > max_global:
                max_global = max_local

        return max_global
