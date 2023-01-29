package advancedJavaPractice.multitread.volatileKeyword;

public class VolatileKeyword {

	public static void main(String[] args) {
		// cok cekirdekli bilgisayarlarda her cekirdek kendi threadini kendi kesinde
		// tutoyor ve
		// sonuca problem olusuyor..
		// chache degilde dogrudan RAM den islem yapmamizi saglayan yapiya Volatile
		// Keyword denir

		/*
		 * TASK:Banka /Hastane islemleri iccin sira numarasi veren bir uygulama
		 * tasarlayin . Uygulama her bir talep icin bir sonraki numarayi vermeli 1.
		 * Class olustur - Numerator
		 * 
		 */
		Numerator numerator = new Numerator();
		
		Thread thread1 = new Thread( new Runnable() {
			
			public void run() {
				numerator.getOrder();
			}
		});
		
		thread1.setName("1st Tread");
		thread1.start();
		
		Thread thread2 = new Thread( new Runnable() {
			
			public void run() {
				numerator.getOrder();
			}
		});
		
		thread2.setName("2nd Tread");
		thread2.start();
		
		Thread thread3 = new Thread( new Runnable() {
			
			public void run() {
				numerator.getOrder();
			}
		});
		
		thread3.setName("3rd Tread");
		thread3.start();
	}
	
	/*
	 * 
	 * 
Sayin 3rd Tread siraniz: 3
Sayin 2nd Tread siraniz: 3
Sayin 1st Tread siraniz: 3

volatile degiskenin basina eklersek bu degissken cache den degilde Ram den cagrilir.
Volatile degiskenin main memoryde saklanmasini garanti eder...
Ancak tum threadlarin degiskene ayni anda ulasmasindan kaynakli sorunu cozmez bunun icin synchronize keyword da eklemeliyiz.
	 */


}
