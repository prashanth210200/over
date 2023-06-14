package com.onesoft.day1;

public class studentaverage {
	public static void main(String[] args) {
		String name="shan";
		long rollnum=9876543210l;
		int tamilmark=99;
		int englishmark=99;
		int mathsmark=99;
		int sciencemark=88;
		int socialmark=77;
		int totalmark =tamilmark+englishmark+mathsmark+sciencemark+socialmark;
		float average =totalmark/5f;
		System.out.println("student name is "+name +" average is "+average);
	}

}
