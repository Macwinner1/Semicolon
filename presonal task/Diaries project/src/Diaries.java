import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Diaries {
    List<Diary> diaries = new List<Diary>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Diary> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Diary diary) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Diary> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Diary> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Diary get(int index) {
            return null;
        }

        @Override
        public Diary set(int index, Diary element) {
            return null;
        }

        @Override
        public void add(int index, Diary element) {

        }

        @Override
        public Diary remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Diary> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Diary> listIterator(int index) {
            return null;
        }

        @Override
        public List<Diary> subList(int fromIndex, int toIndex) {
            return List.of();
        }
    }
}
