import java.util.Random;

abstract class nh extends oi {
	
	private static ob K = rf.a(40, "str=");
	private static ob L = rf.a(40, "shad");
	private static ob M = rf.a(40, "times");
	private static ob N = rf.a(40, "img=");
	private static ob O = rf.a(40, "str");
	private fa[] P;
	private static int Q = -1;
	private static ob R = rf.a(40, "nbsp");
	private int[] S;
	private static ob T = rf.a(40, "col=");
	private static ob U = rf.a(40, "gt");
	private static int V = -1;
	private static int W = 256;
	private int[] X;
	private static int Y = 0;
	private int[] Z;
	private static ob ab = rf.a(40, ")4str");
	int bb = 0;
	private static ob cb = rf.a(40, "u=");
	private static ob db = rf.a(40, "shy");
	private static int eb = 0;
	private static ob fb = rf.a(40, ")4col");
	private int[] gb;
	private static ob hb = rf.a(40, ")4shad");
	private static ob ib = rf.a(40, "reg");
	byte[][] jb = new byte[256][];
	private static ob[] kb = new ob[100];
	private static ob lb = rf.a(40, "trans=");
	private static int mb = 0;
	private static int nb = -1;
	private static ob ob = rf.a(40, "u");
	private int pb;
	private static ob qb = rf.a(40, "shad=");
	private static ob rb = rf.a(40, "lt");
	private static int sb = -1;
	private static int tb = 256;
	private static ob ub = rf.a(40, "copy");
	private int[] ints_vb;
	private static int wb = 0;
	private static ob xb = rf.a(40, "euro");
	private static ob yb = rf.a(40, "br");
	private static ob zb = rf.a(40, ")4u");
	private byte[] Ab;
	private static ob Bb = rf.a(40, ")4trans");
	private int[] Cb;
	private int Db;
	
	private void e(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * oi.E;
		int var8 = oi.E - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < oi.F) {
			var11 = oi.F - var3;
			var5 -= var11;
			var3 = oi.F;
			var10 += var11 * var4;
			var7 += var11 * oi.E;
		}
		
		if (var3 + var5 > oi.I) {
			var5 -= var3 + var5 - oi.I;
		}
		
		if (var2 < oi.J) {
			var11 = oi.J - var2;
			var4 -= var11;
			var2 = oi.J;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}
		
		if (var2 + var4 > oi.G) {
			var11 = var2 + var4 - oi.G;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}
		
		if (var4 > 0 && var5 > 0) {
			a(oi.D, this.jb[var1], var6, var10, var7, var4, var5, var8, var9);
		}
	}
	
	static ob a(ob var0) {
		int var1 = var0.a(false);
		int var2 = 0;
		
		for (int var3 = 0; var3 < var1; ++var3) {
			byte var4 = var0.buffer[var3];
			if (var4 == 60 || var4 == 62) {
				var2 += 3;
			}
		}
		
		ob var8 = new ob();
		var8.length = var1 + var2;
		var8.buffer = new byte[var8.length];
		int var5 = 0;
		
		for (int var6 = 0; var6 < var1; ++var6) {
			byte var7 = var0.buffer[var6];
			if (var7 == 60) {
				var8.buffer[var5++] = 60;
				var8.buffer[var5++] = 108;
				var8.buffer[var5++] = 116;
				var8.buffer[var5++] = 62;
			} else if (var7 == 62) {
				var8.buffer[var5++] = 60;
				var8.buffer[var5++] = 103;
				var8.buffer[var5++] = 116;
				var8.buffer[var5++] = 62;
			} else {
				var8.buffer[var5++] = var7;
			}
		}
		
		return var8;
	}
	
	final int a(ob gameString, int unused) {
		return this.a(gameString, new int[] {250}, kb);
	}
	
	private void b(int color, int var2, int var3) {
		V = -1;
		nb = -1;
		sb = var2;
		Q = var2;
		mb = color;
		wb = color;
		tb = var3;
		W = var3;
		Y = 0;
		eb = 0;
	}
	
	private static int a(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}
		
		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}
		
		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}
		
		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;
		
		for (int var18 = var11; var18 < var12; ++var18) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}
		
		return -var13;
	}
	
	final void a(ob var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.b(var4, var5);
			int[] var7 = new int[var1.length];
			int[] var8 = new int[var1.length];
			
			for (int var9 = 0; var9 < var1.length; ++var9) {
				var7[var9] = (int) (Math.sin((double) var9 / 5.0D + (double) var6 / 5.0D) * 5.0D);
				var8[var9] = (int) (Math.sin((double) var9 / 3.0D + (double) var6 / 5.0D) * 5.0D);
			}
			
			this.a(var1, var2 - this.b(var1) / 2, var3, var7, var8);
		}
	}
	
	private int f(int value) {
		return this.ints_vb[value & 0xff];
	}
	
	final void a(ob var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			this.b(var4, var5);
			double var8 = 7.0D - (double) var7 / 8.0D;
			if (var8 < 0.0D) {
				var8 = 0.0D;
			}
			
			int[] var10 = new int[var1.length];
			
			for (int var11 = 0; var11 < var1.length; ++var11) {
				var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) var6) * var8);
			}
			
			this.a(var1, var2 - this.b(var1) / 2, var3, (int[]) null, var10);
		}
	}
	
	final int a(ob var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
		if (var1 == null) {
			return 0;
		} else {
			var6.setSeed((long) var7);
			this.b(var4, var5, 192 + (var6.nextInt() & 31));
			int[] var8 = new int[var1.length];
			int var9 = 0;
			
			for (int var10 = 0; var10 < var1.length; ++var10) {
				var8[var10] = var9;
				if ((var6.nextInt() & 3) == 0) {
					++var9;
				}
			}
			
			this.a(var1, var2, var3, var8, (int[]) null);
			return var9;
		}
	}
	
	abstract void f(int var1, int var2, int var3, int var4, int var5, int var6);
	
	final void a(ob var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.b(var4, var5);
			this.a(var1, var2, var3);
		}
	}
	
	static void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
		var9 = 256 - var9;
		
		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}
			
			var4 += var7;
			var3 += var8;
		}
		
	}
	
	private void b(int var1, int var2) {
		V = -1;
		nb = -1;
		sb = var2;
		Q = var2;
		mb = var1;
		wb = var1;
		tb = 256;
		W = 256;
		Y = 0;
		eb = 0;
	}
	
	final int b(ob var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;
			
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.buffer[var5] & 255;
				if (var6 == 60) {
					var2 = var5;
				} else {
					if (var6 == 62 && var2 != -1) {
						ob var7 = var1.a(var5, var2 + 1, (byte) 49);
						var2 = -1;
						if (var7.a((byte) 32, rb)) {
							var6 = 60;
						} else if (var7.a((byte) 17, U)) {
							var6 = 62;
						} else if (var7.a((byte) 110, R)) {
							var6 = 160;
						} else if (var7.a((byte) 13, db)) {
							var6 = 173;
						} else if (var7.a((byte) 84, M)) {
							var6 = 215;
						} else if (var7.a((byte) 116, xb)) {
							var6 = 128;
						} else if (var7.a((byte) 46, ub)) {
							var6 = 169;
						} else {
							if (!var7.a((byte) 79, ib)) {
								if (var7.a((int) 90, N)) {
									try {
										int var8 = var7.a((byte) 39, (int) 4).f((int) 10);
										var4 += this.P[var8].K;
										var3 = -1;
									} catch (Exception var9) {
										var9.printStackTrace();
									}
								}
								continue;
							}
							
							var6 = 174;
						}
					}
					
					if (var2 == -1) {
						var4 += this.ints_vb[var6];
						if (this.Ab != null && var3 != -1) {
							var4 += this.Ab[(var3 << 8) + var6];
						}
						
						var3 = var6;
					}
				}
			}
			
			return var4;
		}
	}
	
	private int a(ob var1, int var2, int var3, int var4, int var5, int color, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			this.b(color, var7, var8);
			if (var11 == 0) {
				var11 = this.bb;
			}
			
			int[] var12 = new int[] {var4};
			if (var5 < this.pb + this.Db + var11 && var5 < var11 + var11) {
				var12 = null;
			}
			
			int var13 = this.a(var1, var12, kb);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}
			
			int var14;
			int var15;
			if (var10 == 0) {
				var14 = var3 + this.pb;
			} else if (var10 == 1) {
				var14 = var3 + this.pb + (var5 - this.pb - this.Db - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.Db - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.pb - this.Db - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}
				
				var14 = var3 + this.pb + var15;
				var11 += var15;
			}
			
			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.a(kb[var15], var2, var14);
				} else if (var9 == 1) {
					this.a(kb[var15], var2 + (var4 - this.b(kb[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.a(kb[var15], var2 + var4 - this.b(kb[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.a(kb[var15], var2, var14);
				} else {
					this.c(kb[var15], var4);
					this.a(kb[var15], var2, var14);
					Y = 0;
				}
				
				var14 += var11;
			}
			
			return var13;
		}
	}
	
	final int a(ob var1, int var2, int var3, int var4, int var5, int color, int var7, int var8, int var9, int var10) {
		return this.a(var1, var2, var3, var4, var5, color, var7, 256, var8, var9, var10);
	}
	
	private void a(byte[] var1) {
		this.ints_vb = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.ints_vb.length; ++var2) {
				this.ints_vb[var2] = var1[var2] & 255;
			}
			
			this.bb = var1[256] & 255;
		} else {
			var2 = 0;
			
			for (int var3 = 0; var3 < 256; ++var3) {
				this.ints_vb[var3] = var1[var2++] & 255;
			}
			
			int[] var4 = new int[256];
			int[] var5 = new int[256];
			
			for (int var6 = 0; var6 < 256; ++var6) {
				var4[var6] = var1[var2++] & 255;
			}
			
			for (int var7 = 0; var7 < 256; ++var7) {
				var5[var7] = var1[var2++] & 255;
			}
			
			byte[][] var8 = new byte[256][];
			
			int var11;
			for (int var9 = 0; var9 < 256; ++var9) {
				var8[var9] = new byte[var4[var9]];
				byte var10 = 0;
				
				for (var11 = 0; var11 < var8[var9].length; ++var11) {
					var10 += var1[var2++];
					var8[var9][var11] = var10;
				}
			}
			
			byte[][] var14 = new byte[256][];
			
			int var13;
			for (var11 = 0; var11 < 256; ++var11) {
				var14[var11] = new byte[var4[var11]];
				byte var12 = 0;
				
				for (var13 = 0; var13 < var14[var11].length; ++var13) {
					var12 += var1[var2++];
					var14[var11][var13] = var12;
				}
			}
			
			this.Ab = new byte[65536];
			
			for (int var15 = 0; var15 < 256; ++var15) {
				if (var15 != 32 && var15 != 160) {
					for (var13 = 0; var13 < 256; ++var13) {
						if (var13 != 32 && var13 != 160) {
							this.Ab[(var15 << 8) + var13] = (byte) a(var8, var14, var5, this.ints_vb, var4, var15, var13);
						}
					}
				}
			}
			
			this.bb = var5[32] + var4[32];
		}
	}
	
	final void b(ob var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.b(var4, var5);
			this.a(var1, var2 - this.b(var1) / 2, var3);
		}
	}
	
	private void a(ob var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.bb;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;
		
		for (int var9 = 0; var9 < var1.length; ++var9) {
			int var10 = var1.buffer[var9] & 255;
			if (var10 == 60) {
				var6 = var9;
			} else {
				int var12;
				int var13;
				int var14;
				if (var10 == 62 && var6 != -1) {
					ob var11 = var1.a(var9, var6 + 1, (byte) 64);
					var6 = -1;
					if (var11.a((byte) 84, rb)) {
						var10 = 60;
					} else if (var11.a((byte) 55, U)) {
						var10 = 62;
					} else if (var11.a((byte) 21, R)) {
						var10 = 160;
					} else if (var11.a((byte) 91, db)) {
						var10 = 173;
					} else if (var11.a((byte) 8, M)) {
						var10 = 215;
					} else if (var11.a((byte) 121, xb)) {
						var10 = 128;
					} else if (var11.a((byte) 42, ub)) {
						var10 = 169;
					} else {
						if (!var11.a((byte) 95, ib)) {
							if (var11.a((int) 112, N)) {
								try {
									if (var4 != null) {
										var12 = var4[var8];
									} else {
										var12 = 0;
									}
									
									if (var5 != null) {
										var13 = var5[var8];
									} else {
										var13 = 0;
									}
									
									++var8;
									var14 = var11.a((byte) -120, (int) 4).f((int) 10);
									fa var19 = this.P[var14];
									int var16 = this.X != null ? this.X[var14] : var19.M;
									if (W == 256) {
										var19.b(var2 + var12, var3 + this.bb - var16 + var13);
									} else {
										var19.b(var2 + var12, var3 + this.bb - var16 + var13, W);
									}
									
									var2 += var19.K;
									var7 = -1;
								} catch (Exception var17) {
									var17.printStackTrace();
								}
							} else {
								this.c(var11);
							}
							continue;
						}
						
						var10 = 174;
					}
				}
				
				if (var6 == -1) {
					if (this.Ab != null && var7 != -1) {
						var2 += this.Ab[(var7 << 8) + var10];
					}
					
					int var18 = this.gb[var10];
					var12 = this.Z[var10];
					if (var4 != null) {
						var13 = var4[var8];
					} else {
						var13 = 0;
					}
					
					if (var5 != null) {
						var14 = var5[var8];
					} else {
						var14 = 0;
					}
					
					++var8;
					if (var10 != 32) {
						if (W == 256) {
							if (Q != -1) {
								this.e(var10, var2 + this.S[var10] + 1 + var13, var3 + this.Cb[var10] + 1 + var14, var18, var12, Q);
							}
							
							this.f(var10, var2 + this.S[var10] + var13, var3 + this.Cb[var10] + var14, var18, var12, wb);
						} else {
							if (Q != -1) {
								this.b(var10, var2 + this.S[var10] + 1 + var13, var3 + this.Cb[var10] + 1 + var14, var18, var12, Q, W);
							}
							
							this.a(var10, var2 + this.S[var10] + var13, var3 + this.Cb[var10] + var14, var18, var12, wb, W);
						}
					} else if (Y > 0) {
						eb += Y;
						var2 += eb >> 8;
						eb &= 255;
					}
					
					int var15 = this.ints_vb[var10];
					if (V != -1) {
						oi.d(var2, var3 + (int) ((double) this.bb * 0.7D), var15, V);
					}
					
					if (nb != -1) {
						oi.d(var2, var3 + this.bb, var15, nb);
					}
					
					var2 += var15;
					var7 = var10;
				}
			}
		}
		
	}
	
	public static void d() {
		rb = null;
		U = null;
		R = null;
		db = null;
		M = null;
		xb = null;
		ub = null;
		ib = null;
		N = null;
		yb = null;
		T = null;
		fb = null;
		lb = null;
		Bb = null;
		cb = null;
		ob = null;
		zb = null;
		qb = null;
		L = null;
		hb = null;
		K = null;
		O = null;
		ab = null;
		kb = null;
	}
	
	private void c(ob var1) {
		try {
			if (var1.a((int) -69, T)) {
				wb = var1.a((byte) 103, (int) 4).d(-125, 16);
				return;
			}
			
			if (var1.a((byte) 108, fb)) {
				wb = mb;
				return;
			}
			
			if (var1.a((int) -128, lb)) {
				W = var1.a((byte) 96, (int) 6).f((int) 10);
				return;
			}
			
			if (var1.a((byte) 80, Bb)) {
				W = tb;
				return;
			}
			
			if (var1.a((int) -16, K)) {
				V = var1.a((byte) -99, (int) 4).d(-126, 16);
				return;
			}
			
			if (var1.a((byte) 48, O)) {
				V = 8388608;
				return;
			}
			
			if (var1.a((byte) 91, ab)) {
				V = -1;
				return;
			}
			
			if (var1.a((int) 107, cb)) {
				nb = var1.a((byte) 65, (int) 2).d(-127, 16);
				return;
			}
			
			if (var1.a((byte) 16, ob)) {
				nb = 0;
				return;
			}
			
			if (var1.a((byte) 120, zb)) {
				nb = -1;
				return;
			}
			
			if (var1.a((int) 126, qb)) {
				Q = var1.a((byte) -123, (int) 5).d(-128, 16);
				return;
			}
			
			if (var1.a((byte) 6, L)) {
				Q = 0;
				return;
			}
			
			if (var1.a((byte) 47, hb)) {
				Q = sb;
				return;
			}
			
			if (var1.a((byte) 21, yb)) {
				this.b(mb, sb, tb);
			}
		} catch (Exception var2) {
			var2.printStackTrace();
		}
		
	}
	
	final int b(ob gameString, int unused) {
		int length = this.a(gameString, new int[] {250}, kb);
		int i = 0;
		for (int index = 0; index < length; ++index) {
			int value = this.b(kb[index]);
			if (value > i) {
				i = value;
			}
		}
		
		return i;
	}
	
	static void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);
		
		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
				
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
				
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
				
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}
			
			for (int var12 = var5; var12 < 0; ++var12) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}
			
			var4 += var7;
			var3 += var8;
		}
		
	}
	
	abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7);
	
	final void c(ob var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.b(var4, var5);
			this.a(var1, var2 - this.b(var1), var3);
		}
	}
	
	final void b(ob var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.b(var4, var5);
			int[] var7 = new int[var1.length];
			
			for (int var8 = 0; var8 < var1.length; ++var8) {
				var7[var8] = (int) (Math.sin((double) var8 / 2.0D + (double) var6 / 5.0D) * 5.0D);
			}
			
			this.a(var1, var2 - this.b(var1) / 2, var3, (int[]) null, var7);
		}
	}
	
	private void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * oi.E;
		int var9 = oi.E - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < oi.F) {
			var12 = oi.F - var3;
			var5 -= var12;
			var3 = oi.F;
			var11 += var12 * var4;
			var8 += var12 * oi.E;
		}
		
		if (var3 + var5 > oi.I) {
			var5 -= var3 + var5 - oi.I;
		}
		
		if (var2 < oi.J) {
			var12 = oi.J - var2;
			var4 -= var12;
			var2 = oi.J;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}
		
		if (var2 + var4 > oi.G) {
			var12 = var2 + var4 - oi.G;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}
		
		if (var4 > 0 && var5 > 0) {
			a(oi.D, this.jb[var1], var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}
	
	private int a(ob gameString, int[] data, ob[] obs) {
		if (gameString == null) {
			return 0;
		} else {
			int i = 0;
			int srcPointer = 0;
			ob class_ob = vb.a(100, 256);
			int i2 = -1;
			int i3 = 0;
			byte b = 0;
			int i4 = -1;
			int i5 = -1;
			int i6 = 0;
			int i7 = gameString.a(false);
			for (int pointer = 0; pointer < i7; ++pointer) {
				int value = gameString.a(127, pointer);
				if (value == 60) {
					i4 = pointer;
				} else {
					if (value == 62 && i4 != -1) {
						ob class_ob2 = gameString.a(pointer, i4 + 1, (byte) 16);
						i4 = -1;
						class_ob.getChar(-58, 60);
						class_ob.a(class_ob2, (byte) 34);
						class_ob.getChar(-58, 62);
						if (class_ob2.a((byte) 114, yb)) {
							obs[i6++] = class_ob.a(class_ob.a(false), srcPointer, (byte) 45);
							srcPointer = class_ob.a(false);
							i = 0;
							i2 = -1;
							i5 = -1;
						} else if (class_ob2.a((byte) 125, rb)) {
							i += this.f(60);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + 60];
							}
							
							i5 = 60;
						} else if (class_ob2.a((byte) 14, U)) {
							i += this.f(62);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + 62];
							}
							
							i5 = 62;
						} else if (class_ob2.a((byte) 86, R)) {
							i += this.f(160);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + 160];
							}
							
							i5 = 160;
						} else if (class_ob2.a((byte) 83, db)) {
							i += this.f(173);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + 173];
							}
							
							i5 = 173;
						} else if (class_ob2.a((byte) 126, M)) {
							i += this.f(215);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + 215];
							}
							
							i5 = 215;
						} else if (class_ob2.a((byte) 62, xb)) {
							i += this.f(128);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + 128];
							}
							
							i5 = 128;
						} else if (class_ob2.a((byte) 47, ub)) {
							i += this.f(169);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + 169];
							}
							
							i5 = 169;
						} else if (class_ob2.a((byte) 106, ib)) {
							i += this.f(174);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + 174];
							}
							
							i5 = 174;
						} else if (class_ob2.a(-92, N)) {
							try {
								int i8 = class_ob2.a((byte) -95, 4).f(10);
								i += this.P[i8].K;
								i5 = -1;
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						
						value = -1;
					}
					
					if (i4 == -1) {
						if (value != -1) {
							class_ob.getChar(-58, value);
							i += this.f(value);
							if (this.Ab != null && i5 != -1) {
								i += this.Ab[(i5 << 8) + value];
							}
							
							i5 = value;
						} else if (value == 32) {
							i2 = class_ob.a(false);
							i3 = i;
							b = 1;
						}
						
						if (data != null && i > data[i6 < data.length ? i6 : data.length - 1] && i2 >= 0) {
							obs[i6++] = class_ob.a(i2 - b, srcPointer, (byte) 120);
							srcPointer = i2;
							i2 = -1;
							i -= i3;
							i5 = -1;
						}
						
						if (value == 45) {
							i2 = class_ob.a(false);
							i3 = i;
							b = 0;
						}
					}
				}
			}
			
			if (class_ob.a(false) > srcPointer) {
				obs[i6++] = class_ob.a(class_ob.a(false), srcPointer, (byte) 9);
			}
			
			return i6;
		}
	}
	
	final void a(fa[] var1, int[] var2) {
		if (var2 != null && var2.length != var1.length) {
			throw new IllegalArgumentException();
		} else {
			this.P = var1;
			this.X = var2;
		}
	}
	
	private void a(ob var1, int var2, int var3) {
		var3 -= this.bb;
		int var4 = -1;
		int var5 = -1;
		
		for (int var6 = 0; var6 < var1.length; ++var6) {
			int var7 = var1.buffer[var6] & 255;
			if (var7 == 60) {
				var4 = var6;
			} else {
				int var9;
				if (var7 == 62 && var4 != -1) {
					ob var8 = var1.a(var6, var4 + 1, (byte) 22);
					var4 = -1;
					if (var8.a((byte) 84, rb)) {
						var7 = 60;
					} else if (var8.a((byte) 30, U)) {
						var7 = 62;
					} else if (var8.a((byte) 93, R)) {
						var7 = 160;
					} else if (var8.a((byte) 107, db)) {
						var7 = 173;
					} else if (var8.a((byte) 30, M)) {
						var7 = 215;
					} else if (var8.a((byte) 126, xb)) {
						var7 = 128;
					} else if (var8.a((byte) 36, ub)) {
						var7 = 169;
					} else {
						if (!var8.a((byte) 47, ib)) {
							if (var8.a((int) 122, N)) {
								try {
									var9 = var8.a((byte) 56, (int) 4).f((int) 10);
									fa var14 = this.P[var9];
									int var11 = this.X != null ? this.X[var9] : var14.M;
									if (W == 256) {
										var14.b(var2, var3 + this.bb - var11);
									} else {
										var14.b(var2, var3 + this.bb - var11, W);
									}
									
									var2 += var14.K;
									var5 = -1;
								} catch (Exception var12) {
									var12.printStackTrace();
								}
							} else {
								this.c(var8);
							}
							continue;
						}
						
						var7 = 174;
					}
				}
				
				if (var4 == -1) {
					if (this.Ab != null && var5 != -1) {
						var2 += this.Ab[(var5 << 8) + var7];
					}
					
					int var13 = this.gb[var7];
					var9 = this.Z[var7];
					if (var7 != 32) {
						if (W == 256) {
							if (Q != -1) {
								this.e(var7, var2 + this.S[var7] + 1, var3 + this.Cb[var7] + 1, var13, var9, Q);
							}
							
							this.f(var7, var2 + this.S[var7], var3 + this.Cb[var7], var13, var9, wb);
						} else {
							if (Q != -1) {
								this.b(var7, var2 + this.S[var7] + 1, var3 + this.Cb[var7] + 1, var13, var9, Q, W);
							}
							
							this.a(var7, var2 + this.S[var7], var3 + this.Cb[var7], var13, var9, wb, W);
						}
					} else if (Y > 0) {
						eb += Y;
						var2 += eb >> 8;
						eb &= 255;
					}
					
					int var10 = this.ints_vb[var7];
					if (V != -1) {
						oi.d(var2, var3 + (int) ((double) this.bb * 0.7D), var10, V);
					}
					
					if (nb != -1) {
						oi.d(var2, var3 + this.bb + 1, var10, nb);
					}
					
					var2 += var10;
					var5 = var7;
				}
			}
		}
		
	}
	
	private void c(ob var1, int var2) {
		int var3 = 0;
		boolean var4 = false;
		
		for (int var5 = 0; var5 < var1.a(false); ++var5) {
			int var6 = var1.a((int) 125, (int) var5);
			if (var6 == 60) {
				var4 = true;
			} else if (var6 == 62) {
				var4 = false;
			} else if (!var4 && var6 == 32) {
				++var3;
			}
		}
		
		if (var3 > 0) {
			Y = (var2 - this.b(var1) << 8) / var3;
		}
		
	}
	
	nh(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.S = var2;
		this.Cb = var3;
		this.gb = var4;
		this.Z = var5;
		this.a(var1);
		this.jb = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;
		
		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.Cb[var10] < var8 && this.Z[var10] != 0) {
				var8 = this.Cb[var10];
			}
			
			if (this.Cb[var10] + this.Z[var10] > var9) {
				var9 = this.Cb[var10] + this.Z[var10];
			}
		}
		
		this.pb = this.bb - var8;
		this.Db = var9 - this.bb;
	}
	
	nh(byte[] var1) {
		this.a(var1);
	}
}
