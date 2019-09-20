public class BubbleSort implements SortingAlgorithm {
    public BubbleSort(){

    }
    public void sort(int[]a){
        for(int i = 1;i<a.length-1;i++){
            for(int j = 1; j<a.length;j++){
                int temp = a[j];
                if(a[j-1]>a[j])
                {
                    a[j]= a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
}
