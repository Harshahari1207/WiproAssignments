var myVar;
function myTimeout(){
    myVar = setTimeout(alertFunc, 180000);
}

function alertFunc(){
    alert("3 mins passed! Timeout");
}

function pagevalidation(){
    var mobile = document.forms["myform"]["mobile"].value;
    var dob = document.forms["myforms"]["dob"].value;
    var firstname = document.forms["myforms"]["fname"].value;
    var lastname = document.forms["myforms"]["lname"].value;
    var password1 = document.forms["myforms"]["password1"].value;
    var password2 = document.forms["myform"]["password2"].value;
    var email = document.forms["myforms"]["email"].value;

    var letters = /^[A-Za-z]+$/;
    var phoneno = /^\(?([0-9]{3})\)?[-.]?([0-9]{3})[-.]?([0-9]{4})$/;
    var eregex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var dobPattern = /^([0-9]{2})-([0-9]{2})-([0-9]{4})$/;

    //Mobile no.
    if(!phoneno.test(mobile)){
        document.getElementById("error-mob").innerHTML = "* Follow xxx xxx xxxx or xxxx-xxx-xxx formate";
        return false;
    }

    //DOB
    if(!dobPattern.test(dob)){
        document.getElementById("error-dob").innerHTML = "* Follow the patter dd-mm-yyyy";
        return false;
    }

    //First name
    if(!letters.test(firstname)){
        document.getElementById("error-lname").innerHTML = "*First name can't be number or special character";
        return false;
    }

    //Secon name
    if(!letters.test(lastname)){
        document.getElementById("error-lname").innerHTML = "*Last name can't be number or special character";
        return false;
    }

    //password
    if(password1.length > 5 && password1.length < 20){
        if(password1 == password2){
            document.getElementById("error-pass1").innerHTML = "* Password didn't match";
            return false;
        }
    }else{
        document.getElementById("error-pass1").innerHTML = "* Password should be between 6 and 20";
        return false;
    }

    //Email
    if(!eregex.test(email)){
        document.getElementById("error-email").innerHTML = "* Ener a valid email";
        return false;
    }

}


function startTime(){
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();
    var dt = new Date();

    var ampm = h<12 ? "AM" : "PM";

    m = checkTime(m);
    s = checkTime(s);
    document.getElementById("clock").innerHTML = "Time : "+ h + " : "+m+ " : "+s+ " " +ampm;
    var t = setTimeout(startTime, 500);
    
    document.getElementById("date").innerHTML = "Date : " + ("0" + dt.getDate()).slice(-2) + "." +("0" + (dt.getMonth()+1)).slice(-2) + "." + dt.getFullYear();
}

function checkTime(i){
    if(i < 10){
        i = "0" +i;
    }
    return i;
}