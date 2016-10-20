class oi extends rg {
	
	static int[] D;
	static int E;
	static int F = 0;
	static int G = 0;
	static int H;
	static int I = 0;
	static int J = 0;
	
	static void b(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}
		
		if (var1 < 0) {
			var1 = 0;
		}
		
		if (var2 > E) {
			var2 = E;
		}
		
		if (var3 > H) {
			var3 = H;
		}
		
		J = var0;
		F = var1;
		G = var2;
		I = var3;
	}
	
	static void a(int var0, int var1, int var2, int var3, int color) {
		d(var0, var1, var2, color);
		d(var0, var1 + var3 - 1, var2, color);
		c(var0, var1, var3, color);
		c(var0 + var2 - 1, var1, var3, color);
	}
	
	static void c(int var0, int var1, int var2, int var3) {
		if (var0 >= J && var0 < G) {
			if (var1 < F) {
				var2 -= F - var1;
				var1 = F;
			}
			
			if (var1 + var2 > I) {
				var2 = I - var1;
			}
			
			int var4 = var0 + var1 * E;
			
			for (int var5 = 0; var5 < var2; ++var5) {
				D[var4 + var5 * E] = var3;
			}
			
		}
	}
	
	static void a(int[] var0) {
		J = var0[0];
		F = var0[1];
		G = var0[2];
		I = var0[3];
	}
	
	static void b(int[] var0) {
		var0[0] = J;
		var0[1] = F;
		var0[2] = G;
		var0[3] = I;
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		e(var0, var1, var2, var4, var5);
		e(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			c(var0, var1 + 1, var3 - 2, var4, var5);
			c(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}
		
	}
	
	static void a() {
		int var0 = 0;
		
		int var1;
		for (var1 = E * H - 7; var0 < var1; D[var0++] = 0) {
			D[var0++] = 0;
			D[var0++] = 0;
			D[var0++] = 0;
			D[var0++] = 0;
			D[var0++] = 0;
			D[var0++] = 0;
			D[var0++] = 0;
		}
		
		for (var1 += 7; var0 < var1; D[var0++] = 0) {
			;
		}
		
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				d(var0, var1, var2 + 1, var4);
			} else {
				d(var0 + var2, var1, -var2 + 1, var4);
			}
		} else if (var2 == 0) {
			if (var3 >= 0) {
				c(var0, var1, var3 + 1, var4);
			} else {
				c(var0, var1 + var3, -var3 + 1, var4);
			}
		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}
			
			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '耀';
				var3 <<= 16;
				var5 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
				var2 += var0;
				if (var0 < J) {
					var1 += var5 * (J - var0);
					var0 = J;
				}
				
				if (var2 >= G) {
					var2 = G - 1;
				}
				
				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= F && var6 < I) {
						D[var0 + var6 * E] = var4;
					}
					
					var1 += var5;
					++var0;
				}
				
			} else {
				var0 <<= 16;
				var0 += '耀';
				var2 <<= 16;
				var5 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
				var3 += var1;
				if (var1 < F) {
					var0 += var5 * (F - var1);
					var1 = F;
				}
				
				if (var3 >= I) {
					var3 = I - 1;
				}
				
				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= J && var6 < G) {
						D[var6 + var1 * E] = var4;
					}
					
					var0 += var5;
					++var1;
				}
				
			}
		}
	}
	
	public static void b() {
		D = null;
	}
	
	private static void c(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= J && var0 < G) {
			if (var1 < F) {
				var2 -= F - var1;
				var1 = F;
			}
			
			if (var1 + var2 > I) {
				var2 = I - var1;
			}
			
			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * E;
			
			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (D[var12] >> 16 & 255) * var5;
				int var10 = (D[var12] >> 8 & 255) * var5;
				int var11 = (D[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				D[var12] = var14;
				var12 += E;
			}
			
		}
	}
	
	static void d(int i, int i1, int i2, int i3, int var4) {
		if (i < J) {
			i2 -= J - i;
			i = J;
		}
		
		if (i1 < F) {
			i3 -= F - i1;
			i1 = F;
		}
		
		if (i + i2 > G) {
			i2 = G - i;
		}
		
		if (i1 + i3 > I) {
			i3 = I - i1;
		}
		
		int var5 = E - i2;
		int var6 = i + i1 * E;
		
		for (int var7 = -i3; var7 < 0; ++var7) {
			for (int var8 = -i2; var8 < 0; ++var8) {
				D[var6++] = var4;
			}
			
			var6 += var5;
		}
		
	}
	
	static void a(int[] var0, int var1, int var2) {
		D = var0;
		E = var1;
		H = var2;
		b(0, 0, var1, var2);
	}
	
	static void d(int var0, int var1, int var2, int var3) {
		if (var1 >= F && var1 < I) {
			if (var0 < J) {
				var2 -= J - var0;
				var0 = J;
			}
			
			if (var0 + var2 > G) {
				var2 = G - var0;
			}
			
			int var4 = var0 + var1 * E;
			
			for (int var5 = 0; var5 < var2; ++var5) {
				D[var4 + var5] = var3;
			}
			
		}
	}
	
	static void c(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < J) {
			var2 -= J - var0;
			var0 = J;
		}
		
		if (var1 < F) {
			var3 -= F - var1;
			var1 = F;
		}
		
		if (var0 + var2 > G) {
			var2 = G - var0;
		}
		
		if (var1 + var3 > I) {
			var3 = I - var1;
		}
		
		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
		int var6 = 256 - var5;
		int var7 = E - var2;
		int var8 = var0 + var1 * E;
		
		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = -var2; var10 < 0; ++var10) {
				int var11 = D[var8];
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
				D[var8++] = var4 + var11;
			}
			
			var8 += var7;
		}
		
	}
	
	private static void e(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= F && var1 < I) {
			if (var0 < J) {
				var2 -= J - var0;
				var0 = J;
			}
			
			if (var0 + var2 > G) {
				var2 = G - var0;
			}
			
			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * E;
			
			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (D[var12] >> 16 & 255) * var5;
				int var10 = (D[var12] >> 8 & 255) * var5;
				int var11 = (D[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				D[var12++] = var14;
			}
			
		}
	}
	
	static void d(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = 0;
		int var7 = 65536 / var3;
		if (var0 < J) {
			var2 -= J - var0;
			var0 = J;
		}
		
		if (var1 < F) {
			var6 += (F - var1) * var7;
			var3 -= F - var1;
			var1 = F;
		}
		
		if (var0 + var2 > G) {
			var2 = G - var0;
		}
		
		if (var1 + var3 > I) {
			var3 = I - var1;
		}
		
		int var8 = E - var2;
		int var9 = var0 + var1 * E;
		
		for (int var10 = -var3; var10 < 0; ++var10) {
			int var11 = 65536 - var6 >> 8;
			int var12 = var6 >> 8;
			int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;
			
			for (int var14 = -var2; var14 < 0; ++var14) {
				D[var9++] = var13;
			}
			
			var9 += var8;
			var6 += var7;
		}
		
	}
	
	static void c() {
		J = 0;
		F = 0;
		G = E;
		I = H;
	}
	
	static void e(int var0, int var1, int var2, int var3) {
		if (J < var0) {
			J = var0;
		}
		
		if (F < var1) {
			F = var1;
		}
		
		if (G > var2) {
			G = var2;
		}
		
		if (I > var3) {
			I = var3;
		}
		
	}
	
	static void a(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * E;
		
		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];
			
			for (var0 = -var4[var1]; var0 < 0; ++var0) {
				D[var6++] = var2;
			}
			
			var5 += E;
		}
		
	}
}
