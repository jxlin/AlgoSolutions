/*
 * Given an Iterator class interface with methods: next() 
 * and hasNext(), design and implement a PeekingIterator 
 * that support the peek() operation -- it essentially 
 * peek() at the element that will be returned by the next 
 * call to next().

 * Here is an example. Assume that the iterator is 
 * initialized to the beginning of the list: [1, 2, 3].
 * 
 * Call next() gets you 1, the first element in the list.
 * 
 * Now you call peek() and it returns 2, the next element. 
 * Calling next() after that still return 2.
 * 
 * You call next() the final time and it returns 3, 
 * the last element. Calling hasNext() after that should 
 * return false.
 */
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
public class PeekingIterator implements Iterator<Integer> {

    private PeekingIterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public Integer peek() {
        if (iterator.hasNext()) {
            
        }
    }

    @Override
    public Integer next() {

    }

    @Override
    public boolean hasNext() {

    }

}
