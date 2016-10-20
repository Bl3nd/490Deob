final class rb {
	
	private static vb a = new vb();
	
	private static void a(vb var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.h = 1;
		if (hh.O == null) {
			hh.O = new int[var0.h * 100000];
		}
		
		boolean var26 = true;
		
		while (true) {
			while (var26) {
				byte var1 = c(var0);
				if (var1 == 23) {
					return;
				}
				
				var1 = c(var0);
				var1 = c(var0);
				var1 = c(var0);
				var1 = c(var0);
				var1 = c(var0);
				var1 = c(var0);
				var1 = c(var0);
				var1 = c(var0);
				var1 = c(var0);
				var1 = e(var0);
				var0.w = 0;
				var1 = c(var0);
				var0.w = var0.w << 8 | var1 & 255;
				var1 = c(var0);
				var0.w = var0.w << 8 | var1 & 255;
				var1 = c(var0);
				var0.w = var0.w << 8 | var1 & 255;
				
				int var41;
				for (var41 = 0; var41 < 16; ++var41) {
					var1 = e(var0);
					if (var1 == 1) {
						var0.r[var41] = true;
					} else {
						var0.r[var41] = false;
					}
				}
				
				for (var41 = 0; var41 < 256; ++var41) {
					var0.k[var41] = false;
				}
				
				int var42;
				for (var41 = 0; var41 < 16; ++var41) {
					if (var0.r[var41]) {
						for (var42 = 0; var42 < 16; ++var42) {
							var1 = e(var0);
							if (var1 == 1) {
								var0.k[var41 * 16 + var42] = true;
							}
						}
					}
				}
				
				d(var0);
				int var44 = var0.s + 2;
				int var45 = a(3, var0);
				int var46 = a(15, var0);
				
				for (var41 = 0; var41 < var46; ++var41) {
					var42 = 0;
					
					while (true) {
						var1 = e(var0);
						if (var1 == 0) {
							var0.y[var41] = (byte) var42;
							break;
						}
						
						++var42;
					}
				}
				
				byte[] var27 = new byte[6];
				
				byte var29;
				for (var29 = 0; var29 < var45; var27[var29] = var29++) {
					;
				}
				
				for (var41 = 0; var41 < var46; ++var41) {
					var29 = var0.y[var41];
					
					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}
					
					var27[0] = var28;
					var0.i[var41] = var28;
				}
				
				int var43;
				for (var43 = 0; var43 < var45; ++var43) {
					int var55 = a(5, var0);
					
					for (var41 = 0; var41 < var44; ++var41) {
						while (true) {
							var1 = e(var0);
							if (var1 == 0) {
								var0.J[var43][var41] = (byte) var55;
								break;
							}
							
							var1 = e(var0);
							if (var1 == 0) {
								++var55;
							} else {
								--var55;
							}
						}
					}
				}
				
				for (var43 = 0; var43 < var45; ++var43) {
					byte var2 = 32;
					byte var3 = 0;
					
					for (var41 = 0; var41 < var44; ++var41) {
						if (var0.J[var43][var41] > var3) {
							var3 = var0.J[var43][var41];
						}
						
						if (var0.J[var43][var41] < var2) {
							var2 = var0.J[var43][var41];
						}
					}
					
					a(var0.e[var43], var0.F[var43], var0.A[var43], var0.J[var43], var2, var3, var44);
					var0.c[var43] = var2;
				}
				
				int var47 = var0.s + 1;
				int var48 = -1;
				byte var49 = 0;
				
				for (var41 = 0; var41 <= 255; ++var41) {
					var0.P[var41] = 0;
				}
				
				int var32 = 4095;
				
				for (int var30 = 15; var30 >= 0; --var30) {
					for (int var31 = 15; var31 >= 0; --var31) {
						var0.d[var32] = (byte) (var30 * 16 + var31);
						--var32;
					}
					
					var0.o[var30] = var32 + 1;
				}
				
				int var52 = 0;
				byte var59;
				if (var49 == 0) {
					++var48;
					var49 = 50;
					var59 = var0.i[var48];
					var22 = var0.c[var59];
					var23 = var0.e[var59];
					var25 = var0.A[var59];
					var24 = var0.F[var59];
				}
				
				int var50 = var49 - 1;
				int var56 = var22;
				
				int var57;
				byte var58;
				for (var57 = a(var22, var0); var57 > var23[var56]; var57 = var57 << 1 | var58) {
					++var56;
					var58 = e(var0);
				}
				
				int var51 = var25[var57 - var24[var56]];
				
				while (true) {
					while (var51 != var47) {
						if (var51 != 0 && var51 != 1) {
							int var39 = var51 - 1;
							int var36;
							if (var39 < 16) {
								var36 = var0.o[0];
								
								for (var1 = var0.d[var36 + var39]; var39 > 3; var39 -= 4) {
									int var40 = var36 + var39;
									var0.d[var40] = var0.d[var40 - 1];
									var0.d[var40 - 1] = var0.d[var40 - 2];
									var0.d[var40 - 2] = var0.d[var40 - 3];
									var0.d[var40 - 3] = var0.d[var40 - 4];
								}
								
								while (var39 > 0) {
									var0.d[var36 + var39] = var0.d[var36 + var39 - 1];
									--var39;
								}
								
								var0.d[var36] = var1;
							} else {
								int var37 = var39 / 16;
								int var38 = var39 % 16;
								var36 = var0.o[var37] + var38;
								
								for (var1 = var0.d[var36]; var36 > var0.o[var37]; --var36) {
									var0.d[var36] = var0.d[var36 - 1];
								}
								
								++var0.o[var37];
								
								while (var37 > 0) {
									--var0.o[var37];
									var0.d[var0.o[var37]] = var0.d[var0.o[var37 - 1] + 16 - 1];
									--var37;
								}
								
								--var0.o[0];
								var0.d[var0.o[0]] = var1;
								if (var0.o[0] == 0) {
									int var35 = 4095;
									
									for (int var33 = 15; var33 >= 0; --var33) {
										for (int var34 = 15; var34 >= 0; --var34) {
											var0.d[var35] = var0.d[var0.o[var33] + var34];
											--var35;
										}
										
										var0.o[var33] = var35 + 1;
									}
								}
							}
							
							++var0.P[var0.u[var1 & 255] & 255];
							hh.O[var52] = var0.u[var1 & 255] & 255;
							++var52;
							if (var50 == 0) {
								++var48;
								var50 = 50;
								var59 = var0.i[var48];
								var22 = var0.c[var59];
								var23 = var0.e[var59];
								var25 = var0.A[var59];
								var24 = var0.F[var59];
							}
							
							--var50;
							var56 = var22;
							
							for (var57 = a(var22, var0); var57 > var23[var56]; var57 = var57 << 1 | var58) {
								++var56;
								var58 = e(var0);
							}
							
							var51 = var25[var57 - var24[var56]];
						} else {
							int var53 = -1;
							int var54 = 1;
							
							do {
								if (var51 == 0) {
									var53 += var54;
								} else if (var51 == 1) {
									var53 += 2 * var54;
								}
								
								var54 *= 2;
								if (var50 == 0) {
									++var48;
									var50 = 50;
									var59 = var0.i[var48];
									var22 = var0.c[var59];
									var23 = var0.e[var59];
									var25 = var0.A[var59];
									var24 = var0.F[var59];
								}
								
								--var50;
								var56 = var22;
								
								for (var57 = a(var22, var0); var57 > var23[var56]; var57 = var57 << 1 | var58) {
									++var56;
									var58 = e(var0);
								}
								
								var51 = var25[var57 - var24[var56]];
							} while (var51 == 0 || var51 == 1);
							
							++var53;
							var1 = var0.u[var0.d[var0.o[0]] & 255];
							
							for (var0.P[var1 & 255] += var53; var53 > 0; --var53) {
								hh.O[var52] = var1 & 255;
								++var52;
							}
						}
					}
					
					var0.H = 0;
					var0.M = 0;
					var0.G[0] = 0;
					
					for (var41 = 1; var41 <= 256; ++var41) {
						var0.G[var41] = var0.P[var41 - 1];
					}
					
					for (var41 = 1; var41 <= 256; ++var41) {
						var0.G[var41] += var0.G[var41 - 1];
					}
					
					for (var41 = 0; var41 < var52; ++var41) {
						var1 = (byte) (hh.O[var41] & 255);
						hh.O[var0.G[var1 & 255]] |= var41 << 8;
						++var0.G[var1 & 255];
					}
					
					var0.K = hh.O[var0.w] >> 8;
					var0.m = 0;
					var0.K = hh.O[var0.K];
					var0.E = (byte) (var0.K & 255);
					var0.K >>= 8;
					++var0.m;
					var0.O = var52;
					b(var0);
					if (var0.m == var0.O + 1 && var0.H == 0) {
						var26 = true;
						break;
					}
					
					var26 = false;
					break;
				}
			}
			
			return;
		}
	}
	
	private static void b(vb var0) {
		byte var2 = var0.M;
		int var3 = var0.H;
		int var4 = var0.m;
		int var5 = var0.E;
		int[] var6 = hh.O;
		int var7 = var0.K;
		byte[] var8 = var0.x;
		int var9 = var0.v;
		int var10 = var0.C;
		int var12 = var0.O + 1;
		
		label63:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label63;
					}
					
					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label63;
						}
						
						var8[var9] = var2;
						++var9;
						--var10;
						break;
					}
					
					var8[var9] = var2;
					--var3;
					++var9;
					--var10;
				}
			}
			
			boolean var14 = true;
			
			byte var1;
			while (var14) {
				var14 = false;
				if (var4 == var12) {
					var3 = 0;
					break label63;
				}
				
				var2 = (byte) var5;
				var7 = var6[var7];
				var1 = (byte) (var7 & 255);
				var7 >>= 8;
				++var4;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label63;
					}
					
					var8[var9] = var2;
					++var9;
					--var10;
					var14 = true;
				} else if (var4 == var12) {
					if (var10 == 0) {
						var3 = 1;
						break label63;
					}
					
					var8[var9] = var2;
					++var9;
					--var10;
					var14 = true;
				}
			}
			
			var3 = 2;
			var7 = var6[var7];
			var1 = (byte) (var7 & 255);
			var7 >>= 8;
			++var4;
			if (var4 != var12) {
				if (var1 != var5) {
					var5 = var1;
				} else {
					var3 = 3;
					var7 = var6[var7];
					var1 = (byte) (var7 & 255);
					var7 >>= 8;
					++var4;
					if (var4 != var12) {
						if (var1 != var5) {
							var5 = var1;
						} else {
							var7 = var6[var7];
							var1 = (byte) (var7 & 255);
							var7 >>= 8;
							++var4;
							var3 = (var1 & 255) + 4;
							var7 = var6[var7];
							var5 = (byte) (var7 & 255);
							var7 >>= 8;
							++var4;
						}
					}
				}
			}
		}
		
		int var13 = var0.t;
		var0.t += var10 - var10;
		var0.M = var2;
		var0.H = var3;
		var0.m = var4;
		var0.E = var5;
		hh.O = var6;
		var0.K = var7;
		var0.x = var8;
		var0.v = var9;
		var0.C = var10;
	}
	
	private static int a(int var0, vb var1) {
		while (var1.n < var0) {
			var1.z = var1.z << 8 | var1.p[var1.f] & 255;
			var1.n += 8;
			++var1.f;
			++var1.D;
		}
		
		int var3 = var1.z >> var1.n - var0 & (1 << var0) - 1;
		var1.n -= var0;
		return var3;
	}
	
	private static void a(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;
		
		int var8;
		for (var8 = var4; var8 <= var5; ++var8) {
			for (int var9 = 0; var9 < var6; ++var9) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}
			}
		}
		
		for (var8 = 0; var8 < 23; ++var8) {
			var1[var8] = 0;
		}
		
		for (var8 = 0; var8 < var6; ++var8) {
			++var1[var3[var8] + 1];
		}
		
		for (var8 = 1; var8 < 23; ++var8) {
			var1[var8] += var1[var8 - 1];
		}
		
		for (var8 = 0; var8 < 23; ++var8) {
			var0[var8] = 0;
		}
		
		int var10 = 0;
		
		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}
		
		for (var8 = var4 + 1; var8 <= var5; ++var8) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}
		
	}
	
	private static byte c(vb var0) {
		return (byte) a(8, var0);
	}
	
	private static void d(vb var0) {
		var0.s = 0;
		
		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.k[var1]) {
				var0.u[var0.s] = (byte) var1;
				++var0.s;
			}
		}
		
	}
	
	public static void a() {
		a = null;
	}
	
	static int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (a) {
			int var5;
			a.p = var2;
			a.f = var4;
			a.x = var0;
			a.v = 0;
			a.C = var1;
			a.n = 0;
			a.z = 0;
			a.D = 0;
			a.t = 0;
			a(a);
			var1 -= a.C;
			a.p = null;
			a.x = null;
			var5 = var1;
			return var5;
		}
	}
	
	private static byte e(vb var0) {
		return (byte) a(1, var0);
	}
}
