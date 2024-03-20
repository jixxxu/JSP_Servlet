$(function( ) { 
$.validator.setDefaults({
onkeyup : false, 
onclick : false, 
onfocusout : false, 
showErrors : function(errorMap, errorList) {
if(this.numberOfInvalids( )) {
alert(errorList[0].message); 
} 
}
});

$.validator.addMethod("regex", function(value, element, regexpr) { 
return regexpr.test(value); 
}); 
$("#signupForm").validate({
rules : {
name : {
required : true, 
regex : /^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$/
},

age : {
required : true, 
digits : true
},

id : {
required : true, 
minlength : 4,
regex : /^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$/
},

password : {
required : true, 
minlength : 4,
maxlength : 8
},

pwdre : {
required : true, 
equalTo : "#password" 
}
},

messages : {
name : {
required : "이름을 입력하세요", 
regex : "공백이나 특수문자를 제거하세요."
},

age : {
required : "나이를 입력하세요.", 
digits : "숫자로만 입력하세요."
},

id : {
required : "아이디를 입력하세요.", 
minlength : "최소 {0} 글자입니다.", 
regex : "공백이나 특수문자를 제거하세요."
},

password : {
required : "비밀번호를 입력하세요.", 
minlength : "최소 {0} 글자입니다.", 
maxlength : "최대 {0} 글자입니다."
},

pwdre : {
required : "비밀번호를 확인하세요.", 
equalTo : "비밀번호가 틀립니다."
}
}
});
});