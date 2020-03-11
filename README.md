# Basics

### Books
* [Cracking the Coding Interview, 6th Edition](https://panda-myvin.s3.ap-south-1.amazonaws.com/Cracking+the+Coding+Interview%2C+6th+Edition+189+Programming+Questions+and+Solutions.pdf)      
* [Java Design Patterns Kindle Edition by Vaskaran Sarcar ](https://panda-myvin.s3.ap-south-1.amazonaws.com/%5BJava+Design+Patterns+Kindle+Edition+by+Vaskaran+Sarcar+-+2016%5D.pdf)   
* [Java Programming Interviews Exposed Kindle Edition by Noel Markham ](https://panda-myvin.s3.ap-south-1.amazonaws.com/%5BJava+Programming+Interviews+Exposed+Kindle+Edition+by+Noel+Markham+-+2014%5D.pdf)  
* [Cracking The Tech Career](https://panda-myvin.s3.ap-south-1.amazonaws.com/cracking+the+tech+career.pdf)


    class Student{
                private String name;

                public Student(String name) {
                        this.name = name;

                }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        '}';
            }

            public String getName() {
                        return name;
                }

                public void setName(String name) {
                        this.name = name;
                }

        }
       
        List<Student> list1=new ArrayList<>();
        list1.add(new Student("ram"));
        list1.add(new Student("sham"));
        list1.add(new Student("kam"));
            list1.add(new Student("kam"));
            list1.add(new Student("kam"));
            list1.add(new Student("kam"));
            list1.add(new Student("sham"));



        System.out.println(list1.stream().collect(Collectors.groupingBy(Student::getName)).toString());
        
        
        
        
   output
        {sham=[Student{name='sham'}, Student{name='sham'}], kam=[Student{name='kam'}, Student{name='kam'}, Student{name='kam'}, Student{name='kam'}], ram=[Student{name='ram'}]}
