import java.awt.event.KeyEvent;

final class vf extends vd {
	
	ob o;
	static int p;
	static int q;
	static int r;
	byte aByte_s;
	static int t;
	static int u;
	static int v;
	static ob w = rf.a(40, " )2> <col=ff9040>");
	static ob x = rf.a(40, "Ladevorgang )2 bitte warten Sie)3");
	ob y;
	static int[] z = new int[] {0, -1, 0, 1};
	int A;
	static int B;
	static int C;
	
	public static void d(int var0) {
		try {
			w = null;
			x = null;
			if (var0 != 3) {
				a(13, -69, 50, 66, 42, (byte) 112, 86, -95, -72, 75);
			}
			
			z = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "vf.D(" + var0 + ')');
		}
	}
	
	static void a(byte var0, int var1, int var2, int var3, int var4) {
		try {
			if (jc.anInt_ib == 1) {
				rh.u[ai.wb / 100].c(jh.h + -8, -8 + af.t);
			}
			
			if (~jc.anInt_ib == -3) {
				rh.u[4 + ai.wb / 100].c(jh.h - 8, -8 + af.t);
			}
			
			if (var0 > -48) {
				b(-20, -17, 103, 59, 86, 75);
			}
			
			bh.a((int) 82);
			if (lg.displayFPS) {
				int var5 = -5 + var4 - -512;
				int var6 = 20 + var2;
				mf.i_gb.c(wc.a(new ob[] {s.T, hh.a((byte) 93, di.i)}, -3), var5, var6, 16776960, -1);
				Runtime var7 = Runtime.getRuntime();
				var6 += 15;
				int var8 = (int) ((var7.totalMemory() + -var7.freeMemory()) / 1024L);
				int var9 = 16776960;
				if (~var8 < -32769 && ag.forceSend) {
					var9 = 16711680;
				}
				
				if (~var8 < -65537 && !ag.forceSend) {
					var9 = 16711680;
				}
				
				mf.i_gb.c(wc.a(new ob[] {va.i, hh.a((byte) 93, var8), fh.i}, -3), var5, var6, var9, -1);
				var6 += 15;
			}
			
			++C;
		} catch (RuntimeException var10) {
			throw bc.a(var10, "vf.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	static int a(int var0, KeyEvent var1) {
		try {
			++B;
			if (var0 <= 109) {
				a(85, (KeyEvent) null);
			}
			
			int var2 = var1.getKeyChar();
			if (var2 == 8364) {
				return 128;
			} else {
				if (var2 <= 0 || ~var2 <= -257) {
					var2 = -1;
				}
				
				return var2;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "vf.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, byte var5, int var6, int var7, int var8, int var9) {
		int var35 = client.anInt_wb;
		
		try {
			label42:
			{
				if (var9 == var7 && var3 == var6 && var0 == var1 && ~var2 == ~var8) {
					va.a(var4, var3, var8, (byte) 107, var0, var7);
					if (var35 == 0) {
						break label42;
					}
				}
				
				int var10 = var7;
				int var12 = 3 * var7;
				int var13 = 3 * var3;
				int var11 = var3;
				int var14 = 3 * var9;
				int var15 = var6 * 3;
				int var16 = var1 * 3;
				int var17 = 3 * var2;
				int var18 = -var7 + (var0 + -var16 - -var14);
				int var19 = var15 + -var17 + (var8 - var3);
				int var21 = var13 + -var15 + var17 - var15;
				int var20 = var12 + (-var14 + var16 - var14);
				int var22 = -var12 + var14;
				int var23 = var15 + -var13;
				int var24 = 128;
				if (var35 != 0 || var24 <= 4096) {
					do {
						int var25 = var24 * var24 >> 12;
						int var26 = var25 * var24 >> 12;
						int var27 = var26 * var18;
						int var28 = var26 * var19;
						int var30 = var25 * var21;
						int var31 = var22 * var24;
						int var29 = var25 * var20;
						int var32 = var24 * var23;
						int var34 = var3 - -(var32 + var30 + var28 >> 12);
						int var33 = (var31 + (var27 - -var29) >> 12) + var7;
						va.a(var4, var11, var34, (byte) 107, var33, var10);
						var11 = var34;
						var10 = var33;
						var24 += 128;
					} while (var24 <= 4096);
				}
			}
			
			if (var5 <= 126) {
				x = null;
			}
			
			++u;
		} catch (RuntimeException var36) {
			throw bc.a(var36, "vf.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	static void e(int var0) {
		try {
			++v;
			if (var0 <= 91) {
				x = null;
			}
			
			ag.forceSend = true;
			ch.Z = true;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "vf.F(" + var0 + ')');
		}
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		try {
			label25:
			{
				if (gh.R <= var4 && ng.u >= var3 && var1 >= dd.a && ~var2 >= ~na.anInt_m) {
					hh.b(var3, var0, 94, var1, var4, var2);
					if (client.anInt_wb == 0) {
						break label25;
					}
				}
				
				vd.a(255, var2, var4, var0, var1, var3);
			}
			
			if (var5 != 100) {
				e(-57);
			}
			
			++r;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "vf.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
}
