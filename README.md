# Illumio Coding Assignment

## Implementation
The attributes from the input csv file is converted to a **Rule** object stored in a **Set** which is used so time is not wasted in putting duplicate entries in the data structure.<br/>
I have used Set as inserting and searching in a Set is O(1).<br/>
Also, I have overloaded the **equals()** method of Object class for comparing attributes of Rule object.<br/>
**private** is used to restrict write access to Rule objects and **final** is used so the variables are not be modified.<br/><br/>

## Testing
Unit testing is done using **JUnit** testing framework.<br/>
As per the problem statement, it is assumed that the input csv file will be well formed.<br/>
All the edge cases are handled properly by the code.<br/>


## Team Preference
1. Data team
2. Platform team
3. Policy team
