package Searching;

/*
 @author Myvin Barboza
 07/04/20 10:14 AM 
 */

public class BinarySearch {

    static int binarySearch(int a[],int l,int r,int x){

        if(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==x) return mid;
            if(a[mid]>x) return binarySearch(a,l,mid-1,x);
            return binarySearch(a,mid+1,r,x);
        }
        return -1;



    }


    public static void main(String[] args) {
    int a[]={2,6,13,21,36,47,63,81,97};
    int x=97;
    int p=binarySearch(a,0,a.length-1,x);
        System.out.println(p);
    }
}