public class SelectionSort implements SortingAlgorithm {

    public SelectionSort(){

    }

    public void sort(int[]a){
        int n = a.length;

       
        for (int i = 0; i < n-1; i++)
        {
           
            int min = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min])
                    min = j;

            
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

    }
}
