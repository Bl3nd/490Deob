final class jd {
	
	private int a;
	static int b = 0;
	private int[] results;
	static ob d = rf.a(40, "<)4col> x");
	private int e;
	static int f;
	static int g;
	static ob h = rf.a(40, ")2");
	static int i;
	private int[] memory;
	private int k;
	private int count;
	static int m;
	static int n;
	static int o;
	static int p;
	
	/**
	 * ISAAC
	 * @param var1
	 */
	private void nextKeySet(int var1) {
		try {
			++m;
			this.e += ++this.a;
			for (int i = 0; i < 256; ++i) {
				int i1 = this.memory[i];
				if ((2 & i) == 0) {
					if ((i & 1) == 0) {
						this.k ^= this.k << 13;
					} else {
						this.k ^= this.k >>> 6;
					}
				} else if (~(1 & i) == -1) {
					this.k ^= this.k << 2;
				} else {
					this.k ^= this.k >>> 16;
				}
				
				this.k += this.memory[255 & 128 + i];
				int i2;
				this.memory[i] = i2 = this.e + this.k + this.memory[bd.b(i1 >> 2, 255)];
				this.results[i] = this.e = this.memory[bd.b(255, i2 >> -1214011256 >> 903397634)] + i1;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "jd.F(" + var1 + ')');
		}
	}
	
	final int readKey(byte var1) {
		try {
			if (this.count-- == 0) {
				this.nextKeySet(-28703);
				this.count = 255;
			}
			
			++o;
			if (var1 > -70) {
				a(46L, (byte) 90);
			}
			
			return this.results[this.count];
		} catch (RuntimeException var3) {
			throw bc.a(var3, "jd.D(" + var1 + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			h = null;
			if (var0 == -28934) {
				d = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "jd.B(" + var0 + ')');
		}
	}
	
	static int a(int var0, ra var1, int var2) {
		int var14 = client.anInt_wb;
		
		try {
			++g;
			if (var1.M != null && var1.M.length > var0) {
				if (var2 != -31519) {
					a(-1L, (byte) 41);
				}
				
				try {
					int[] var3 = var1.M[var0];
					int var4 = 0;
					int var5 = 0;
					byte var6 = 0;
					
					while (true) {
						int var8;
						do {
							int var7 = var3[var5++];
							var8 = 0;
							byte var9 = 0;
							if (~var7 == -1) {
								return var4;
							}
							
							if (~var7 == -2) {
								var8 = de.r[var3[var5++]];
							}
							
							if (~var7 == -16) {
								var9 = 1;
							}
							
							if (~var7 == -3) {
								var8 = gh.mb[var3[var5++]];
							}
							
							if (~var7 == -4) {
								var8 = dg.Dc[var3[var5++]];
							}
							
							int var10;
							ra var11;
							int var12;
							int var13;
							if (~var7 == -5) {
								var10 = var3[var5++] << 16;
								var10 += var3[var5++];
								var11 = tc.b(var10, (int) -78);
								var12 = var3[var5++];
								if (var12 != -1 && (!jg.a((byte) -61, var12).xb || li.members)) {
									var13 = 0;
									if (var14 != 0 || var13 < var11.ints_tc.length) {
										do {
											if (~var11.ints_tc[var13] == ~(var12 + 1)) {
												var8 += var11.fb[var13];
											}
											
											++var13;
										} while (var13 < var11.ints_tc.length);
									}
								}
							}
							
							if (var7 == 16) {
								var9 = 2;
							}
							
							if (var7 == 5) {
								var8 = sa.c[var3[var5++]];
							}
							
							if (var7 == 17) {
								var9 = 3;
							}
							
							if (var7 == 6) {
								var8 = ed.ints_e[-1 + gh.mb[var3[var5++]]];
							}
							
							if (~var7 == -8) {
								var8 = sa.c[var3[var5++]] * 100 / '뜛';
							}
							
							if (~var7 == -9) {
								var8 = le.T.Cc;
							}
							
							if (var7 == 9) {
								var10 = 0;
								if (var14 != 0 || var10 < 25) {
									do {
										if (gf.y[var10]) {
											var8 += gh.mb[var10];
										}
										
										++var10;
									} while (var10 < 25);
								}
							}
							
							if (var7 == 10) {
								var10 = var3[var5++] << 16;
								var10 += var3[var5++];
								var11 = tc.b(var10, (int) -122);
								var12 = var3[var5++];
								if (~var12 != 0 && (!jg.a((byte) -61, var12).xb || li.members)) {
									var13 = 0;
									if (var14 != 0 || var13 < var11.ints_tc.length) {
										do {
											if (var12 - -1 == var11.ints_tc[var13]) {
												var8 = 999999999;
												if (var14 == 0) {
													break;
												}
											}
											
											++var13;
										} while (var13 < var11.ints_tc.length);
									}
								}
							}
							
							if (~var7 == -12) {
								var8 = l.d;
							}
							
							if (~var7 == -13) {
								var8 = ra.I;
							}
							
							if (~var7 == -14) {
								var10 = sa.c[var3[var5++]];
								int var17 = var3[var5++];
								var8 = (1 << var17 & var10) == 0 ? 0 : 1;
							}
							
							if (var7 == 14) {
								var10 = var3[var5++];
								var8 = af.b(var10, (int) -36);
							}
							
							if (~var7 == -19) {
								var8 = ic.entityXPosition + (le.T.coordX >> 7);
							}
							
							if (var7 == 19) {
								var8 = ic.entityYPosition + (le.T.coordY >> 7);
							}
							
							if (var7 == 20) {
								var8 = var3[var5++];
							}
							
							if (~var9 == -1) {
								break;
							}
							
							var6 = var9;
						} while (var14 == 0);
						
						if (var6 == 0) {
							var4 += var8;
						}
						
						if (~var6 == -2) {
							var4 -= var8;
						}
						
						if (~var6 == -3 && ~var8 != -1) {
							var4 /= var8;
						}
						
						if (var6 == 3) {
							var4 *= var8;
						}
						
						var6 = 0;
					}
				} catch (Exception var15) {
					return -1;
				}
			} else {
				return -2;
			}
		} catch (RuntimeException var16) {
			throw bc.a(var16, "jd.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	static int a(int var0, int var1, int var2) {
		try {
			int var3 = var2 >>> 31;
			if (var1 != -30453) {
				h = null;
			}
			
			++n;
			return (var3 + var2) / var0 + -var3;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "jd.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(long millis, byte var2) {
		try {
			++i;
			if (millis > 0L) {
				if (~(millis % 10L) != -1L) {
					ki.a(-18314, millis);
				} else {
					ki.a(-18314, millis - 1L);
					ki.a(-18314, 1L);
				}
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "jd.A(" + millis + ',' + var2 + ')');
		}
	}
	
	/**
	 * ISAAC initialize
	 */
	private void c(int unused) {
		try {
			++p;
			int i = -1640531527;
			int i1 = -1640531527;
			int i2 = -1640531527;
			int i3 = -1640531527;
			int i4 = -1640531527;
			int i5 = -1640531527;
			int i6 = -1640531527;
			int i7 = -1640531527;
			int i8;
			for (i8 = 0; ~i8 > -5; ++i8) {
				i7 ^= i6 << 11;
				i6 += i5;
				i4 += i7;
				i6 ^= i5 >>> 2;
				i3 += i6;
				i5 += i4;
				i5 ^= i4 << 8;
				i2 += i5;
				i4 += i3;
				i4 ^= i3 >>> 16;
				i1 += i4;
				i3 += i2;
				i3 ^= i2 << 10;
				i2 += i1;
				i2 ^= i1 >>> 4;
				i += i3;
				i1 += i;
				i1 ^= i << 8;
				i7 += i2;
				i += i7;
				i ^= i7 >>> 9;
				i5 += i;
				i6 += i1;
				i7 += i6;
			}
			
			for (i8 = 0; i8 < 256; i8 += 8) {
				i4 += this.results[i8 + 3];
				i7 += this.results[i8];
				i6 += this.results[i8 + 1];
				i1 += this.results[i8 + 6];
				i5 += this.results[2 + i8];
				i2 += this.results[5 + i8];
				i += this.results[7 + i8];
				i3 += this.results[i8 + 4];
				i7 ^= i6 << 11;
				i6 += i5;
				i4 += i7;
				i6 ^= i5 >>> 2;
				i3 += i6;
				i5 += i4;
				i5 ^= i4 << 8;
				i4 += i3;
				i2 += i5;
				i4 ^= i3 >>> 16;
				i1 += i4;
				i3 += i2;
				i3 ^= i2 << 10;
				i2 += i1;
				i += i3;
				i2 ^= i1 >>> 4;
				i7 += i2;
				i1 += i;
				i1 ^= i << 8;
				i6 += i1;
				i += i7;
				i ^= i7 >>> 9;
				i5 += i;
				i7 += i6;
				this.memory[i8] = i7;
				this.memory[1 + i8] = i6;
				this.memory[i8 + 2] = i5;
				this.memory[3 + i8] = i4;
				this.memory[4 + i8] = i3;
				this.memory[i8 - -5] = i2;
				this.memory[i8 - -6] = i1;
				this.memory[7 + i8] = i;
			}
			for (i8 = 0; i8 < 256; i8 += 8) {
				i3 += this.memory[i8 - -4];
				i2 += this.memory[5 + i8];
				i5 += this.memory[i8 - -2];
				i += this.memory[i8 - -7];
				i7 += this.memory[i8];
				i1 += this.memory[i8 + 6];
				i4 += this.memory[i8 - -3];
				i6 += this.memory[1 + i8];
				i7 ^= i6 << 11;
				i4 += i7;
				i6 += i5;
				i6 ^= i5 >>> 2;
				i3 += i6;
				i5 += i4;
				i5 ^= i4 << 8;
				i4 += i3;
				i2 += i5;
				i4 ^= i3 >>> 16;
				i1 += i4;
				i3 += i2;
				i3 ^= i2 << 10;
				i2 += i1;
				i2 ^= i1 >>> 4;
				i += i3;
				i1 += i;
				i7 += i2;
				i1 ^= i << 8;
				i += i7;
				i6 += i1;
				i ^= i7 >>> 9;
				i5 += i;
				i7 += i6;
				this.memory[i8] = i7;
				this.memory[1 + i8] = i6;
				this.memory[2 + i8] = i5;
				this.memory[3 + i8] = i4;
				this.memory[i8 - -4] = i3;
				this.memory[i8 + 5] = i2;
				this.memory[i8 + 6] = i1;
				this.memory[i8 - -7] = i;
			}
			
			this.nextKeySet(-28703);
			this.count = 256;
		} catch (RuntimeException var11) {
			throw bc.a(var11, "jd.E(" + unused + ')');
		}
	}
	
	static void a(int var0, int var1, hi[] var2, int var3, byte[] var4, int var5, int var6) {
		int var12 = client.anInt_wb;
		
		try {
			int var7 = 0;
			int var9;
			int var10;
			int var11;
			og var14;
			if (var12 == 0 && var7 >= 4) {
				++f;
				if (var3 > -24) {
					a(0, -6, 2);
				}
				
				var14 = new og(var4);
				var9 = 0;
				if (var12 != 0 || ~var9 > -5) {
					do {
						var10 = 0;
						if (var12 != 0 || var10 < 64) {
							do {
								var11 = 0;
								if (var12 != 0 || ~var11 > -65) {
									do {
										kf.a(var1, 90, var10 - -var0, var5 + var11, var9, var6, var14, 0);
										++var11;
									} while (~var11 > -65);
								}
								
								++var10;
							} while (var10 < 64);
						}
						
						++var9;
					} while (~var9 > -5);
					
				}
			} else {
				do {
					label219:
					{
						int var8 = 0;
						if (var12 != 0) {
							var9 = 0;
							if (var12 != 0) {
								if (var8 + var0 > 0 && ~(var0 + var8) > -104 && var9 + var5 > 0 && ~(var5 + var9) > -104) {
									var2[var7].i[var8 + var0][var5 - -var9] = bd.b(var2[var7].i[var8 + var0][var5 - -var9], -16777217);
								}
								
								++var9;
							}
						} else {
							if (~var8 <= -65) {
								break label219;
							}
							
							var9 = 0;
							if (var12 != 0) {
								if (var8 + var0 > 0 && ~(var0 + var8) > -104 && var9 + var5 > 0 && ~(var5 + var9) > -104) {
									var2[var7].i[var8 + var0][var5 - -var9] = bd.b(var2[var7].i[var8 + var0][var5 - -var9], -16777217);
								}
								
								++var9;
							}
						}
						
						while (true) {
							for (; var9 < 64; ++var9) {
								if (var8 + var0 > 0 && ~(var0 + var8) > -104 && var9 + var5 > 0 && ~(var5 + var9) > -104) {
									var2[var7].i[var8 + var0][var5 - -var9] = bd.b(var2[var7].i[var8 + var0][var5 - -var9], -16777217);
								}
							}
							
							++var8;
							if (~var8 <= -65) {
								break;
							}
							
							var9 = 0;
							if (var12 != 0) {
								if (var8 + var0 > 0 && ~(var0 + var8) > -104 && var9 + var5 > 0 && ~(var5 + var9) > -104) {
									var2[var7].i[var8 + var0][var5 - -var9] = bd.b(var2[var7].i[var8 + var0][var5 - -var9], -16777217);
								}
								
								++var9;
							}
						}
					}
					
					++var7;
				} while (var7 < 4);
				
				++f;
				if (var3 > -24) {
					a(0, -6, 2);
				}
				
				var14 = new og(var4);
				var9 = 0;
				if (var12 != 0 || ~var9 > -5) {
					do {
						var10 = 0;
						if (var12 != 0 || var10 < 64) {
							do {
								var11 = 0;
								if (var12 != 0 || ~var11 > -65) {
									do {
										kf.a(var1, 90, var10 - -var0, var5 + var11, var9, var6, var14, 0);
										++var11;
									} while (~var11 > -65);
								}
								
								++var10;
							} while (var10 < 64);
						}
						
						++var9;
					} while (~var9 > -5);
					
				}
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "jd.H(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	private jd() {
	}
	
	jd(int[] seed) {
		try {
			this.memory = new int[256];
			this.results = new int[256];
			
			System.arraycopy(seed, 0, this.results, 0, seed.length);
			
			this.c(7);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "jd.<init>(" + (seed != null ? "{...}" : "null") + ')');
		}
	}
}
