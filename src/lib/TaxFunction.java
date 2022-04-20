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
	double t=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	double i=sc.nextDouble();
	t=incomeTax(i);
	System.out.println("Income tax amount is "+t);
	}
static double incomeTax(double i)
{
	double tax;	
	if(i<=200000)
		tax=0;
	else if(i<=300000)
		tax=0.1*(i-200000);
	else if(i<=500000)
		tax=(0.2*(i-300000))+10000;
	else if(i<=1000000)
		tax=(0.3*(i-500000))+50000;
	else
		tax=(0.4*(i-1000000))+200000;
	return tax;
 
}
	
}	