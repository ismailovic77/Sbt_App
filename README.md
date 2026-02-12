## recap of the chapter 3

1 - Operators , infix , postfix 
    * operators in scala are like methods 
    * infix : when a method have only one argument , you can drop the parentheses and the . when calling it (best used with operators like + - etc) 
    * postfix : a method without arguments can be called without the . (not allowed in scala 3 )

    * methods in scala are left associative normally , they start evaluating from left to right
    * every method that end with : is right associative , it staret from right to left 

2 - if statments are expression that outputs values , so we can assign them to a variable 

3- For loops use a generator (<-) , it can also include next to the filters needed 

4- While loops are simple as well => while( cdt) {} 

5- Do while loops => do { } while (cdt)

6- Still have some notes on the pattern matching and also the Enumeration , (questions like when should it be used , regex for matching , the@ annotation )

## Pattern Matching 

1- I put some examples on matching , we can also do matching on tuples , and get the value of the elements in the tuples , 
2- we have matching on case clases (here the matching is like matching on the type since the case class is basically a type , but it also checks the values passed to the constructor of the case class )
3- Matchin on regular expressions , (here there is the concept of extractors that I need to check in more detail )

4 - Another concept that needs more of a deep dive is : binding nested nested variables in case matches

## Try catch
 
 The try catch is used the same way as the matching pattern 

 ## Enumerations 
