<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register</title>
  <link rel="stylesheet" href="./css/style.css">
</head>
<body>
  <main>
    <form class="register" action="/auth/handle_register.php" method="post">
      <h2>REGISTER</h2>
          <label for="name">Name</label>
          <input type="text" name="name" id="name" placeholder="Your name" required>
          <label for="email">Email</label>
          <input type="email" name="email" id="email" placeholder="Your email"required>
          <label for="address">Address</label>
          <input type="text" name="address" placeholder="Kp. example RT99" id="address">

          <div class="gender">
            <input type="radio" name="gender" id="male" value="L">
            <label for="male">Male</label>
            <input type="radio" name="gender" id="female" value="P">
            <label for="female">Female</label>
          </div>

          <label for="username">Username</label>
          <input type="text" name="username" id="username" placeholder="Username" required>
          <label for="password">Password</label>
          <input type="password" name="password" id="password" placeholder="Password" required>
          <input type="submit" value="Register" name="register">
    </form>
  </main>
</body>
</html>