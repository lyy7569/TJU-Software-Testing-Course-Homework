import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BackPackTest {

    // 1.边界值测试用例: 空背包，没有物品可选择
    @Test
    public void test1() {
        int[] weights = {};
        int[] values = {};
        int capacity = 10;
        int[] expected = {0, 0};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 2.边界值测试用例: 背包容量为0，无法选择任何物品
    @Test
    public void test2() {
        int[] weights = {1, 2, 3};
        int[] values = {5, 6, 7};
        int capacity = 0;
        int[] expected = {0,0,0,0, 0};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 3.等价类划分测试用例: 物品数量为1
    @Test
    public void test3() {
        int[] weights = {2};
        int[] values = {5};
        int capacity = 3;
        int[] expected = {5, 1, 2};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 4.等价类划分测试用例: 物品数量为2
    @Test
    public void test4() {
        int[] weights = {2, 3};
        int[] values = {5, 6};
        int capacity = 5;
        int[] expected = {11, 1, 1,5};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 5.特定用例测试: 背包容量刚好等于物品总重量
    @Test
    public void test5() {
        int[] weights = {2, 3, 4};
        int[] values = {5, 6, 7};
        int capacity = 9;
        int[] expected = {18, 1, 1, 1,9};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 6.特定用例测试: 物品价值全部相同
    @Test
    public void test6() {
        int[] weights = {2, 3, 4};
        int[] values = {5, 5, 5};
        int capacity = 5;
        int[] expected = {10, 1, 1,0,5};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 7.特定用例测试: 物品重量全部相同
    @Test
    public void test7() {
        int[] weights = {3, 3, 3};
        int[] values = {5, 6, 7};
        int capacity = 6;
        int[] expected = {13,0, 1, 1,6};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 8.特定用例测试: 物品价值和重量均为负数
    @Test
    public void test8() {
        int[] weights = {-2, -3, -4};
        int[] values = {-5, -6, -7};
        int capacity = 5;
        int[] expected = {0,0,0,0, 0};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 9.特定用例测试: 选择第一个物品后，背包容量不足以选择其他物品
    @Test
    public void test9() {
        int[] weights = {2, 3, 4};
        int[] values = {5, 6, 7};
        int capacity = 2;
        int[] expected = {5, 1, 0, 0,2};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 10.特定用例测试: 选择最后一个物品后，背包容量仍有余量
    @Test
    public void test10() {
        int[] weights = {3, 3, 4};
        int[] values = {5, 6, 7};
        int capacity = 5;
        int[] expected = {7, 0, 0, 1,4};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 11.边界值测试用例: 背包容量刚好为一个物品的重量
    @Test
    public void test11() {
        int[] weights = {2, 3, 4};
        int[] values = {5, 6, 7};
        int capacity = 2;
        int[] expected = {5, 1, 0,0,2};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 12.边界值测试用例: 背包容量刚好为最大值
    @Test
    public void test12() {
        int[] weights = {2, 3, 4};
        int[] values = {5, 6, 7};
        int capacity = Integer.MAX_VALUE;
        int[] expected = {18, 1, 1, 1,9};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 13.特定用例测试: 包含大数值的物品重量和价值
    @Test
    public void test13() {
        int[] weights = {1000, 2000, 3000};
        int[] values = {10000, 20000, 30000};
        int capacity = 4000;
        int[] expected = {40000, 1, 0, 1,4000};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }

    // 14.特定用例测试: 包含负数的背包容量
    @Test
    public void test14() {
        int[] weights = {2, 3, 4};
        int[] values = {5, 6, 7};
        int capacity = -5;
        int[] expected = {0,0,0,0, 0};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }
    // 15.特定用例测试: 物品重量随物品价值增加而减少
    @Test
    public void test15() {
        int[] weights = {5, 4, 3, 2, 1};
        int[] values = {1, 2, 3, 4, 5};
        int capacity = 6;
        int[] expected = {12, 0,0,1, 1, 1, 6};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }
    // 16. 特定用例测试: 所有物品都无法放入背包，因为它们的价值都为0
    @Test
    public void test16() {
        int[] weights = {2, 3, 4};
        int[] values = {0, 0, 0};
        int capacity = 5;
        int[] expected = {0, 0,0,0,0};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }
    // 17. 特定用例测试: 所有物品都有零重量，但价值不为零
    @Test
    public void test17() {
        int[] weights = {0, 0, 0};
        int[] values = {5, 6, 7};
        int capacity = 5;
        int[] expected = {18, 1, 1, 1,0};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }
    // 18. 特定用例测试: weights 和 values数组长短不一致
    @Test
    public void test18() {
        int[] weights = {1, 3, 4};
        int[] values = {5, 6};
        int capacity = 5;
        int[] expected = {0,0,0,0,0};
        assertArrayEquals(expected, BackPack.backPack(weights, values, capacity));
    }
}

