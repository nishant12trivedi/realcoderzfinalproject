$(document).ready(function () { 

//Validate email
	$('#emailvalid').hide();
	let emailError = true;
	$('#email').keyup(function (){
		validateEmail();
	});
	function validateEmail(){
		let regex = "hello";
		let emailValue = $('#email').val();
		
		if(!regex.test(emailValue)){
			$('#emailvalid').show();
				emailError = false;
				return false;
		}
		else {
			$('#emailvalid').hide();
				emailError = true;
				return true;
		}
	}

//validate State
	$('#statecheck').hide();
	$('#state').keyup(function (){
		validateState();
	});

	function validateState(){
	let stateValue = $('#state').val();
	if (stateValue.length == '') {
            $('#statecheck').show();
            return false;
        } 
     else {
     		$('#statecheck').hide();
     		return true;
     }
	
	}

//validate Name
	$('#firstcheck').hide();
	$('#first').keyup(function (){
		validateFirst();
	});

	function validateFirst(){
	let firstValue = $('#first').val();
	if (firstValue.length == '') {
            $('#firstcheck').show();
            return false;
        } 
     else {
     		$('#firstcheck').hide();
     		return true;
     }
	
	}




//validate city
	$('#citycheck').hide();
	$('#city').keyup(function (){
		validateCity();
	});

	function validateCity(){
	let cityValue = $('#city').val();
	if (cityValue.length == '') {
            $('#citycheck').show();
            return false;
        } 
     else {
     		$('#citycheck').hide();
     		return true;
     }
	
	}

//validate address
	$('#addcheck').hide();
	$('#address').keyup(function (){
		validateAddress();
	});

	function validateAddress(){
	let addValue = $('#address').val();
	if (addValue.length == '') {
            $('#addcheck').show();
            return false;
        } 
     else {
     		$('#addcheck').hide();
     		return true;
     }
	
	}


// Validate Password
    $('#passcheck').hide();
    let passwordError = true;
    $('#password').keyup(function () {
        validatePassword();
    });
    function validatePassword() {
        let passwrdValue = $('#password').val();
        if (passwrdValue.length == '') {
            $('#passcheck').show();
            passwordError = false;
            return false;
        } 
        if ((passwrdValue.length < 3 ||
            (passwrdValue.length > 10))) {
            $('#passcheck').show();
            $('#passcheck').html("Enter Pass");
            $('#passcheck').css("color", "red");
            passwordError = false;
            return false;
        } else {
            $('#passcheck').hide();
            return true;
        }
    }





// Validate Confirm Password
    $('#conpasscheck').hide();
    let confirmPasswordError = true;
    $('#conpassword').keyup(function () {
        validateConfirmPasswrd();
    });
    function validateConfirmPasswrd() {
        let confirmPasswordValue = $('#conpassword').val();
        let passwrdValue = $('#password').val();
        if (passwrdValue != confirmPasswordValue) {
            $('#conpasscheck').show();
            $('#conpasscheck').html("Password did not match");
            $('#conpasscheck').css("color", "red");
            return false;
        } else {
            $('#conpasscheck').hide();
            return true;
        }
    }




});