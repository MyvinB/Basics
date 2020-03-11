# Hashing Interview Q
#### Q1) What is hashMap?
If you have a key value pair type of data storing them in an array will be a waste of space.

eg  Myvin->97674532 Clea->8974844 over here we would have to make two list and link them with the same index and any alteration in one list would affect the key value pairs.

eg 1->45 40->78 over here we have 1 and 40 as key in an array we would simply have to create extra spaces if using one array

To avoid this we use HashTables( Fancy word for array) where in the principle of hashing is used a particular hash function gives the index of the bucket where the key value pair will be stored.  
A hash function should be determinsitic (it shouldn't change for a given value).

#### Q2)What is a capacity and load factor for a HashMap?
When a HashMap is instantiated there are two parameters that will affect its performance: initial capacity and load factor.
Capacity is the number of buckets/bins in the hash table.
While the load factor measures how many values the hash table is allowed to get before capacity is automatically increased.  
When the amount of items in the table is greater and the load factor and the capacity, the table is rehashed. Meaning the structure of the data is rebuilt with twice the number of buckets specified in the instantiation.  
Java has a load factor of 0.75.

#### Q3)What is Collision?
Since a hash function gets us a small number for a key which is a big integer or string, there is a possibility that two keys result in the same value. The situation where a newly inserted key maps to an already occupied slot in the hash table is called collision and must be handled using some collision handling technique.

#### Q4)How to handle Collisions?
##### Separate Chaining: 
The idea is to make each cell of hash table point to a linked list of records that have same hash function value.
##### Open Addressing: 
In Open Addressing, all elements are stored in the hash table itself. So at any point, size of the table must be greater than or equal to the total number of keys (Note that we can increase table size by copying old data if needed).  
Types of ways     
* Linear Probing
* Quadratic Probing 
* Double Hashing 
# SpringBoot Q

####Q1)What is loose coupling and tight coupling?
#### Q)What is dependency Injection or inversion of control?
#### Q2)What are IOC containers and roles?
Two Type of containers 
* BeanFactory : Basic Features
* ApplicationContext: Spring Aop,WebApplicationContext(Request,Session,SessionScopeetc ) for web applications.

Uses
Genrally ApplicationContext is used cause it has extra features only when there is a memory constrain we use beanFactory.  
Roles 
* Find Beans.
* Wire Dependencies.
* Manage Lifecycle of the Bean.  
#### Q3)What is a scope of a bean?
* Singleton : One instance per Spring Context
* Prototype : New Bean created whenever requested.
* Request : One Bean per Http request . Web-aware SpringApplicationContext.
* Session : One Bean per Http session .Web-aware
Default scope of a bean is Singleton
Spring beans are not thread safe.
#### Q4)Constructor Injection vs Setter Injection
Constructor injection has mandatory dependency also it helps to create an immutable bean which is created at one time unlinke setter.
#### Q5)What is Primary ,Qualifier?
It is used when there is more than one bean to inject for a particular dependency.
* Primary : Gives priority to the bean to come first.
* Qualifier : Gives the bean a name used while defining and calling.      
#### Q5)What are the Spring Modules?
![](images/SpringModules.png)  
#### Q6) What are the annotations in Spring?
* @Component @Service @Repository @Controller
* @Autowired
* @Primary
* @Qualifier
* @Configuration

#### Q7) What is the simplest way of ensuring that we are using a single version of spring related dependencies?
A BOM is a special kind of POM that is used to control the versions of a project's dependencies and provide a central place to define and update those versions.

#### Q8)What is DispatcherServlet?
It acts as a front controller and provides a single entry point for the application
When DispatcherServlet receives view name, it consults the ViewResolver to find the right view.

#### Q9)How would you exclude packages in a springBoot starter dependency?
use excludes

#### Q10)Difference between RequestParam & PathVariable?
   http://localhost:8080/springmvc/hello/101?param1=10&param2=20
        
        @RequestMapping("/hello/{id}")    public String getDetails(@PathVariable(value="id") String id,
            @RequestParam(value="param1", required=true) String param1,
            @RequestParam(value="param2", required=false) String param2){
        .......
        }
#### Q11)what are the annotations under @SpringBootApplication?
* @SpringBootConfiguration
* @EnableAutoConfiguration
* @ComponentScan

#### Q12)Why is embedded server? Why is it important?
Easy to deploy the application with an embedded server just need a jar file thats all.

#### Q14)What is the use of Configuration Properties

#### Q15)what is profile ?

#### Q16)What is SpringBootActuator?
Exposes a lot of details health all sorts of metrics details of garbage collection etc
#### Q17)What is CommandLineRunner?
Interface used to indicate that a bean should run when it is contained within a application.
#### Q18)Why is spring jdbc better than jdbc?
Spring jdbc we do not need to manage resource all is done by spring also the jdbc template is much more convient.
#### Q19)What is RowMapper used in Spring for ?
RowMapper interface allows to map a row of the relations with the instance of user-defined class. It iterates the ResultSet internally and adds it into the collection. So we don't need to write a lot of code to fetch the records as ResultSetExtractor.
#### Q20)What is Jpa?
Java Persistence Api it uses object-relation mapping. Internally it uses Entity Manager. Uses Jpql which is much simpler.
#### Q21)What are the relationship in Jpa?
* OneToOne
* OneToMany
* ManyToMany
#### Q22)What is the use of @Transactional Annotation
Would generally perform a roll back if anything fails.
       
       