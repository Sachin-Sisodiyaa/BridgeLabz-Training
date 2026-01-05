package javaDSAPractice.com.linkedlist.singlylinkedlist.socialmedia;

//Node representing a User
class UserNode {
 int userId;
 String name;
 int age;

 // Head of friend list
 FriendNode friendsHead; 
 UserNode next;

 UserNode(int userId, String name, int age) {
     this.userId = userId;
     this.name = name;
     this.age = age;
     this.friendsHead = null;
     this.next = null;
 }
}

