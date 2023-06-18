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
  <form action="/auth/handle_login.php" method="post">
    <div>
      <label for="username">Username : </label>
      <input type="text" name="username" id="username" required>
    </div>

    <div>
      <label for="password">Password : </label>
      <input type="password" name="password" id="password" required>
    </div>

    <div>
      <input type="submit" value="Log In" name="login">
      <a href="/register.php">Create a new account</a>
    </div>
  </form>
</body>
</html>