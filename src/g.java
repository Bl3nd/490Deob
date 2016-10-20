final class g extends rg {
	
	private l D;
	boolean E;
	boolean F;
	private static ob isAlreadyOnYourFriendList = rf.a(40, " is already on your friend list)3");
	private boolean H;
	static ob I;
	static int J = 0;
	static int L;
	private int[] M;
	static ob N;
	static boolean O = false;
	int P;
	static int Q;
	private static ob R = rf.a(40, "Close");
	static int S;
	private int T;
	private int U;
	private int V;
	static int W;
	static ob isAlreadyOnYourFriendList2;
	static ob Y;
	int Z;
	boolean ab = false;
	private float bb;
	static int cb;
	private static ob db;
	static int eb;
	static int fb;
	static int gb;
	
	protected final void finalize() throws Throwable {
		try {
			++fb;
			super.finalize();
		} catch (RuntimeException var2) {
			throw bc.a(var2, "g.finalize(" + ')');
		}
	}
	
	final void b(int var1, byte var2) {
		int var14 = client.anInt_wb;
		
		try {
			if (var2 > 49) {
				++cb;
				if (this.M != null) {
					if (this.V != 0 || ~this.T != -1) {
						if (ke.qb == null || this.M.length > ke.qb.length) {
							ke.qb = new int[this.M.length];
						}
						
						int var3 = ~this.M.length != -4097 ? 128 : 64;
						int var5 = this.T * var1;
						int var6 = -1 + var3;
						int var4 = this.M.length;
						int var8 = var4 - 1;
						int var7 = var1 * var3 * this.V;
						int var9 = 0;
						if (var14 != 0 || var9 < var4) {
							do {
								int var10 = var8 & var9 + var7;
								int var11 = 0;
								if (var14 != 0 || ~var3 < ~var11) {
									do {
										int var12 = var9 - -var11;
										int var13 = (var6 & var11 + var5) + var10;
										ke.qb[var12] = this.M[var13];
										++var11;
									} while (~var3 < ~var11);
								}
								
								var9 += var3;
							} while (var9 < var4);
						}
						
						int[] var16 = this.M;
						this.M = ke.qb;
						ke.qb = var16;
					}
					
				}
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "g.B(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void f(int var0) {
		try {
			N = null;
			R = null;
			Y = null;
			I = null;
			isAlreadyOnYourFriendList = null;
			if (var0 == -16733) {
				db = null;
				isAlreadyOnYourFriendList2 = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "g.E(" + var0 + ')');
		}
	}
	
	static void a(int var0, byte var1, int var2, int var3, int var4) {
		int var7 = client.anInt_wb;
		
		try {
			if (var1 != 75) {
				b(-101, (int) 17);
			}
			
			++L;
			int var5 = var4;
			if (var7 != 0 || ~(var3 + var4) <= ~var4) {
				do {
					int var6 = var0;
					if (var7 != 0 || ~var0 >= ~(var2 + var0)) {
						do {
							if (~var6 <= -1 && ~var6 > -105 && var5 >= 0 && ~var5 > -105) {
								ff.nb[0][var6][var5] = 127;
								if (var0 == var6 && var6 > 0) {
									d.D[0][var6][var5] = d.D[0][-1 + var6][var5];
								}
								
								if (~var6 == ~(var2 + var0) && var6 < 103) {
									d.D[0][var6][var5] = d.D[0][var6 - -1][var5];
								}
								
								if (~var5 == ~var4 && ~var5 < -1) {
									d.D[0][var6][var5] = d.D[0][var6][var5 - 1];
								}
								
								if (~(var4 + var3) == ~var5 && var5 < 103) {
									d.D[0][var6][var5] = d.D[0][var6][var5 + 1];
								}
							}
							
							++var6;
						} while (~var6 >= ~(var2 + var0));
					}
					
					++var5;
				} while (~(var3 + var4) <= ~var5);
				
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "g.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final int[] a(of var1, float var2, int var3, int var4, pe var5) {
		int var33 = client.anInt_wb;
		
		try {
			++gb;
			if (var3 != '｀') {
				I = null;
			}
			
			if (this.M == null || this.bb != var2) {
				if (!this.D.a(var5, var1, (byte) 10)) {
					return null;
				}
				
				int var6 = ~var4 <= ~this.P ? this.P : var4;
				this.M = this.D.a((byte) -48, var5, var6, (double) var2, true, var1, var6);
				this.bb = var2;
				if (this.H) {
					int[] var7 = new int[var6];
					int[] var8 = new int[var6];
					int[] var9 = new int[var6];
					int[] var10 = new int[var6 * var6];
					int var15 = var6;
					int var14 = var6;
					int var13 = var6;
					int var17 = -1 + var6;
					int var19 = var6 * var6;
					int var20 = 2;
					int var11;
					if (var33 != 0 || var20 >= 0) {
						do {
							var11 = var17;
							if (var33 != 0 || var17 >= 0) {
								do {
									--var14;
									int var12 = this.M[var14];
									var7[var11] += bd.b(16718580, var12) >> 16;
									var8[var11] += bd.b(var12, (int) '｀') >> 8;
									var9[var11] += bd.b(255, (int) var12);
									--var11;
								} while (var11 >= 0);
							}
							
							if (~var14 == -1) {
								var14 = var19;
							}
							
							--var20;
						} while (var20 >= 0);
					}
					
					int var18 = -1 + var6;
					int var26 = var19;
					int var32 = var18;
					if (var33 != 0 || ~var18 <= -1) {
						do {
							int var31 = 0;
							int var30 = 0;
							int var29 = 0;
							int var27 = 1;
							int var28 = 1;
							var11 = 2;
							if (var33 != 0 || var11 >= 0) {
								do {
									--var28;
									var30 += var9[var28];
									var29 += var7[var28];
									var31 += var8[var28];
									if (var28 == 0) {
										var28 = var15;
									}
									
									--var11;
								} while (var11 >= 0);
							}
							
							var11 = var17;
							if (var33 != 0 || var17 >= 0) {
								do {
									--var28;
									--var27;
									int var23 = var30 / 9;
									int var21 = var29 / 9;
									int var22 = var31 / 9;
									--var26;
									var10[var26] = ff.b(ff.b(var21 << 16, var22 << 8), var23);
									var30 += var9[var28] + -var9[var27];
									var29 += var7[var28] - var7[var27];
									var31 += var8[var28] + -var8[var27];
									if (~var27 == -1) {
										var27 = var15;
									}
									
									if (~var28 == -1) {
										var28 = var15;
									}
									
									--var11;
								} while (var11 >= 0);
							}
							
							var11 = var17;
							if (var33 != 0 || ~var17 <= -1) {
								do {
									--var13;
									int var24 = this.M[var13];
									--var14;
									int var25 = this.M[var14];
									var7[var11] += (bd.b(var25, 16744338) >> 16) - bd.b(255, (int) (var24 >> 16));
									var8[var11] += -(bd.b(var24, (int) '＜') >> 8) + (bd.b(var25, (int) '￢') >> 8);
									var9[var11] += -bd.b(255, (int) var24) + bd.b(255, (int) var25);
									--var11;
								} while (~var11 <= -1);
							}
							
							if (~var14 == -1) {
								var14 = var19;
							}
							
							if (~var13 == -1) {
								var13 = var19;
							}
							
							--var32;
						} while (~var32 <= -1);
					}
					
					this.M = var10;
				}
			}
			
			return this.M;
		} catch (RuntimeException var34) {
			throw bc.a(var34, "g.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}
	
	final boolean a(pe var1, byte var2, of var3) {
		try {
			++eb;
			if (var2 != -101) {
				N = null;
			}
			
			return this.D.a(var1, var3, (byte) 10);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "g.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(int var1, pe var2, int var3, of var4) {
		try {
			++Q;
			if (!this.D.a(var2, var4, (byte) 10)) {
				return null;
			} else {
				int var5 = this.P <= var1 ? this.P : var1;
				if (var3 > -88) {
					b(94, (int) -52);
				}
				
				return this.D.a((byte) -115, var2, var5, 1.0D, false, var4, var5);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "g.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}
	
	static int b(int var0, int var1) {
		try {
			++S;
			return var0 != 128 ? 57 : var1 >>> 8;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "g.D(" + var0 + ',' + var1 + ')');
		}
	}
	
	g(og var1) {
		try {
			this.D = new l(var1);
			int var2 = var1.readUnsignedByte(255);
			this.F = ~(var2 & 2) != -1;
			this.E = (1 & var2) != 0;
			int var4 = var1.readUnsignedByte(255);
			this.P = 1 << 1 + (var4 & 7);
			int var3 = 3 & var2 >> 3;
			this.H = ~(var4 & 8) != -1;
			this.Z = var1.readShort(31);
			this.U = var1.readUnsignedByte(255);
			if (~this.U == -256) {
				this.U = 256;
			}
			
			this.T = var1.readByte(1064893128);
			this.V = var1.readByte(1064893128);
			var1.readUnsignedByte(255);
			var1.readUnsignedByte(255);
			var1.readUnsignedByte(255);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "g.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	g() {
		try {
			this.D = new l();
			this.P = 64;
			this.E = true;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "g.<init>(" + ')');
		}
	}
	
	static {
		isAlreadyOnYourFriendList2 = isAlreadyOnYourFriendList;
		Y = R;
		db = rf.a(40, "glow2:");
		I = db;
		N = db;
	}
}
