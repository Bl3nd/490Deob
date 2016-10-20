import java.util.Arrays;

final class o {
	
	static int a;
	static int[] b = new int[5];
	static int c;
	static boolean d = true;
	static ob ob_e = rf.a(40, "Abbrechen");
	static int[] f;
	static int g;
	static int h;
	
	static void a(pe cacheFile8, int unused, pe cacheFile7, pe cacheFile3, pe cacheFile13) {
		try {
			++h;
			sf.cacheFile8 = cacheFile8;
			qc.cacheFile7 = cacheFile7;
			qi.cacheFile3 = cacheFile3;
			ug.cacheFile13 = cacheFile13;
			wg.cb = new ra[qi.cacheFile3.getLength(-3853)][];
			gi.F = new boolean[qi.cacheFile3.getLength(-3853)];
			System.out.println("gi.F: " + gi.F.length + " wg.cb: " + wg.cb.length);
		} catch (RuntimeException var6) {
			throw bc.a(var6, "o.D(" + (cacheFile8 != null ? "{...}" : "null") + ',' + unused + ',' + (cacheFile7 != null ? "{...}" : "null") + ',' + (cacheFile3 != null ? "{...}" : "null") + ',' + (cacheFile13 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(int var0, ud var1) {
		int var4 = client.anInt_wb;
		
		try {
			var1.Lb = false;
			++g;
			ce var2;
			if (~var1.P != 0) {
				label178:
				{
					var2 = le.c(var0 + 15620, var1.P);
					if (var2 == null || var2.Z == null) {
						var1.P = -1;
						if (var4 == 0) {
							break label178;
						}
					}
					
					++var1.Ib;
					if (var2.Z.length > var1.Wb && var1.Ib > var2.W[var1.Wb]) {
						var1.Ib = 1;
						++var1.Wb;
						ah.a(var1.coordX, var2, false, var1.Wb, var1 == le.T, var1.coordY);
					}
					
					if (var1.Wb >= var2.Z.length) {
						var1.Ib = 0;
						var1.Wb = 0;
						ah.a(var1.coordX, var2, false, var1.Wb, le.T == var1, var1.coordY);
					}
				}
			}
			
			if (var1.O != -1 && ~var1.dc >= ~bi.f) {
				label179:
				{
					if (~var1.Sb > -1) {
						var1.Sb = 0;
					}
					
					int var6 = lb.d(var1.O, var0 + -51).E;
					if (~var6 == 0) {
						var1.O = -1;
						if (var4 == 0) {
							break label179;
						}
					}
					
					ce var3 = le.c(15619, var6);
					if (var3 == null || var3.Z == null) {
						var1.O = -1;
						if (var4 == 0) {
							break label179;
						}
					}
					
					++var1.Z;
					if (~var1.Sb > ~var3.Z.length && var3.W[var1.Sb] < var1.Z) {
						++var1.Sb;
						var1.Z = 1;
						ah.a(var1.coordX, var3, false, var1.Sb, le.T == var1, var1.coordY);
					}
					
					if (~var1.Sb <= ~var3.Z.length) {
						var1.O = -1;
					}
				}
			}
			
			if (~var1.mb != 0 && var1.wb <= 1) {
				var2 = le.c(15619, var1.mb);
				if (~var2.V == -2 && ~var1.cc < -1 && ~var1.eb >= ~bi.f && ~bi.f < ~var1.Qb) {
					var1.wb = 1;
					return;
				}
			}
			
			if (~var1.mb != 0 && ~var1.wb == -1) {
				label180:
				{
					var2 = le.c(15619, var1.mb);
					if (var2 == null || var2.Z == null) {
						var1.mb = -1;
						if (var4 == 0) {
							break label180;
						}
					}
					
					++var1.cb;
					if (var2.Z.length > var1.Kb && var1.cb > var2.W[var1.Kb]) {
						var1.cb = 1;
						++var1.Kb;
						ah.a(var1.coordX, var2, false, var1.Kb, var1 == le.T, var1.coordY);
					}
					
					if (var2.Z.length <= var1.Kb) {
						label171:
						{
							var1.Kb -= var2.U;
							++var1.xb;
							if (~var2.eb >= ~var1.xb) {
								var1.mb = -1;
								if (var4 == 0) {
									break label171;
								}
							}
							
							if (~var1.Kb <= -1 && var2.Z.length > var1.Kb) {
								ah.a(var1.coordX, var2, false, var1.Kb, var1 == le.T, var1.coordY);
								if (var4 == 0) {
									break label171;
								}
							}
							
							var1.mb = -1;
						}
					}
					
					var1.Lb = var2.cb;
				}
			}
			
			if (var0 > ~var1.wb) {
				--var1.wb;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "o.E(" + var0 + ',' + "{...}" + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			b = null;
			f = null;
			ob_e = null;
			if (var0 != 72) {
				ob_e = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "o.B(" + var0 + ')');
		}
	}
	
	static void a(boolean var0) {
		try {
			if (var0) {
				a(-94, (ud) null);
			}
			
			++a;
			hf.k.b((int) 9946);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "o.C(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var8 = client.anInt_wb;
		
		try {
			if (var3 != 4243) {
				a(-49, (ud) null);
			}
			
			sa.a(var1, (byte) 52, var5, var4, e.ints_b[var0++]);
			sa.a(var1, (byte) 52, var5, var4, e.ints_b[var2--]);
			++c;
			int var6 = var0;
			if (var8 != 0 || ~var0 >= ~var2) {
				do {
					int[] var7 = e.ints_b[var6];
					var7[var5] = var7[var1] = var4;
					++var6;
				} while (~var6 >= ~var2);
				
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "o.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
}
