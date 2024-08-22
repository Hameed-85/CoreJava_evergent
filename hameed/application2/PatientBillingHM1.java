package com.evergent.corejava.hameed.application2;
//package com.evergent.corejava.hameed.application2;

import java.io.IOException;
import java.util.Scanner;

public class PatientBillingHM1 {
	enum Module {
		E, H, S, B, Q
	}
	;
	enum SubmoduleE {
		EA, EB, EC, ED
	}
	;
	enum SubmoduleH {
		HA, HB, HC, HD
	}
	;
	enum SubmoduleS {
		SA, SB, SC, SD
	}
	;
	enum SubmoduleB {
		BA, BB, BC
	}
	;

	public static void main(String[] args) throws IOException {
		Scanner br = new Scanner(System.in);
		int totalAmount = 0;
		StringBuilder billSummary = new StringBuilder();

		System.out.println("\n\t\t \t\t Welcome To PATIENT BILLING SYSTEM");

		while (true) {
			System.out.println("======================");
			System.out.println("PBS Main Menu");
			System.out.println("======================");
			System.out.println("E-Eye Problem");
			System.out.println("H-Head Related issue");
			System.out.println("S-Skin Problem");
			System.out.println("B-Bone Problem");
			System.out.println("P-Payment");
			System.out.println("======================");
			System.out.println("Enter your Health Problem (E,H,S,B,P) : ");
			String prob = br.nextLine().toUpperCase(); // Convert to uppercase to match enum values

			if (prob.equals("P")) {
				break; // Exit the loop
			}

			switch (Module.valueOf(prob)) {
				case E:
					totalAmount += handleEyeProblems(br, billSummary);
					break;
				case H:
					totalAmount += handleHeadProblems(br, billSummary);
					break;
				case S:
					totalAmount += handleSkinProblems(br, billSummary);
					break;
				case B:
					totalAmount += handleBoneProblems(br, billSummary);
					break;
			}
		}

		// Print final summary
		System.out.println("====Summary of Your Bills====");
		System.out.println(billSummary.toString());
		System.out.println("Total Amount: " + totalAmount + "Rs");
		System.out.println("===THANK YOU===");
	}

	private static int handleEyeProblems(Scanner br, StringBuilder billSummary) {
		int amount = 0;
		int pat;
		System.out.println("Eye Problem You are Consulting To Ophthalmologist");
		System.out.println("======================");
		System.out.println("EA-to Eye Sight Check up");
		System.out.println("EB-to Lens Repair");
		System.out.println("EC-to Eye Conjunctivitis");
		System.out.println("ED-to return PBS menu");
		System.out.println("======================");
		System.out.println("Enter your Problem code (EA,EB,EC,ED) : ");
		String prob = br.nextLine().toUpperCase();

		switch (SubmoduleE.valueOf(prob)) {
			case EA:
				System.out.println("Eye Sight Check up ");
				System.out.println("Consult cost is 100Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 100 * pat;
				billSummary.append("You have Eye Problem : You are Consulting to Opthamologist : Eye Sight Check up for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
			case EB:
				System.out.println("Lens Repair ");
				System.out.println("Lens cost is 500Rs.per Lens");
				System.out.println("Enter number of Lenses");
				pat = br.nextInt();
				amount = 500 * pat;
				billSummary.append("You have Eye Problem: Lens Repair for ").append(pat).append(" lenses - Amount: ").append(amount).append("Rs\n");
				break;
			case EC:
				System.out.println("Eye Conjunctivitis ");
				System.out.println("Consult cost is 300Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 300 * pat;
				billSummary.append(" You have Eye Problem: Eye Conjunctivitis for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
		}
		br.nextLine(); // Consume the newline
		return amount;
	}

	private static int handleHeadProblems(Scanner br, StringBuilder billSummary) {
		int amount = 0;
		int pat;
		System.out.println("Head Related Problem and You are Consulting to Phrenologist");
		System.out.println("======================");
		System.out.println("HA-to Normal Head Ache");
		System.out.println("HB-to Brain Tumour");
		System.out.println("HC-to Head Injury");
		System.out.println("HD-to return PBS menu");
		System.out.println("======================");
		System.out.println("Enter your Problem code (HA,HB,HC,HD) : ");
		String prob = br.nextLine().toUpperCase();

		switch (SubmoduleH.valueOf(prob)) {
			case HA:
				System.out.println("Normal Head Ache ");
				System.out.println("Consult cost is 200Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 200 * pat;
				billSummary.append("You have Head Problem : You are Consulting to Phrenologist: Normal Head Ache for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
			case HB:
				System.out.println("Brain Tumour ");
				System.out.println("Consult cost is 5000Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 5000 * pat;
				billSummary.append("You have Head Problem \n You are Consulting to Phrenologist\n Brain Tumour for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
			case HC:
				System.out.println("Head Injury ");
				System.out.println("Consult cost is 200Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 200 * pat;
				billSummary.append("Head Problem: Head Injury for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
		}
		br.nextLine(); // Consume the newline
		return amount;
	}

	private static int handleSkinProblems(Scanner br, StringBuilder billSummary) {
		int amount = 0;
		int pat;
		System.out.println("Skin Related Problem You are consulting to Dermatologist");
		System.out.println("======================");
		System.out.println("SA-to Skin Wound");
		System.out.println("SB-to Skin Allergy");
		System.out.println("SC-to Skin Disease");
		System.out.println("SD-to return PBS menu");
		System.out.println("======================");
		System.out.println("Enter your Problem code (SA,SB,SC,SD) : ");
		String prob = br.nextLine().toUpperCase();

		switch (SubmoduleS.valueOf(prob)) {
			case SA:
				System.out.println("Skin Wound ");
				System.out.println("Consult cost is 200Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 200 * pat;
				billSummary.append("You have Skin Problem:You are Consulting to Dermatologist Skin Wound for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
			case SB:
				System.out.println("Skin Allergy ");
				System.out.println("Consult cost is 500Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 500 * pat;
				billSummary.append("Skin Problem: Skin Allergy for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
			case SC:
				System.out.println("Skin Disease ");
				System.out.println("Consult cost is 2000Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 2000 * pat;
				billSummary.append("Skin Problem: Skin Disease for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
		}
		br.nextLine(); // Consume the newline
		return amount;
	}

	private static int handleBoneProblems(Scanner br, StringBuilder billSummary) {
		int amount = 0;
		int pat;
		System.out.println("Bone Related Problem You are consulting to Osteologist");
		System.out.println("======================");
		System.out.println("BA-to Bone Fracture");
		System.out.println("BB-to Bone X-ray");
		System.out.println("BC-to return PBS menu");
		System.out.println("======================");
		System.out.println("Enter your Problem code (BA,BB,BC) : ");
		String prob = br.nextLine().toUpperCase();

		switch (SubmoduleB.valueOf(prob)) {
			case BA:
				System.out.println("Bone Fracture ");
				System.out.println("Consult cost is 200Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 200 * pat;
				billSummary.append("Bone Problem: Bone Fracture for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
			case BB:
				System.out.println("Bone X-ray ");
				System.out.println("Consult cost is 500Rs.per Head");
				System.out.println("Enter number of Patients");
				pat = br.nextInt();
				amount = 500 * pat;
				billSummary.append("Bone Problem: Bone X-ray for ").append(pat).append(" patients - Amount: ").append(amount).append("Rs\n");
				break;
		}
		br.nextLine(); // Consume the newline
		return amount;
	}
}
