final class ge extends rg {
	
	private short[] D;
	static int E;
	private int[] F;
	static int G;
	static int H;
	private short[] I;
	static int J;
	int K = -1;
	static int L;
	static int M;
	private int[] N = new int[] {-1, -1, -1, -1, -1};
	private short[] O;
	static ob P = rf.a(40, "Hierhin gehen");
	static int Q;
	static int R;
	boolean S = false;
	private short[] T;
	static int U;
	static int W;
	static int X;
	static int Y;
	static ob Z = rf.a(40, "und Ihr Passwort ein)3");
	
	final boolean f(int var1) {
		int var4 = client.anInt_wb;
		
		try {
			++W;
			boolean var2 = true;
			if (var1 <= 5) {
				this.D = null;
			}
			
			int var3 = 0;
			if (var4 == 0 && ~var3 <= -6) {
				return var2;
			} else {
				do {
					if (this.N[var3] != -1 && !qa.cacheFile7.b((byte) 63, this.N[var3], 0)) {
						var2 = false;
					}
					
					++var3;
				} while (~var3 > -6);
				
				return var2;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ge.A(" + var1 + ')');
		}
	}
	
	static ra a(int var0, ra var1) {
		int var4 = client.anInt_wb;
		
		try {
			int var2 = qb.c(ce.a(var1, 18125), -114);
			++Q;
			if (~var2 == var0) {
				return null;
			} else {
				int var3 = 0;
				if (var4 == 0 && ~var3 <= ~var2) {
					return var1;
				} else {
					do {
						var1 = tc.b(var1.Ic, var0 ^ 65);
						if (var1 == null) {
							return null;
						}
						
						++var3;
					} while (~var3 > ~var2);
					
					return var1;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ge.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(ob var0, ob var1, int var2, short var3, long var4, int var6, int var7) {
		try {
			++R;
			if (!le.X) {
				if (var2 != 0) {
					Z = null;
				}
				
				if (si.S < 500) {
					ca.Nb[si.S] = var1;
					wf.e[si.S] = var0;
					ph.i[si.S] = var3;
					qb.G[si.S] = var4;
					ae.Rb[si.S] = var6;
					nd.i[si.S] = var7;
					++si.S;
				}
			}
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ge.D(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	static void a(pe cacheFile2, byte unused) {
		try {
			++Y;
			ka.cacheFile2 = cacheFile2;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ge.H(" + (cacheFile2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static int b(int var0, int var1, int var2) {
		int var4 = client.anInt_wb;
		
		try {
			++U;
			if (var1 == -2) {
				return 12345678;
			} else if (~var1 == 0) {
				if (var2 < 2) {
					var2 = 2;
					if (var4 == 0) {
						return var2;
					}
				}
				
				if (var2 > 126) {
					var2 = 126;
				}
				
				return var2;
			} else {
				var2 = (var1 & 127) * var2 >> 303887879;
				if (var0 != 41) {
					Z = null;
				}
				
				if (~var2 <= -3) {
					if (~var2 >= -127) {
						return var2 + (var1 & 'ﾀ');
					}
					
					var2 = 126;
					if (var4 == 0) {
						return var2 + (var1 & 'ﾀ');
					}
				}
				
				var2 = 2;
				return var2 + (var1 & 'ﾀ');
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ge.J(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
	
	final boolean a(boolean var1) {
		int var4 = client.anInt_wb;
		
		try {
			if (var1) {
				this.T = null;
			}
			
			++L;
			if (this.F == null) {
				return true;
			} else {
				boolean var2 = true;
				int var3 = 0;
				if (var4 == 0 && this.F.length <= var3) {
					return var2;
				} else {
					do {
						if (!qa.cacheFile7.b((byte) 83, this.F[var3], 0)) {
							var2 = false;
						}
						
						++var3;
					} while (this.F.length > var3);
					
					return var2;
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ge.C(" + var1 + ')');
		}
	}
	
	final cb b(byte var1) {
		int var7 = client.anInt_wb;
		
		try {
			++M;
			cb[] var2 = new cb[5];
			int var3 = 0;
			int var4 = 0;
			if (var7 != 0) {
				if (~this.N[var4] != 0) {
					var2[var3++] = cb.a(qa.cacheFile7, this.N[var4], 0);
				}
				
				++var4;
			}
			
			for (; ~var4 > -6; ++var4) {
				if (~this.N[var4] != 0) {
					var2[var3++] = cb.a(qa.cacheFile7, this.N[var4], 0);
				}
			}
			
			if (var1 > -62) {
				return null;
			} else {
				cb var5 = new cb(var2, var3);
				int var6;
				if (this.I != null) {
					var6 = 0;
					if (var7 != 0 || this.I.length > var6) {
						do {
							var5.b(this.I[var6], this.O[var6]);
							++var6;
						} while (this.I.length > var6);
					}
				}
				
				if (this.T != null) {
					var6 = 0;
					if (var7 != 0 || this.T.length > var6) {
						do {
							var5.a(this.T[var6], this.D[var6]);
							++var6;
						} while (this.T.length > var6);
					}
				}
				
				return var5;
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "ge.M(" + var1 + ')');
		}
	}
	
	final cb g(int var1) {
		int var6 = client.anInt_wb;
		
		try {
			++X;
			if (this.F == null) {
				return null;
			} else {
				cb[] var2 = new cb[this.F.length];
				if (var1 != -19400) {
					this.g(-54);
				}
				
				int var3 = 0;
				if (var6 != 0) {
					var2[var3] = cb.a(qa.cacheFile7, this.F[var3], 0);
					++var3;
				}
				
				while (this.F.length > var3) {
					var2[var3] = cb.a(qa.cacheFile7, this.F[var3], 0);
					++var3;
				}
				
				cb var4;
				label53:
				{
					if (~var2.length == -2) {
						var4 = var2[0];
						if (var6 == 0) {
							break label53;
						}
					}
					
					var4 = new cb(var2, var2.length);
				}
				
				int var5;
				if (this.I != null) {
					var5 = 0;
					if (var6 != 0 || var5 < this.I.length) {
						do {
							var4.b(this.I[var5], this.O[var5]);
							++var5;
						} while (var5 < this.I.length);
					}
				}
				
				if (this.T != null) {
					var5 = 0;
					if (var6 != 0 || ~this.T.length < ~var5) {
						do {
							var4.a(this.T[var5], this.D[var5]);
							++var5;
						} while (~this.T.length < ~var5);
					}
				}
				
				return var4;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ge.K(" + var1 + ')');
		}
	}
	
	static ra a(byte var0, ra var1) {
		try {
			int var2 = -116 / ((var0 - -35) / 57);
			++J;
			ra var3 = a((int) -1, var1);
			if (var3 == null) {
				var3 = var1.o;
			}
			
			return var3;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ge.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	public static void h(int var0) {
		try {
			P = null;
			Z = null;
			if (var0 < 93) {
				a((int) 31, (ra) null);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ge.F(" + var0 + ')');
		}
	}
	
	final void a(og class_og, byte unused) {
		int var4 = client.anInt_wb;
		
		try {
			++G;
			
			do {
				int value = class_og.readUnsignedByte(255);
				if (value == 0) {
					break;
				}
				
				this.a(class_og, value, -90);
			} while (var4 == 0);
			
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ge.L(" + (class_og != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static void b(int var0, int var1) {
		try {
			if (var1 != -12885) {
				a((pe) null, (byte) -116);
			}
			
			++E;
			lb.S = 1000 / var0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ge.I(" + var0 + ',' + var1 + ')');
		}
	}
	
	private void a(og class_og, int value, int unused) {
		int dummy = client.anInt_wb;
		
		try {
			//System.out.println("value: " + value);
			int i;
			label97:
			{
				if (value == 1) {
					this.K = class_og.readUnsignedByte(255);
				} else {
					int i1;
					if (value == 2) {
						i = class_og.readUnsignedByte(255);
						this.F = new int[i];
						i1 = 0;
						if (/*dummy != 0 || */~i1 > ~i) {
							do {
								this.F[i1] = class_og.readShort(47);
								++i1;
							} while (~i1 > ~i);
						}
					} else if (value == 3) {
						this.S = true;
					} else if (value != 40) {
						if (value == 41) {
							i = class_og.readUnsignedByte(255);
							this.T = new short[i];
							this.D = new short[i];
							i1 = 0;
							if (/*dummy != 0 || */i1 < i) {
								while (true) {
									this.T[i1] = (short) class_og.readShort(72);
									this.D[i1] = (short) class_og.readShort(101);
									++i1;
									if (i1 >= i) {
										/*if (dummy == 0) {
											break label97;
										}*/
										break;
									}
								}
							}
						} else if (~value <= -61 && ~value > -71) {
							this.N[-60 + value] = class_og.readShort(60);
						}
					} else {
						i = class_og.readUnsignedByte(255);
						this.O = new short[i];
						this.I = new short[i];
						i1 = 0;
						if (/*dummy != 0 || */~i1 > ~i) {
							do {
								this.I[i1] = (short) class_og.readShort(112);
								this.O[i1] = (short) class_og.readShort(116);
								++i1;
							} while (~i1 > ~i);
						}
					}
				}
			}
			
			++H;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "ge.G(" + (class_og != null ? "{...}" : "null") + ',' + value + ',' + unused + ')');
		}
	}
}
