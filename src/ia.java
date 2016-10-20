final class ia extends af {
	
	static int R;
	static int S = 0;
	static int T = 1;
	static int U;
	static int V;
	private int W = 1;
	static ob X;
	static i Y;
	static int Z;
	private int ab = 1;
	static ob bb = rf.a(40, "Zu viele Anmelde)2Versuche von Ihrer Adresse");
	private static ob cb = rf.a(40, "wave2:");
	static ob db;
	static int eb = 0;
	static int fb;
	
	final void a(int var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			label46:
			{
				label41:
				{
					label40:
					{
						if (~var1 != -1) {
							if (~var1 == -2) {
								break label40;
							}
							
							if (~var1 != -3) {
								break label46;
							}
							
							if (var5 == 0) {
								break label41;
							}
						}
						
						this.ab = var3.readUnsignedByte(255);
						if (var5 == 0) {
							break label46;
						}
					}
					
					this.W = var3.readUnsignedByte(255);
					if (var5 == 0) {
						break label46;
					}
				}
				
				super.u = var3.readUnsignedByte(255) == 1;
			}
			
			++Z;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ia.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var15 = client.anInt_wb;
		
		try {
			if (var1 <= 13) {
				b(false);
			}
			
			++V;
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int var4 = 1 + (this.W - -this.W);
				int var6 = this.ab + this.ab - -1;
				int var7 = 65536 / var6;
				int[][] var8 = new int[var4][];
				int var5 = 65536 / var4;
				int var9 = var2 + -this.W;
				int var12;
				if (var15 != 0 || this.W + var2 >= var9) {
					do {
						var12 = 0;
						int[] var10 = this.c(fc.jb & var9, 0, 103);
						int[] var11 = new int[lh.eb];
						int var13 = -this.ab;
						if (var15 != 0 || ~this.ab <= ~var13) {
							do {
								var12 += var10[kg.b & var13];
								++var13;
							} while (~this.ab <= ~var13);
						}
						
						int var14 = 0;
						if (var15 != 0 || ~var14 > ~lh.eb) {
							do {
								var11[var14] = var12 * var7 >> 16;
								var12 -= var10[var14 + -this.ab & kg.b];
								++var14;
								var12 += var10[this.ab + var14 & kg.b];
							} while (~var14 > ~lh.eb);
						}
						
						var8[var9 - -this.W + -var2] = var11;
						++var9;
					} while (this.W + var2 >= var9);
				}
				
				int var17 = 0;
				if (var15 != 0 || ~lh.eb < ~var17) {
					do {
						int var18 = 0;
						var12 = 0;
						if (var15 != 0 || var12 < var4) {
							do {
								var18 += var8[var12][var17];
								++var12;
							} while (var12 < var4);
						}
						
						var3[var17] = var5 * var18 >> 16;
						++var17;
					} while (~lh.eb < ~var17);
				}
			}
			
			return var3;
		} catch (RuntimeException var16) {
			throw bc.a(var16, "ia.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var24 = client.anInt_wb;
		
		try {
			int[][] var3 = super.ve_s.a(var1, (byte) 45);
			int var4;
			if (super.ve_s.u) {
				var4 = this.W + this.W + 1;
				int var6 = 1 + this.ab + this.ab;
				int var5 = 65536 / var4;
				int var7 = 65536 / var6;
				int[][][] var8 = new int[var4][][];
				int var9 = -this.W + var1;
				int var13;
				int var14;
				if (var24 != 0 || ~(var1 + this.W) <= ~var9) {
					do {
						int[][] var10 = this.b(var9 & fc.jb, 117, 0);
						int[][] var11 = new int[3][lh.eb];
						int var12 = 0;
						var13 = 0;
						int[] var16 = var10[1];
						var14 = 0;
						int[] var17 = var10[2];
						int[] var15 = var10[0];
						int var18 = -this.ab;
						if (var24 != 0 || ~this.ab <= ~var18) {
							do {
								int var19 = kg.b & var18;
								var12 += var15[var19];
								var14 += var17[var19];
								var13 += var16[var19];
								++var18;
							} while (~this.ab <= ~var18);
						}
						
						int[] var20 = var11[1];
						int[] var33 = var11[0];
						int[] var21 = var11[2];
						int var22 = 0;
						if (var24 != 0 || lh.eb > var22) {
							do {
								var33[var22] = var12 * var7 >> 16;
								var20[var22] = var7 * var13 >> 16;
								var21[var22] = var14 * var7 >> 16;
								int var23 = var22 - this.ab & kg.b;
								++var22;
								var12 -= var15[var23];
								var14 -= var17[var23];
								var13 -= var16[var23];
								var23 = var22 - -this.ab & kg.b;
								var12 += var15[var23];
								var14 += var17[var23];
								var13 += var16[var23];
							} while (lh.eb > var22);
						}
						
						var8[-var1 + this.W + var9] = var11;
						++var9;
					} while (~(var1 + this.W) <= ~var9);
				}
				
				int[] var28 = var3[2];
				int[] var27 = var3[1];
				int[] var26 = var3[0];
				var13 = 0;
				if (var24 != 0 || ~var13 > ~lh.eb) {
					do {
						var14 = 0;
						int var30 = 0;
						int var29 = 0;
						int var31 = 0;
						if (var24 != 0 || var4 > var31) {
							do {
								int[][] var32 = var8[var31];
								var30 += var32[2][var13];
								var14 += var32[0][var13];
								var29 += var32[1][var13];
								++var31;
							} while (var4 > var31);
						}
						
						var26[var13] = var5 * var14 >> 16;
						var27[var13] = var5 * var29 >> 16;
						var28[var13] = var5 * var30 >> 16;
						++var13;
					} while (~var13 > ~lh.eb);
				}
			}
			
			var4 = -6 % ((-42 - var2) / 41);
			++R;
			return var3;
		} catch (RuntimeException var25) {
			throw bc.a(var25, "ia.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void b(boolean var0) {
		try {
			if (var0) {
				bb = null;
			}
			
			X = null;
			db = null;
			Y = null;
			cb = null;
			bb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ia.C(" + var0 + ')');
		}
	}
	
	static void d(int var0, int var1, int var2) {
		for (int var3 = 0; var3 < ki.s; ++var3) {
			for (int var4 = 0; var4 < qd.L; ++var4) {
				for (int var5 = 0; var5 < wc.J; ++var5) {
					pd var6 = nb.oc[var3][var4][var5];
					if (var6 != null) {
						rc var7 = var6.x;
						if (var7 != null && var7.k.a()) {
							a.a(var7.k, var3, var4, var5, 1, 1);
							if (var7.b != null && var7.b.a()) {
								a.a(var7.b, var3, var4, var5, 1, 1);
								var7.k.a(var7.b, 0, 0, 0, false);
								var7.b = var7.b.b(var0, var1, var2);
							}
							
							var7.k = var7.k.b(var0, var1, var2);
						}
						
						for (int var8 = 0; var8 < var6.B; ++var8) {
							ah var9 = var6.D[var8];
							if (var9 != null && var9.h.a()) {
								a.a(var9.h, var3, var4, var5, var9.e - var9.q + 1, var9.r - var9.d + 1);
								var9.h = var9.h.b(var0, var1, var2);
							}
						}
						
						me var10 = var6.u;
						if (var10 != null && var10.c.a()) {
							qg.a(var10.c, var3, var4, var5);
							var10.c = var10.c.b(var0, var1, var2);
						}
					}
				}
			}
		}
		
	}
	
	public ia() {
		super(1, false);
	}
	
	static {
		X = cb;
		db = cb;
	}
}
