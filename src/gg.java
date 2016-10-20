final class gg implements Runnable {
	
	boolean a = true;
	static pe cacheFile19;
	private static ob ob_c = rf.a(40, "Dec");
	private static ob d = rf.a(40, "Aug");
	private static ob e = rf.a(40, "Nov");
	final Object f = new Object();
	private static ob g = rf.a(40, "Apr");
	private static ob h = rf.a(40, "Sep");
	static ob[] i;
	static int j;
	static na k = null;
	private static ob l = rf.a(40, "Jan");
	static int m;
	private static ob n = rf.a(40, "Jul");
	static ob[] o;
	private static ob p = rf.a(40, "Feb");
	private static ob q = rf.a(40, "Mar");
	private static ob r = rf.a(40, "Jun");
	private static ob ob_s = rf.a(40, "May");
	private static ob t = rf.a(40, "Oct");
	static kc[] u;
	int[] v = new int[500];
	static int w = 0;
	int x = 0;
	int[] y = new int[500];
	static int z;
	
	static void a(hf var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8;
		int var9 = var8 = (var6 << 7) - bg.b;
		int var10;
		int var11 = var10 = (var7 << 7) - dd.m;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14;
		int var15 = var14 = var11 + 128;
		int var16 = la.v[var1][var6][var7] - qc.A;
		int var17 = la.v[var1][var6 + 1][var7] - qc.A;
		int var18 = la.v[var1][var6 + 1][var7 + 1] - qc.A;
		int var19 = la.v[var1][var6][var7 + 1] - qc.A;
		int var20 = var11 * var4 + var9 * var5 >> 16;
		var11 = var11 * var5 - var9 * var4 >> 16;
		var9 = var20;
		var20 = var16 * var3 - var11 * var2 >> 16;
		var11 = var16 * var2 + var11 * var3 >> 16;
		var16 = var20;
		if (var11 >= 50) {
			var20 = var10 * var4 + var13 * var5 >> 16;
			var10 = var10 * var5 - var13 * var4 >> 16;
			var13 = var20;
			var20 = var17 * var3 - var10 * var2 >> 16;
			var10 = var17 * var2 + var10 * var3 >> 16;
			var17 = var20;
			if (var10 >= 50) {
				var20 = var15 * var4 + var12 * var5 >> 16;
				var15 = var15 * var5 - var12 * var4 >> 16;
				var12 = var20;
				var20 = var18 * var3 - var15 * var2 >> 16;
				var15 = var18 * var2 + var15 * var3 >> 16;
				var18 = var20;
				if (var15 >= 50) {
					var20 = var14 * var4 + var8 * var5 >> 16;
					var14 = var14 * var5 - var8 * var4 >> 16;
					var8 = var20;
					var20 = var19 * var3 - var14 * var2 >> 16;
					var14 = var19 * var2 + var14 * var3 >> 16;
					if (var14 >= 50) {
						int var21 = ec.P + (var9 << 9) / var11;
						int var22 = ec.M + (var16 << 9) / var11;
						int var23 = ec.P + (var13 << 9) / var10;
						int var24 = ec.M + (var17 << 9) / var10;
						int var25 = ec.P + (var12 << 9) / var15;
						int var26 = ec.M + (var18 << 9) / var15;
						int var27 = ec.P + (var8 << 9) / var14;
						int var28 = ec.M + (var20 << 9) / var14;
						ec.N = 0;
						int var29;
						if ((var25 - var27) * (var24 - var28) - (var26 - var28) * (var23 - var27) > 0) {
							if (cf.Y && s.a(da.Bb, client.anInt_lb, var26, var28, var24, var25, var27, var23)) {
								uc.mb = var6;
								cf.R = var7;
							}
							
							ec.K = false;
							if (var25 < 0 || var27 < 0 || var23 < 0 || var25 > ec.R || var27 > ec.R || var23 > ec.R) {
								ec.K = true;
							}
							
							if (var0.i == -1) {
								if (var0.w != 12345678) {
									ec.a(var26, var28, var24, var25, var27, var23, var0.w, var0.anInt_m, var0.j);
								}
							} else if (!ch.Z) {
								if (var0.aBoolean_q) {
									ec.a(var26, var28, var24, var25, var27, var23, var0.w, var0.anInt_m, var0.j, var9, var13, var8, var16, var17, var20, var11, var10, var14, var0.i);
								} else {
									ec.a(var26, var28, var24, var25, var27, var23, var0.w, var0.anInt_m, var0.j, var12, var8, var13, var18, var20, var17, var15, var14, var10, var0.i);
								}
							} else {
								var29 = ec.Z.c(var0.i, -30480);
								ec.a(var26, var28, var24, var25, var27, var23, ce.b(var29, var0.w), ce.b(var29, var0.anInt_m), ce.b(var29, var0.j));
							}
						}
						
						if ((var21 - var23) * (var28 - var24) - (var22 - var24) * (var27 - var23) > 0) {
							if (cf.Y && s.a(da.Bb, client.anInt_lb, var22, var24, var28, var21, var23, var27)) {
								uc.mb = var6;
								cf.R = var7;
							}
							
							ec.K = false;
							if (var21 < 0 || var23 < 0 || var27 < 0 || var21 > ec.R || var23 > ec.R || var27 > ec.R) {
								ec.K = true;
							}
							
							if (var0.i == -1) {
								if (var0.anInt_d != 12345678) {
									ec.a(var22, var24, var28, var21, var23, var27, var0.anInt_d, var0.j, var0.anInt_m);
									return;
								}
							} else {
								if (!ch.Z) {
									ec.a(var22, var24, var28, var21, var23, var27, var0.anInt_d, var0.j, var0.anInt_m, var9, var13, var8, var16, var17, var20, var11, var10, var14, var0.i);
									return;
								}
								
								var29 = ec.Z.c(var0.i, -30480);
								ec.a(var22, var24, var28, var21, var23, var27, ce.b(var29, var0.anInt_d), ce.b(var29, var0.j), ce.b(var29, var0.anInt_m));
							}
						}
						
					}
				}
			}
		}
	}
	
	public final void run() {
		/*System.err.println("Method run() [Class gg] un-decompiled");*/
		try {
			while (this.a) {
				synchronized (this.f) {
					if ((~this.x) > 65035) {
						this.y[this.x] = og.o;
						this.v[this.x] = re.u;
						this.x += 1;
					}
				}
				jd.a(50L, (byte) -8);
			}
			m += 1;
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "gg.run(" + ')');
		}
		
	}
	
	static void a(boolean var0, boolean var1) {
		int var9 = client.anInt_wb;
		
		try {
			if (wg.db == le.T.coordX >> 7 && ~wd.q == ~(le.T.coordY >> 7)) {
				wg.db = 0;
			}
			
			if (var1) {
				a(true, false);
			}
			
			int var2 = se.b;
			++z;
			if (var0) {
				var2 = 1;
			}
			
			int var3 = 0;
			if (var9 != 0 || ~var3 > ~var2) {
				do {
					dg var4;
					long var5;
					label61:
					{
						if (var0) {
							var5 = 8791798054912L;
							var4 = le.T;
							if (var9 == 0) {
								break label61;
							}
						}
						
						var4 = lg.j[si.cb[var3]];
						var5 = (long) si.cb[var3] << 32;
					}
					
					if (var4 != null && var4.b((byte) 90)) {
						int var7 = var4.coordX >> 7;
						var4.uc = false;
						if ((ag.forceSend && se.b > 50 || ~se.b < -201) && !var0 && var4.Jb == var4.P) {
							var4.uc = true;
						}
						
						int var8 = var4.coordY >> 7;
						if (var7 >= 0 && ~var7 > -105 && var8 >= 0 && ~var8 > -105) {
							label111:
							{
								if (var4.rc != null && var4.oc <= bi.f && ~var4.hc < ~bi.f) {
									var4.uc = false;
									var4.zb = ug.a(gf.G, var4.coordX, (byte) 40, var4.coordY);
									c.a(gf.G, var4.coordX, var4.coordY, var4.zb, var4, var4.gb, var5, var4.Jc, var4.Gc, var4.sc, var4.yc);
									if (var9 == 0) {
										break label111;
									}
								}
								
								if ((var4.coordX & 127) == 64 && ~(127 & var4.coordY) == -65) {
									if (ed.d == wa.s[var7][var8]) {
										break label111;
									}
									
									wa.s[var7][var8] = ed.d;
								}
								
								var4.zb = ug.a(gf.G, var4.coordX, (byte) 40, var4.coordY);
								ki.a(gf.G, var4.coordX, var4.coordY, var4.zb, 60, var4, var4.gb, var5, var4.Lb);
							}
						}
					}
					
					++var3;
				} while (~var3 > ~var2);
				
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "gg.B(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			n = null;
			o = null;
			r = null;
			g = null;
			p = null;
			d = null;
			if (var0) {
				ob_c = null;
				e = null;
				ob_s = null;
				i = null;
				t = null;
				u = null;
				q = null;
				cacheFile19 = null;
				h = null;
				l = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "gg.A(" + var0 + ')');
		}
	}
	
	static {
		i = new ob[] {l, p, q, g, ob_s, r, n, d, h, t, e, ob_c};
		o = new ob[8];
	}
}
