public class Main {

	public static void main(String[] args) {
		String[][] ogrenciIsim = new String[2][4];

		ogrenciIsim[0][0] = "Isim";
		ogrenciIsim[0][1] = "Metehan";
		ogrenciIsim[0][2] = "Duriye";
		ogrenciIsim[0][3] = "Kevser";

		ogrenciIsim[1][0] = "Soy Isim";
		ogrenciIsim[1][1] = "Pembe";
		ogrenciIsim[1][2] = "Gul";
		ogrenciIsim[1][3] = "Cilek";
		

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(ogrenciIsim[i][j]);
			}
		}
	}
}
