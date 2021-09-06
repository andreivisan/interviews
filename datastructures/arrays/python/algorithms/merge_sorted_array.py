def merge(nums1, m, nums2, n):
    p1 = m - 1
    p2 = n - 1

    for p in reversed(range(len(nums1))):
        if p2 < 0:
            break
        if p1 >= 0 and nums1[p1] > nums2[p2]:
            nums1[p] = nums1[p1]
            p1 -= 1
        else:
            nums1[p] = nums2[p2]
            p2 -= 1


def main():
    nums1 = [1, 2, 3, 0, 0, 0]
    nums2 = [2, 5, 6]
    merge(nums1, 3, nums2, 3)
    print(nums1)


if __name__ == "__main__":
    main()
