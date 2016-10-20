class vd {
	
	static int anInt_a;
	static int anInt_b;
	static int anInt_c;
	static int anInt_d;
	static int anInt_e;
	static ob f = rf.a(40, "(Udns");
	static ob ob_g = rf.a(40, "nav");
	static int anInt_h;
	long clientScriptId;
	static int j;
	static int k = 0;
	vd vd_l;
	static int[] ints_m = new int[128];
	vd vd_n;
	
	final boolean a(int var1) {
		try {
			++j;
			if (var1 != -1677781832) {
				b(111);
			}
			
			return this.vd_l != null;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "vd.UB(" + var1 + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			ints_m = null;
			if (var0 == 17480) {
				f = null;
				ob_g = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "vd.VB(" + var0 + ')');
		}
	}
	
	static cc a(int var0, byte var1) {
		try {
			int var2 = -63 % ((-54 - var1) / 55);
			++anInt_b;
			cc var3 = (cc) rd.K.a((long) var0, (byte) 94);
			if (var3 != null) {
				return var3;
			} else {
				byte[] var4 = md.cacheFile2.a((byte) -90, var0, 5);
				var3 = new cc();
				if (var4 != null) {
					var3.a(new og(var4), -124);
				}
				
				rd.K.a(var3, (byte) -49, (long) var0);
				return var3;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "vd.BC(" + var0 + ',' + var1 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var11 = client.anInt_wb;
		
		try {
			++anInt_e;
			int var6 = kg.a(dd.a, na.anInt_m, true, var4);
			int var7 = kg.a(dd.a, na.anInt_m, true, var1);
			int var8 = kg.a(gh.R, ng.u, true, var2);
			int var9 = kg.a(gh.R, ng.u, true, var5);
			int var10 = var6;
			if (var11 != 0) {
				sa.a(var9, (byte) 52, var8, var3, e.ints_b[var6]);
				var10 = var6 + 1;
			}
			
			while (var7 >= var10) {
				sa.a(var9, (byte) 52, var8, var3, e.ints_b[var10]);
				++var10;
			}
			
			if (var0 != 255) {
				ob_g = null;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "vd.SB(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	static ob a(int var0, int var1) {
		try {
			++anInt_d;
			return var0 > -12 ? null : wc.a(new ob[] {hh.a((byte) 93, 255 & var1 >> 24),
					sh.k, hh.a((byte) 93, 255 & var1 >> 16),
					sh.k, hh.a((byte) 93, var1 >> 8 & 255),
					sh.k, hh.a((byte) 93, var1 & 255)}, -3);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "vd.AC(" + var0 + ',' + var1 + ')');
		}
	}
	
	static me a(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		return var3 != null && var3.u != null ? var3.u : null;
	}
	
	final void c(int unused) {
		try {
			++anInt_c;
			if (this.vd_l != null) {
				this.vd_l.vd_n = this.vd_n;
				this.vd_n.vd_l = this.vd_l;
				this.vd_n = null;
				this.vd_l = null;
				if (unused != 128) {
					this.vd_n = null;
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "vd.WB(" + unused + ')');
		}
	}
}
