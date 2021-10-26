class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        num_list = {}
        for n in nums:
            if n in num_list:
                return True
            else:
                num_list[n] = True
