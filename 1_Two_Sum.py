class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        d = {}
        for idx, n in enumerate(nums):
            if target - n in d:
                return [idx, d.get(target - n)]

            else:
                d[n] = idx

        return []
