final class df extends dc {
	
	private final int n;
	static int o;
	private final int p;
	static int q;
	private final int r;
	static vc s = new vc(64);
	static vc t = new vc(50);
	private final int u;
	static int[] v = new int[100];
	static ob fpsonCommand = rf.a(40, "::fpson");
	static int x;
	static int y;
	static int[][] z = new int[104][104];
	static ob A = rf.a(40, "Verbindung mit Update)2Server)3)3)3");
	static gg B;
	
	final void a(byte var1, int var2, int var3) {
		try {
			++o;
			if (var1 != 94) {
				this.a((byte) 68, 2, -7);
			}
			
			int var4 = var3 * this.n >> 12;
			int var5 = var3 * this.u >> 12;
			int var6 = var2 * this.r >> 12;
			int var7 = this.p * var2 >> 12;
			va.a(super.e, var6, var7, (byte) 112, var5, var4);
		} catch (RuntimeException var8) {
			throw bc.a(var8, "df.B(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void a(int var1, int var2, boolean var3) {
		try {
			if (var3) {
				++x;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "df.A(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void a(int var1, byte var2, int var3) {
		try {
			if (var2 != 114) {
				s = null;
			}
			
			++q;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "df.D(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void b(byte var0) {
		try {
			if (var0 != -51) {
				b((byte) 116);
			}
			
			B = null;
			fpsonCommand = null;
			s = null;
			v = null;
			z = null;
			A = null;
			t = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "df.H(" + var0 + ')');
		}
	}
	
	df(int var1, int var2, int var3, int var4, int var5, int var6) {
		super(-1, var5, var6);
		
		try {
			this.r = var2;
			this.p = var4;
			this.u = var3;
			this.n = var1;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "df.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
}
