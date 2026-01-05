package javaDSAPractice.com.linkedlist.singlylinkedlist.socialmedia;

import java.util.Scanner;

public class SocialMediaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SocialMediaList sm = new SocialMediaList();

        int choice;

        do {
            System.out.println("\n===== Social Media Friend System =====");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Display Friends of User");
            System.out.println("5. Find Mutual Friends");
            System.out.println("6. Search User by ID");
            System.out.println("7. Search User by Name");
            System.out.println("8. Count Friends of Each User");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sm.addUser(id, name, age);
                    System.out.println("User added successfully!");
                    break;

                case 2:
                    System.out.print("Enter First User ID: ");
                    int u1 = sc.nextInt();

                    System.out.print("Enter Second User ID: ");
                    int u2 = sc.nextInt();

                    sm.addFriend(u1, u2);
                    break;

                case 3:
                    System.out.print("Enter First User ID: ");
                    int r1 = sc.nextInt();

                    System.out.print("Enter Second User ID: ");
                    int r2 = sc.nextInt();

                    sm.removeFriend(r1, r2);
                    break;

                case 4:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();

                    sm.displayFriends(uid);
                    break;

                case 5:
                    System.out.print("Enter First User ID: ");
                    int m1 = sc.nextInt();

                    System.out.print("Enter Second User ID: ");
                    int m2 = sc.nextInt();

                    sm.findMutualFriends(m1, m2);
                    break;

                case 6:
                    System.out.print("Enter User ID to search: ");
                    int sid = sc.nextInt();

                    UserNode userById = sm.searchById(sid);
                    if (userById != null)
                        System.out.println("Found: " + userById.name + ", Age: " + userById.age);
                    else
                        System.out.println("User not found!");
                    break;

                case 7:
                    System.out.print("Enter Name to search: ");
                    String sname = sc.nextLine();

                    UserNode userByName = sm.searchByName(sname);
                    if (userByName != null)
                        System.out.println("Found: ID " + userByName.userId + ", Age: " + userByName.age);
                    else
                        System.out.println("User not found!");
                    break;

                case 8:
                    sm.countFriends();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}

