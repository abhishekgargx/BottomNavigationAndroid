# Bottom Navigation Android using Activities.

This is not library it is code sample of demo app, which uses 4 activites and navigate through bottom navigation.



# Problem : 
- How to use activites with bottom navigation android, as it is always be used with fragments ?

# Solution : 
- there are two solutions for above problem

        **************************************************************************************************************************
        Solution 1:  Put bottom navigation bottom click listener and logic of implementation in every
                    single activity there.

        Pros of solution 1  : you will able to achieve navigation bottom bar with android activities

        cons of solution 1 : -you will to write same code again and again many time, and in large project it will be troublesome
                             - hard to debug you need to go to evey class.

        ****************************************************************************************************************************
        solution 2: Make a seprate class file, in which you put your navigation logic and extend in every activity .

        Pros of solution 2: -it will be easy to do it, as we using simple inheritance and abstraction concept of java.
                            -you do not write code again and again for every write hence your activity code will be remain almost
                            untouched.
                            -works well with large projects.
                            -you can added other common functionality for other acitivites at once.
                            -

        Cons of solution 2 : you need to atleast include element of bottom navigation in every activity layout you want to use.

        *********************************************************************************************************************************

# conclusion : 

- we got solution of problem and two methods to apporch problem, i personally used second solution as bottom navigation logic stays in seprate file and easy to manage and implement.

# Usage :

- make seperate bottom navigation element.
- Make BaseActivity which extends AppCompactActivity
- Make two abstract methods one for get current layout value , another to get action name in bottom navigation.
- Make class HomeActivity (*Just any name )   in which you want bottom navigation
- now extend BaseActivity in HomeActivity
- implement both abstract methods of BaseAcitivity in HomeActivity
- Make sure to do not use method setContentView in HomeActivity, instead of pass your xml name to baseAcitity
- You can find both HomeActivity and BaseActivity with working sample code (modify it as per you requirements).

# Tip: 
- clone this project first and then read whole implementation and working of code, complie in on your mobile then use it in your project.

