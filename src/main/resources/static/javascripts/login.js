function test(){
    var s1=document.loginForm.name.value
    var s2=document.loginForm.password.value
    if (s1 == "" || s2 == "") {
        alert('请将内容填写完整');
        return false; //false不提交
    }
    return true; // true提交
}
