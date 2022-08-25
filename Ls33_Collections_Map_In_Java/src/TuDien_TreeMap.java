import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien_TreeMap {
	// attributes
	private Map<String, String> duLieu = new TreeMap<String, String>();
	// constructor functions

	// handle methods
	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}

	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}

	public String traTu(String tuKhoa) {
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}

	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();

		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}

	public int laySoLuong() {
		return this.duLieu.size();
	}

	public void xoaTatCa() {
		this.duLieu.clear();
	}
	public static void pressEnterToContinue() {
		System.out.println("Nhấn phím Enter để tiếp tục chương trình...");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
	// main

	public static void main(String[] args) {
		TuDien_TreeMap tuDien = new TuDien_TreeMap();
		try (Scanner sc = new Scanner(System.in)) {
			int luaChon = 0;
			do {
				for (int i = 0; i < 100; i++) {
					System.out.print("-");
				}
				System.out.println("\nTừ điển cá nhân TreeMap <có sắp xếp>");
				System.out.println("Menu: ");
				System.out.println("1.	Thêm từ (Từ khóa, Ý nghĩa).\r\n"
						+ "2.	Xóa từ.\r\n"
						+ "3.	Tìm nghĩa của từ khóa => Tra từ.\r\n"
						+ "4.	In ra danh sách từ khóa.\r\n"
						+ "5.	In ra số lượng từ.\r\n"
						+ "6.	Xóa tất cả các từ khóa.\r\n"
						+ "0.	Thoát chương trình.\r\n"
						+ "");
				luaChon = sc.nextInt();				sc.nextLine();
				switch (luaChon) {
				case 1: {
					System.out.println("Nhập vào từ khóa: "); 

					String tuKhoa = sc.nextLine();
					System.out.println("Nhập vào ý nghĩa: ");
					String yNghia = sc.nextLine();
					tuDien.themTu(tuKhoa, yNghia);
					pressEnterToContinue();
					break;
				}
				case 2, 3: {
					System.out.println("Nhập vào từ khóa: ");
					String tuKhoa = sc.nextLine();
					if(luaChon == 2) {
						tuDien.xoaTu(tuKhoa);
					} else if (tuDien.traTu(tuKhoa) != null){
						System.out.println("Ý nghĩa của từ " +tuKhoa+ " là: "+tuDien.traTu(tuKhoa));
					} else {
						System.out.println("Không có từ khóa này trong từ điển của bạn!");
					}
					pressEnterToContinue();
					break;
				}

				case 4: {
					tuDien.inTuKhoa();
					pressEnterToContinue();
					break;
				}
				case 5: {
					System.out.println("Số lượng từ hiện tại trong từ điển cá nhân của bạn là: "+ tuDien.laySoLuong() +" từ");
					pressEnterToContinue();
					break;
				}
				case 6: {
					tuDien.xoaTatCa();
					pressEnterToContinue();
					break;
				}
				default:
					if(luaChon !=0) {
						throw new IllegalArgumentException("Unexpected value: " + luaChon);
					} else {
						break;
					}
					
				}
			} while (luaChon != 0);
		}
		
	}
}
