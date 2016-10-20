final class hc {
	
	private long a;
	static int b;
	private long c;
	static ca cacheFile_16;
	static ob e = rf.a(40, "m-Ochte mit Ihnen handeln)3");
	static int f;
	static int g;
	static int h;
	private int i;
	private int[] j;
	private int[] k;
	static int l;
	static int m;
	static int n;
	static ob o = rf.a(40, "(U2");
	static int p;
	static int q;
	boolean r;
	static int s;
	static int t;
	static int u;
	static int v;
	
	private void a(byte unused) {
		int var7 = client.anInt_wb;
		
		try {
			++n;
			long l = this.c;
			this.c = -1L;
			long[] longs = va.e;
			int i = 0;
			if (~i > -13) {
				do {
					this.c = longs[(int) (255L & ((long) (this.k[i] >> 24) ^ this.c))] ^ this.c >>> 8;
					this.c = longs[(int) ((this.c ^ (long) (this.k[i] >> 16)) & 255L)] ^ this.c >>> 8;
					this.c = this.c >>> 8 ^ longs[(int) ((this.c ^ (long) (this.k[i] >> 8)) & 255L)];
					this.c = this.c >>> 8 ^ longs[(int) (255L & ((long) this.k[i] ^ this.c))];
					++i;
				} while (~i > -13);
			}
			
			int i1 = 0;
			while (~i1 > -6) {
				this.c = longs[(int) (255L & (this.c ^ (long) this.j[i1]))] ^ this.c >>> 8;
				++i1;
			}
			
			this.c = longs[(int) (((long) (this.r ? 1 : 0) ^ this.c) & 255L)] ^ this.c >>> 8;
			if (~l != -1L && this.c != l) {
				hf.k.a(l, false);
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "hc.G(" + unused + ')');
		}
	}
	
	final void a(boolean var1, byte var2) {
		try {
			int var3 = -44 / ((var2 - 39) / 41);
			++h;
			if (!var1 == this.r) {
				this.a(this.j, (int[]) null, -1, 0, var1);
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "hc.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, boolean var2, boolean var3) {
		int var6 = client.anInt_wb;
		
		try {
			++s;
			if (!var2) {
				if (var1 != 1 || !this.r) {
					int var4 = this.k[gh.ab[var1]];
					if (~var4 != -1) {
						var4 &= 1073741823;
						
						ge var5;
						do {
							label48:
							{
								if (var3) {
									++var4;
									if (var4 < na.C) {
										break label48;
									}
									
									var4 = 0;
									if (var6 == 0) {
										break label48;
									}
								}
								
								--var4;
								if (var4 < 0) {
									var4 = na.C - 1;
								}
							}
							
							var5 = ea.c(var4, 0);
						} while (var5 == null || var5.S || var1 - -(!this.r ? 0 : 7) != var5.K);
						
						this.k[gh.ab[var1]] = ff.b(Integer.MIN_VALUE, var4);
						this.a((byte) 114);
					}
				}
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "hc.L(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void a(int var1, int var2, int var3) {
		try {
			int var4 = gh.ab[var2];
			++m;
			if (~this.k[var4] != -1) {
				if (ea.c(var1, 0) != null) {
					if (var3 < 117) {
						this.a(null, null, 100, -117, false);
					}
					
					this.k[var4] = ff.b(Integer.MIN_VALUE, var1);
					this.a((byte) 114);
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "hc.I(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			cacheFile_16 = null;
			o = null;
			e = null;
			if (var0 != 29450) {
				a((int) 48);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "hc.H(" + var0 + ')');
		}
	}
	
	final void a(og var1, int var2) {
		int var5 = client.anInt_wb;
		
		try {
			++v;
			var1.writeByte(83, !this.r ? 0 : 1);
			int var3 = 0;
			int var4;
			if (var5 != 0) {
				var4 = this.k[gh.ab[var3]];
				if ((var4 & Integer.MIN_VALUE) != 0) {
					var1.d(26894, var4 & 1073741823);
					if (var5 != 0) {
						var1.d(26894, '\uffff');
						++var3;
					} else {
						++var3;
					}
				} else {
					var1.d(26894, '\uffff');
					++var3;
				}
			}
			
			while (~var3 > -8) {
				var4 = this.k[gh.ab[var3]];
				if ((var4 & Integer.MIN_VALUE) != 0) {
					var1.d(26894, var4 & 1073741823);
					if (var5 != 0) {
						var1.d(26894, '\uffff');
						++var3;
					} else {
						++var3;
					}
				} else {
					var1.d(26894, '\uffff');
					++var3;
				}
			}
			
			if (var2 > -75) {
				this.b(89, -87, -21);
			}
			
			var4 = 0;
			if (var5 != 0 || ~var4 > -6) {
				do {
					var1.writeByte(117, this.j[var4]);
					++var4;
				} while (~var4 > -6);
				
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "hc.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	final int b(int var1) {
		try {
			if (var1 != 24295) {
				this.a(54, false, -110);
			}
			
			++b;
			return ~this.i == 0 ? (this.k[11] << 5) + (this.k[8] << 10) + (this.k[0] << 15) + (this.j[0] << 25) - -(this.j[4] << 20) + this.k[1] : 305419896 - -ei.b(this.i, 0).J;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "hc.B(" + var1 + ')');
		}
	}
	
	final void a(int[] ints, int[] ints1, int i, int unused, boolean flag) {
		int dummy = client.anInt_wb;
		try {
			t += 1;
			if (ints1 == null) {
				ints1 = new int[12];
				int i1 = 0;
				while (i1 < 7) {
					int id = 0;
					while (na.C > id) {
						ge class_ge = ea.c(id, 0);
						if ((class_ge != null) && (!class_ge.S)) {
							if ((~class_ge.K) == (~i1 - -(flag ? 7 : 0))) {
								ints1[gh.ab[i1]] = ff.b(id, Integer.MIN_VALUE);
								if (dummy == 0) {
									break;
								}
							}
						}
						id++;
					}
					i1++;
				}
			}
			this.k = ints1;
			if (unused != 0) {
				a(true, 127, -74, null, null);
			}
			this.r = flag;
			this.j = ints;
			this.i = i;
			a((byte) 114);
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "hc.D(" + (ints != null ? "{...}" : "null") + ',' + (ints1 != null ? "{...}" : "null") + ',' + i + ',' + unused + ',' + flag + ')');
		}
		
	}
	
	final fe a(boolean var1, int var2, int var3, ce var4, ce var5) {
		int var17 = client.anInt_wb;
		
		try {
			if (!var1) {
				return null;
			} else {
				++l;
				if (this.i != -1) {
					return ei.b(this.i, 0).a(var1, var3, var5, var4, var2);
				} else {
					int[] var8 = this.k;
					long var6 = this.c;
					if (var5 != null && (var5.J >= 0 || ~var5.M <= -1)) {
						var8 = new int[12];
						int var9 = 0;
						if (var17 != 0 || ~var9 > -13) {
							do {
								var8[var9] = this.k[var9];
								++var9;
							} while (~var9 > -13);
						}
						
						if (~var5.J <= -1) {
							label212:
							{
								if (~var5.J != -65536) {
									var8[5] = ff.b(var5.J, 1073741824);
									var6 ^= (long) var8[5] << 32;
									if (var17 == 0) {
										break label212;
									}
								}
								
								var8[5] = 0;
								var6 ^= -4294967296L;
							}
						}
						
						if (var5.M >= 0) {
							label169:
							{
								if (~var5.M == -65536) {
									var8[3] = 0;
									var6 ^= 4294967295L;
									if (var17 == 0) {
										break label169;
									}
								}
								
								var8[3] = ff.b(var5.M, 1073741824);
								var6 ^= (long) var8[3];
							}
						}
					}
					
					fe var19 = (fe) hf.k.a(var6, (byte) 119);
					if (var19 == null) {
						boolean var10 = false;
						int var11 = 0;
						if (var17 != 0 || var11 < 12) {
							do {
								int var12 = var8[var11];
								if (~(var12 & 1073741824) == -1) {
									if (~(var12 & Integer.MIN_VALUE) == -1) {
										++var11;
										continue;
									}
									
									if (ea.c(var12 & 1073741823, 0).a(false)) {
										++var11;
										continue;
									}
									
									var10 = true;
									if (var17 == 0) {
										++var11;
										continue;
									}
								}
								
								if (!jg.a((byte) -61, var12 & 1073741823).b(this.r, true)) {
									var10 = true;
								}
								
								++var11;
							} while (var11 < 12);
						}
						
						if (var10) {
							if (~this.a != 0L) {
								var19 = (fe) hf.k.a(this.a, (byte) -79);
							}
							
							if (var19 == null) {
								return null;
							}
						}
						
						if (var19 == null) {
							cb[] var21 = new cb[12];
							int var13 = 0;
							int var14 = 0;
							if (var17 != 0 || var14 < 12) {
								do {
									int var15 = var8[var14];
									cb var16;
									if ((var15 & 1073741824) != 0) {
										var16 = jg.a((byte) -61, 1073741823 & var15).c(true, this.r);
										if (var16 == null) {
											++var14;
											continue;
										}
										
										var21[var13++] = var16;
										if (var17 == 0) {
											++var14;
											continue;
										}
									}
									
									if (~(Integer.MIN_VALUE & var15) != -1) {
										var16 = ea.c(1073741823 & var15, 0).g(-19400);
										if (var16 != null) {
											var21[var13++] = var16;
										}
									}
									
									++var14;
								} while (var14 < 12);
							}
							
							cb var22 = new cb(var21, var13);
							int var23 = 0;
							if (var17 != 0 || ~var23 > -6) {
								do {
									if (la.x[var23].length > this.j[var23]) {
										var22.b(kd.Z[var23], la.x[var23][this.j[var23]]);
									}
									
									if (ob.V[var23].length > this.j[var23]) {
										var22.b(hf.z[var23], ob.V[var23][this.j[var23]]);
									}
									
									++var23;
								} while (~var23 > -6);
							}
							
							var19 = var22.b(64, 850, -30, -50, -30);
							hf.k.a(var19, (byte) -31, var6);
							this.a = var6;
						}
					}
					
					if (var5 == null && var4 == null) {
						return var19;
					} else {
						fe var20;
						if (var5 != null && var4 != null) {
							var20 = var5.a(var19, -18112, var4, var3, var2);
							if (var17 == 0) {
								return var20;
							}
						}
						
						if (var5 == null) {
							var20 = var4.a((fe) var19, (int) var3, -125);
							if (var17 == 0) {
								return var20;
							}
						}
						
						var20 = var5.a((fe) var19, (int) var2, 1);
						return var20;
					}
				}
			}
		} catch (RuntimeException var18) {
			throw bc.a(var18, "hc.K(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(byte var1, boolean var2) {
		try {
			++p;
			this.r = var2;
			this.a((byte) 114);
			int var3 = 52 % ((22 - var1) / 50);
		} catch (RuntimeException var4) {
			throw bc.a(var4, "hc.M(" + var1 + ',' + var2 + ')');
		}
	}
	
	final fe a(int var1, boolean var2, ce var3) {
		int var12 = client.anInt_wb;
		
		try {
			++u;
			if (this.i != -1) {
				return ei.b(this.i, 0).a(125, var1, var3);
			} else {
				fe var4 = (fe) mc.t.a(this.c, (byte) -72);
				if (var4 == null) {
					boolean var5 = false;
					int var6 = 0;
					if (var12 != 0 || ~var6 > -13) {
						do {
							int var7 = this.k[var6];
							if ((var7 & 1073741824) == 0) {
								if ((Integer.MIN_VALUE & var7) != 0) {
									if (!ea.c(1073741823 & var7, 0).f(114)) {
										var5 = true;
										if (var12 != 0) {
											if (!jg.a((byte) -61, var7 & 1073741823).a(this.r, false)) {
												var5 = true;
											}
											
											++var6;
										} else {
											++var6;
										}
									} else {
										++var6;
									}
								} else {
									++var6;
								}
							} else {
								if (!jg.a((byte) -61, var7 & 1073741823).a(this.r, false)) {
									var5 = true;
								}
								
								++var6;
							}
						} while (~var6 > -13);
					}
					
					if (var5) {
						return null;
					}
					
					int var8 = 0;
					cb[] var14 = new cb[12];
					int var9 = 0;
					if (var12 != 0 || var9 < 12) {
						do {
							int var10 = this.k[var9];
							cb var11;
							if ((1073741824 & var10) == 0) {
								if ((var10 & Integer.MIN_VALUE) == 0) {
									++var9;
									continue;
								}
								
								var11 = ea.c(1073741823 & var10, 0).b((byte) -86);
								if (var11 == null) {
									++var9;
									continue;
								}
								
								var14[var8++] = var11;
								if (var12 == 0) {
									++var9;
									continue;
								}
							}
							
							var11 = jg.a((byte) -61, var10 & 1073741823).a(0, this.r);
							if (var11 != null) {
								var14[var8++] = var11;
							}
							
							++var9;
						} while (var9 < 12);
					}
					
					cb var15 = new cb(var14, var8);
					int var16 = 0;
					if (var12 != 0 || ~var16 > -6) {
						do {
							if (~la.x[var16].length < ~this.j[var16]) {
								var15.b(kd.Z[var16], la.x[var16][this.j[var16]]);
							}
							
							if (~this.j[var16] > ~ob.V[var16].length) {
								var15.b(hf.z[var16], ob.V[var16][this.j[var16]]);
							}
							
							++var16;
						} while (~var16 > -6);
					}
					
					var4 = var15.b(64, 768, -50, -10, -50);
					mc.t.a(var4, (byte) -81, this.c);
				}
				
				if (!var2) {
					return null;
				} else {
					if (var3 != null) {
						var4 = var3.a(var4, var1, true);
					}
					
					return var4;
				}
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "hc.J(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void a(int var1, boolean var2, int var3) {
		try {
			int var4;
			label24:
			{
				++f;
				var4 = this.j[var1];
				if (var2) {
					++var4;
					if (la.x[var1].length > var4) {
						break label24;
					}
					
					var4 = 0;
					if (client.anInt_wb == 0) {
						break label24;
					}
				}
				
				--var4;
				if (~var4 > -1) {
					var4 = la.x[var1].length + -1;
				}
			}
			
			this.j[var1] = var4;
			this.a((byte) 114);
			if (var3 > -119) {
				this.i = 47;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "hc.E(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	final void b(int var1, int var2, int var3) {
		try {
			this.j[var3] = var2;
			++g;
			int var4 = 24 / ((-53 - var1) / 35);
			this.a((byte) 114);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "hc.A(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
}
