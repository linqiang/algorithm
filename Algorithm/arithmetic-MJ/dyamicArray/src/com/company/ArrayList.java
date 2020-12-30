package com.company;

public class ArrayList {

    private int size;//元素数量
    private int[] elements; //所有元素

    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FOUND = -1;
    /*
    * 数组的容量
    * */
    public ArrayList(int capaticy){
        capaticy = (capaticy < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capaticy;
         elements = new int[capaticy];
    }

    public ArrayList(){
//        elements = new int[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY);
    }


    /*
    * 清除所有元素
    * */

    public void clear(){
        size = 0;
    }

    /*
    * 元素数量
    * */
    public int size(){
        return size;
    }

    /*
    * 是否为空
    * */
    public boolean isEmpty(){
        return size == 0;
    }

    /*
    * 是否包含某个元素
    * */
    public boolean contains(int element){
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /*
    * 添加某个元素到尾部
    * */
    public void add(int element){
        elements[size] = element;
        size++;
    }

    /*
    * 获取index位置的元素
    * */

    public int get(int index){
        if (index < 0 || index >= size){
            throw  new IndexOutOfBoundsException("Index" + index +", Size" + size );
        }
        return elements[index];
    }

    /*
    *   设置index 位置的元素
    * @param index
    * @return  原来的元素
    * */
    public int set(int index, int element){
        if (index < 0 || index >= size){
            throw  new IndexOutOfBoundsException("Index" + index +", Size" + size );
        }
        int old = elements[index];
        elements[index] = element;
        return old;

    }

    ///*
    //
    // 在index位置插入一个元素
    // */

    public  void add(int index, int element){
        if (index < 0 || index >= size){
            throw  new IndexOutOfBoundsException("Index" + index +", Size" + size );
        }
        for (int i = size - 1; i >- size - 1; i--) {
            elements[i] = elements[i + 1];
        }
        elements[index] = element;
        size++;
    }

    /*
     *   删除index位置的元素
     * @param index
     * @return  原来的元素
     * */
    public int remove(int index){
        if (index < 0 || index >= size){
            throw  new IndexOutOfBoundsException("Index" + index +", Size" + size );
        }
        int old = elements[index];
        for (int i = index + 1  ; i <= size - 1; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return old;
    }

    /*
     *   查看元素索引
     * @param index
     * @return  原来的元素
     * */
    public int indexOf(int element){
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) return i;
        }
        return ELEMENT_NOT_FOUND;
    }


    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("size=").append(size).append(",[");
        for (int i = 0; i < size ; i++) {
            if (i != 0){
                string.append(",");
            }
            string.append(elements[i]);
//            if (i != size - 1){
//                string.append(",");
//            }
        }
        string.append("]");
        return string.toString();
    }


}
