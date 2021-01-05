package com.naver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public void me9() {
		System.out.println(String.format("%4d, %3s", 33, "hell"));
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY�� MM�� dd�� hh�� mm�� ss��");
		String msg = sdf.format(c.getTime());
		System.out.println(msg);

	}

	public void me8() {
		// �ڹٿ����� CalendarŬ������ ����.
		// �׷��� DB������ CalendarŬ�������ٴ� Date Ŭ������ ���� ����Ѵ�.
		// ���� �ݵ�� �� Ÿ���� ��ȯ�� �� �־�� �Ѵ�.

		Calendar c = Calendar.getInstance();
		Date d = new Date(c.getTimeInMillis());
		c.setTime(d);
		Date d2 = new Date(1);
		System.out.println(System.currentTimeMillis());

	}

	public void me7() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());

		c.roll(Calendar.DATE, 20);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));

	}

	public void me61() {
		Calendar c = Calendar.getInstance();
		Calendar c2 = (Calendar) c.clone();
		c2.add(Calendar.DATE, 20);

		System.out.println(c);
		System.out.println(c2);

	}

	public void me6() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		// 2020�� 11�� 12���Դϴ�.
		// 20�� �Ŀ��� ��ĥ�ϱ��?
		// 2020�� 11�� 32��....
		// 2020�� 12�� 2��.....
		// add()�� Calendar��ü�� ������ �����մϴ�.
		// Ư�� �ʵ��� ���� �־��� ���� ���ؼ� �����մϴ�.
		c.add(Calendar.DATE, 20);
		System.out.println(c.getTime());

	}

	public void me5() {// �� �߿��� ����...���� �� �ص� �Ǵ� ����
		Scanner sc = new Scanner(System.in);

		try {
			/*
			 * System.out.println("������ �Է��ϼ���."); int year = sc.nextInt(); sc.nextLine();
			 * 
			 * System.out.println("���� �Է��ϼ���."); int month = sc.nextInt(); sc.nextLine();
			 */

			int year = 2020;
			int month = 10;

			Calendar c = Calendar.getInstance();
			c.set(year, month - 1, 1);

			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);

			System.out.println(year + "�� " + month + "��");
			System.out.println(" SU MO TU WE TH FR SA");

			for (int i = 1; i < firstDateDay; i++) {
				System.out.print("   ");
			}

			for (int i = 1; i < lastDate + 1; i++) {
				String naljja = i < 10 ? "  " + i : " " + i;
				System.out.print(naljja);
				if ((i + firstDateDay - 1) % Calendar.SATURDAY == 0) {
					System.out.println();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public void me41() {
		// 1950�� 2���� ���������� ��ĥ���� �������?
		// �׸��� �׳��� ������ �����ϱ��?
		// �� �� ���� ����Ͻÿ�.

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1950);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);

		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		c.set(Calendar.DATE, maxDate);

		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	}

	public void me4() {
		Calendar c = Calendar.getInstance();
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDate);
	}

	public void me32() {
		// 1. 1950�� 6�� 25���� ���� �����ϱ��? ȭ�鿡 ���ϸ� ����Ͻÿ�.
		Calendar c = Calendar.getInstance();
		c.set(1950, Calendar.JUNE, 25);
		int[] dayarr = {c.get(Calendar.DAY_OF_WEEK)};
		for (int i = 0; i < dayarr.length; i++) {
			if(dayarr[i] == 1) {
				System.out.println("������");
			}
		}
		
		
	

		

	}

	public void me31() {
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, Calendar.MAY);
		System.out.println(c);
	}

	public void me3() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.set(1950, 6 - 1, 25);

		System.out.println(c1);
		System.out.println(c2);

	}

	public void me2() {
		Calendar c = Calendar.getInstance();

		// c�� �̿��ؼ� ���� ���� �����ϱ�.

		int year = c.get(Calendar.YEAR);
		// �� ���� int month
		int month = c.get(Calendar.MONTH) + 1;
		// �� ���� int date
		int date = c.get(Calendar.DATE);
		// ���� ���� int day
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
	}

	public void me1() {
		// 1. Calendar Ŭ���� ��ü ���� ���
		Calendar c = Calendar.getInstance();

	}

}