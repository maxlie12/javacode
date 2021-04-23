package Tester;

public class b2 {
	String name,class_name;
	float C,PHP,total;
	public b2() {
		name = "Nguyen Van Luan";
		class_name = "bk02";
		C = 8;
		PHP  = 7;
		total = (C+PHP)/2;
	}
	public static void main(String[] args) {
		b2 oject = new b2();
		if(oject.total >=8) {
			System.out.println("gioi");
		}
		else if(oject.total >=6) {
			System.out.println("kha");
		}
		else if(oject.total >=5) {
			System.out.println("trung binh");
		}
		else { 
				System.out.println("khong dat");
		}
	}
}
