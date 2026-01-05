package javaDSAPractice.com.linkedlist.singlylinkedlist.socialmedia;

class SocialMediaList {

    private UserNode head; // Head of user list

    // ADD USER 
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newUser;
    }

    //SEARCH USER 
    public UserNode searchById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public UserNode searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    //ADD FRIEND CONNECTION 
    public void addFriend(int userId1, int userId2) {

        UserNode u1 = searchById(userId1);
        UserNode u2 = searchById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        // Add friend ID to both users
        addFriendToList(u1, userId2);
        addFriendToList(u2, userId1);

        System.out.println("Friend connection added between " + u1.name + " and " + u2.name);
    }

    private void addFriendToList(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);

        if (user.friendsHead == null) {
            user.friendsHead = newFriend;
            return;
        }

        FriendNode temp = user.friendsHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newFriend;
    }

    // REMOVE FRIEND CONNECTION 
    public void removeFriend(int userId1, int userId2) {
        UserNode u1 = searchById(userId1);
        UserNode u2 = searchById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        removeFriendFromList(u1, userId2);
        removeFriendFromList(u2, userId1);

        System.out.println("Friend connection removed.");
    }

    private void removeFriendFromList(UserNode user, int friendId) {

        FriendNode curr = user.friendsHead;
        FriendNode prev = null;

        while (curr != null) {
            if (curr.friendId == friendId) {
                if (prev == null)
                    user.friendsHead = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    // DISPLAY FRIENDS 
    public void displayFriends(int userId) {

        UserNode user = searchById(userId);
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendsHead;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // MUTUAL FRIENDS 
    public void findMutualFriends(int userId1, int userId2) {

        UserNode u1 = searchById(userId1);
        UserNode u2 = searchById(userId2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friendsHead;

        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = u2.friendsHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }

    // COUNT FRIENDS 
    public void countFriends() {

        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendsHead;

            while (f != null) {
                count++;
                f = f.next;
            }

            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
}

