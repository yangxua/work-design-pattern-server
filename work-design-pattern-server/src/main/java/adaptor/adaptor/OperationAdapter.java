package adaptor.adaptor;

import adaptor.adaptee.BinarySearch;
import adaptor.adaptee.QuickSort;
import adaptor.target.ScoreOperation;

/**
 * @Auther: allanyang
 * @Date: 2019/4/6 14:41
 * @Description:
 */
public class OperationAdapter implements ScoreOperation {

    private BinarySearch binarySearch;
    private QuickSort quickSort;

    public OperationAdapter() {
        this.binarySearch = new BinarySearch();
        this.quickSort = new QuickSort();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key);
    }
}