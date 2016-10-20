final class l {
	
	private int[] a;
	private int[] b;
	static pi pi_c = new pi();
	static int d = 0;
	static int anInt_e;
	static int f;
	private af g;
	private af h;
	static int i;
	private af[] j;
	static int k;
	static int l;
	static int m;
	static ca cacheFile_8;
	static int[] o = new int[100];
	static oc p;
	static int q;
	
	final boolean a(pe var1, of var2, byte var3) {
		int var6 = client.anInt_wb;
		
		try {
			++q;
			int var4 = 0;
			if (var6 != 0) {
				if (!var1.d(var3 ^ 82, this.b[var4])) {
					return false;
				}
				
				++var4;
			}
			
			while (~var4 > ~this.b.length) {
				if (!var1.d(var3 ^ 82, this.b[var4])) {
					return false;
				}
				
				++var4;
			}
			
			if (var3 != 10) {
				this.a((pe) null, (of) null, (byte) 59);
			}
			
			int var5 = 0;
			if (var6 == 0 && var5 >= this.a.length) {
				return true;
			} else {
				do {
					if (!var2.d(12377, this.a[var5])) {
						return false;
					}
					
					++var5;
				} while (var5 < this.a.length);
				
				return true;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "l.E(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
	
	static void a(int var0) {
		int var6 = client.anInt_wb;
		
		try {
			++l;
			
			try {
				label44:
				{
					if (c.Y == null) {
						c.Y = new wd(gi.y, wc.a(new ob[] {ob.P, lb.db, sc.c}, -3).e((byte) -54));
					}
					
					byte[] var1 = c.Y.a(true);
					if (var1 != null) {
						og var2 = new og(var1);
						dd.j = var2.readShort(55);
						ea.ab = new cd[dd.j];
						int var3 = 0;
						if (/*var6 != 0 || */var3 < dd.j) {
							do {
								cd var4 = ea.ab[var3] = new cd();
								int var5 = var2.readShort(30);
								var4.d = (var5 & '耀') != 0;
								var4.k = 32767 & var5;
								var4.l = var2.t(-19405);
								var4.e = var2.readSignedShort((byte) -67);
								var4.h = var3;
								var4.i = ja.a(var4.l, 3379);
								++var3;
							} while (var3 < dd.j);
						}
						
						ca.a(ea.ab, cc.D, 0, ef.gb, 25097, -1 + ea.ab.length);
						c.Y = null;
						ih.v = true;
					}
				}
			} catch (Exception var7) {
				var7.printStackTrace();
				c.Y = null;
			}
			
			if (var0 != -25539) {
				a((byte) -37);
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "l.C(" + var0 + ')');
		}
	}
	
	public l() {
		try {
			this.b = new int[0];
			this.a = new int[0];
			this.g = new nf();
			this.g.Q = 1;
			this.h = new nf();
			this.h.Q = 1;
			this.j = new af[] {this.g, this.h};
		} catch (RuntimeException var2) {
			throw bc.a(var2, "l.<init>(" + ')');
		}
	}
	
	l(og var1) {
		super();
		int var13 = client.anInt_wb;
		
		try {
			int var2 = var1.readUnsignedByte(255);
			this.j = new af[var2];
			int var3 = 0;
			int[][] var5 = new int[var2][];
			int var4 = 0;
			int var6 = 0;
			int var9;
			if (var13 != 0 || ~var2 < ~var6) {
				do {
					af var7 = se.a(var1, (byte) -44);
					if (var7.e(-24089) >= 0) {
						++var3;
					}
					
					if (~var7.d(61) <= -1) {
						++var4;
					}
					
					int var8 = var7.K.length;
					var5[var6] = new int[var8];
					var9 = 0;
					if (var13 != 0 || ~var8 < ~var9) {
						do {
							var5[var6][var9] = var1.readUnsignedByte(255);
							++var9;
						} while (~var8 < ~var9);
					}
					
					this.j[var6] = var7;
					++var6;
				} while (~var2 < ~var6);
			}
			
			this.a = new int[var4];
			var4 = 0;
			this.b = new int[var3];
			var3 = 0;
			int var16 = 0;
			Object var15;
			if (var13 == 0 && var2 <= var16) {
				var15 = null;
				this.g = this.j[var1.readUnsignedByte(255)];
				this.h = this.j[var1.readUnsignedByte(255)];
			} else {
				do {
					af var17 = this.j[var16];
					var9 = var17.K.length;
					int var10 = 0;
					if (var13 != 0) {
						var17.K[var10] = this.j[var5[var16][var10]];
						++var10;
					}
					
					while (~var10 > ~var9) {
						var17.K[var10] = this.j[var5[var16][var10]];
						++var10;
					}
					
					int var11 = var17.e(-24089);
					int var12 = var17.d(76);
					if (var11 > 0) {
						this.b[var3++] = var11;
					}
					
					if (var12 > 0) {
						this.a[var4++] = var12;
					}
					
					var5[var16] = null;
					++var16;
				} while (var2 > var16);
				
				var15 = null;
				this.g = this.j[var1.readUnsignedByte(255)];
				this.h = this.j[var1.readUnsignedByte(255)];
			}
		} catch (RuntimeException var14) {
			throw bc.a(var14, "l.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte var1, pe var2, int var3, double var4, boolean var6, of var7, int var8) {
		int var23 = client.anInt_wb;
		
		try {
			int[] var9 = new int[var3 * var8];
			fh.a(var4, -80);
			++anInt_e;
			if (var1 > -27) {
				this.a = null;
			}
			
			ki.v = var2;
			e.of_h = var7;
			ed.a(var8, var3, -73);
			int var10 = 0;
			if (var23 != 0) {
				this.j[var10].a((byte) 100, var3, var8);
				++var10;
			}
			
			while (this.j.length > var10) {
				this.j[var10].a((byte) 100, var3, var8);
				++var10;
			}
			
			int var11;
			int var12;
			byte var13;
			label104:
			{
				if (!var6) {
					var12 = var8;
					var11 = 0;
					var13 = 1;
					if (var23 == 0) {
						break label104;
					}
				}
				
				var11 = var8 - 1;
				var12 = -1;
				var13 = -1;
			}
			
			int var14 = 0;
			int var15 = 0;
			if (var23 != 0 || ~var3 < ~var15) {
				do {
					int[] var16;
					int[] var17;
					int[] var18;
					label77:
					{
						if (!this.g.u) {
							int[][] var19 = this.g.b(var15, (byte) -114);
							var18 = var19[2];
							var17 = var19[1];
							var16 = var19[0];
							if (var23 == 0) {
								break label77;
							}
						}
						
						int[] var26 = this.g.a((byte) 45, var15);
						var17 = var26;
						var18 = var26;
						var16 = var26;
					}
					
					int var27 = var11;
					if (var23 != 0 || var11 != var12) {
						do {
							int var20 = var16[var27] >> 4;
							int var21 = var17[var27] >> 4;
							if (~var20 < -256) {
								var20 = 255;
							}
							
							if (var20 < 0) {
								var20 = 0;
							}
							
							if (var21 > 255) {
								var21 = 255;
							}
							
							if (~var21 > -1) {
								var21 = 0;
							}
							
							var20 = tf.p[var20];
							var21 = tf.p[var21];
							int var22 = var18[var27] >> 4;
							if (var22 > 255) {
								var22 = 255;
							}
							
							if (~var22 > -1) {
								var22 = 0;
							}
							
							var22 = tf.p[var22];
							var9[var14++] = var22 + (var20 << 16) + (var21 << 8);
							var27 += var13;
						} while (var27 != var12);
					}
					
					++var15;
				} while (~var3 < ~var15);
			}
			
			int var25 = 0;
			if (var23 != 0) {
				this.j[var25].a(false);
				++var25;
			}
			
			while (~this.j.length < ~var25) {
				this.j[var25].a(false);
				++var25;
			}
			
			return var9;
		} catch (RuntimeException var24) {
			throw bc.a(var24, "l.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + var8 + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			pi_c = null;
			cacheFile_8 = null;
			if (var0 != -87) {
				a((int) 88);
			}
			
			p = null;
			o = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "l.B(" + var0 + ')');
		}
	}
	
	static int a(int var0, int var1, byte var2) {
		int var6 = client.anInt_wb;
		
		try {
			ng var3 = (ng) jg.a.a((long) var0, 22346);
			++k;
			if (var3 == null) {
				return 0;
			} else if (var1 == -1) {
				return 0;
			} else {
				if (var2 <= 1) {
					d = 61;
				}
				
				int var4 = 0;
				int var5 = 0;
				if (var6 == 0 && var3.y.length <= var5) {
					return var4;
				} else {
					do {
						if (~var1 == ~var3.q[var5]) {
							var4 += var3.y[var5];
						}
						
						++var5;
					} while (var3.y.length > var5);
					
					return var4;
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "l.D(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
}
