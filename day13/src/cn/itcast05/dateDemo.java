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
	// 练习计算活了多少天   ，  我必须输入的 是 正确的格式   yyyy-MM-dd
	public static void testMyhoDate() throws ParseException {
		System.out.println("请输入你的 日期 格式 yyyy-MM-dd");
		// 键盘事件，命令框 会等待 用户输入
		String bir = new Scanner(System.in).next();
		// 创建SimpleDateFormat 对象，写日期模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// parse 将  "2010-01-11"   =>    Thu Jan 01 08:00:00 CST 1970
		Date brs = sdf.parse(bir);
		
		// 获取今天对象
		Date todayDate = new Date();
		// 转成毫秒值
		long keyTime = brs.getTime();
		long currentTime = todayDate.getTime();
		
		long time = currentTime - keyTime;
		if(time <=0 ) {
			System.out.println("你还没有出生那");
		} else {
			System.out.println("你活了"+time/1000/60/60/24+"天");   //  你活了263天
		}
		
	}
	
	// add 日历 向后偏移 280 天,   当前时间是 2018/9/21
	public static void calendar_add() {
		Calendar can = Calendar.getInstance();
		can.add(Calendar.DAY_OF_MONTH, 280);
		// 获取年
		int year = can.get(Calendar.YEAR);
		// 获取月
		int month = can.get(Calendar.MONTH);
		// 获取日
		int day = can.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日"); // 2019年5月28日
	}
	
	// Caldender set 方法
	public static void calendar_set() {
		Calendar can = Calendar.getInstance();
		//can.set(Calendar.MONTH, 11);  // 第二个参数 是当前月份大于一， 是当前页
		can.set(2022, 11, 1);  // 2022年11月1日
		// 获取年
		int year = can.get(Calendar.YEAR);
		// 获取月
		int month = can.get(Calendar.MONTH);
		// 获取日
		int day = can.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日"); // 2018年11月21日
	}
	
	// Canlender   get 方法
	public static void Canlender_1() {
		Calendar can = Calendar.getInstance();
		// 获取年
		int year = can.get(Calendar.YEAR);
		// 获取月
		int month = can.get(Calendar.MONTH);
		// 获取日
		int day = can.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH点mm分钟ss秒");
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
