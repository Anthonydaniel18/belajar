
public class Pelanggan {
	
	int id;
	String nama;
	String kend;
	int menit;

	public Pelanggan(int id,String nama, String kend, int menit) {
		this.id=id;
		this.nama = nama;
		this.kend = kend;
		this.menit = menit;
		// TODO Auto-generated constructor stub
	}
	
	public int getid(){
		return id;
	}
	
	public void setid(){
		this.id=id;
	}
	
	public String getnama(){
		return nama;
	}
	
	public void setnama(){
		this.nama=nama;
	}
	
	public String getkend(){
		return kend;
	}
	
	public void setkend(){
		this.kend=kend;
	}
	
	public int getmenit(){
		return menit;
	}
	
	public void setmenit(){
		this.menit=menit;
	}

}
