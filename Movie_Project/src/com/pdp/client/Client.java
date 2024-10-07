package com.pdp.client;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.pdp.controller.Controll;
import com.pdp.movie.ActorInfo;

public class Client {
	static {
		System.out.println("-------------- * MOVIES PROJECT * --------------");

	}

	static Controll c = new Controll();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;

		do {
			System.out.println("\nwhat do you want : ");
			System.out.println("1. All Movie Years ");
			System.out.println("2. All Movie Names ");
			System.out.println("3. Exit...");

			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter valid input");
				e.printStackTrace();
				break;
			}

			switch (choice) {
			case 1: {

				System.out.println("All Movies Years :-");

				List<Integer> mname = c.moviesYers();
				Set<Integer> myear = new HashSet<Integer>(mname);
				for (Object my : myear) {

					System.out.println("  " + my);
				}
				System.out.println("-----------------------------------");
				System.out.println("\nwhich years movies do you want ");
				System.out.println("enter this movie year : ");
				int year = 0;
				try {
					year = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Please enter valid input");
					e.printStackTrace();
				}

				List<String> names = c.moviesName(year);
				String dup = null;
				for (Object name : names) {
					if ((dup != name) && name != "null") {

						System.out.println("  " + name);
						dup = (String) name;
					}
				}
				System.out.println("\nwhich movie actors name do you want : ");
				System.out.println("type this movie name : ");
				String mna = null;
				try {
					mna = br.readLine();
				} catch (IOException e) {
					System.out.println("Please enter valid input");
					e.printStackTrace();
				}
				List<String> actnames = c.actorsName(mna);
				String d = null;
				for (Object an : actnames) {
					if (d != an) {
						System.out.println("  " + an);
					}
				}

				System.out.println("\nWhich Actor details do you want ");
				System.out.println("Enter this actor name :  ");
				String aname = null;
				try {
					aname = br.readLine();
				} catch (IOException e) {
					System.out.println("Please enter valid input");
					e.printStackTrace();
				}

				List<ActorInfo> actordetail = c.actorDetails(aname);
				for (Object object : actordetail) {
					System.out.println("  " + object);
				}

				int ch = 0;
				do {
					System.out.println("\nwhat do you ");
					System.out.println("1. another player Info");
					System.out.println("2. Main Menu");

					try {
						ch = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Please enter valid input");
						e.printStackTrace();
					}

					switch (ch) {
					case 1: {
						System.out.println("\nwhich player info do you want : ");
						String name = null;
						try {
							name = br.readLine();
						} catch (IOException e) {
							System.out.println("Please enter valid input");
							e.printStackTrace();
						}
						List<ActorInfo> actd = c.actorDetails(name);
						for (Object object : actd) {
							System.out.println("  " + object);
						}

						break;
					}
					case 2: {

						break;
					}

					default: {
						System.out.println("Invalid input... \n Please enter valid input : ");
					}

					}

				} while (ch != 2);

				break;
			}
			case 2: {
				Set<String> keyset = c.movies();
				for (String string : keyset) {
					System.out.println(string);
				}

				System.out.println("\n which movie actors name do you want : ");
				System.out.println("type this movie name : ");
				String mname = null;
				try {
					mname = br.readLine();
				} catch (IOException e) {
					System.out.println("Please enter valid input");
					e.printStackTrace();
				}
				List<String> actnames = c.actorsName(mname);
				String d = null;
				for (Object an : actnames) {
					if (d != an) {
						System.out.println("  " + an);
					}
				}
				System.out.println("\nWhich Actor details do you want ");
				System.out.println("Enter this actor name :  ");
				String aname = null;
				try {
					aname = br.readLine();
				} catch (IOException e) {
					System.out.println("Please enter valid input");
					e.printStackTrace();
				}

				List<ActorInfo> actordetail = c.actorDetails(aname);
				for (Object object : actordetail) {
					System.out.println("  " + object);
				}

				int ch = 0;
				do {
					System.out.println("\nwhat do you ");
					System.out.println("1. Another Actor Info");
					System.out.println("2. Main Menu");

					try {
						ch = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Please enter valid input");
						e.printStackTrace();
					}

					switch (ch) {
					case 1: {
						System.out.println("\nwhich Actor info do you want : ");
						String name = null;
						try {
							name = br.readLine();
						} catch (IOException e) {
							System.out.println("Please enter valid input");
							e.printStackTrace();
						}
						List<ActorInfo> actd = c.actorDetails(name);
						for (Object object : actd) {
							System.out.println("  " + object);
						}

						break;
					}
					case 2: {

						break;
					}

					default: {
						System.out.println("Invalid input... \n Please enter valid input : ");
					}

					}

				} while (ch != 2);

				break;
			}
			case 3: {
				System.out.println("Thank you use our application .... \nPlease Visit Again... ");
				break;
			}
			default: {
				System.out.println("Invalid input... \n Please enter valid input : ");
				break;
			}

			}

		} while (choice != 3);

	}

}
