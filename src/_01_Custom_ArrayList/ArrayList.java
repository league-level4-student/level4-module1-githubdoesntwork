package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] array;

	public ArrayList() {
		array = (T[]) new Object[0];

	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return array[loc];
	}

	public void add(T val) {
		T[] tempArray = (T[]) new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		tempArray[array.length] = val;
		array = tempArray;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] tempArray = (T[]) new Object[array.length + 1];
		for (int i = 0; i < array.length + 1; i++) {
			if (i < loc) {
				tempArray[i] = array[i];
			} else if(i==loc){
				tempArray[i] = val;
			}else if(i>loc) {
				tempArray[i] = array[i-1];
			}
		}
		array = tempArray;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] tempArray = (T[]) new Object[array.length];
		for (int i = 0; i < array.length; i++) {
			if(i!=loc) {
			tempArray[i] = array[i];
			}else {
				tempArray[i] = val;
			}
		}
		array = tempArray;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {

	}

	public boolean contains(T val) {

		return false;
	}
}