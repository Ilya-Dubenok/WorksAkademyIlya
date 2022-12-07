package home_work_5.containter;


import home_work_5.api.Comparator;

import java.util.*;
import java.util.function.Consumer;

public class DataContainer<T> implements Iterable<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Добавляет элемент в T[]data. Добавляет элемент на последнее "свободное"
     * место в T[]data и возвращает индекс, на место которого был добавлен элемент, или -1
     * если item==null
     * @param item элемент для добавления
     * @return индекс, на место которого был добавлен элемент
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }

        if (isFull()) {
            extendData();
            data[data.length - 1] = item;
            return data.length - 1;

        } else {

            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                }
            }

        }
        return -1;

    }

    /**
     * Сортирует T[]data алгоритмом шейкерной сортировки. Пропускает null значения
     * @param comparator компаратор, по которому будет происходить сортировка
     */
    public void sort(Comparator<? super T> comparator) {

        int start = 0;
        int end = data.length - 1;
        boolean flag = true;

        while (start < end && flag) {
            flag = false;

            for (int i = start, a = start; i < end && a < end; i++, a++) {

                if (data[i] == null) {
                    continue;
                }
                /*долго же мне пришлось думать над этим моментом,
                  чтобы правильно пропускат null
                */
                if (data[a + 1] == null) {
                    i--;
                    continue;
                }
                if (comparator.compare(data[i], data[a + 1]) > 0) {
                    T temp = data[a + 1];
                    data[a + 1] = data[i];
                    data[i] = temp;
                    flag = true;
                    i = a;
                }

            }
            end--;
            for (int i = end, a = end; i > start && a > start; i--, a--) {
                if (data[i] == null) {
                    continue;
                }
                if (data[a - 1] == null) {
                    i++;
                    continue;
                }
                if (comparator.compare(data[i], data[a - 1]) < 0) {
                    T temp = data[a - 1];
                    data[a - 1] = data[i];
                    data[i] = temp;
                    flag = true;
                }

            }
            start++;


        }

    }

    /**
     * Сортирует T[]data в переданном dataContainer.
     * Это ведь еще не лямбда, так?
     * @param dataContainer
     * @param <T>
     */
    public static <T extends Comparable> void sort(DataContainer<T> dataContainer) {
        dataContainer.sort(new home_work_5.api.Comparator<T>() {
            @Override
            public double compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     * Сортирует элементы в dataContainer
     * @param dataContainer
     * @param comparator
     * @param <T>
     */
    public static <T> void sort(DataContainer<T> dataContainer, Comparator<T> comparator) {
        dataContainer.sort(comparator);
    }

    /**
     * Возвращает значение элемента массива по индексу, или null, если такой ячейки нет
     * @param index индекс ячейки, значение которой возвращается
     * @return
     */
    public T get(int index) {
        if (index >= data.length || index < 0) {
            return null;
        } else {
            return data[index];
        }
    }

    /**
     * Возвращает массив T[]data
     * @return
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Удаляет первую найденную ячейку массива, содержащую заданный элемент
     * @param item элемент, ячейку, содержащую который, необходимо удалить
     * @return true если операция удалась
     */
    public boolean delete(T item) {
        if (item == null) {
            return false;
        }

        int temp = -1;
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                temp = i;
                break;
            }
        }

        if (temp != -1) {
            return delete(temp);
        }
        return false;

    }

    /**
     * Удаляет из T[]data ячейку по заданному индексу, делая итоговый размер T[]data меньше на 1
     * @param index Индекс ячейки, которую нужно удалить
     * @return true если операция удалась
     */
    public boolean delete(int index) {
        if (index >= data.length || index < 0) {
            return false;
        }

        T[] temp1 = Arrays.copyOfRange(data, 0, index);
        T[] temp2 = Arrays.copyOfRange(data, index + 1, data.length);
        this.data = Arrays.copyOf(temp1, temp1.length + temp2.length);
        copyTillEnd(temp2);
        return true;

    }

    /**
     * Добавляет в T[] data все элементы переданного массива в конец
     * @param toCopy массив,элементы которого копируем
     */
    private void copyTillEnd(T[] toCopy) {
        for (T t : toCopy) {
            add(t);
        }
    }

    /**
     * Проверяет, имеется ли свободное место в массиве T[]data
     * @return true если массив не имеет ячейки со значением null
     */
    private boolean isFull() {

        for (T datum : data) {
            if (datum == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Увеличивает размер массива на 1 ячейку
     */
    private void extendData() {
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
    }

    @Override
    public String toString() {
        String res = "[";
        boolean flag = false;
        for (T datum : data) {

            if (datum != null) {
                if (flag) {
                    res += ", ";
                }
                res += datum.toString();
            }
            flag = true;
        }
        res += "]";

        return res;
    }


    private static final Iterator<?> EMPTYITERATOR = new Iterator<Object>() {
        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new java.util.NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    };

    /**
     * Возвращает EMPTYITERATOR. Типа я знаю, что это такое)
     * @param <A>
     * @return
     */
    private static <A> Iterator<A> emptyIterator() {
        return (Iterator<A>) EMPTYITERATOR;
    }


    /**
     * Возращает итератор для этого класса
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        if (data.length < 1) {
            return emptyIterator();
        }
        return new Iterator<T>() {
            int cursor;
            int lastRet = -1;

            @Override
            public boolean hasNext() {
                return cursor != data.length;
            }

            @Override
            public T next() {
                int i = cursor;
                if (i > data.length) {
                    throw new NoSuchElementException();
                }
                T[] result = getItems();
                if (i >= result.length) {
                    throw new ConcurrentModificationException();
                }
                cursor = i + 1;
                return result[lastRet = i];
            }


        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
