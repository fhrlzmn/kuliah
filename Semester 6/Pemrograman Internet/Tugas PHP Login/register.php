<?php

?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
</head>
<body>
  <form action="/auth/handle_register.php" method="post">
    <div>
      <label for="name">Name : </label>
      <input type="text" name="name" id="name" required>
    </div>

    <div>
      <label for="email">Email : </label>
      <input type="email" name="email" id="email" required>
    </div>


    <div>
      <label for="address">Address : </label>
      <input type="text" name="address" id="address">
    </div>

    <div>
      <label for="gender">Gender : </label>
      <input type="radio" name="gender" id="male" value="L">
      <label for="male">Male</label>
      <input type="radio" name="gender" id="female" value="P">
      <label for="female">Female</label>
    </div>

    <div>
      <label for="username">Username : </label>
      <input type="text" name="username" id="username" required>
    </div>

    <div>
      <label for="password">Password : </label>
      <input type="password" name="password" id="password" required>
    </div>

    <div>
      <input type="submit" value="Register" name="register">
    </div>
  </form>
</body>
</html>