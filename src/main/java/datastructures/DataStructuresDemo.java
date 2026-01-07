package datastructures;

import java.util.*;

/**
 * Java数组详细演示类
 * 详细介绍Java数组的所有操作，包括声明、初始化、访问、修改、遍历、排序、搜索等
 */
public class DataStructuresDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Java数组详细演示 ===");
        
        // 演示数组的各种声明和初始化方式
        demoArrayDeclarationAndInitialization();
        
        // 演示数组元素的访问和修改
        demoArrayElementAccess();
        
        // 演示多种数组遍历方式
        demoArrayTraversal();
        
        // 演示数组长度和边界检查
        demoArrayLengthAndBoundaries();
        
        // 演示数组排序操作
        demoArraySorting();
        
        // 演示数组搜索操作
        demoArraySearching();
        
        // 演示数组复制操作
        demoArrayCopy();
        
        // 演示多维数组的使用
        demoMultiDimensionalArray();
        
        // 演示数组与其他数据结构的转换
        demoArrayConversion();
    }
    
    /**
     * 演示数组的各种声明和初始化方式
     */
    public static void demoArrayDeclarationAndInitialization() {
        System.out.println("\n1. 数组的声明和初始化：");
        
        // 方式1：声明后再初始化
        System.out.println("1.1 声明后再初始化：");
        int[] intArray1; // 声明一个int类型的数组变量
        intArray1 = new int[5]; // 初始化数组，分配5个元素的内存空间
        System.out.println("intArray1: " + Arrays.toString(intArray1)); // 打印数组内容，未赋值时默认值为0
        
        // 方式2：声明的同时初始化
        System.out.println("\n1.2 声明的同时初始化：");
        int[] intArray2 = new int[5];
        System.out.println("intArray2: " + Arrays.toString(intArray2));
        
        // 方式3：声明并直接初始化元素值
        System.out.println("\n1.3 声明并直接初始化元素值：");
        int[] intArray3 = {1, 2, 3, 4, 5}; // 使用数组字面量初始化
        System.out.println("intArray3: " + Arrays.toString(intArray3));
        
        // 方式4：动态初始化并赋值
        System.out.println("\n1.4 动态初始化并赋值：");
        int[] intArray4 = new int[5];
        for (int i = 0; i < intArray4.length; i++) {
            intArray4[i] = i * 10;
        }
        System.out.println("intArray4: " + Arrays.toString(intArray4));
        
        // 不同数据类型数组的默认值
        System.out.println("\n1.5 不同数据类型数组的默认值：");
        byte[] byteArray = new byte[3];
        short[] shortArray = new short[3];
        long[] longArray = new long[3];
        float[] floatArray = new float[3];
        double[] doubleArray = new double[3];
        boolean[] booleanArray = new boolean[3];
        char[] charArray = new char[3];
        String[] stringArray = new String[3];
        
        System.out.println("byte数组默认值：" + Arrays.toString(byteArray)); // 0
        System.out.println("short数组默认值：" + Arrays.toString(shortArray)); // 0
        System.out.println("long数组默认值：" + Arrays.toString(longArray)); // 0
        System.out.println("float数组默认值：" + Arrays.toString(floatArray)); // 0.0
        System.out.println("double数组默认值：" + Arrays.toString(doubleArray)); // 0.0
        System.out.println("boolean数组默认值：" + Arrays.toString(booleanArray)); // false
        System.out.println("char数组默认值：" + Arrays.toString(charArray)); // \u0000 (空字符)
        System.out.println("String数组默认值：" + Arrays.toString(stringArray)); // null
    }
    
    /**
     * 演示数组元素的访问和修改
     */
    public static void demoArrayElementAccess() {
        System.out.println("\n2. 数组元素的访问和修改：");
        
        // 创建一个数组
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("原始数组：" + Arrays.toString(numbers));
        
        // 访问数组元素：使用索引访问，索引从0开始
        System.out.println("\n2.1 访问数组元素：");
        System.out.println("第一个元素 (索引0): " + numbers[0]);
        System.out.println("第三个元素 (索引2): " + numbers[2]);
        System.out.println("最后一个元素 (索引4): " + numbers[4]);
        
        // 修改数组元素：通过索引赋值
        System.out.println("\n2.2 修改数组元素：");
        numbers[1] = 25; // 修改索引1的元素
        numbers[4] = 55; // 修改索引4的元素
        System.out.println("修改后的数组：" + Arrays.toString(numbers));
    }
    
    /**
     * 演示多种数组遍历方式
     */
    public static void demoArrayTraversal() {
        System.out.println("\n3. 数组的遍历方式：");
        
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        System.out.println("数组内容：" + Arrays.toString(fruits));
        
        // 方式1：普通for循环遍历
        System.out.println("\n3.1 普通for循环遍历：");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("索引 " + i + ": " + fruits[i]);
        }
        
        // 方式2：增强for循环(foreach)遍历
        System.out.println("\n3.2 增强for循环(foreach)遍历：");
        for (String fruit : fruits) {
            System.out.println("水果: " + fruit);
        }
        
        // 方式3：使用Arrays.stream()遍历
        System.out.println("\n3.3 使用Arrays.stream()遍历：");
        Arrays.stream(fruits).forEach(fruit -> System.out.println("水果: " + fruit));
        
        // 方式4：使用Iterator遍历（先转换为List）
        System.out.println("\n3.4 使用Iterator遍历：");
        List<String> fruitList = Arrays.asList(fruits);
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            System.out.println("水果: " + iterator.next());
        }
    }
    
    /**
     * 演示数组长度和边界检查
     */
    public static void demoArrayLengthAndBoundaries() {
        System.out.println("\n4. 数组长度和边界检查：");
        
        int[] numbers = {1, 2, 3, 4, 5};
        
        // 获取数组长度：使用length属性
        System.out.println("\n4.1 数组长度：");
        System.out.println("数组长度: " + numbers.length);
        
        // 边界检查：索引范围是0到length-1
        System.out.println("\n4.2 边界检查：");
        System.out.println("有效索引范围: 0 到 " + (numbers.length - 1));
        
        // 演示数组越界异常
        System.out.println("\n4.3 数组越界异常演示：");
        try {
            // 尝试访问不存在的索引（长度为5，索引最大为4）
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到数组越界异常: " + e.getMessage());
        }
    }
    
    /**
     * 演示数组排序操作
     */
    public static void demoArraySorting() {
        System.out.println("\n5. 数组排序操作：");
        
        // 整数数组排序
        System.out.println("\n5.1 整数数组排序：");
        int[] intNumbers = {5, 2, 9, 1, 5, 6};
        System.out.println("排序前: " + Arrays.toString(intNumbers));
        Arrays.sort(intNumbers); // 默认升序排序
        System.out.println("排序后: " + Arrays.toString(intNumbers));
        
        // 字符串数组排序
        System.out.println("\n5.2 字符串数组排序：");
        String[] names = {"Charlie", "Alice", "Bob", "David"};
        System.out.println("排序前: " + Arrays.toString(names));
        Arrays.sort(names); // 按字母顺序排序
        System.out.println("排序后: " + Arrays.toString(names));
        
        // 自定义排序（降序）
        System.out.println("\n5.3 自定义排序（降序）：");
        Integer[] boxedNumbers = {5, 2, 9, 1, 5, 6};
        System.out.println("排序前: " + Arrays.toString(boxedNumbers));
        Arrays.sort(boxedNumbers, Collections.reverseOrder());
        System.out.println("降序排序后: " + Arrays.toString(boxedNumbers));
        
        // 部分排序
        System.out.println("\n5.4 部分排序：");
        int[] partialNumbers = {5, 2, 9, 1, 5, 6};
        System.out.println("排序前: " + Arrays.toString(partialNumbers));
        Arrays.sort(partialNumbers, 1, 4); // 排序索引1到3的元素（不包括4）
        System.out.println("部分排序后: " + Arrays.toString(partialNumbers));
    }
    
    /**
     * 演示数组搜索操作
     */
    public static void demoArraySearching() {
        System.out.println("\n6. 数组搜索操作：");
        
        // 线性搜索（适用于任何数组）
        System.out.println("\n6.1 线性搜索：");
        int[] linearArray = {5, 2, 9, 1, 5, 6};
        int target = 9;
        int index = -1;
        
        for (int i = 0; i < linearArray.length; i++) {
            if (linearArray[i] == target) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("目标值 " + target + " 在数组中的索引是: " + index);
        } else {
            System.out.println("目标值 " + target + " 不在数组中");
        }
        
        // 二分搜索（仅适用于已排序的数组）
        System.out.println("\n6.2 二分搜索：");
        int[] sortedArray = {1, 2, 5, 5, 6, 9};
        target = 5;
        
        // 查找第一个匹配项
        index = Arrays.binarySearch(sortedArray, target);
        System.out.println("目标值 " + target + " 的索引是: " + index);
        
        // 查找不存在的值
        target = 7;
        index = Arrays.binarySearch(sortedArray, target);
        System.out.println("不存在的目标值 " + target + " 返回: " + index + " (负数表示插入位置)");
    }
    
    /**
     * 演示数组复制操作
     */
    public static void demoArrayCopy() {
        System.out.println("\n7. 数组复制操作：");
        
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("原始数组: " + Arrays.toString(originalArray));
        
        // 方式1：使用Arrays.copyOf()复制
        System.out.println("\n7.1 使用Arrays.copyOf()复制：");
        int[] copy1 = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("复制后的数组: " + Arrays.toString(copy1));
        
        // 扩展数组长度
        int[] copy2 = Arrays.copyOf(originalArray, 8);
        System.out.println("扩展长度后的数组: " + Arrays.toString(copy2));
        
        // 方式2：使用Arrays.copyOfRange()复制指定范围
        System.out.println("\n7.2 使用Arrays.copyOfRange()复制指定范围：");
        int[] copy3 = Arrays.copyOfRange(originalArray, 1, 4); // 复制索引1到3的元素
        System.out.println("复制范围(1-3)后的数组: " + Arrays.toString(copy3));
        
        // 方式3：使用System.arraycopy()复制
        System.out.println("\n7.3 使用System.arraycopy()复制：");
        int[] copy4 = new int[originalArray.length];
        // 参数：源数组, 源起始位置, 目标数组, 目标起始位置, 复制长度
        System.arraycopy(originalArray, 0, copy4, 0, originalArray.length);
        System.out.println("复制后的数组: " + Arrays.toString(copy4));
        
        // 方式4：使用clone()方法复制
        System.out.println("\n7.4 使用clone()方法复制：");
        int[] copy5 = originalArray.clone();
        System.out.println("复制后的数组: " + Arrays.toString(copy5));
    }
    
    /**
     * 演示多维数组的使用
     */
    public static void demoMultiDimensionalArray() {
        System.out.println("\n8. 多维数组的使用：");
        
        // 二维数组的声明和初始化
        System.out.println("\n8.1 二维数组的声明和初始化：");
        
        // 方式1：直接初始化
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("二维数组matrix1:");
        printMatrix(matrix1);
        
        // 方式2：动态初始化
        int[][] matrix2 = new int[3][3];
        // 填充值
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("\n二维数组matrix2:");
        printMatrix(matrix2);
        
        // 访问二维数组元素
        System.out.println("\n8.2 访问二维数组元素：");
        System.out.println("matrix1[1][2] = " + matrix1[1][2]); // 访问第二行第三列的元素
        
        // 不规则二维数组（每行长度不同）
        System.out.println("\n8.3 不规则二维数组：");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[5]; // 第一行5个元素
        jaggedArray[1] = new int[3]; // 第二行3个元素
        jaggedArray[2] = new int[4]; // 第三行4个元素
        
        // 填充不规则数组
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = i * 10 + j;
            }
        }
        
        // 打印不规则数组
        System.out.println("不规则二维数组：");
        for (int[] row : jaggedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    /**
     * 打印二维数组的辅助方法
     */
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    /**
     * 演示数组与其他数据结构的转换
     */
    public static void demoArrayConversion() {
        System.out.println("\n9. 数组与其他数据结构的转换：");
        
        // 数组转List
        System.out.println("\n9.1 数组转List：");
        String[] array = {"A", "B", "C", "D"};
        List<String> list = Arrays.asList(array);
        System.out.println("数组: " + Arrays.toString(array));
        System.out.println("转换为List: " + list);
        
        // List转数组
        System.out.println("\n9.2 List转数组：");
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] numArray = numList.toArray(new Integer[0]);
        System.out.println("List: " + numList);
        System.out.println("转换为数组: " + Arrays.toString(numArray));
        
        // 数组转Set
        System.out.println("\n9.3 数组转Set：");
        Integer[] duplicateArray = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new HashSet<>(Arrays.asList(duplicateArray));
        System.out.println("原始数组(含重复元素): " + Arrays.toString(duplicateArray));
        System.out.println("转换为Set(去重): " + set);
        
        // 数组转Stream
        System.out.println("\n9.4 数组转Stream：");
        int[] intArray = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(intArray).sum();
        System.out.println("数组: " + Arrays.toString(intArray));
        System.out.println("数组元素的和(使用Stream): " + sum);
    }
}