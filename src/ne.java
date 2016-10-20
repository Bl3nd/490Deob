import java.util.Random;

final class ne {
	
	private int[] a = new int[5];
	private j b;
	private int c = 0;
	private we d;
	private int[] e = new int[5];
	private j f;
	int g = 0;
	private static int[] h;
	private int i = 100;
	private j j;
	private static int[] k = new int['耀'];
	private j l;
	private j m;
	private j n;
	private int[] o = new int[5];
	private j j_p;
	private static int[] q;
	int r = 500;
	private j s;
	private j t;
	private static int[] u;
	private static int[] v;
	private static int[] w;
	private static int[] x;
	private static int[] y;
	
	final void a(og var1) {
		this.n = new j();
		this.n.a(var1);
		this.t = new j();
		this.t.a(var1);
		int var2 = var1.readUnsignedByte(255);
		if (var2 != 0) {
			--var1.pointer;
			this.j = new j();
			this.j.a(var1);
			this.l = new j();
			this.l.a(var1);
		}
		
		var2 = var1.readUnsignedByte(255);
		if (var2 != 0) {
			--var1.pointer;
			this.m = new j();
			this.m.a(var1);
			this.f = new j();
			this.f.a(var1);
		}
		
		var2 = var1.readUnsignedByte(255);
		if (var2 != 0) {
			--var1.pointer;
			this.b = new j();
			this.b.a(var1);
			this.s = new j();
			this.s.a(var1);
		}
		
		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.r(-2);
			if (var4 == 0) {
				break;
			}
			
			this.a[var3] = var4;
			this.e[var3] = var1.e((byte) 114);
			this.o[var3] = var1.r(-2);
		}
		
		this.c = var1.r(-2);
		this.i = var1.r(-2);
		this.r = var1.readShort(122);
		this.g = var1.readShort(97);
		this.d = new we();
		this.j_p = new j();
		this.d.a(var1, this.j_p);
	}
	
	public static void a() {
		q = null;
		k = null;
		h = null;
		v = null;
		w = null;
		x = null;
		y = null;
		u = null;
	}
	
	final int[] a(int var1, int var2) {
		p.a(q, 0, var1);
		if (var2 < 10) {
			return q;
		} else {
			double var3 = (double) var1 / ((double) var2 + 0.0D);
			this.n.a();
			this.t.a();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.j != null) {
				this.j.a();
				this.l.a();
				var5 = (int) ((double) (this.j.f - this.j.b) * 32.768D / var3);
				var6 = (int) ((double) this.j.b * 32.768D / var3);
			}
			
			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.m != null) {
				this.m.a();
				this.f.a();
				var8 = (int) ((double) (this.m.f - this.m.b) * 32.768D / var3);
				var9 = (int) ((double) this.m.b * 32.768D / var3);
			}
			
			for (int var11 = 0; var11 < 5; ++var11) {
				if (this.a[var11] != 0) {
					v[var11] = 0;
					w[var11] = (int) ((double) this.o[var11] * var3);
					x[var11] = (this.a[var11] << 14) / 100;
					y[var11] = (int) ((double) (this.n.f - this.n.b) * 32.768D * Math.pow(1.0057929410678534D, (double) this.e[var11]) / var3);
					u[var11] = (int) ((double) this.n.b * 32.768D / var3);
				}
			}
			
			int var13;
			int var14;
			int var15;
			int var16;
			for (int var12 = 0; var12 < var1; ++var12) {
				var13 = this.n.a(var1);
				var14 = this.t.a(var1);
				if (this.j != null) {
					var15 = this.j.a(var1);
					var16 = this.l.a(var1);
					var13 += this.a(var7, var16, this.j.e) >> 1;
					var7 += (var15 * var5 >> 16) + var6;
				}
				
				if (this.m != null) {
					var15 = this.m.a(var1);
					var16 = this.f.a(var1);
					var14 = var14 * ((this.a(var10, var16, this.m.e) >> 1) + '耀') >> 15;
					var10 += (var15 * var8 >> 16) + var9;
				}
				
				for (var15 = 0; var15 < 5; ++var15) {
					if (this.a[var15] != 0) {
						var16 = var12 + w[var15];
						if (var16 < var1) {
							q[var16] += this.a(v[var15], var14 * x[var15] >> 15, this.n.e);
							v[var15] += (var13 * y[var15] >> 16) + u[var15];
						}
					}
				}
			}
			
			int var17;
			int var18;
			if (this.b != null) {
				this.b.a();
				this.s.a();
				var13 = 0;
				boolean var21 = false;
				boolean var22 = true;
				
				for (var16 = 0; var16 < var1; ++var16) {
					var17 = this.b.a(var1);
					var18 = this.s.a(var1);
					if (var22) {
						var14 = this.b.b + ((this.b.f - this.b.b) * var17 >> 8);
					} else {
						var14 = this.b.b + ((this.b.f - this.b.b) * var18 >> 8);
					}
					
					var13 += 256;
					if (var13 >= var14) {
						var13 = 0;
						var22 = !var22;
					}
					
					if (var22) {
						q[var16] = 0;
					}
				}
			}
			
			if (this.c > 0 && this.i > 0) {
				var13 = (int) ((double) this.c * var3);
				
				for (var14 = var13; var14 < var1; ++var14) {
					q[var14] += q[var14 - var13] * this.i / 100;
				}
			}
			
			if (this.d.a[0] > 0 || this.d.a[1] > 0) {
				this.j_p.a();
				var13 = this.j_p.a(var1 + 1);
				var14 = this.d.a(0, (float) var13 / 65536.0F);
				var15 = this.d.a(1, (float) var13 / 65536.0F);
				if (var1 >= var14 + var15) {
					var16 = 0;
					var17 = var15;
					if (var15 > var1 - var14) {
						var17 = var1 - var14;
					}
					
					int var19;
					int var20;
					while (var16 < var17) {
						var18 = (int) ((long) q[var16 + var14] * (long) we.h >> 16);
						
						for (var19 = 0; var19 < var14; ++var19) {
							var18 += (int) ((long) q[var16 + var14 - 1 - var19] * (long) we.f[0][var19] >> 16);
						}
						
						for (var20 = 0; var20 < var16; ++var20) {
							var18 -= (int) ((long) q[var16 - 1 - var20] * (long) we.f[1][var20] >> 16);
						}
						
						q[var16] = var18;
						var13 = this.j_p.a(var1 + 1);
						++var16;
					}
					
					var17 = 128;
					
					while (true) {
						if (var17 > var1 - var14) {
							var17 = var1 - var14;
						}
						
						while (var16 < var17) {
							var18 = (int) ((long) q[var16 + var14] * (long) we.h >> 16);
							
							for (var19 = 0; var19 < var14; ++var19) {
								var18 += (int) ((long) q[var16 + var14 - 1 - var19] * (long) we.f[0][var19] >> 16);
							}
							
							for (var20 = 0; var20 < var15; ++var20) {
								var18 -= (int) ((long) q[var16 - 1 - var20] * (long) we.f[1][var20] >> 16);
							}
							
							q[var16] = var18;
							var13 = this.j_p.a(var1 + 1);
							++var16;
						}
						
						if (var16 >= var1 - var14) {
							while (var16 < var1) {
								var18 = 0;
								
								for (var19 = var16 + var14 - var1; var19 < var14; ++var19) {
									var18 += (int) ((long) q[var16 + var14 - 1 - var19] * (long) we.f[0][var19] >> 16);
								}
								
								for (var20 = 0; var20 < var15; ++var20) {
									var18 -= (int) ((long) q[var16 - 1 - var20] * (long) we.f[1][var20] >> 16);
								}
								
								q[var16] = var18;
								this.j_p.a(var1 + 1);
								++var16;
							}
							break;
						}
						
						var14 = this.d.a(0, (float) var13 / 65536.0F);
						var15 = this.d.a(1, (float) var13 / 65536.0F);
						var17 += 128;
					}
				}
			}
			
			for (var13 = 0; var13 < var1; ++var13) {
				if (q[var13] < -32768) {
					q[var13] = -32768;
				}
				
				if (q[var13] > 32767) {
					q[var13] = 32767;
				}
			}
			
			return q;
		}
	}
	
	private int a(int var1, int var2, int var3) {
		return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2) : (var3 == 2 ? h[var1 & 32767] * var2 >> 14 : (var3 == 3 ? ((var1 & 32767) * var2 >> 14) - var2 : (var3 == 4 ? k[var1 / 2607 & 32767] * var2 : 0)));
	}
	
	static {
		Random var0 = new Random(0L);
		
		for (int var1 = 0; var1 < '耀'; ++var1) {
			k[var1] = (var0.nextInt() & 2) - 1;
		}
		
		h = new int['耀'];
		
		for (int var2 = 0; var2 < '耀'; ++var2) {
			h[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}
		
		q = new int[220500];
		u = new int[5];
		v = new int[5];
		w = new int[5];
		x = new int[5];
		y = new int[5];
	}
}
