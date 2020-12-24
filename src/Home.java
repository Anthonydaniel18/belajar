import java.util.*;

public class Home {
Scanner sc = new Scanner(System.in);
Vector<Pelanggan>pelanggans = new Vector<>();


public Home(){
	menu();
}

	void menu(){
		int pilihan;
		
		do {
			
		System.out.println("Selamat datang");
		System.out.println("--------------");
		System.out.println("1. insert");
		System.out.println("2. view");
		System.out.println("3. update");
		System.out.println("4. delete");
		System.out.print("pilih: ");
		
		try {
			pilihan = sc.nextInt();			
		} catch (Exception e) {
			// TODO: handle exception
			pilihan=0;
			System.out.println("menu tidak ada");
			sc.nextLine();
		} 
		} while (pilihan<1||pilihan>4);
		
		switch(pilihan){
		case 1:
			insert();
			menu();
		case 2:
			viewdata();
			menu();
		case 3:
			viewdata();
			updatedata();
		case 4:
			viewdata();
			delete();
		}
		
		
	}

	void insert(){
		String nama; String kend;
		int menit = 0,id;
		boolean chk=true;
		
		do {
			System.out.print("masukan nama : ");
			nama = sc.nextLine();
		} while (nama.length()<5);
		
		System.out.print("naik apa kesini : ");
		kend = sc.nextLine();
		
			do {
				System.out.println("berapa menit kesini : ");
				try {
					menit = sc.nextInt();
				} catch (Exception e) {
					chk=false;
					System.out.println("masukan angka");
					sc.nextLine();
				}
			} while (chk=false||menit!=0);
		
			System.out.println("data sukses dimasukan");
			
			id = pelanggans.size()+1;
			
			Pelanggan p = new Pelanggan(id,nama,kend,menit);
			pelanggans.add(p);
			sc.nextLine();
			viewdata();
		
		
		}
	
	public void viewdata(){
		if(pelanggans.isEmpty()){
			
			System.out.println();
			System.out.println("belum ada data");
			System.out.println();
			
			
		}else{
		for(int i=0;i<pelanggans.size();i++){
			
			int id = pelanggans.get(i).getid();
			System.out.println("id : "+ id);
			String name = pelanggans.get(i).getnama();
			System.out.println("nama : "+ name);
			String kenda = pelanggans.get(i).getkend();
			System.out.println("kendaraan : "+ kenda);
			int minute = pelanggans.get(i).getmenit();
			System.out.println("waktu : "+ minute);
			System.out.println("- - - - - - - - -");
		}
		
		}
	}
	
	void updatedata(){
		String unama,ukend;
		int id,umenit = 0,ganti;
		boolean chk;
		
		System.out.print("hapus id (0 untuk batal) : ");
		ganti = sc.nextInt();
		
		if(ganti==0){
			System.out.println("kembali ke home");
			menu();
		}else{
			
			id = pelanggans.get(ganti-1).getid();
			
			do {
				System.out.print("masukan nama : ");
				unama = sc.nextLine();
			} while (unama.length()<5);
			
			System.out.print("naik apa kesini : ");
			ukend = sc.nextLine();
			
				do {
					System.out.println("berapa menit kesini : ");
					try {
						umenit = sc.nextInt();
						
					} catch (Exception e) {
						chk=false;
						System.out.println("masukan angka");
						sc.nextLine();
					}
				} while (chk=false);
				
			
				
				Pelanggan pu = new Pelanggan(id,unama,ukend,umenit);
				pelanggans.set(ganti-1, pu);
		
		}
		
	}
	
	void delete(){
		int hapus;

		
		System.out.print("hapus id (0 untuk batal) : ");
		hapus = sc.nextInt();
		
		if(hapus==0){
			System.out.println("kembali ke home");
			menu();
		}else{
		pelanggans.remove(hapus-1);
		}
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Home();	
	}
	

}

