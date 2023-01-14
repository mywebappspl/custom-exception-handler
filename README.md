# Custom exception handler and response entity for exception 

### Description

This small pasckage is allowing developer to throw custom exception
and throw this exception message inside response entity with selected status.

### How use it ?
Fist define your message in 'ExceptionMessage' file like bellow:

`MY_EXCEPTION_NAME ("My exception description"),`

then in your code you can throw this exception like bellow:
```java
@GetMapping("/")
public ResponseEntity<Integer> someFunction(@PathVariable int id) throws Exception{
    if(some condition){
        \\\
        some code
        \\\
        return some Integer
    }
    else
    {
        throw new CustomExceptionHandler(ExceptionMessages.MYEXCEPTION,HttpStatus.NOT_FOUND);
    }
}
```

OR

```java
@GetMapping("/")
public ResponseEntity<Integer> someFunction(@PathVariable int id) throws Exception{
    try{
        \\\
        some code
        \\\
    }
    catch(Exception e)
    {
        throw new CustomExceptionHandler(ExceptionMessages.MY_EXCEPTION,HttpStatus.NOT_FOUND);
    }
}
```


