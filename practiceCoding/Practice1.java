package practiceCoding;

public class Practice1 {
	public static void main(String[] args) {
//		int x = 80;
//		
//		switch (2) {
//		case 1:
//			if (x >= 60) {
//				System.out.println("合格");
//			} else {
//				System.out.println("不合格");
//			}
//		break;
//		case 2:
//			if (x >= 80) {
//				System.out.println("たいへんよくできました。");
//			} else if (x >= 60 && x < 80) {
//				System.out.println("よくできました。");
//			} else {
//				System.out.println("ざんねんでした。");
//			}
//		break;
//		case 3:
//			if (x >= 80) {
//				System.out.println("優");
//			} else if (x >= 70 && x < 80) {
//				System.out.println("良");
//			} else if (x >= 60 && x < 70) {
//				System.out.println("可");
//			} else {
//				System.out.println("不可");
//			}
//		break;
//		}
		
//		int firstTest = 1;
//		int secondTest = 90;
//		String goodResult = "合格";
//		String badResult = "不合格";
//		
//		if (firstTest >= 60 && secondTest >= 60) {
//			System.out.println(goodResult);
//		} else if (firstTest + secondTest >= 130) {
//			System.out.println(goodResult);
//		} else if (firstTest + secondTest >= 100 && (firstTest >= 90 || secondTest >= 90)) {
//			System.out.println(goodResult);
//		} else {
//			System.out.println(badResult);
//		}
		
//		0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
//		0=午前、1=午後、2=夜間
//		int week = 3; 
//		int day = 2;
//		String close = "休診です。";
//		String open = "診療しています。";
//		
//		if (week == 0) {
//			System.out.println(close);
//		} else if (week == 1 || week == 4) {
//			System.out.println(open);
//		} else if (week == 2 || week == 5) {
//			if (day == 0) {
//				System.out.println(close);
//			} else {
//				System.out.println(open);
//			}
//		} else if (week == 3) {
//			if (day == 2) {
//				System.out.println(close);
//			} else {
//				System.out.println(open);
//			}
//		} else if (week == 6) {
//			if (day == 0) {
//				System.out.println(open);
//			} else {
//				System.out.println(close);
//			}
//		}
		
//		System.out.println("曜日を選択してください。");
//		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
//		System.out.println("");
//		System.out.println("時間帯を選択してください。");
//		System.out.println("0=午前、1=午後、2=夜間");
//		System.out.println("");
//		
//		int week = 0;
//		int day = 3;
//		
//		boolean bopen = true;
//		
//		if (week == 0) {
//			bopen = false;
//		} else if (day == 0 && (week == 2 || week == 5)) {
//			bopen = false;
//		} else if (day == 1 && week == 6) {
//			bopen = false;
//		} else if (day == 2 && (week == 3 || week == 6)) {
//			bopen = false;
//		}
//		
//		if (bopen) {
//			System.out.println("診療しています。");
//		} else {
//			System.out.println("休診です。");
//		}
		
//		int x = 5;
//		int y = 3;
//		
//		if (x < y && (x % 2) == 0 && (y % 2) == 0) {
//			System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
//		}
//		if (x == y && x < 0) {
//			System.out.println("xとyは等しく、かつ、負の数である。");
//		}
//		if (x < y || (x % 2) == 0) {
//			System.out.println("xはyより小さい、または、xは偶数である。");
//		}
//		if ((x <= 10 || x >= 100) && (y >= 10 && y <= 100)) {
//			System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
//		}
//		if (!(x < 0 && y < 0)) {
//			System.out.println("xもyも負の数である、ではない。");
//		}
		
//		System.out.println("月を選択してください。");
//		System.out.println("0 = 1月, 1 = 2月, 2 = 3月, 3 = 4月, 4 = 5月, 5 = 6月, 6 = 7月,");
//		System.out.println("7 = 8月, 8 = 9月, 9 = 10月, 10 = 11月, 11 = 12月");
//		
//		int month = 8;
//		
//		switch (month) {
//		case 0:
//			System.out.println("元日、成人の日");
//			break;
//		case 1:
//			System.out.println("建国記念日");
//			break;
//		case 2:
//			System.out.println("春分の日");
//			break;
//		case 3:
//			System.out.println("昭和の日");
//			break;
//		case 4:
//			System.out.println("憲法記念日、みどりの日、こどもの日");
//			break;
//		case 5:
//			System.out.println("海の日");
//			break;
//		case 6:
//			System.out.println("敬老の日、秋分の日");
//			break;
//		case 7:
//			System.out.println("体育の日");
//			break;
//		case 8:
//			System.out.println("文化の日、勤労感謝の日");
//			break;
//		case 9:
//			System.out.println("天皇誕生日");
//			break;
//		case 10:
//			System.out.println("");
//			break;
//		case 11:
//			System.out.println("");
//			break;
//		}
		
//		System.out.println("お好きな寿司ネタはなんですか？");
//		System.out.println("0=まぐろ、1=えび、2=サーモン、3=はまち、4=たい、5=いか");
//		
//		int fish = 2;
//		
//		System.out.println("あなたの今日の運勢は、、");
//		
//		switch (fish) {
//		case 0:
//			System.out.print("大凶です。");
//			break;
//		case 1:
//			System.out.println("大吉です。");
//			break;
//		case 2:
//			System.out.println("吉です");
//			break;
//		case 3:
//			System.out.println("小吉です。");
//			break;
//		case 4:
//			System.out.println("中吉です。");
//			break;
//		case 5:
//			System.out.println("凶です。");
//			break;
//		}
		
//		System.out.println("月の日数を表示します。");
//		System.out.println("月を入力してください。");
//		System.out.println("");
//		
//		int month = 2;
//		
//		switch (month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("31日です。");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println("30日です。");
//			break;
//		case 2:
//			System.out.println("28日です。");
//			break;
//		default:
//			System.out.println("入力が間違っています。");
//			break;
//		}
		
//		for (int i = 0; i < 10; i++ ) {
//			System.out.println("SPAM");
//		}
		
//		for (int i = 3; i <= 27; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(3 * i);
//		}
		
//		int x = 1;
//		
//		for (int i = 1; i <= 8; i++) {
//			x *= 2;
//			System.out.println("2の" + i + "乗=" + x);
//		}
		
//		int x = 1;
//		
//		for (int i = 1; i <= 7; i++) {
//			x *= i;
//		}
//		System.out.println("7の階乗=" + x);
		
//		int sum = 0;
//		for (int i = 0; i < 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum / 10);
		
//		int wins = 0;
//		int result = 1;
//		
//		for (int i = 0; i < 10; i++) {
//			if (result == 1) {
//				wins += 1;
//			}
//		}
//		System.out.println("勝ち" + wins + "回、負け" + (10 - wins) + "回");
		
		
//		int giants = 2;
//		int tigers = 2;
//		
//		for (int game = 1; game <= 9; game++) {
//			System.out.println(game + "回表、巨人の得点は？");
//			System.out.println(game + "回裏、阪神の得点は？");
//		}
//		
//		System.out.println("巨人：" + giants + "点、" + "阪神：" + tigers + "点");
//		
//		if (giants > tigers) {
//			System.out.println("巨人の勝ち！");
//		} else if (giants < tigers) {
//			System.out.println("阪神の勝ち！");
//		} else {
//			System.out.println("引き分け！");
//		}
		
//		int max_value = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			if (i > max_value) {
//				max_value = i;
//			}
//		}
//		System.out.println("最大値=" + max_value);
		
//		int max_value =0, min_value = 0;
//		for (int i = 0; i < 10; i++) {
//			if (i == 0) {
//				max_value = i;
//				min_value = i;
//			} else {
//				if (i > max_value) {
//					max_value = i;
//				}
//				
//				if (i < min_value) {
//					min_value = i;
//				}
//			}
//		}
//		System.out.println("最大値=" + max_value + " 最小値=" + min_value);
		
//		int count = 50;
//		
//		for (int i = 0; i < count; i++) {
//			System.out.print("‘*’");
//		}
		
//		int count = 15;
//		
//		for (int i = 0; i < count; i++) {
//			System.out.print(i % 10);
//		}
		
		for( int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
