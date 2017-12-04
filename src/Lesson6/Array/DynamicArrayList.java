package Lesson6.Array;

/**
 * Created by Zu on 03.12.2017.
 */
public class DynamicArrayList implements CustomList{

    private int[] array;
    private int realElementsCount;

    public DynamicArrayList() {
        array = new int[5];
    }

    @Override
    public boolean add(int value){

        if(realElementsCount == array.length){
            int[] oldArray = array;
            array = new int[(int)(array.length * 1.5)];
            System.arraycopy(oldArray,0,array,0,oldArray.length);
            System.out.println("oldArray lenght " + oldArray.length);
            System.out.println("newArray(array now) lenght " + array.length);
        }
        array[realElementsCount] = value;
        realElementsCount++;
        return false;
    }

    @Override
    public void print() {
        for (int index = 0; index < realElementsCount; index++)
            System.out.print(array[index] + " ");

    }

    @Override
    public int getArrayLenght() {
        return array.length;
    }

    @Override
    public void remove(int index) {

        array[index] = 0;
        System.arraycopy(array,index+1,array,index,array.length - index - 1);
        realElementsCount--;
    }
}
