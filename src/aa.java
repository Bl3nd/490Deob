abstract class aa extends rg {
	
	static int D;
	static int E;
	static int F = 0;
	static int G;
	static ob H = rf.a(40, " )2> <col=00ffff>");
	static int I;
	static int J;
	static ob K = rf.a(40, "document)3cookie=(R");
	static int L;
	static int M = 0;
	static int N = (int) (Math.random() * 33.0D) + -16;
	
	public static void f(int unused) {
		try {
			H = null;
			K = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "aa.NA(" + unused + ')');
		}
	}
	
	abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);
	
	static int a(byte unused, int value) {
		try {
			++D;
			return 0xff & value;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "aa.OA(" + unused + ',' + value + ')');
		}
	}
	
	static void a(byte unused, int i, int i1, fc fc, int i2, int i3) {
		try {
			++I;
			qf qf = new qf();
			qf.z = fc.xb * 128;
			qf.o = fc.nb;
			qf.D = fc.Bb;
			qf.q = i1;
			qf.C = 128 * i3;
			qf.K = i * 128;
			qf.r = fc.Hb;
			qf.w = fc.sb;
			int i4 = fc.Mb;
			int i5 = fc.Gb;
			if (~i2 == -2 || i2 == 3) {
				i4 = fc.Gb;
				i5 = fc.Mb;
			}
			
			qf.B = 128 * (i4 + i3);
			qf.p = 128 * (i + i5);
			if (fc.J != null) {
				qf.x = fc;
				qf.d(0);
			}
			
			va.h.a(0, qf);
			if (qf.o != null) {
				qf.F = qf.D + (int) (Math.random() * (double) (qf.w - qf.D));
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "aa.MA(" + unused + ',' + i + ',' + i1 + ',' + (fc != null ? "{...}" : "null") + ',' + i2 + ',' + i3 + ')');
		}
	}
	
	void a(aa var1, int var2, int var3, int var4, boolean var5) {
		try {
			++E;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "aa.GA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	aa b(int var1, int var2, int var3) {
		try {
			++G;
			return this;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "aa.S(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	boolean a() {
		try {
			++J;
			return false;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "aa.K(" + ')');
		}
	}
	
	abstract int b();
}
