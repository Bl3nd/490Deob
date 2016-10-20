final class ih {
	
	int a;
	int b;
	int c;
	static ob d;
	static short[] e = new short[] {(short) 960, (short) 957, (short) -21568, (short) -21571, (short) 22464};
	int f;
	static ob g = rf.a(40, "hel");
	static int h;
	int i;
	int j;
	int k;
	static ob headicons_pk = rf.a(40, "headicons_pk");
	private static ob m = rf.a(40, "scroll:");
	int n;
	int o;
	int p;
	int q;
	static int r;
	int s;
	static ob t = rf.a(40, "Einloggen");
	static int u;
	static boolean v = false;
	int w;
	static int x;
	int y;
	int z;
	int A;
	static int B;
	int C;
	static int D;
	static ob E;
	int F;
	
	static ob a(int var0, int var1) {
		try {
			++D;
			return var1 > var0 ? hh.a((byte) 93, var0) : qi.v;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ih.B(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			m = null;
			e = null;
			d = null;
			if (var0) {
				a(95);
			}
			
			g = null;
			headicons_pk = null;
			t = null;
			E = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ih.C(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3) {
		try {
			++u;
			if (var2 != ci.z && ~var0 != -1 && ~dh.k > -51 && var1 != -1) {
				ri.k[dh.k] = var1;
				ii.G[dh.k] = var0;
				eh.Y[dh.k] = var3;
				ke.rb[dh.k] = null;
				kg.o[dh.k] = 0;
				++dh.k;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ih.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static void a(ca class_ca, int unused, int i) {
		try {
			++h;
			if (ig.c != null) {
				ig.c.pointer = 5 + 8 * i;
				int var3 = ig.c.readInt(1029109968);
				int var4 = ig.c.readInt(1029109968);
				class_ca.a(var3, (byte) 88, var4);
			} else {
				ee.a(null, true, 255, (byte) 0, -18963, 0, 255);
				qi.s[i] = class_ca;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ih.D(" + (class_ca != null ? "{...}" : "null") + ',' + unused + ',' + i + ')');
		}
	}
	
	static void a(int var0) {
		try {
			if (var0 != -18802) {
				E = null;
			}
			
			nf.eb.b((int) 9946);
			++B;
			mf.cb.b((int) 9946);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ih.A(" + var0 + ')');
		}
	}
	
	static {
		d = m;
		x = -8 + (int) (Math.random() * 17.0D);
		E = m;
	}
}
