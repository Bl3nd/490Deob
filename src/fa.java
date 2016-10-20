final class fa extends oi {
	
	int K;
	int L;
	int M;
	int N;
	int[] O;
	int P;
	int Q;
	byte[] R;
	
	private static void a(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = -(var6 >> 2);
		var6 = -(var6 & 3);
		
		for (int var11 = -var7; var11 < 0; ++var11) {
			byte var14;
			for (int var12 = var10; var12 < 0; ++var12) {
				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}
				
				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}
				
				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}
				
				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}
			}
			
			for (int var13 = var6; var13 < 0; ++var13) {
				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}
			}
			
			var5 += var8;
			var4 += var9;
		}
		
	}
	
	final void b(int var1, int var2, int var3) {
		var1 += this.P;
		var2 += this.L;
		int var4 = var1 + var2 * oi.E;
		int var5 = 0;
		int var6 = this.N;
		int var7 = this.Q;
		int var8 = oi.E - var7;
		int var9 = 0;
		int var10;
		if (var2 < oi.F) {
			var10 = oi.F - var2;
			var6 -= var10;
			var2 = oi.F;
			var5 += var10 * var7;
			var4 += var10 * oi.E;
		}
		
		if (var2 + var6 > oi.I) {
			var6 -= var2 + var6 - oi.I;
		}
		
		if (var1 < oi.J) {
			var10 = oi.J - var1;
			var7 -= var10;
			var1 = oi.J;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}
		
		if (var1 + var7 > oi.G) {
			var10 = var1 + var7 - oi.G;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}
		
		if (var7 > 0 && var6 > 0) {
			b(oi.D, this.R, this.O, var5, var4, var7, var6, var8, var9, var3);
		}
	}
	
	final void b(int i, int i1) {
		i += this.P;
		i1 += this.L;
		int i2 = i + i1 * oi.E;
		int i3 = 0;
		int n = this.N;
		int q = this.Q;
		int i4 = oi.E - q;
		int i5 = 0;
		int i6;
		if (i1 < oi.F) {
			i6 = oi.F - i1;
			n -= i6;
			i1 = oi.F;
			i3 += i6 * q;
			i2 += i6 * oi.E;
		}
		
		if (i1 + n > oi.I) {
			n -= i1 + n - oi.I;
		}
		
		if (i < oi.J) {
			i6 = oi.J - i;
			q -= i6;
			i = oi.J;
			i3 += i6;
			i2 += i6;
			i5 += i6;
			i4 += i6;
		}
		
		if (i + q > oi.G) {
			i6 = i + q - oi.G;
			q -= i6;
			i5 += i6;
			i4 += i6;
		}
		
		if (q > 0 && n > 0) {
			a(oi.D, this.R, this.O, 0, i3, i2, q, n, i4, i5);
		}
	}
	
	final void d() {
		if (this.Q != this.K || this.N != this.M) {
			byte[] var1 = new byte[this.K * this.M];
			int var2 = 0;
			
			for (int var3 = 0; var3 < this.N; ++var3) {
				for (int var4 = 0; var4 < this.Q; ++var4) {
					var1[var4 + this.P + (var3 + this.L) * this.K] = this.R[var2++];
				}
			}
			
			this.R = var1;
			this.Q = this.K;
			this.N = this.M;
			this.P = 0;
			this.L = 0;
		}
	}
	
	private static final void b(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;
		
		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				byte var13 = var1[var3++];
				if (var13 != 0) {
					int var15 = var2[var13 & 255];
					int var14 = var0[var4];
					var0[var4++] = ((var15 & 16711935) * var9 + (var14 & 16711935) * var10 & -16711936) + ((var15 & '\uff00') * var9 + (var14 & '\uff00') * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}
			
			var4 += var7;
			var3 += var8;
		}
		
	}
	
	final void c(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.O.length; ++var4) {
			int var5 = this.O[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}
			
			int var6 = this.O[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			
			int var7 = this.O[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			
			this.O[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}
}
