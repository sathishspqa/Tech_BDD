Feature: Login Page

Scenario: Login with valid credentials

Given User opens the application URL
When User clicks the request type user
And  User clicks the request type Single user
And  User clicks the request type Single user not found
And  User clicks the request type unknown
And  User clicks the request type unknown single
And  User clicks the request type unknown single not found
And  User clicks the request type Post
And  User clicks the request type Put
And  User clicks the request type Patch
And  User clicks the request type Delete
And  User clicks the request type register Successful
And  User clicks the request type register unsuccessful
And  User clicks the request type login successful
And  User clicks the request type login unsuccessful
And  User clicks the request type delay
And  User clicks the Support Requres
Then Succesfuly display the sample request and response

