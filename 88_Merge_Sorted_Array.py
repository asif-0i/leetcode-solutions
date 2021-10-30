class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        max = m + n - 1
        i = m - 1
        j = n - 1

        while i >= 0 and j >= 0:
            if nums2[j] > nums1[i]:
                nums1[max] = nums2[j]
                j -= 1
                max -= 1
            else:
                nums1[max] = nums1[i]
                max -= 1
                i -= 1

        while j >= 0:
            nums1[max] = nums2[j]
            j -= 1
            max -= 1
