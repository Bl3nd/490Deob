import java.io.UnsupportedEncodingException;

final class ci extends vd {
	
	byte[] o;
	static int regionX;
	static ob loadingConfig2;
	static int r;
	static vc s;
	private static ob loadingConfig = rf.a(40, "Loading config )2 ");
	static pi u;
	static ob v;
	static ob titlebutton;
	static int[] x;
	static int y;
	static int z;
	static int[] A;
	static int[] B;
	
	public static void a(byte unused) {
		try {
			A = null;
			s = null;
			titlebutton = null;
			x = null;
			loadingConfig2 = null;
			B = null;
			v = null;
			u = null;
			loadingConfig = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ci.B(" + unused + ')');
		}
	}
	
	ci(byte[] bytes) {
		try {
			this.o = bytes;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ci.<init>(" + (bytes != null ? "{...}" : "null") + ')');
		}
	}
	
	static ob a(int var0, ob var1, ra var2) {
		int var6 = client.anInt_wb;
		
		try {
			++r;
			if (var1.b(a.c, (byte) 119) != -1) {
				int var3;
				do {
					var3 = var1.b(ah.l, (byte) 121);
					if (var3 == -1) {
						break;
					}
					
					var1 = wc.a(new ob[] {var1.a(var3, 0, (byte) 117), ih.a(jd.a(0, var2, -31519), 999999999), var1.a((byte) -118, var3 + 2)}, -3);
				} while (var6 == 0);
				
				do {
					var3 = var1.b((ob) hc.o, (byte) 127);
					if (~var3 == 0) {
						break;
					}
					
					var1 = wc.a(new ob[] {var1.a(var3, 0, (byte) 39), ih.a(jd.a(1, var2, -31519), 999999999), var1.a((byte) -115, var3 - -2)}, -3);
				} while (var6 == 0);
				
				do {
					var3 = var1.b((ob) lh.W, (byte) 126);
					if (var3 == -1) {
						break;
					}
					
					var1 = wc.a(new ob[] {var1.a(var3, 0, (byte) 49), ih.a(jd.a(2, var2, -31519), 999999999), var1.a((byte) -106, 2 + var3)}, -3);
				} while (var6 == 0);
				
				do {
					var3 = var1.b((ob) cc.I, (byte) 123);
					if (var3 == -1) {
						break;
					}
					
					var1 = wc.a(new ob[] {var1.a(var3, 0, (byte) 56), ih.a(jd.a(3, var2, -31519), 999999999), var1.a((byte) -113, var3 - -2)}, -3);
				} while (var6 == 0);
				
				do {
					var3 = var1.b((ob) uc.U, (byte) 123);
					if (~var3 == 0) {
						break;
					}
					
					var1 = wc.a(new ob[] {var1.a(var3, 0, (byte) 124), ih.a(jd.a(4, var2, -31519), 999999999), var1.a((byte) 60, (int) (var3 - -2))}, -3);
				} while (var6 == 0);
				
				do {
					var3 = var1.b((ob) vd.f, (byte) 126);
					if (~var3 == 0) {
						break;
					}
					
					ob var4 = lb.T;
					if (d.S != null) {
						var4 = vd.a(-51, (int) d.S.c);
						
						try {
							if (d.S.e != null) {
								byte[] var5 = ((String) d.S.e).getBytes("ISO-8859-1");
								var4 = sc.a(1, 0, var5, var5.length);
							}
						} catch (UnsupportedEncodingException var7) {
							var7.printStackTrace();
						}
					}
					
					var1 = wc.a(new ob[] {var1.a(var3, 0, (byte) 41), var4, var1.a((byte) 47, (int) (4 + var3))}, -3);
				} while (var6 == 0);
			}
			
			if (var0 >= -67) {
				loadingConfig = null;
			}
			
			return var1;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ci.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		loadingConfig2 = loadingConfig;
		s = new vc(200);
		v = rf.a(40, "3D)2Softwarebibliothek gestartet");
		titlebutton = rf.a(40, "titlebutton");
		u = new pi();
		B = new int[5];
		z = 127;
	}
}
