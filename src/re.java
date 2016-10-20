final class re extends vd {
	
	boolean o = false;
	static int p = 1;
	static int q = 0;
	static ob mod_icons = rf.a(40, "mod_icons");
	static ob s;
	static kc[] t;
	static int u = 0;
	static kc v;
	int w;
	static int x;
	private static ob y = rf.a(40, "Login limit exceeded)3");
	static md z;
	static int A;
	int B;
	static ob C = rf.a(40, "<img=0>");
	static int D = 1;
	static int E;
	static int F;
	static int G = 0;
	
	static void a(int var0, int var1, int var2, int var3, ob var4) {
		try {
			ra var5 = ue.a(var1, (byte) 56, var2);
			++x;
			if (var0 != 23428) {
				D = -53;
			}
			
			if (var5 != null) {
				if (var5.A != null) {
					wc var6 = new wc();
					var6.A = var3;
					var6.q = var4;
					var6.P = var5.A;
					var6.E = var5;
					wg.a(-128, (wc) var6);
				}
				
				boolean var8 = true;
				if (~var5.ab < -1) {
					var8 = li.a(var5, false);
				}
				
				if (var8) {
					if (cd.a(ce.a(var5, 18125), var3 + -1, 1)) {
						if (var3 == 1) {
							af.P.p(58, 12885);
							++th.cb;
							af.P.writeInt((int) var2, (byte) 19);
							af.P.d(26894, var1);
						}
						
						if (~var3 == -3) {
							++wc.D;
							af.P.p(222, var0 + -10543);
							af.P.writeInt((int) var2, (byte) 14);
							af.P.d(26894, var1);
						}
						
						if (var3 == 3) {
							++ka.z;
							af.P.p(97, 12885);
							af.P.writeInt(var2, (byte) -116);
							af.P.d(26894, var1);
						}
						
						if (~var3 == -5) {
							++bi.h;
							af.P.p(201, var0 + -10543);
							af.P.writeInt(var2, (byte) -124);
							af.P.d(26894, var1);
						}
						
						if (var3 == 5) {
							++dh.o;
							af.P.p(161, 12885);
							af.P.writeInt(var2, (byte) -124);
							af.P.d(26894, var1);
						}
						
						if (var3 == 6) {
							af.P.p(127, 12885);
							++b.db;
							af.P.writeInt(var2, (byte) -118);
							af.P.d(26894, var1);
						}
						
						if (var3 == 7) {
							++oe.c;
							af.P.p(72, 12885);
							af.P.writeInt(var2, (byte) -124);
							af.P.d(26894, var1);
						}
						
						if (var3 == 8) {
							af.P.p(27, 12885);
							af.P.writeInt((int) var2, (byte) 6);
							++di.f;
							af.P.d(26894, var1);
						}
						
						if (~var3 == -10) {
							af.P.p(144, 12885);
							af.P.writeInt((int) var2, (byte) 0);
							af.P.d(26894, var1);
							++bg.anInt_l;
						}
						
						if (~var3 == -11) {
							++ee.h;
							af.P.p(249, var0 + -10543);
							af.P.writeInt(var2, (byte) -3);
							af.P.d(var0 + 3466, var1);
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "re.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			s = null;
			if (var0 <= 92) {
				a(-64, 75, 11, 45, (ob) null);
			}
			
			v = null;
			mod_icons = null;
			z = null;
			t = null;
			C = null;
			y = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "re.A(" + var0 + ')');
		}
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		try {
			++E;
			if (var5 != -23302) {
				b(33, 65, 74, 124, -125, 9);
			}
			
			if (var2 == var0) {
				ea.a(var5 ^ 23419, var1, var3, var4, var2);
			} else if (~(-var2 + var1) <= ~gh.R && ng.u >= var1 + var2 && dd.a <= -var0 + var4 && var4 + var0 <= na.anInt_m) {
				af.a(var4, var2, (byte) -107, var0, var3, var1);
			} else {
				cf.b(2, var1, var2, var0, var3, var4);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "re.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	static {
		s = y;
	}
}
