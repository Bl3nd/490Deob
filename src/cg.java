final class cg extends vd {
	
	private static float[] o;
	private static float[] p;
	private int q;
	private int r;
	private static boolean s = false;
	private static float[] t;
	private static float[] u;
	private static mh[] v;
	private static float[] w;
	private boolean x;
	private static int y;
	private int z;
	private int A;
	private static int[] B;
	private static int[] C;
	private static f[] D;
	static hd[] E;
	private static byte[] F;
	private float[] G;
	private int H;
	private static int I;
	private static float[] J;
	private static int K;
	private static int[] L;
	private static boolean[] M;
	private boolean N;
	private static vh[] O;
	private int P;
	private static float[] Q;
	private byte[][] R;
	private static int S;
	private byte[] T;
	private int U;
	private int V;
	
	private float[] d(int var1) {
		a(this.R[var1], 0);
		b();
		int var2 = f(ld.b(B.length - 1, 16));
		boolean var3 = M[var2];
		int var4 = var3 ? K : S;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = b() != 0;
			var6 = b() != 0;
		}
		
		int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (S >> 2);
			var9 = (var4 >> 2) + (S >> 2);
			var10 = S >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}
		
		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (S >> 2);
			var12 = var4 - (var4 >> 2) + (S >> 2);
			var13 = S >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}
		
		mh var14 = v[B[var2]];
		int var16 = var14.b;
		int var17 = var14.a[var16];
		boolean var15 = !D[var17].a();
		
		float[] var21;
		for (int var19 = 0; var19 < var14.c; ++var19) {
			vh var20 = O[var14.d[var19]];
			var21 = p;
			var20.a(var21, var4 >> 1, var15);
		}
		
		int var47;
		int var48;
		if (!var15) {
			var47 = var14.b;
			var48 = var14.a[var47];
			D[var48].a(p, var4 >> 1);
		}
		
		int var22;
		if (var15) {
			for (var47 = var4 >> 1; var47 < var4; ++var47) {
				p[var47] = 0.0F;
			}
		} else {
			var47 = var4 >> 1;
			var48 = var4 >> 2;
			var22 = var4 >> 3;
			float[] var23 = p;
			
			for (int var24 = 0; var24 < var47; ++var24) {
				var23[var24] *= 0.5F;
			}
			
			for (int var25 = var47; var25 < var4; ++var25) {
				var23[var25] = -var23[var4 - var25 - 1];
			}
			
			float[] var26 = var3 ? t : J;
			float[] var27 = var3 ? w : u;
			float[] var28 = var3 ? o : Q;
			int[] var29 = var3 ? C : L;
			
			float var32;
			float var33;
			float var34;
			for (int var30 = 0; var30 < var48; ++var30) {
				float var31 = var23[4 * var30] - var23[var4 - 4 * var30 - 1];
				var32 = var23[4 * var30 + 2] - var23[var4 - 4 * var30 - 3];
				var33 = var26[2 * var30];
				var34 = var26[2 * var30 + 1];
				var23[var4 - 4 * var30 - 1] = var31 * var33 - var32 * var34;
				var23[var4 - 4 * var30 - 3] = var31 * var34 + var32 * var33;
			}
			
			for (int var51 = 0; var51 < var22; ++var51) {
				var32 = var23[var47 + 3 + 4 * var51];
				var33 = var23[var47 + 1 + 4 * var51];
				var34 = var23[4 * var51 + 3];
				float var35 = var23[4 * var51 + 1];
				var23[var47 + 3 + 4 * var51] = var32 + var34;
				var23[var47 + 1 + 4 * var51] = var33 + var35;
				float var36 = var26[var47 - 4 - 4 * var51];
				float var37 = var26[var47 - 3 - 4 * var51];
				var23[4 * var51 + 3] = (var32 - var34) * var36 - (var33 - var35) * var37;
				var23[4 * var51 + 1] = (var33 - var35) * var36 + (var32 - var34) * var37;
			}
			
			int var52 = ld.b(var4 - 1, 16);
			
			int var38;
			int var39;
			int var40;
			float var41;
			float var42;
			float var43;
			float var44;
			float var45;
			int var54;
			int var55;
			int var56;
			int var57;
			for (int var53 = 0; var53 < var52 - 3; ++var53) {
				var54 = var4 >> var53 + 2;
				var55 = 8 << var53;
				
				for (var56 = 0; var56 < 2 << var53; ++var56) {
					var57 = var4 - var54 * 2 * var56;
					var38 = var4 - var54 * (2 * var56 + 1);
					
					for (var39 = 0; var39 < var4 >> var53 + 4; ++var39) {
						var40 = 4 * var39;
						var41 = var23[var57 - 1 - var40];
						var42 = var23[var57 - 3 - var40];
						var43 = var23[var38 - 1 - var40];
						var44 = var23[var38 - 3 - var40];
						var23[var57 - 1 - var40] = var41 + var43;
						var23[var57 - 3 - var40] = var42 + var44;
						var45 = var26[var39 * var55];
						float var46 = var26[var39 * var55 + 1];
						var23[var38 - 1 - var40] = (var41 - var43) * var45 - (var42 - var44) * var46;
						var23[var38 - 3 - var40] = (var42 - var44) * var45 + (var41 - var43) * var46;
					}
				}
			}
			
			float var58;
			for (var54 = 1; var54 < var22 - 1; ++var54) {
				var55 = var29[var54];
				if (var54 < var55) {
					var56 = 8 * var54;
					var57 = 8 * var55;
					var58 = var23[var56 + 1];
					var23[var56 + 1] = var23[var57 + 1];
					var23[var57 + 1] = var58;
					var58 = var23[var56 + 3];
					var23[var56 + 3] = var23[var57 + 3];
					var23[var57 + 3] = var58;
					var58 = var23[var56 + 5];
					var23[var56 + 5] = var23[var57 + 5];
					var23[var57 + 5] = var58;
					var58 = var23[var56 + 7];
					var23[var56 + 7] = var23[var57 + 7];
					var23[var57 + 7] = var58;
				}
			}
			
			for (var55 = 0; var55 < var47; ++var55) {
				var23[var55] = var23[2 * var55 + 1];
			}
			
			for (var56 = 0; var56 < var22; ++var56) {
				var23[var4 - 1 - 2 * var56] = var23[4 * var56];
				var23[var4 - 2 - 2 * var56] = var23[4 * var56 + 1];
				var23[var4 - var48 - 1 - 2 * var56] = var23[4 * var56 + 2];
				var23[var4 - var48 - 2 - 2 * var56] = var23[4 * var56 + 3];
			}
			
			for (var57 = 0; var57 < var22; ++var57) {
				var58 = var28[2 * var57];
				float var59 = var28[2 * var57 + 1];
				float var60 = var23[var47 + 2 * var57];
				var41 = var23[var47 + 2 * var57 + 1];
				var42 = var23[var4 - 2 - 2 * var57];
				var43 = var23[var4 - 1 - 2 * var57];
				var44 = var59 * (var60 - var42) + var58 * (var41 + var43);
				var23[var47 + 2 * var57] = (var60 + var42 + var44) * 0.5F;
				var23[var4 - 2 - 2 * var57] = (var60 + var42 - var44) * 0.5F;
				var44 = var59 * (var41 + var43) - var58 * (var60 - var42);
				var23[var47 + 2 * var57 + 1] = (var41 - var43 + var44) * 0.5F;
				var23[var4 - 1 - 2 * var57] = (-var41 + var43 + var44) * 0.5F;
			}
			
			for (var38 = 0; var38 < var48; ++var38) {
				var23[var38] = var23[2 * var38 + var47] * var27[2 * var38] + var23[2 * var38 + 1 + var47] * var27[2 * var38 + 1];
				var23[var47 - 1 - var38] = var23[2 * var38 + var47] * var27[2 * var38 + 1] - var23[2 * var38 + 1 + var47] * var27[2 * var38];
			}
			
			for (var39 = 0; var39 < var48; ++var39) {
				var23[var4 - var48 + var39] = -var23[var39];
			}
			
			for (var40 = 0; var40 < var48; ++var40) {
				var23[var40] = var23[var48 + var40];
			}
			
			for (int var61 = 0; var61 < var48; ++var61) {
				var23[var48 + var61] = -var23[var48 - var61 - 1];
			}
			
			for (int var62 = 0; var62 < var48; ++var62) {
				var23[var47 + var62] = var23[var4 - var62 - 1];
			}
			
			for (int var63 = var8; var63 < var9; ++var63) {
				var44 = (float) Math.sin(((double) (var63 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
				p[var63] *= (float) Math.sin(1.5707963267948966D * (double) var44 * (double) var44);
			}
			
			for (int var64 = var11; var64 < var12; ++var64) {
				var45 = (float) Math.sin(((double) (var64 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				p[var64] *= (float) Math.sin(1.5707963267948966D * (double) var45 * (double) var45);
			}
		}
		
		float[] var49 = null;
		if (this.H > 0) {
			var48 = this.H + var4 >> 2;
			var49 = new float[var48];
			int var50;
			if (!this.N) {
				for (var22 = 0; var22 < this.q; ++var22) {
					var50 = (this.H >> 1) + var22;
					var49[var22] += this.G[var50];
				}
			}
			
			if (!var15) {
				for (var22 = var8; var22 < var4 >> 1; ++var22) {
					var50 = var49.length - (var4 >> 1) + var22;
					var49[var50] += p[var22];
				}
			}
		}
		
		var21 = this.G;
		this.G = p;
		p = var21;
		this.H = var4;
		this.q = var12 - (var4 >> 1);
		this.N = var15;
		return var49;
	}
	
	public static void a() {
		F = null;
		E = null;
		D = null;
		O = null;
		v = null;
		M = null;
		B = null;
		p = null;
		J = null;
		u = null;
		Q = null;
		t = null;
		w = null;
		o = null;
		L = null;
		C = null;
	}
	
	static float e(int i) {
		int i1 = i & 2097151;
		int i2 = i & Integer.MIN_VALUE;
		int i3 = (i & 2145386496) >> 21;
		if (i2 != 0) {
			i1 = -i1;
		}
		
		return (float) ((double) i1 * Math.pow(2.0D, (double) (i3 - 788)));
	}
	
	final oa a(int[] ints) {
		if (ints != null && ints[0] <= 0) {
			return null;
		} else {
			if (this.T == null) {
				this.H = 0;
				this.G = new float[K];
				this.T = new byte[this.P];
				this.U = 0;
				this.V = 0;
			}
			
			for (; this.V < this.R.length; ++this.V) {
				if (ints != null && ints[0] <= 0) {
					return null;
				}
				
				float[] floats = this.d(this.V);
				if (floats != null) {
					int i = this.U;
					int length = floats.length;
					if (length > this.P - i) {
						length = this.P - i;
					}
					
					for (int i1 = 0; i1 < length; ++i1) {
						int i2 = (int) (128.0F + floats[i1] * 128.0F);
						if ((i2 & -256) != 0) {
							i2 = ~i2 >> 31;
						}
						
						this.T[i++] = (byte) (i2 - 128);
					}
					
					if (ints != null) {
						ints[0] -= i - this.U;
					}
					
					this.U = i;
				}
			}
			
			this.G = null;
			byte[] var7 = this.T;
			this.T = null;
			return new oa(this.z, var7, this.A, this.r, this.x);
		}
	}
	
	private static void a(byte[] bytes, int unused) {
		F = bytes;
		y = 0;
		I = 0;
	}
	
	static cg a(pe pe, int i, int i1) {
		if (!a(pe)) {
			pe.b((byte) 123, i, i1);
			return null;
		} else {
			byte[] bytes = pe.a((byte) -124, i1, i);
			return bytes == null ? null : new cg(bytes);
		}
	}
	
	static int b() {
		int i = F[y] >> I & 1;
		++I;
		y += I >> 3;
		I &= 7;
		return i;
	}
	
	static int f(int var0) {
		int var1 = 0;
		int var2;
		int var3;
		for (var2 = 0; var0 >= 8 - I; var0 -= var3) {
			var3 = 8 - I;
			int var4 = (1 << var3) - 1;
			var1 += (F[y] >> I & var4) << var2;
			I = 0;
			++y;
			var2 += var3;
		}
		
		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += (F[y] >> I & var3) << var2;
			I += var0;
		}
		
		return var1;
	}
	
	private static boolean a(pe var0) {
		if (!s) {
			byte[] var1 = var0.a((byte) -105, 0, 0);
			if (var1 == null) {
				return false;
			}
			
			b(var1);
			s = true;
		}
		
		return true;
	}
	
	private void a(byte[] var1) {
		og var2 = new og(var1);
		this.z = var2.readInt(1029109968);
		this.P = var2.readInt(1029109968);
		this.A = var2.readInt(1029109968);
		this.r = var2.readInt(1029109968);
		if (this.r < 0) {
			this.r = ~this.r;
			this.x = true;
		}
		
		int var3 = var2.readInt(1029109968);
		this.R = new byte[var3][];
		
		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;
			
			int var6;
			do {
				var6 = var2.readUnsignedByte(255);
				var5 += var6;
			} while (var6 >= 255);
			
			byte[] var7 = new byte[var5];
			var2.readBytes(var5, 0, 91, var7);
			this.R[var4] = var7;
		}
		
	}
	
	private static void b(byte[] var0) {
		a(var0, 0);
		S = 1 << f(4);
		K = 1 << f(4);
		p = new float[K];
		
		int var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var9;
		int var11;
		int var13;
		for (int var1 = 0; var1 < 2; ++var1) {
			var2 = var1 != 0 ? K : S;
			var3 = var2 >> 1;
			var4 = var2 >> 2;
			var5 = var2 >> 3;
			float[] var6 = new float[var3];
			
			for (var7 = 0; var7 < var4; ++var7) {
				var6[2 * var7] = (float) Math.cos((double) (4 * var7) * 3.141592653589793D / (double) var2);
				var6[2 * var7 + 1] = -((float) Math.sin((double) (4 * var7) * 3.141592653589793D / (double) var2));
			}
			
			float[] var8 = new float[var3];
			
			for (var9 = 0; var9 < var4; ++var9) {
				var8[2 * var9] = (float) Math.cos((double) (2 * var9 + 1) * 3.141592653589793D / (double) (2 * var2));
				var8[2 * var9 + 1] = (float) Math.sin((double) (2 * var9 + 1) * 3.141592653589793D / (double) (2 * var2));
			}
			
			float[] var10 = new float[var4];
			
			for (var11 = 0; var11 < var5; ++var11) {
				var10[2 * var11] = (float) Math.cos((double) (4 * var11 + 2) * 3.141592653589793D / (double) var2);
				var10[2 * var11 + 1] = -((float) Math.sin((double) (4 * var11 + 2) * 3.141592653589793D / (double) var2));
			}
			
			int[] var12 = new int[var5];
			var13 = ld.b(var5 - 1, 16);
			
			for (int var14 = 0; var14 < var5; ++var14) {
				var12[var14] = sh.a(var13, var14, 1);
			}
			
			if (var1 != 0) {
				t = var6;
				w = var8;
				o = var10;
				C = var12;
			} else {
				J = var6;
				u = var8;
				Q = var10;
				L = var12;
			}
		}
		
		var2 = f(8) + 1;
		E = new hd[var2];
		
		for (var3 = 0; var3 < var2; ++var3) {
			E[var3] = new hd();
		}
		
		var4 = f(6) + 1;
		
		for (var5 = 0; var5 < var4; ++var5) {
			f(16);
		}
		
		int var15 = f(6) + 1;
		D = new f[var15];
		
		for (var7 = 0; var7 < var15; ++var7) {
			D[var7] = new f();
		}
		
		int var16 = f(6) + 1;
		O = new vh[var16];
		
		for (var9 = 0; var9 < var16; ++var9) {
			O[var9] = new vh();
		}
		
		int var17 = f(6) + 1;
		v = new mh[var17];
		
		for (var11 = 0; var11 < var17; ++var11) {
			v[var11] = new mh();
		}
		
		int var18 = f(6) + 1;
		M = new boolean[var18];
		B = new int[var18];
		
		for (var13 = 0; var13 < var18; ++var13) {
			M[var13] = b() != 0;
			f(16);
			f(16);
			B[var13] = f(8);
		}
		
	}
	
	private cg(byte[] var1) {
		this.a(var1);
	}
}
