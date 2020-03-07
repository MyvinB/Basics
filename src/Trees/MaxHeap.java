package Trees;

/*
 @author Myvin Barboza
 05/03/20 4:09 PM
 link: https://www.youtube.com/watch?v=HqPJF2L5h9U
 Jennylink: https://www.youtube.com/watch?v=NEtwJASLU8Q&t=25s
 */

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

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

    static List<Integer> insertHeap(List<Integer> list,int n,int value){
        n=n+1;
        list.add(value);
        int i=n-1;//zero index
        while(i>1){
            int parent=i/2;
            if(list.get(parent)<list.get(i)){
                int swap=list.get(parent);
                System.out.println(parent);
                list.set(parent,list.get(i));
                list.set(i,swap);
                i=parent;
            }
            else break;
        }
        return list;
    }



    public static void main(String[] args) {
        int ar[]={10,5,3,2,4};
        List<Integer> list=new ArrayList<Integer>();
        list.add(0);//dummy node
        list.add(10);list.add(5);list.add(3);list.add(2);list.add(4);
        int n=list.size();
        list=insertHeap(list,n,6);
        //int n=deleteRoot(ar,p);
        for (int e: list) {
            System.out.print(e+" ");
        }
        n=list.size();
        n=deleteRoot(list,n);
        System.out.println();
        for(int i=1;i<n;i++) System.out.print(list.get(i)+" ");


    }

}