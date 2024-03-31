import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class BubbleSortTest {

    // 1.空数组测试用例
    @Test
    public void test1() {
        int[] arr = {};
        int[] expected = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 2.单个元素数组测试用例
    @Test
    public void test2() {
        int[] arr = {5};
        int[] expected = {5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 3. 已排序数组测试用例
    @Test
    public void test3() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 4. 逆序数组测试用例
    @Test
    public void test4() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    //5.随机顺序数组测试用例
    @Test
    public void test5() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] expected = {1, 1, 2, 3, 4, 5, 6, 9};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 6.包含重复元素的数组测试用例
    @Test
    public void test6() {
        int[] arr = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};
        int[] expected = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 7.数组长度为奇数测试用例
    @Test
    public void test7() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int[] expected = {1, 1, 2, 3, 4, 5, 9};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 8.数组长度为偶数测试用例
    @Test
    public void test8() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] expected = {1, 1, 2, 3, 4, 5, 6, 9};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 9.数组中所有元素相等测试用例
    @Test
    public void test9() {
        int[] arr = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 10.数组中包含正数和负数测试用例
    @Test
    public void test10() {
        int[] arr = {-5, 3, -2, 4, -1};
        int[] expected = {-5, -2, -1, 3, 4};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 11.大数组测试用例
    @Test
    public void test11() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8, 4};
        int[] expected = {1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8, 9, 9, 9};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 12.超大数字数组测试用例
    @Test
    public void test12() {
        int[] arr = {9999999, 123456789, 987654321, 55555555, 88888888};
        int[] expected = {9999999, 55555555, 88888888,123456789, 987654321};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 13.全是负数的数组测试用例
    @Test
    public void test13() {
        int[] arr = {-9, -8, -7, -6, -5, -4, -3, -2, -1};
        int[] expected = {-9, -8, -7, -6, -5, -4, -3, -2, -1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 14. 所有元素为零的数组测试用例
    @Test
    public void test14() {
        int[] arr = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 15. 正序和逆序交替的数组测试用例
    @Test
    public void test15() {
        int[] arr = {1, 5, 2, 4, 3};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 16. 所有元素为同一负数的数组测试用例
    @Test
    public void test16() {
        int[] arr = {-3, -3, -3, -3, -3};
        int[] expected = {-3, -3, -3, -3, -3};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 17. 对称数组测试用例
    @Test
    public void test17() {
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] expected = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    // 18. 最小和最大值在数组两端的测试用例
    @Test
    public void test18() {
        int[] arr = {Integer.MIN_VALUE, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE};
        int[] expected = {Integer.MIN_VALUE, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

}









