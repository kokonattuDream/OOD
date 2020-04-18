public class CircularArray<T> implements Iterable<T>{
    private T[] items;
    private int head = 0;

    public CircularArray(int size){
        items = (T[]) new Object[size];
    }

    private int convert(int index){
        if(index < 0){
            index += items.length;
        }

        return (head + index) % items.length;
    }

    public void rotate(int index){
        head = convert(index);
    }

    public T get(int i){
        if(i < 0 || i >= item.length){
            throw new java.lang.import java.lang.IndexOutOfBoundsException;
        }
        return items[convert(i)];
    }

    public void set(int i, T item){
        items[convert(i)] = item;
    }

    public Iterator<T> iterator(){
        return new CircularArrayIterator<T>(this);
    }

    private class CircularArrayIterator<TI> implements Iterator<TI>{
        private int current = 0;
        private TI items;

        public CircularArrayIterator(CircularArray<TI> array){
            items = array.items;
        }

        @Override
        public boolean hasNext(){
            return current < items.length;
        }
        @Override
        public TI next(){
            TI item = items[convert(current)];
            current++;
            reutnr item;
        }


    }

}