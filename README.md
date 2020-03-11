# Basics

### Books
* [Cracking the Coding Interview, 6th Edition](https://panda-myvin.s3.ap-south-1.amazonaws.com/Cracking+the+Coding+Interview%2C+6th+Edition+189+Programming+Questions+and+Solutions.pdf)      
* [Java Design Patterns Kindle Edition by Vaskaran Sarcar ](https://panda-myvin.s3.ap-south-1.amazonaws.com/%5BJava+Design+Patterns+Kindle+Edition+by+Vaskaran+Sarcar+-+2016%5D.pdf)   
* [Java Programming Interviews Exposed Kindle Edition by Noel Markham ](https://panda-myvin.s3.ap-south-1.amazonaws.com/%5BJava+Programming+Interviews+Exposed+Kindle+Edition+by+Noel+Markham+-+2014%5D.pdf)  
* [Cracking The Tech Career](https://panda-myvin.s3.ap-south-1.amazonaws.com/cracking+the+tech+career.pdf)



List<String> a=new ArrayList<>();
a.add("Cocla");
a.add("para");
a.add("dd");
        Map<String, List<String>> map = new HashMap<>();
        map.put("Ramesh", a);
        map.put("Suresh", a);
        map.put("Thanda",a);

        Map<String,List<String>> map1 = new HashMap<>();
        map1.put("Ramesh", a);
        map1.put("Suresh", a);
        map1.put("Thanda",a);
      



        //findAny returns a optional object
        //is present (checks if the list is not empty)
        //allMatch compares all the elements
        //Basic logic is comparing all the keys and values in both the maps
      //  boolean g=map.get("Ramesh").stream().filter(value->(map1.get("Ramesh").stream().allMatch(value1 ->value.equals(value1)))).findAny().isPresent();
            boolean b=map.keySet().stream().allMatch(value->map1.containsKey(value)&& map.size()==map1.size())  && map.keySet().stream().allMatch(value->map1.get(value).stream().allMatch(num->map.get(value).contains(num))) && map1.keySet().stream().allMatch(value->map.get(value).stream().allMatch(num->map1.get(value).contains(num)));
            System.out.println(b);
