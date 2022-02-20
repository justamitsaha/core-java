package com.saha.amit.inheritence;

class Bear {
	   public static void sneeze() {
	      System.out.println("Bear is sneezing");
	   }
	   public void hibernate() {
	      System.out.println("Bear is hibernating");
	   }
	   public static void laugh() {
	      System.out.println("Bear is laughing");
	   }
	}
	
	public class Panda extends Bear {
		/*
		 * public void sneeze() { } 
		 * public static void hibernate() { } 
		 * protected static void laugh() { }
		 */
	}