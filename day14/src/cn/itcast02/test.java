package cn.itcast02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class test {
	public static void main(String[] args) {
		game_1();
	}
	// 实现 斗地主
	public static void game_1() {
		// 创建Map 集合，键是编号，值是牌
		HashMap<Integer, String> pooker = new HashMap<Integer, String>();
		// 创建 List 集合，存储编号
		ArrayList<Integer> pookerNumber = new ArrayList<Integer>();
		// 定义出 13个点数的数组
		String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		// 定义4个花色数组
		String[] colors = {"♠","🖤","🍸","🔹"};
		// 定义整数变量， 作为键出现
		int index = 2;
		// 遍历数组
		for(String number : numbers) {
			for(String color : colors) {
				pooker.put(index, color+number);
				pookerNumber.add(index);
				index++;
			}
		}
		pooker.put(0, "大王");
		pookerNumber.add(0);
		pooker.put(1, "小王");
		pookerNumber.add(1);
		
		
		// 洗牌 随机 打乱 Collections.shuffle()
		Collections.shuffle(pookerNumber);
//		System.out.println(pookerNumber); 
		
		// 发牌功能，发牌编号，发给玩家集合，底牌集合
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> bottom = new ArrayList<Integer>();
		
		// 发牌 采取的是 集合 %3
		for(int i = 0; i < pookerNumber.size(); i++) {
			// 先将 底牌做好
			if(i <= 3) {
				// 存到底牌
				bottom.add(pookerNumber.get(i));
			} else if( i % 3 == 0) {
				// 索引取出来的编号 ，给玩家
				player1.add( pookerNumber.get(i));
			} else if( i% 3 == 1) {
				player2.add( pookerNumber.get(i));
			} else if( i% 3 == 2) {
				player3.add( pookerNumber.get(i));
			}
		}
		// 对玩家手中的编号排序
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		// 看牌
		
		look("名字1", player1, pooker);
		look("名字2", player2, pooker);
		look("名字3", player3, pooker);
		look("底牌", bottom, pooker);
	}
	public static void look(String name, ArrayList<Integer> player, HashMap<Integer, String> pooker) {
		System.out.println(name);
		for(Integer key : player) {
			String value = pooker.get(key);
			System.out.print(value);
		}
		System.out.println();
	}
}