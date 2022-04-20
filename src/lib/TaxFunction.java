package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
	public static void main(String args[])
	{
	double tax=0,it;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	it=sc.nextDouble();
	if(it<=200000)
		tax=0;
	else if(it<=300000)
		tax=0.1*(it-200000);
	else if(it<=500000)
		tax=(0.2*(it-300000))+(0.1*100000);
	else if(it<=1000000)
		tax=(0.3*(it-500000))+(0.2*200000)+(0.1*100000);
	else
		tax=(0.4*(it-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
	System.out.println("Income tax amount is "+tax);
	}
	
}
