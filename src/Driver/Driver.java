package Driver;

import java.util.Scanner;

import Entity.Book;
import Entity.User;
import Repository.Database;
import Service.*;

public class Driver {
	public static void main(String[] args) {
		System.out.println(
				"                                                       😎😎😎📕📕 WELCOME TO THE LIBRARY 📕📕😎😎😎 ");
		while (true) {
			System.out.println();
			System.out.println("                                                               	 User or Librarian ❔");
			System.out.println();
			System.out.println("                                                                     1:User🙋");
			System.out.println("                                                                     2:Librarian🙋");
			System.out.println("                                                                     3:Exit🙋");
			System.out.println();
			System.out.println(
					"--------------------------------------------------------------- ✔️✔️ Enter your choice ✔️✔️ -------------------------------------------------------------------------------");
			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();
			int p = 1;
			switch (choice) {
			case 1:
				System.out.println("                                                                 	1:Login");
				System.out.println("                                                                        2:Sign Up");
				System.out.println();
				System.out.println(
						"--------------------------------------------------------------- ✔️✔️ Enter your choice ✔️✔️ -------------------------------------------------------------------------------");
				int choiceLogin = sc.nextInt();
				sc.nextLine();
				if (choiceLogin == 1) {
					System.out.println("--------------------------------------------------------------- ✔️✔️ Enter your ID ✔️✔️ -------------------------------------------------------------------------------");
					String idOfUser=sc.nextLine();
					System.out.println("--------------------------------------------------------------- ✔️✔️ Enter your Password ✔️✔️ -------------------------------------------------------------------------------");
					String passOfuser=sc.nextLine();
					int l=0;
					for(int i=0;i<Database.users.length;i++) {
						if(Database.users[i]!=null &&(Database.users[i].userID.equals(idOfUser)) && (Database.users[i].password.equals(passOfuser))){
							l=1;
							break;
						}
					}
					if(l==1) {
						UserService u = new UserService();
						System.out.println(
								"                                                               What you want to perform ❔                                                       ");
						System.out.println();
						System.out.println(
								"                                                                     1:Show All Books");
						System.out
								.println("                                                                     2:Get The Book");
						System.out.println(
								"                                                                     3:Return The Book");
						System.out.println();
						System.out.println(
								"--------------------------------------------------------------- ✔️✔️  Enter your choice ✔️✔️ -----------------------------------------------------------------------------");
						int choice2 = sc.nextInt();
						switch (choice2) {
						case 1:
							System.out.println(u.viewAvailableBooks());
							break;
						case 2:
							System.out.println(
									"-------------------------------------------------------------- ✔️✔️  Enter ID of the book ✔️✔️ -----------------------------------------------------------------------------");
							String idBook = sc.next();
							u.getBook(idBook);
							break;
						case 3:
							System.out.println();
							System.out.println(
									"-------------------------------------------------------------- ✔️✔️  Enter Id of the book ✔️✔️ -----------------------------------------------------------------------------");
							String idBook1 = sc.next();
							u.returnBook(idBook1);
							System.out.println("<----------------------------  Book is returned  ------------------------>");
						default:
							System.out.println("Enter correct choice");
							break;
						}
						break;
					}
					else {
						System.out.println("-------------------------------------------------------------- ❌❌ Invalid Credentials ❌❌ -----------------------------------------------------------------------------");
					}
					
				} else if (choiceLogin == 2) {
					System.out.println(
							"--------------------------------------------------------------- ✔️✔️  Enter Name  ✔️✔️ -----------------------------------------------------------------------------");
					
					String name = sc.nextLine();
					System.out.println(
							"--------------------------------------------------------------- ✔️✔️  Enter User Id ✔️✔️ -----------------------------------------------------------------------------");
					String userid = sc.nextLine();
					System.out.println(
							"--------------------------------------------------------------- ✔️✔️  Enter Password ✔️✔️ -----------------------------------------------------------------------------");
					String pass = sc.nextLine();
					System.out.println(
							"--------------------------------------------------------------- ✔️✔️  Enter Password Again ✔️✔️ -----------------------------------------------------------------------------");
					String pass2 = sc.nextLine();
					if (pass.equals(pass2)) {
						User us = new User(name, userid, pass);
						int i = 0;
						while (i < Database.users.length) {
							if (Database.users[i] == null) {
								break;
							}
							i++;
						}
						Database.users[i] = us;

					}

				}
				else {
					System.out.println("--------------------------------------------------------------- ❌❌ Enter correct choice ❌❌ -----------------------------------------------------------------------------");
				}
				break;

			case 2:
				LibraryService l = new LibraryService();
				System.out.println("----------------------------------------------------------- 😊😊😊 What you want to perform 😊😊😊 -----------------------------");
				System.out.println();
				System.out.println(
						"                                                                     1:Add The Book📗");
				System.out.println("                                                                     2:Is Book Availaible❔");
				System.out.println("                                                                     3:Update The Quantity🔢");
				System.out.println();
				System.out
						.println("--------------------------------------------------------------- ✔️✔️  Enter your choice ✔️✔️ -----------------------------------------------------------------------------");
				int choice3 = sc.nextInt();
				sc.nextLine();
				switch (choice3) {
				case 1:
					System.out.println("--------------------------------------------------------------- ✔️✔️  Enter Book Name ✔️✔️ -----------------------------------------------------------------------------");
					String name = sc.nextLine();
					System.out.println(
							"--------------------------------------------------------------- ✔️✔️  Enter Id of The Book✔️✔️ -----------------------------------------------------------------------------");
					String id = sc.next();
					sc.nextLine();
					System.out.println(
							"--------------------------------------------------------------- ✔️✔️  Enter Author of The Book  ✔️✔️ -----------------------------------------------------------------------------");
					String author = sc.nextLine();
					System.out.println(
							"--------------------------------------------------------------- ✔️✔️  Enter Quantity of The Book ✔️✔️ -----------------------------------------------------------------------------");
					int quant = sc.nextInt();
					Book b = new Book(id, name, author);
					l.addBook(b, quant);
					System.out.println("Book is Added");
					break;
				case 2:
					System.out.println("---------------------  Enter ID of the book  -----------------------");
					String str = sc.next();
					if (l.isAvailable(str)) {
						System.out.println("-----------------  Hey User!...Book is availaible  --------------------");
					} else {
						System.out.println(
								"-----------------  Sorry...The book is not currently availaible  -----------------------");
					}
					break;
				case 3:
					System.out.println("Enter ID of the book");
					String str1 = sc.next();
					System.out.println("-------------------  Enter quantity  -----------------------");
					int qua = sc.nextInt();
					l.updateQuantity(str1, qua);
					System.out.println("---------------------  QUANTITY UPDATED  -----------------------");
					break;
				default:
					System.out.println("---------------------  Enter correct choice  ----------------------");
					break;
				}
				break;
			case 3:
				p = 0;
				break;
			default:
				System.out.println("---------------------------  Enter correct choice  -------------------------");
				break;

			}
			if (p == 0) {
				break;
			}
			System.out.println("Do you want to continue(y/n)?");
			char cho = sc.next().charAt(0);
			if (cho == 'n')
				break;
		}
	}
}
