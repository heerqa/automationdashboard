<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>


.form-signin {
  max-width: 330px;
  padding: 15px;
  margin: 0 auto;
}
.form-signin .form-signin-heading,
.form-signin .checkbox {
  margin-bottom: 10px;
}
.form-signin .checkbox {
  font-weight: normal;
}
.form-signin .form-control {
  position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;
  padding: 10px;
  font-size: 16px;
}
.form-signin .form-control:focus {
  z-index: 2;
}
.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}
.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}
</style>


   
      <form class="form-signin" role="form" action='/j_spring_security_check' method='POST'>
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputName" class="sr-only">User Name</label>
        <input type="text" id="inputName" name='j_username' class="form-control" placeholder="User Name" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name='j_password' class="form-control" placeholder="Password" required>
        <div class="checkbox">
        </div>
        <button name="submit"class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>



    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->

  