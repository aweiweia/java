package zuoye;

import java.util.Scanner;

/**
 *
 * @author ��Դ
 * @date ����ʱ�䣺2016��12��16������5:06:19
 * 
 */
public class ZuoYe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������е��ƣ�");
		//���
		int num1 = sc.nextInt();
		System.out.println("�����������е��ƣ�");
		//����
		int num2 = sc.nextInt();
		//�м����:֧����
		int temp = 0;
		//1.����Ȱ�Ǯ����֧����
		temp = num1;
		//2.���ҷ��������
		num1 = num2;
		//3.֧������Ǯ�������
		num2 = temp;
		System.out.println("�����е��ƣ�" + num1);
		System.out.println("�����е��ƣ�" + num2);
	}
}
