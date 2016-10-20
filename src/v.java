import java.awt.Frame;
import java.util.Random;

final class v extends rg {
	
	static ob D;
	static ob E;
	static ob F;
	static ob G;
	static ob H;
	static int I;
	static ob J;
	static ob K;
	static ob L;
	static int M;
	static ob N;
	byte O;
	static ob P;
	static ob Q;
	static ob R;
	static ob S;
	static ob T;
	static ob U;
	static ob V;
	static vc W;
	static int[] X;
	static ob Y;
	static ob Z;
	static ob ab;
	static ob bb;
	static ob cb;
	static ob db;
	static ob eb;
	static ob fb;
	static ob gb;
	static ob hb;
	private static ob ib = rf.a(40, "");
	static int jb;
	static ob kb;
	static ob lb;
	static ob mb;
	static ob ob_nb;
	static ob ob;
	static ob pb;
	static ob qb;
	static ob rb;
	static ob sb;
	static int tb;
	static int ub;
	static ob vb;
	static ob wb;
	int xb;
	static ob yb;
	ca zb;
	static ob Ab;
	static ob preparedVisibilityMap2;
	static og Cb;
	static Frame frame;
	private static ob preparedVisibilityMap;
	
	static int a(byte var0, Random var1, int var2) {
		try {
			++I;
			if (var0 <= 79) {
				return 85;
			} else if (var2 <= 0) {
				throw new IllegalArgumentException();
			} else if (ri.a((byte) -65, var2)) {
				return (int) ((4294967295L & (long) var1.nextInt()) * (long) var2 >> 32);
			} else {
				int var3 = Integer.MIN_VALUE + -((int) (4294967296L % (long) var2));
				
				int var4;
				do {
					var4 = var1.nextInt();
				} while (~var3 >= ~var4);
				
				return wc.a(var4, var2, (byte) -79);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "v.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	static rc b(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		return var3 == null ? null : var3.x;
	}
	
	public static void f(int var0) {
		try {
			hb = null;
			sb = null;
			F = null;
			H = null;
			Q = null;
			ob_nb = null;
			G = null;
			T = null;
			ob = null;
			Z = null;
			vb = null;
			D = null;
			if (var0 == -2900) {
				E = null;
				X = null;
				P = null;
				V = null;
				mb = null;
				qb = null;
				S = null;
				cb = null;
				ib = null;
				db = null;
				preparedVisibilityMap2 = null;
				L = null;
				Y = null;
				fb = null;
				U = null;
				kb = null;
				K = null;
				ab = null;
				wb = null;
				J = null;
				W = null;
				bb = null;
				eb = null;
				Cb = null;
				Ab = null;
				rb = null;
				pb = null;
				gb = null;
				lb = null;
				frame = null;
				N = null;
				preparedVisibilityMap = null;
				R = null;
				yb = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "v.B(" + var0 + ')');
		}
	}
	
	static {
		Z = ib;
		Y = ib;
		L = ib;
		rb = ib;
		sb = ib;
		ob = ib;
		V = ib;
		R = ib;
		cb = rf.a(40, "<img=0>");
		H = ib;
		S = ib;
		P = ib;
		F = ib;
		D = ib;
		fb = ib;
		pb = ib;
		N = ib;
		E = ib;
		tb = 0;
		G = ib;
		Q = ib;
		qb = ib;
		gb = ib;
		U = ib;
		mb = ib;
		ab = ib;
		hb = ib;
		kb = ib;
		eb = ib;
		db = ib;
		ob_nb = ib;
		lb = ib;
		J = ib;
		wb = ib;
		vb = ib;
		bb = ib;
		T = ib;
		K = ib;
		yb = rf.a(40, "welle:");
		Ab = ib;
		W = new vc(64);
		preparedVisibilityMap = rf.a(40, "Prepared visibility map");
		preparedVisibilityMap2 = preparedVisibilityMap;
	}
}
