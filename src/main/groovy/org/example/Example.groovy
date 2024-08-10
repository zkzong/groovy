package org.example

import org.junit.Test


/**
 * @Author: zongz
 * @Date: 2024/8/10
 */
class Example {

//    static void main(String[] args) {
//        // One can see the use of a semi-colon after each statement
//        def x = 5;
//        // Using a simple println statement to print output to the console
//        println('Hello World');
//    }

//    static void main(String[] args) {
//        //Example of a int datatype
//        int x = 5;
//
//        //Example of a long datatype
//        long y = 100L;
//
//        //Example of a floating point datatype
//        float a = 10.56f;
//
//        //Example of a double datatype
//        double b = 10.5e40;
//
//        //Example of a BigInteger datatype
//        BigInteger bi = 30g;
//
//        //Example of a BigDecimal datatype
//        BigDecimal bd = 3.5g;
//
//        println(x);
//        println(y);
//        println(a);
//        println(b);
//        println(bi);
//        println(bd);
//    }

//    static void main(String[] args) {
//        // x is defined as a variable
//        String x = "Hello";
//
//        // The value of the variable is printed to the console
//        println(x);
//    }

//    static void main(String[] args) {
//        // Defining a variable in lowercase
//        int x = 5;
//
//        // Defining a variable in uppercase
//        int X = 6;
//
//        // Defining a variable with the underscore in it's name
//        def _Name = "Joe";
//
//        println(x);
//        println(X);
//        println(_Name);
//    }

//    static void main(String[] args) {
//        //Initializing 2 variables
//        int x = 5;
//        int X = 6;
//
//        //Printing the value of the variables to the console
//        println("The value of x is " + x + "The value of X is " + X);
//    }

    @Test
    void range() {
        def range = 5..10;
        println(range);
        println(range.get(2));
    }

//    static def DisplayName() {
//        println("This is how methods work in groovy");
//        println("This is an example of a simple method");
//    }
//
//    static void main(String[] args) {
//        DisplayName();
//    }

    /**
     * 方法参数
     * @param a
     * @param b
     */
    void sum(int a, int b) {
        int c = a + b;
        println(c);
    }

    @Test
    void sumdemo() {
        sum(10, 5);
    }

    /**
     * 默认参数
     * @param a
     * @param b
     */
    void sum1(int a, int b = 5) {
        int c = a + b;
        println(c);
    }

    @Test
    void sum1demo() {
        sum1(6);
    }

    void sum2(int a, int b = 5) {
        int c = a + b;
        println(c);
    }

    void sum2demo() {
        sum2(6, 6);
    }

    /**
     * 方法返回值
     * @param a
     * @param b
     * @return
     */
    int sum3(int a, int b = 5) {
        int c = a + b;
        return c;
    }

    @Test
    void sum3demo() {
        println(sum3(6));
    }

    int x;

    public int getX() {
        return x;
    }

    public void setX(int pX) {
        x = pX;
    }

    /**
     * 实例方法
     */
    @Test
    void getXdemo() {
        Example ex = new Example();
        ex.setX(100);
        println(ex.getX());
    }

    static int xx = 100;

    /**
     * 本地和外部参数名称
     * @return
     */
    public static int getXx() {
        int lx = 200;
        println(lx);
        return xx;
    }

    @Test
    void getXxdemo() {
        println getXx()
    }

    int xxx = 100;

    /**
     * 方法属性
     * @return
     */
    public int getXxx() {
        this.xxx = 200;
        return xxx;
    }

    @Test
    void getXxxdemo() {
        Example ex = new Example();
        println(ex.getXxx());
    }

    /**
     * 读取文件
     */
    @Test
    void readfile() {
        new File("D:/Example.txt").eachLine {
            line -> println "line : $line";
        }
    }

    /**
     * 读取文件的内容到字符串
     */
    @Test
    void text() {
        File file = new File("D:/Example.txt")
        println file.text
    }

    /**
     * 写入文件
     */
    @Test
    void write() {
        new File('D:/', 'Example.txt').withWriter('utf-8') {
            writer -> writer.writeLine 'Hello World'
        }
    }

    /**
     * 获取文件的大小
     */
    @Test
    void filesize() {
        File file = new File("D:/Example.txt")
        println "The file ${file.absolutePath} has ${file.length()} bytes"
    }
    /**
     * 测试文件是否是目录
     */
    @Test
    void isDir() {
        def file = new File('D:/')
        println "File? ${file.isFile()}"
        println "Directory? ${file.isDirectory()}"
    }

}