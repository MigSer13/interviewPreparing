package ru.home.lesson2;

public class MyArrayList<T> {
    private Object[] arr;
    private int count = 0;

    public MyArrayList(Object[] arr) {
        this.arr = new Object[10];
    }


 //   List<String> list = new ArrayList<>();

    public void add(T t){
        if(count >= arr.length-1){
            upsizeArr();
        }
        arr[count] = t;
        count++;
    }

    public T get(int index){
        return (T) arr[index];
    }

    public void remove(int index){
        for (int i = index; i < arr.length; i++) {
            if(index == arr.length-1){
                arr[i] = null;
                break;
            }
            arr[i] = arr[i+1];
        }
    }
    public void remove(Object o){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == o){
                remove(i);
                break;
            }
        }
    }

    private void upsizeArr() {
        Object[] newArr = new Object[arr.length + arr.length/2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
