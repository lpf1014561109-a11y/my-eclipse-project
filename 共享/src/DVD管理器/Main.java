package DVD管理器;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int number;
	do{
	System.out.println("欢迎光临DVD商店");
	System.out.println("-------------------");
	System.out.println("菜单：\n1.新增DVD\n2.查看DVD\n3.删除DVD\n4.借出DVD\n5.归还DVD\n6.退出DVD" );
	System.out.println("-------------------");
	System.out.println("请输入您要选择的分类");
	number = scanner.nextInt();
	switch (number) {
		//新增
		case 1:
			System.out.println("请输入添加的DVD名字");
			String setname = scanner.next();
			DVDService.addDVD(setname);
			break;
		//查看
		case 2:
			DVDService.chickDVD();
			break;
		//删除
		case 3:
			DVDService.chickDVD();
			System.out.println("请输入删除的DVD编号");
			int chicknumber = scanner.nextInt();
			DVDService.deleteDVD(chicknumber);
			break;
		//借出
		case 4:
			DVDService.chickDVD();
			System.out.println("请输入想要借出的DVD编号");
			int rentalnumber = scanner.nextInt();
	        System.out.println("请输入借出日期：");
	        String rentalDate = scanner.next();
	        DVDService.rentalDVD(rentalnumber, rentalDate);
	        break;
		//归还
		case 5:
			DVDService.chickDVD();
	        System.out.println("请输入想要归还的DVD编号：");
	        int returnNumber = scanner.nextInt();
	        System.out.println("请输入归还日期：");
	        int returnDate = scanner.nextInt();
	        DVDService.returnDVD(returnNumber, returnDate);
	        break;
		case 6:System.out.println("欢迎下次光临！");
	    break;
	    default:
	    	System.out.println("输入有误，请重新输入！");
	        break;
		}
		System.out.println();
	  } while (number != 6);
		scanner.close();
	}
}

