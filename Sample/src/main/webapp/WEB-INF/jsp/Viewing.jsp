<!DOCTYPE html>   
<html>   
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<title> Login Page </title>  
<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: red;  
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
        background-color: red;  
    }   
</style>   
</head>    
<body>    
    <center> <h1> Toyota Management System</h1> </center>   
    <form action="/" method="post">  
        <div class="container">   
            <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="username" required>  
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  
            <input id="login" type="submit"></button>   
            Not Registered?<a href="/register">Register</a> 
            <h3 id="success">${success}</h3>
           
        </div>   
    </form>     
</body>     
</html> 