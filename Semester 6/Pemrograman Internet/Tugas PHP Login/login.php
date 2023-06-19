<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link rel="stylesheet" href="./css/style.css">
</head>
<body>
  <main>
    <form class="login" action="/auth/handle_login.php" method="post">
      <h2>LOGIN</h2>
      <label for="username">Username</label>
      <input type="text" name="username" id="username" required>
      <label for="password">Password</label>
      <input type="password" name="password" id="password" required>
      <input type="submit" value="Log In" name="login">
      <p>Don't have an account? <a href="/register.php">Sign Up</a>
    </form>
  </main>
</body>
</html>