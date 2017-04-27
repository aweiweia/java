package zuoye;

import java.util.Scanner;

/**
 *
 * @author 丰源
 * @date 创建时间：2016年12月16日下午5:06:19
 * 
 */
public class ZuoYe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入左手中的牌：");
		//买家
		int num1 = sc.nextInt();
		System.out.println("请输入右手中的牌：");
		//卖家
		int num2 = sc.nextInt();
		//中间变量:支付宝
		int temp = 0;
		//1.买家先把钱付给支付宝
		temp = num1;
		//2.卖家发货给买家
		num1 = num2;
		//3.支付宝把钱打给卖家
		num2 = temp;
		System.out.println("左手中的牌：" + num1);
		System.out.println("右手中的牌：" + num2);
	}
}
