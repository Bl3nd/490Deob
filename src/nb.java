final class nb extends ud {
	
	static long[] hc = new long[200];
	static ob ic = rf.a(40, "");
	static int jc;
	static qe kc;
	static int lc;
	static byte[][] mc = new byte[1000][];
	static int[] nc;
	static pd[][][] oc;
	ai pc;
	static int qc;
	static int rc;
	static int sc;
	static int tc;
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			label31:
			{
				if (~var7 > ~gh.R || var6 > ng.u || dd.a > var4 || na.anInt_m < var3) {
					bg.a(var0, var6, var7, var2, var4, 19, var5, var3);
					if (client.anInt_wb == 0) {
						break label31;
					}
				}
				
				ii.a(true, var5, var0, var2, var4, var3, var7, var6);
			}
			
			++sc;
			if (var1 != -13949) {
				a(113, (byte) 80, (ob) null, (ob) null);
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "nb.M(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	public static void g(int var0) {
		try {
			nc = null;
			hc = null;
			oc = null;
			kc = null;
			if (var0 != -31056) {
				hc = null;
			}
			
			mc = null;
			ic = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "nb.J(" + var0 + ')');
		}
	}
	
	static void a(int var0, byte var1, ob var2, ob var3) {
		try {
			if (var1 >= -94) {
				nc = null;
			}
			
			++rc;
			mf.a(-11840, var2, (ob) null, var3, var0);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "nb.L(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int b() {
		try {
			++lc;
			return super.hb;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "nb.C(" + ')');
		}
	}
	
	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		try {
			++tc;
			if (this.pc != null) {
				ce var11 = ~super.mb != 0 && ~super.wb == -1 ? le.c(15619, super.mb) : null;
				ce var12 = super.P != -1 && (~super.Jb != ~super.P || var11 == null) ? le.c(15619, super.P) : null;
				fe var13 = this.pc.a(true, super.Wb, var11, var12, super.Kb);
				if (var13 != null) {
					super.hb = var13.b();
					int var15 = 0;
					int var16 = 0;
					int var14 = 0;
					if (~this.pc.N != -1 && ~this.pc.xb != -1) {
						int var17 = ec.W[var1];
						int var18 = ec.L[var1];
						short var19 = this.pc.N;
						short var20 = this.pc.xb;
						int var22 = -var20 / 2;
						int var21 = -var19 / 2;
						int var24 = var18 * var22 - var17 * var21 >> 16;
						int var23 = var21 * var18 + var22 * var17 >> 16;
						int var25 = ug.a(gf.G, var23 + super.coordX, (byte) 40, super.coordY - -var24);
						int var26 = var19 / 2;
						int var27 = -var20 / 2;
						int var28 = var26 * var18 + var27 * var17 >> 16;
						int var29 = var27 * var18 - var26 * var17 >> 16;
						int var31 = -var19 / 2;
						int var30 = ug.a(gf.G, super.coordX - -var28, (byte) 40, var29 + super.coordY);
						int var32 = var20 / 2;
						int var33 = var31 * var18 + var32 * var17 >> 16;
						int var37 = var20 / 2;
						int var34 = -(var17 * var31) + var32 * var18 >> 16;
						int var35 = ug.a(gf.G, super.coordX - -var33, (byte) 40, var34 + super.coordY);
						int var36 = var19 / 2;
						int var38 = var18 * var36 + var17 * var37 >> 16;
						int var39 = var37 * var18 + -(var17 * var36) >> 16;
						int var41 = var25 >= var30 ? var30 : var25;
						int var40 = ug.a(gf.G, var38 + super.coordX, (byte) 40, var39 + super.coordY);
						var16 = var40 + var25;
						if (var30 - -var35 < var16) {
							var16 = var35 + var30;
						}
						
						int var42 = var35 >= var40 ? var40 : var35;
						var14 = 2047 & (int) (325.95D * Math.atan2((double) (-var42 + var41), (double) var20));
						if (~var14 != -1) {
							var13.g(var14);
						}
						
						int var43 = var40 > var30 ? var30 : var40;
						int var44 = ~var25 <= ~var35 ? var35 : var25;
						var15 = (int) (325.95D * Math.atan2((double) (var44 + -var43), (double) var19)) & 2047;
						if (var15 != 0) {
							var13.h(var15);
						}
						
						var16 = (var16 >> 1) - super.zb;
						if (~var16 != -1) {
							var13.d(0, var16, 0);
						}
					}
					
					fe var46 = null;
					if (super.O != -1 && ~super.Sb != 0) {
						kh var47 = lb.d(super.O, -73);
						var46 = var47.b(13557, super.Sb);
						if (var46 != null) {
							var46.d(0, -super.Q, 0);
							if (var47.O) {
								if (var14 != 0) {
									var46.g(var14);
								}
								
								if (var15 != 0) {
									var46.h(var15);
								}
								
								if (~var16 != -1) {
									var46.d(0, var16, 0);
								}
							}
						}
					}
					
					if (var46 != null) {
						var13 = ((he) var13).a(var46);
					}
					
					if (~this.pc.tb == -2) {
						var13.O = true;
					}
					
					var13.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
				}
			}
		} catch (RuntimeException var45) {
			throw bc.a(var45, "nb.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	final boolean b(byte var1) {
		try {
			if (var1 < 67) {
				this.b((byte) 98);
			}
			
			++qc;
			return this.pc != null;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "nb.H(" + var1 + ')');
		}
	}
}
