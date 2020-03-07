package Sorting;

/*
 @author Myvin Barboza
 07/03/20 7:06 AM
 Complexity:O(nlogn)
 Jenny: https://www.youtube.com/watch?v=Q_eia3jC9Ts
 */

import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    static List<Integer> list=new ArrayList<Integer>();




    static void heapify(List<Integer> list,int n,int i){
        int largest=i;
        int l=i*2;
        int r=i*2+1;

        if(l<n && list.get(largest)<list.get(l))largest=l;
        if(r<n && list.get(largest)<list.get(r))largest=r;

        if(largest!=i){
            int swap=list.get(i);
            list.set(i,list.get(largest));
            list.set(largest,swap);

            heapify(list,n,largest);
        }
    }


    static int deleteRoot(List<Integer> list,int n){
        int lastElement=list.get(n-1);
        list.set(n-1,list.get(1));
        list.set(1,lastElement);
        n=n-1;
        heapify(list,n,1);
        return n;
    }

    static void heapSort(List<Integer> list){
        //building the heap from the given array
        int n=list.size();
        for(int i=n/2;i>0;i--){
            heapify(list,list.size(),i);
        }
        //deleting from heap

        for(int i=n;i>1;i--){
            deleteRoot(list,i);
        }
    }

    public static void main(String[] args) {
        int ar[]={15,20,7,9,30};
        int n=ar.length;
        list.add(0);//dummy element not to interfere with the index and all
        list.add(0);
        list.add(15); list.add(20); list.add(17); list.add(9); list.add(30);
        heapSort(list);
        System.out.println(list);




    }
}