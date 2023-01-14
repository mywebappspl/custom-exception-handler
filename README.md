# Custom exception handler and response entity with custom exception message 

### Description

This small package is allowing developers to throw custom exception and sending message inside response entity with selected status.

### How use it ?
First define your message in 'ExceptionMessage' like bellow:

`MY_EXCEPTION_NAME ("My exception description"),`

then you can throw this exception in your code:
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


