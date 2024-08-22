package com.evergent.corejava.hameed.application2;

import java.io.IOException;
import java.util.Scanner;

public class PatientBillingHM {
	enum module1 {
		E, H, S, B, Q
	}
	;
	enum submodule1 {
		EA, EB, EC, ED
	}
	;
	enum submodule2 {
		HA, HB, HC, HD
	}
	;
	enum submodule3 {
		SA, SB, SC, SD
	}
	;
	enum submodule4 {
		BA, BB, BC
	}
	;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		int pat;
		int amount;
		String prob = null;
		Scanner br = new Scanner(System.in);
		System.out.println("\n\t\t \t\t Welcome To PATIENT BILLING SYSTEM");
		int i = 1;

		while (i == 1) {
			System.out.println("======================");
			System.out.println(" PBS Main Menu");
			System.out.println("======================");//
			System.out.println("E-Eye Problem");
			System.out.println("H-Head Ache issue");
			System.out.println("S-Skin Problem");
			System.out.println("B-Bone Problem");
			System.out.println("Q-Exit");
			System.out.println("======================");
			System.out.println("Enter your Health Problem (E,H,S,B,Q) : ");
			prob = br.nextLine();// String format
			System.out.println("You entered   : ");
			switch (module1.valueOf(prob)) {
			case E:
				System.out.println(" Eye Problem You are Consulting  To Ophthalmologist ");
				System.out.println("======================");
				System.out.println("EA-to Eye Sight Check up");
				System.out.println("EB-to Lens Repair");
				System.out.println("EC-to Eye conjunctivitis");
				System.out.println("ED-to return PBS menu");
				System.out.println("======================");
				System.out.println("Enter your Problem code (EA,EB,EC,ED) : ");
				prob = br.nextLine();
				switch (submodule1.valueOf(prob)) {
				case EA:
					System.out.println("to Eye Sight Check up ");
					System.out.println("Consult cost is 100Rs.per Head");
					System.out.println("Enter no of Patient");
					pat = br.nextInt();
					System.out.println("you selected no of patient are :" + pat);
					amount = 100 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					System.out.println("Enter 1:Want to display your bill 2:Quit ");
					int n = br.nextInt();
					switch (n) {
					case 1:
						System.out.println("====Summary of your bill=====");
						System.out.println("You Have Eye Problem You have Consulted To Ophthalmologist");
						System.out.println("In which Have Eye Sight Check up");
						System.out.println("You Have " + pat + " no of patients");
						System.out.println("Your Amount is:" + amount);
						System.out.println("===THANK YOU===");

						break;

					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
						break;
					
						
					}

					break;
				case EB:
					System.out.println("to Eye Lens Repair ");
					System.out.println("Lens cost is 500Rs.per Head");
					System.out.println("Enter no of Lens");
					pat = br.nextInt();
					System.out.println("you selected no of Lens are :" + pat);
					amount = 500 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					System.out.println("Enter 1:Want to display your bill 2:Quit ");
					int m = br.nextInt();
					switch (m) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Eye Problem and You have Consulted To Ophthalmologist ");
					System.out.println("In which Have Lens Repair");
					System.out.println("You Have " + pat + " no of lens");
					System.out.println("Your Amount is:" + amount);
					System.out.println("===THANK YOU===");
					break;
					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
						break;
					}
					break;
					
				case EC:
					System.out.println("to Eye Conjuctivities ");
					System.out.println("Consult cost is 300Rs.per Head");
					System.out.println("Enter no of Patients");
					pat = br.nextInt();
					System.out.println("you selected no of Patient are :" + pat);
					amount = 300 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					System.out.println("Enter 1:Want to display your bill 2:Quit ");
					int p = br.nextInt();
					switch (p) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Eye Problem and You have Consulted To Ophthalmologist");
					System.out.println("In which Have Eye Conjuctivities");
					System.out.println("You Have " + pat + " no of patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("=====THANK YOU=====");
					break;
					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
						break;
					}
				}
					break;
			case H:
				System.out.println(" HEAD Related Problem and You are Consulting to Phrenologist");
				System.out.println("======================");
				System.out.println("HA-to Normal Head Ache");
				System.out.println("HB-to Brain Tumour");
				System.out.println("HC-to Head Injury");
				System.out.println("HD-to return PBS menu");
				System.out.println("======================");
				System.out.println("Enter your Problem code (HA,HB,HC,HD) : ");
				prob = br.nextLine();
				switch (submodule2.valueOf(prob)) {
				case HA:
					System.out.println("to Normal Head Ache ");
					System.out.println("Consult cost is 200Rs.per Head");
					System.out.println("Enter no of Patient");
					pat = br.nextInt();
					System.out.println("you selected no of patient are :" + pat);
					amount = 200 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					System.out.println("Enter 1:Want to display your bill 2:Quit ");
					int q = br.nextInt();
					switch (q) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Head Related Problem and You have Consulted to Phrenologist ");
					System.out.println("In which Have  Head Ache Issue");
					System.out.println("You Have " + pat + " no of patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("===THANK YOU===");
					break;
					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
					}

					break;
				case HB:
					System.out.println("to Brain Tumour ");
					System.out.println("Consult cost is 5000Rs.per Head");
					System.out.println("Enter no of Patients");
					pat = br.nextInt();
					System.out.println("you selected no of Patient are :" + pat);
					amount = 5000 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					System.out.println("Enter 1:Want to display your bill 2:Quit ");
					int qq = br.nextInt();
					switch (qq) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Head Related Problem");
					System.out.println("In which You Have Brain Tumour");
					System.out.println("You Have " + pat + " no of Patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("===THANK YOU===");
					break;
					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
						break;
					}
					
					break;
				case HC:
					System.out.println("to Head Injury ");
					System.out.println("Consult cost is 200Rs.per Head");
					System.out.println("Enter no of Patients");
					pat = br.nextInt();
					System.out.println("you selected no of Patient are :" + pat);
					amount = 200 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					System.out.println("Enter 1:Want to display your bill 2:Quit ");
					int qP = br.nextInt();
					switch (qP) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Head Related Problem");
					System.out.println("In which Have Head Injury");
					System.out.println("You Have " + pat + " no of patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("=====THANK YOU=====");
					break;
					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
						break;
					}
				}
					break;
					
				

			case S:
				System.out.println(" SKIN Related Problem You are consulting to Dermatologist" );
				System.out.println("======================");
				System.out.println("SA-to Skin Wound");
				System.out.println("SB-to Skin Allergy");
				System.out.println("SC-to Skin Disease or Skin Cancer");
				System.out.println("SD-to return PBS menu");
				System.out.println("======================");
				System.out.println("Enter your Problem code (SA,SB,SC,SD) : ");
				prob = br.nextLine();
				switch (submodule3.valueOf(prob)) {
				case SA:
					System.out.println("to Skin Wound ");
					System.out.println("Consult cost is 200Rs.per Head");
					System.out.println("Enter no of Patient");
					pat = br.nextInt();
					System.out.println("you selected no of patient are :" + pat);
					amount = 200 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					System.out.println("Enter 1:Want to display your bill 2:Quit ");
					int PP = br.nextInt();
					switch (PP) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Skin Related Problem");
					System.out.println("In which you Have  Skin wound Issue");
					System.out.println("You Have " + pat + " no of patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("===THANK YOU===");
					break;
					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
						break;
					}

					break;
				case SB:
					System.out.println("to Skin Allergy ");
					System.out.println("Consult cost is 500Rs.per Head");
					System.out.println("Enter no of Patients");
					pat = br.nextInt();
					System.out.println("you selected no of Patient are :" + pat);
					amount = 500 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					int Pa = br.nextInt();
					switch (Pa) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Skin Related Problem");
					System.out.println("In which You Have Skin Allergy");
					System.out.println("You Have " + pat + " no of Patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("===THANK YOU===");
					break;
					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
						break;
					}

					break;
				case SC:
					System.out.println("to Skin Disease ");
					System.out.println("Consult cost is 2000Rs.per Head");
					System.out.println("Enter no of Patients");
					pat = br.nextInt();
					System.out.println("you selected no of Patient are :" + pat);
					amount = 2000 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					int Pc = br.nextInt();
					switch (Pc) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Skin Related Problem");
					System.out.println("In which Have Skin Disease");
					System.out.println("You Have " + pat + " no of patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("=====THANK YOU=====");
					break;
					case 2:
					System.out.println("You Have Exited");
					System.exit(0);
					break;
				}
					break;
				}

				break;
			case B:
				System.out.println(" BONE Related Problem");
				System.out.println("======================");
				System.out.println("BA-to Bone Fracture");
				System.out.println("BB-to Bone X-ray");
				System.out.println("BC-to return PBS menu");
				System.out.println("======================");
				System.out.println("Enter your Problem code (BA,BB,BC) : ");
				prob = br.nextLine();
				switch (submodule4.valueOf(prob)) {
				case BA:
					System.out.println("to BONE Fracture ");
					System.out.println("Consult cost is 200Rs.per Head");
					System.out.println("Enter no of Patient");
					pat = br.nextInt();
					System.out.println("you selected no of patient are :" + pat);
					amount = 200 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					int Pd = br.nextInt();
					switch (Pd) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Bone Related Problem");
					System.out.println("In which you Have Bone Fracture Issue");
					System.out.println("You Have " + pat + " no of patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("===THANK YOU===");
					break;
					case 2:
					System.out.println("You Have Exited");
					System.exit(0);
					break;
				}

					break;
				case BB:
					System.out.println("to Bone X-Ray ");
					System.out.println("Consult cost is 500Rs.per Head");
					System.out.println("Enter no of Patients");
					pat = br.nextInt();
					System.out.println("you selected no of Patient are :" + pat);
					amount = 500 * pat;
					System.out.println("YOUR AMOUNT IS:" + amount);
					int Pe = br.nextInt();
					switch (Pe) {
					case 1:
					System.out.println("====Summary of your bill=====");
					System.out.println("You Have Bone Related Problem");
					System.out.println("In which You Have to check Bone X-ray");
					System.out.println("You Have " + pat + " no of Patients");
					System.out.println("Your Amount is:" + amount);
					System.out.println("===THANK YOU===");
					break;
					case 2:
						System.out.println("You Have Exited");
						System.exit(0);
						break;
					}
					break;
				}

				break;
			case Q:

				System.out.println("Exit");
				System.exit(0);
				break;

			}
			i--;
			
				}
			

		}

	}

