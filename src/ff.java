final class ff extends aa {
	
	private int O;
	static int P = 0;
	static ob Q = rf.a(40, "<col=ffffff>");
	static int R;
	private int S;
	static ob loadedFonts2;
	private int U = -32768;
	private int V;
	static boolean W;
	private int X;
	private int Y;
	static v Z;
	static int ab;
	static volatile int bb = -1;
	private static ob loadedFonts = rf.a(40, "Loaded fonts");
	static long db;
	static int[] eb;
	static long[] fb;
	static int gb;
	static int hb;
	private int ib;
	private int jb;
	static kc[] kb;
	private int lb;
	private ce mb;
	static byte[][][] nb;
	static int ob;
	static int pb;
	
	final int b() {
		try {
			++ob;
			return this.U;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ff.C(" + ')');
		}
	}
	
	private aa a(boolean var1) {
		int var14 = client.anInt_wb;
		
		try {
			++pb;
			fc var2 = rf.b(-14098, this.V);
			if (var2.J != null) {
				var2 = var2.e((byte) -3);
			}
			
			if (var2 == null) {
				return null;
			} else {
				int var3;
				int var4;
				int var5;
				int var6;
				if (this.mb != null) {
					label108:
					{
						var3 = -this.Y + bi.f;
						if (~var3 < -101) {
							if (this.mb.U > 0) {
								var4 = -this.mb.U + this.mb.Z.length;
								if (var14 != 0) {
									var3 -= this.mb.W[this.X];
									++this.X;
								}
								
								while (~var4 < ~this.X && var3 > this.mb.W[this.X]) {
									var3 -= this.mb.W[this.X];
									++this.X;
								}
								
								if (~this.X <= ~var4) {
									var5 = 0;
									var6 = var4;
									if (var14 != 0 || var4 < this.mb.Z.length) {
										do {
											var5 += this.mb.W[var6];
											++var6;
										} while (var6 < this.mb.Z.length);
									}
									
									var3 %= var5;
									if (var14 == 0 && ~this.mb.W[this.X] <= ~var3) {
										break label108;
									}
								} else if (~this.mb.W[this.X] <= ~var3) {
									break label108;
								}
							} else if (~this.mb.W[this.X] <= ~var3) {
								break label108;
							}
						} else if (~this.mb.W[this.X] <= ~var3) {
							break label108;
						}
						
						do {
							var3 -= this.mb.W[this.X];
							++this.X;
							if (~this.X <= ~this.mb.Z.length) {
								this.X -= this.mb.U;
								if (~this.X <= -1) {
									if (~this.X <= ~this.mb.Z.length) {
										this.mb = null;
										if (var14 == 0) {
											break;
										}
									}
								} else {
									this.mb = null;
									if (var14 == 0) {
										break;
									}
								}
							}
						} while (~this.mb.W[this.X] > ~var3);
					}
					
					this.Y = bi.f + -var3;
				}
				
				label124:
				{
					if (~this.jb == -2 || ~this.jb == -4) {
						var3 = var2.Gb;
						var4 = var2.Mb;
						if (var14 == 0) {
							break label124;
						}
					}
					
					var3 = var2.Mb;
					var4 = var2.Gb;
				}
				
				var5 = this.lb + (var3 >> 1);
				var6 = (1 + var3 >> 1) + this.lb;
				int[][] var9 = d.D[this.O];
				int var7 = (var4 >> 1) + this.S;
				int var8 = (var4 - -1 >> 1) + this.S;
				int var11 = (var3 << 6) + (this.lb << 7);
				if (!var1) {
					this.a(true);
				}
				
				int var10 = var9[var6][var8] + var9[var5][var8] + var9[var5][var7] + var9[var6][var7] >> 2;
				int var12 = (this.S << 7) + (var4 << 6);
				qb var13;
				if (this.mb != null) {
					var13 = var2.a(var12, this.jb, this.X, var11, var9, var10, this.ib, (byte) 49, this.mb);
					if (var14 == 0) {
						return var13 == null ? null : var13.E;
					}
				}
				
				var13 = var2.a(var11, this.ib, false, this.jb, var10, -9, var12, var9);
				return var13 == null ? null : var13.E;
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "ff.D(" + var1 + ')');
		}
	}
	
	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		try {
			++hb;
			aa var11 = this.a(true);
			if (var11 != null) {
				var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
				this.U = var11.b();
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "ff.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	public static void b(boolean var0) {
		try {
			Z = null;
			if (var0) {
				eb = null;
				kb = null;
				loadedFonts2 = null;
				Q = null;
				nb = null;
				loadedFonts = null;
				fb = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ff.E(" + var0 + ')');
		}
	}
	
	ff(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, aa var9) {
		try {
			this.S = var6;
			this.V = var1;
			this.lb = var5;
			this.O = var4;
			this.ib = var2;
			this.jb = var3;
			if (~var7 != 0) {
				this.mb = le.c(15619, var7);
				this.Y = bi.f + -1;
				this.X = 0;
				if (~this.mb.T == -1 && var9 != null && var9 instanceof ff) {
					ff var10 = (ff) var9;
					if (var10.mb == this.mb) {
						this.Y = var10.Y;
						this.X = var10.X;
						return;
					}
				}
				
				if (var8 && ~this.mb.U != 0) {
					this.X = (int) ((double) this.mb.Z.length * Math.random());
					this.Y -= (int) ((double) this.mb.W[this.X] * Math.random());
					return;
				}
			}
			
		} catch (RuntimeException var11) {
			throw bc.a(var11, "ff.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + (var9 != null ? "{...}" : "null") + ')');
		}
	}
	
	static int b(int var0, int var1) {
		try {
			return var0 | var1;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ff.A(" + var0 + ',' + var1 + ')');
		}
	}
	
	static {
		loadedFonts2 = loadedFonts;
		eb = new int[32];
		db = 0L;
		ab = 0;
		R = 0;
		fb = new long[100];
	}
}
