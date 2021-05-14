
# Place Recommendation App

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
In this app, users can view different posts made by other users. These posts include description and images for the places that they recommended.



### App Evaluation
- **Category:** Social / photo 
- **Mobile:** Photo album 
- **Story:** This app will provide recommendations for people who like to travel.
- **Market:** Many people love to travel and share what their feeling and experience with that place.  
- **Habit:** For these who didd't travel, the user can look at the app everyday to see if some place that it is interest to them. For these who is traveling, it is fun for them to share their picture to another user. 
- **Scope:** First, the user can sign up and login to the app to share their picture about a place that they recommendate. Next, the user can interact with another people's post.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

- [x] Users can sign up for an account.
- [x] Users can login/log out of their account.
- [x] Users can view the recommendations from different users
- [x] Users can add a recommendation, including images,descriptions and the tag.
- [x] Users can view their profile and see the posts that they made
- [x] Users are able to write a diary.
- [x] Users can choose between different tabs including post,write a diary, search, and profile.
- [x] User can pull to refresh.
- [x] Posts are sorted
- [x] Users can like recommendations
- [x] Users can tap on the picture to display the descriptions.



**Optional Nice-to-have Stories**

- [ ] Users can report innappropriate posts
- [ ] Users can have a freindlist.
- [ ] Users are able to add a new friend
- [ ] Users are able to message their friends
- [ ] Users can visit recommended places.


## Video Walkthrough

Here's a walkthrough of implemented user stories:

<br>
<b>Week 4 </b>
<img src='sprint4.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<br>
<b>Week 3 </b>
<img src='sprint3.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

<br>
<b>Week 2</b>

<img src='sprint2.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

<br>
<b>Week 1</b>

<img src='sprint1.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />




### 2. Screen Archetypes

* Login Screen
   * Users can login/log out of their account
   
* Signup Screen
   * Users can sign up for an account

* Posts Screen
   * Users add a recommendation, including images,descriptions and the tag

* Diary Screen
    * Users can write their diary.
    
* Detail Screen
    * Users can view the details of the recommandations.
* Profile Screen
    * Users can visit their profile and all the recommendations that they posted. They can also choose to logout by pressing the logout button
*  Main Screen
    *  Users can view recommandated places and the information about the user who posted this post.



### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Main
* Post
* Profile
* Diary

**Flow Navigation** (Screen to Screen)

* Login Screen
   * Main Screen
   * SignUp Screen
* SignUp Screen
   * Login/SignUp Screen
* Main Screen
   * Tab Navigation
* Profile Screen
   * Post Screen
   * Login Screen
* Post Screen
   * Camera




## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src="Wireframes.jpg" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
<img src="models/comment.png" width=600>
<img src="models/diary.png" width=600>
<img src="models/post.png" width=600>
<img src="models/profile.png" width=600>
<img src="models/user.png" width=600>

### Networking
* Profile Screen
   * （Read/GET) Query all the columns inside Profile model with the logged in username
   * (Update/PUT) update user's information
   * (Delete) delete posts that are posted by this user.
* Home Screen
    * (Read/GET) Query all the columns inside the Post model
    * (Create/POST) Create a new post
    * (Update/PUT) user can choose to like or dislike a specific post
    * (Create/POST) user can comment under a post
* Diary Screen
    * (Read/GET) Qury all the columns inside the diary model
    * (Create/POST) user can add a new diary.
    * (Delete) user can choose to delete a diary 
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
