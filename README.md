# Getting Started
Spring version = 3.14    <br/>
Java Version = Java 17  <br/>
Server Port = 8081

# This is role based Authentication and Authorization application 
## you can use this project following credential 
1. User name = Hemant      <br/>
   password = Hemant@1234    <br/>
   Role = Admin
2. User name = Sushant     <br/>
   Password = Sushant@1234    <br/>
   Role = moderator
3. User name = Deepak    <br/>
   Password = Deepak@1234    <br/>
   Role = user

# End Points
# Login 
   URL - http://localhost:8081/auth/login   <br/>
   Method - POST      <br/>
   Request Body
`{
"email":"Deepak",
"password":"Deepak@1234"
}`

# User Role
   URL - http://localhost:8081/user  <br/>
   Method - GET   <br/>
   Header - Authorization=Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJTdXNoYW50IiwiaWF0IjoxNzMzMzA2NTIwLCJleHAiOjE3MzMzMjQ1MjB9.7YcpREDRhT1evGxrLkw5uJBuo25wBLcdE7BlRcFz7CA

# Moderator Role
   URL - http://localhost:8081/moderator   <br/>
   Method - GET      <br/>
   Header - Authorization=Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJTdXNoYW50IiwiaWF0IjoxNzMzMzA2NTIwLCJleHAiOjE3MzMzMjQ1MjB9.7YcpREDRhT1evGxrLkw5uJBuo25wBLcdE7BlRcFz7CA

# Admin Role
   URL - http://localhost:8081/admin     <br/>
   Method - GET      <br/>
   Header - Authorization=Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJTdXNoYW50IiwiaWF0IjoxNzMzMzA2NTIwLCJleHAiOjE3MzMzMjQ1MjB9.7YcpREDRhT1evGxrLkw5uJBuo25wBLcdE7BlRcFz7CA
   