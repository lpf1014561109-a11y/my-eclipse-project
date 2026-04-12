package DVD管理器;

public class DVDService {
	//管理了多少的dvd
	static DVDData[] dvds = new DVDData[10];
	//默认DVD
	static {
        dvds[0] = new DVDData("罗马假日", false, "", 0);
        dvds[1] = new DVDData("风声鹤唳", false, "", 0);
        dvds[2] = new DVDData("浪漫满屋", false, "", 0);
    }
	//1.新增dvd
	public static boolean addDVD(String name) {
		//判断输入
		if (name == null || name.trim().equals("")) {
            System.out.println("DVD名称不能为空！");
            return false;
        }
		//新增循环
		for (int i = 0; i < dvds.length; i++) {
            if (dvds[i] == null) {
                dvds[i] = new DVDData(name, false, "", 0);
                System.out.println(name + " 添加成功！");
                return true;
            }
        }
		//如果满了的话
        System.out.println("DVD库已满，无法新增！");
        return false;
    }
	//2.查看dvd的方法
	public static void chickDVD() {
		System.out.println("序号\t  名称\t状态\t借出时间\t借出次数");
		boolean hasDVD = false;

	    for (int i = 0; i < dvds.length; i++) {
	        if (dvds[i] != null) {
	            hasDVD = true;

	            String stateText;
	            if (dvds[i].isState()) {
	                stateText = "已借出";
	            } else {
	                stateText = "可借";
	            }

	            System.out.println(
	                    (i + 1) + "\t"
	                    + dvds[i].getName() + "\t"
	                    + stateText + "\t"
	                    + dvds[i].getRentaltiming() + "\t"
	                    + dvds[i].getRentaltime()
	            );
	        }
	    }

	    if (!hasDVD) {
	        System.out.println("当前没有DVD");
	    }
	}
	//3.删除dvd
	public static boolean deleteDVD(int index) {
		int realIndex = index - 1;
		//判读范围
		if (realIndex< 0 || realIndex >= dvds.length) {
			System.out.println("输入的DVD序号不存在");
			return false;
		}
		//为空判断
		if (dvds[realIndex] == null) {
			System.out.println("该位置没有DVD");
			return false;
		}
		
		for (int i = realIndex; i < dvds.length - 1; i++) {
			dvds[i] = dvds[i + 1];
		}
		dvds[dvds.length - 1] = null;
        System.out.println("删除成功！");
        return true;
	}
	//4.借出DVD
	public static boolean rentalDVD(int index, String rentalDate) {
		int rentalIndex = index - 1;
		//判读范围
		if (rentalIndex< 0 || rentalIndex >= dvds.length) {
			System.out.println("输入的DVD序号不存在");
			return false;
		}
		//为空判断
		if (dvds[rentalIndex] == null) {
			System.out.println("该位置没有DVD");
			return false;
		}
		//状态确认
		if (dvds[rentalIndex].isState()) {
	            System.out.println("该DVD已经被借出！");
	            return false;
	        }
		//需要输入日期
		if (rentalDate == null || rentalDate.trim().equals("")) {
	        System.out.println("借出日期不能为空！");
	        return false;
		}   
	    dvds[rentalIndex].setState(true);  // true 表示已借出
	    dvds[rentalIndex].setRentaltiming(rentalDate);
	    dvds[rentalIndex].setRentaltime(dvds[rentalIndex].getRentaltime() + 1);

	    System.out.println("借出成功！");
	    return true;
	}
	//5.归还DVD
	public static boolean returnDVD(int index, int returnDate) {
        int realIndex = index - 1;

        if (realIndex < 0 || realIndex >= dvds.length) {
            System.out.println("输入的DVD序号不存在！");
            return false;
        }

        if (dvds[realIndex] == null) {
            System.out.println("该位置没有DVD，无法归还！");
            return false;
        }

        if (!dvds[realIndex].isState()) {
            System.out.println("该DVD当前未借出，无法归还！");
            return false;
        }

        int lendDate = Integer.parseInt(dvds[realIndex].getRentaltiming());

        if (returnDate < lendDate) {
            System.out.println("归还日期不能小于借出日期！");
            return false;
        }

        int money = (returnDate - lendDate) + 1;

        dvds[realIndex].setState(false);
        dvds[realIndex].setRentaltiming("");

        System.out.println("归还成功！");
        System.out.println("应支付租金：" + money + " 元");
        return true;
    }
	
}
