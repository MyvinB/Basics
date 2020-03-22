     static int count(int a[],int k){
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<a.length;i++){
             if(map.containsKey(a[i]%k)){
                 map.put(a[i]%k,map.get(a[i]%k)+1);
             }
             else map.put(a[i]%k,1);
         }
         int max=0;
         for (int key:map.keySet()){
             if(map.get(key)>max)max=map.get(key);
         }
         int count=0;
         for (int key:map.keySet()){
             if(map.get(key)==max)count=count+max;
         }
         return count;
     }
