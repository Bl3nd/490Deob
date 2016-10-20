final class cf extends af {
	
	static int R = -1;
	static int S;
	static int T;
	private int U = 1024;
	private int V = 3072;
	private int W = 2048;
	static ob clientscriptErrorCheckLogForDetails = rf.a(40, "Clientscript error )2 check log for details");
	static boolean Y = false;
	static long Z = 0L;
	static int ab;
	static ob bb = rf.a(40, "Weiter");
	static int cb = 0;
	static int db;
	static int eb;
	static int fb;
	
	static void a(int[] ints, int i, int unused, int i1, int i2, int i3) {
		pd pd = nb.oc[i1][i2][i3];
		if (pd != null) {
			hf hf = pd.H;
			int i4;
			if (hf == null) {
				kb kb = pd.A;
				if (kb != null) {
					i4 = kb.j;
					int i5 = kb.h;
					int i6 = kb.m;
					int i7 = kb.f;
					int[] ints1 = ub.c[i4];
					int[] ints2 = ka.x[i5];
					int i8 = 0;
					int i9;
					if (i6 != 0) {
						for (i9 = 0; i9 < 4; ++i9) {
							ints[i] = ints1[ints2[i8++]] == 0 ? i6 : i7;
							ints[i + 1] = ints1[ints2[i8++]] == 0 ? i6 : i7;
							ints[i + 2] = ints1[ints2[i8++]] == 0 ? i6 : i7;
							ints[i + 3] = ints1[ints2[i8++]] == 0 ? i6 : i7;
							i += 512;
						}
						
					} else {
						for (i9 = 0; i9 < 4; ++i9) {
							if (ints1[ints2[i8++]] != 0) {
								ints[i] = i7;
							}
							
							if (ints1[ints2[i8++]] != 0) {
								ints[i + 1] = i7;
							}
							
							if (ints1[ints2[i8++]] != 0) {
								ints[i + 2] = i7;
							}
							
							if (ints1[ints2[i8++]] != 0) {
								ints[i + 3] = i7;
							}
							
							i += 512;
						}
					}
				}
			} else {
				int i5 = hf.h;
				if (i5 != 0) {
					for (i4 = 0; i4 < 4; ++i4) {
						ints[i] = i5;
						ints[i + 1] = i5;
						ints[i + 2] = i5;
						ints[i + 3] = i5;
						i += 512;
					}
				}
			}
		}
	}
	
	final int[] a(byte unused, int i) {
		int dummy = client.anInt_wb;
		
		try {
			++S;
			int[] ints = super.nd_v.a(i, 12);
			if (super.nd_v.n) {
				int[] ints1 = this.c(i, 0, 33);
				int i1 = 0;
				if (/*dummy != 0 || */~i1 > ~lh.eb) {
					do {
						ints[i1] = this.U - -(this.W * ints1[i1] >> 12);
						++i1;
					} while (~i1 > ~lh.eb);
				}
			}
			
			return ints;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "cf.F(" + unused + ',' + i + ')');
		}
	}
	
	public cf() {
		super(1, false);
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var25 = client.anInt_wb;
		
		try {
			int var6 = 0;
			if (var0 != 2) {
				cb = -79;
			}
			
			int var7 = var3;
			int var8 = var2 * var2;
			int var9 = var3 * var3;
			++eb;
			int var10 = var9 << 1;
			int var12 = var3 << 1;
			int var11 = var8 << 1;
			int var13 = var8 * (-var12 + 1) - -var10;
			int var14 = var9 + -(var11 * (var12 - 1));
			int var15 = var8 << 2;
			int var16 = var9 << 2;
			int var17 = ((var6 << 1) - -3) * var10;
			int var19 = var16 * (1 + var6);
			int var20 = var15 * (-1 + var3);
			int var18 = ((var3 << 1) + -3) * var11;
			int var21;
			int var22;
			if (dd.a <= var5) {
				if (~na.anInt_m <= ~var5) {
					var21 = kg.a(gh.R, ng.u, true, var1 - -var2);
					var22 = kg.a(gh.R, ng.u, true, var1 - var2);
					sa.a(var21, (byte) 52, var22, var4, e.ints_b[var5]);
					if (var25 == 0 && var3 <= 0) {
						return;
					}
				} else if (var3 <= 0) {
					return;
				}
			} else if (var3 <= 0) {
				return;
			}
			
			do {
				if (var13 < 0 && (var25 != 0 || ~var13 > -1)) {
					do {
						var14 += var19;
						var19 += var16;
						++var6;
						var13 += var17;
						var17 += var16;
					} while (~var13 > -1);
				}
				
				--var7;
				var21 = -var7 + var5;
				if (var14 < 0) {
					var13 += var17;
					var17 += var16;
					var14 += var19;
					var19 += var16;
					++var6;
				}
				
				var13 += -var20;
				var14 += -var18;
				var22 = var7 + var5;
				var18 -= var15;
				if (~var22 <= ~dd.a && ~na.anInt_m <= ~var21) {
					int var23 = kg.a(gh.R, ng.u, true, var6 + var1);
					int var24 = kg.a(gh.R, ng.u, true, var1 - var6);
					if (~var21 <= ~dd.a) {
						sa.a(var23, (byte) 52, var24, var4, e.ints_b[var21]);
					}
					
					if (na.anInt_m >= var22) {
						sa.a(var23, (byte) 52, var24, var4, e.ints_b[var22]);
					}
				}
				
				var20 -= var15;
			} while (var7 > 0);
			
		} catch (RuntimeException var26) {
			throw bc.a(var26, "cf.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	final void f(int var1) {
		try {
			++fb;
			this.W = this.V + -this.U;
			if (var1 != 1) {
				clientscriptErrorCheckLogForDetails = null;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "cf.L(" + var1 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var13 = client.anInt_wb;
		
		try {
			int[][] var3 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[][] var5 = this.b(var1, 109, 0);
				int[] var6 = var5[0];
				int[] var7 = var5[1];
				int[] var8 = var5[2];
				int[] var9 = var3[0];
				int[] var10 = var3[1];
				int[] var11 = var3[2];
				int var12 = 0;
				if (var13 != 0 || var12 < lh.eb) {
					do {
						var9[var12] = (var6[var12] * this.W >> 12) + this.U;
						var10[var12] = this.U - -(var7[var12] * this.W >> 12);
						var11[var12] = (var8[var12] * this.W >> 12) + this.U;
						++var12;
					} while (var12 < lh.eb);
				}
			}
			
			++db;
			return var3;
		} catch (RuntimeException var14) {
			throw bc.a(var14, "cf.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void b(boolean unused) {
		try {
			clientscriptErrorCheckLogForDetails = null;
			bb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "cf.D(" + unused + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			label46:
			{
				label41:
				{
					label40:
					{
						if (var1 != 0) {
							if (~var1 == -2) {
								break label40;
							}
							
							if (var1 != 2) {
								break label46;
							}
							
							if (var5 == 0) {
								break label41;
							}
						}
						
						this.U = var3.readShort(57);
						if (var5 == 0) {
							break label46;
						}
					}
					
					this.V = var3.readShort(43);
					if (var5 == 0) {
						break label46;
					}
				}
				
				super.u = var3.readUnsignedByte(255) == 1;
			}
			
			++T;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "cf.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
}
