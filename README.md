# Basics

### Books
* [Cracking the Coding Interview, 6th Edition](https://panda-myvin.s3.ap-south-1.amazonaws.com/Cracking+the+Coding+Interview%2C+6th+Edition+189+Programming+Questions+and+Solutions.pdf)      
* [Java Design Patterns Kindle Edition by Vaskaran Sarcar ](https://panda-myvin.s3.ap-south-1.amazonaws.com/%5BJava+Design+Patterns+Kindle+Edition+by+Vaskaran+Sarcar+-+2016%5D.pdf)   
* [Java Programming Interviews Exposed Kindle Edition by Noel Markham ](https://panda-myvin.s3.ap-south-1.amazonaws.com/%5BJava+Programming+Interviews+Exposed+Kindle+Edition+by+Noel+Markham+-+2014%5D.pdf)  
* [Cracking The Tech Career](https://panda-myvin.s3.ap-south-1.amazonaws.com/cracking+the+tech+career.pdf)

            class Student{
                private String name;
                private int marks;
                public Student(String name,int marks) {
                        this.name = name;
                        this.marks=marks;

                }

            public int getMarks() {
                return marks;
            }

            public void setMarks(int marks) {
                this.marks = marks;
            }

            public String getName() {
                        return name;
                }

                public void setName(String name) {
                        this.name = name;
                }

        }

        List<Student> list1=new ArrayList<>();
        list1.add(new Student("ram",1));
        list1.add(new Student("sham",2));
        list1.add(new Student("kam",3));
            list1.add(new Student("kam",4));
            list1.add(new Student("kam",5));
            list1.add(new Student("kam",6));
            list1.add(new Student("sham",7));


        System.out.println( list1.stream().collect(Collectors.groupingBy(Student::getName,Collectors.mapping(obj->obj.getMarks(), Collectors.toList()))));
        
        
{sham=[2, 7], kam=[3, 4, 5, 6], ram=[1]}
