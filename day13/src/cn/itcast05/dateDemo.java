package cn.itcast05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class dateDemo {
	public static void main(String[] args) throws ParseException {
		testMyhoDate();
	} 
	// ��ϰ������˶�����   ��  �ұ�������� �� ��ȷ�ĸ�ʽ   yyyy-MM-dd
	public static void testMyhoDate() throws ParseException {
		System.out.println("��������� ���� ��ʽ yyyy-MM-dd");
		// �����¼�������� ��ȴ� �û�����
		String bir = new Scanner(System.in).next();
		// ����SimpleDateFormat ����д����ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// parse ��  "2010-01-11"   =>    Thu Jan 01 08:00:00 CST 1970
		Date brs = sdf.parse(bir);
		
		// ��ȡ�������
		Date todayDate = new Date();
		// ת�ɺ���ֵ
		long keyTime = brs.getTime();
		long currentTime = todayDate.getTime();
		
		long time = currentTime - keyTime;
		if(time <=0 ) {
			System.out.println("�㻹û�г�����");
		} else {
			System.out.println("�����"+time/1000/60/60/24+"��");   //  �����263��
		}
		
	}
	
	// add ���� ���ƫ�� 280 ��,   ��ǰʱ���� 2018/9/21
	public static void calendar_add() {
		Calendar can = Calendar.getInstance();
		can.add(Calendar.DAY_OF_MONTH, 280);
		// ��ȡ��
		int year = can.get(Calendar.YEAR);
		// ��ȡ��
		int month = can.get(Calendar.MONTH);
		// ��ȡ��
		int day = can.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��"); // 2019��5��28��
	}
	
	// Caldender set ����
	public static void calendar_set() {
		Calendar can = Calendar.getInstance();
		//can.set(Calendar.MONTH, 11);  // �ڶ������� �ǵ�ǰ�·ݴ���һ�� �ǵ�ǰҳ
		can.set(2022, 11, 1);  // 2022��11��1��
		// ��ȡ��
		int year = can.get(Calendar.YEAR);
		// ��ȡ��
		int month = can.get(Calendar.MONTH);
		// ��ȡ��
		int day = can.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��"); // 2018��11��21��
	}
	
	// Canlender   get ����
	public static void Canlender_1() {
		Calendar can = Calendar.getInstance();
		// ��ȡ��
		int year = can.get(Calendar.YEAR);
		// ��ȡ��
		int month = can.get(Calendar.MONTH);
		// ��ȡ��
		int day = can.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��");
	}
	// "2012-01-02"    =>    Thu Jan 01 08:00:00 CST 1970
	public static void simpleDateFormat_2() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
		Date date = sdf.parse("2010/02/3/11:11:11");
		System.out.println(date);
	}
	
	// simpleDateFormat
	// "Thu Jan 01 08:00:00 CST 1970"   =>     "2012-01-02"
	public static void simpleDateFormat_1() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HH��mm����ss��");
		String date = sdf.format(new Date());
		System.out.println(date);
	}
	
	public static void time_1() {
		long time = System.currentTimeMillis();
		System.out.println(time);
//		Date date = new Date();
//		Date date = new Date(0);
		Date date = new Date();
		long time2 = date.getTime();
		System.out.println(time2);
	}
	public static void time_2() {
		Date date = new Date();
        System.out.println(date); 
        date.setTime(0);
        System.out.println(date);
	}
}