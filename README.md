# SpringBootSecurity_JPA_MYSQL
This is a springboot application that uses springboot security configuration and JPA to access MYSQL db for user authentication.

The springboot security features are used to create a UserDetailsService class to get user details from the MYSQL database.
It uses loadUserByName() method implementation to achieve this.

in MYSQL, a database named springsecurity is created with table named as user.
This has one row of data wuth user_name field value as 'user' and password as 'pass'.

Keeping the MYSQL server running, and starting this springboot application:
These credentials (username and password) are checked (in  MYSQL table), when from url the following is typed : http://localhost:8080/user

On successful authentication from MYSQL table 'user' - following message is returned on webpage
  Welcome User
