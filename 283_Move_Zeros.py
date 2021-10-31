class Solution:
    """
    ## Sub-optimal solution
    def moveZeroes(self, nums: list[int]) -> None:
        nonZeroTimes = 0

        for n in nums:
            if n != 0:
                nums[nonZeroTimes] = n
                nonZeroTimes += 1

        for i in range(nonZeroTimes, len(nums)):
            nums[i] = 0
    """

    # optimal solution
    def moveZeroes(self, nums):
        pos = 0

        for idx, n in enumerate(nums):
            if n != 0:
                nums[pos], nums[idx] = n, nums[pos]
                pos += 1

                # print(nums)
