<!DOCTYPE html>   
<html>   
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<title> Login Page </title>  
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: lightblue;  
}  
#login {   
       background-color: #4CAF50;   
       width: 100%;  
        color: orange;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         } 
        #success {    
        color: red;     
         }      
 form {   
          
    }   
 input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
    }  
 button:hover {   
        opacity: 0.7;   
    }   
  .cancelbtn {   
        width: auto;   
        padding: 10px 18px;  
        margin: 10px 5px; 
        background-color: red;  
    }   
        
     
 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }   
</style>   
</head>    
<body>    
    <center> <h1>Register Here</h1> </center>   
    <form action="/register" method="post">  
        <div class="container">   
            <label>FirstName : </label>   
            <input type="text" placeholder="Enter firstname" name="username" required>  
            <label>LastName : </label>   
            <input type="text" placeholder="Enter lastname" name="lastname" required>
            <label>age : </label>   
            <input type="text" placeholder="Enter age" name="age" required>
            <label>username : </label>   
            <input type="text" placeholder="Enter username" name="username" required>   
            <label>password : </label>   
            <input type="password" placeholder="Enter password" name="password" required>   
            <input id="login" type="submit"></button>
            Already Registered?<a href="/">Login</a>   
   
            <h3 id="success">${success}</h3>
           
        </div>   
    </form>     
</body>     
</html> 
