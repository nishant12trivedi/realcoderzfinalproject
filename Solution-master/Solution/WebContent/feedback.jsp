<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
   background-image: url("satya.jpg");
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
<script src=
    "https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
    </script>
</head>
<body>

<form action="register" method="post">
  <div class="container">
    <h1> FeedBack   Form  </h1>
    <hr>
     <label for="first"><b>First Name</b></label>
    <input type="text" placeholder="First Name" name="first" id="first" required>
    <h5 id="firstcheck" style="color: red;">
                **Please Fill the Name
              </h5>
    
    
    <label for="last"><b>Last Name</b></label>
    <input type="text" placeholder="Last Name" name="last" id="last" required>
    
    <label> <b> 
      Gender : </b> 
      </label><br>  <br>
       <input type="radio" id="male" name="gender" value="male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="female">
        <label for="female">Female</label>
        <input type="radio" id="other" name="gender" value="other">
        <label for="other">Other</label><br><br>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>
    <h5 id="emailvalid" style="color:red;">Your email must be a valid email
    </h5>
    <label for="phone"><b>Phone No.</b></label>
    <input type="text" placeholder="Enter Phone No." name="phone" id="phone" required><br><br>
    
    

    <label for="city"><b>City</b></label>
    <input type="text" placeholder="Enter City" name="city" id="city" required minlength="4">
	<h5 id="citycheck" style="color: red;">
                **Please Fill the city
              </h5>

    <label for="state"><b>State</b></label>
    <input type="text" placeholder="Enter State" name="state" id="state" required minlength="4">
	<h5 id="statecheck" style="color: red;">
                **Please Fill the State
              </h5>
	
    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Address" name="address" id="address" required minlength="12">
	<h5 id="addcheck" style="color: red;">
                **Please Fill the address
              </h5>
	
    <label for="pass"><b>Password</b></label>
    <input type="text" placeholder="Enter password" name="pass" id="password" required minlength= "10">
    <h5 id="passcheck" style="color: red;">
                **Please enter the password
              </h5>

    <label for="repass"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" id="conpassword" required minlength="10">
    <h5 id="conpasscheck" style="color: red;">
                  **Enter password
              </h5>
                </h5>

    <label for="repass"><b>Feedback</b></label>
    <input type="text" placeholder="Feedback" name="feedback" id="conpassword" required minlength="10">
    <h5 id="conpasscheck" style="color: red;">
                  **Provide your feedback
              </h5>
              
 <
              
    <hr>
                                <a class="nav-link" href="index.jsp">Submit</a>
    

  </div>
  
</form>
<script src="app.js"></script>
</body>
</html>